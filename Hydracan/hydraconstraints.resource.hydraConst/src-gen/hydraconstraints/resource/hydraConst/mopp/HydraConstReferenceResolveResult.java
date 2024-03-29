/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

/**
 * A basic implementation of the
 * hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class HydraConstReferenceResolveResult<ReferenceType> implements hydraconstraints.resource.hydraConst.IHydraConstReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> quickFixes;
	
	public HydraConstReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<hydraconstraints.resource.hydraConst.IHydraConstQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(hydraconstraints.resource.hydraConst.IHydraConstQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<hydraconstraints.resource.hydraConst.IHydraConstQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new hydraconstraints.resource.hydraConst.mopp.HydraConstElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new hydraconstraints.resource.hydraConst.mopp.HydraConstURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
