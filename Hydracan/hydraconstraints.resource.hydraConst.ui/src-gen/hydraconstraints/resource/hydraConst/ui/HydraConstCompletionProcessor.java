/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

public class HydraConstCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private hydraconstraints.resource.hydraConst.IHydraConstResourceProvider resourceProvider;
	private hydraconstraints.resource.hydraConst.ui.IHydraConstBracketHandlerProvider bracketHandlerProvider;
	
	public HydraConstCompletionProcessor(hydraconstraints.resource.hydraConst.IHydraConstResourceProvider resourceProvider, hydraconstraints.resource.hydraConst.ui.IHydraConstBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		hydraconstraints.resource.hydraConst.IHydraConstTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		hydraconstraints.resource.hydraConst.ui.HydraConstCodeCompletionHelper helper = new hydraconstraints.resource.hydraConst.ui.HydraConstCodeCompletionHelper();
		hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		hydraconstraints.resource.hydraConst.ui.HydraConstProposalPostProcessor proposalPostProcessor = new hydraconstraints.resource.hydraConst.ui.HydraConstProposalPostProcessor();
		java.util.List<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal> finalProposalList = new java.util.ArrayList<hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal>();
		for (hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (hydraconstraints.resource.hydraConst.ui.HydraConstCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			hydraconstraints.resource.hydraConst.ui.IHydraConstBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
