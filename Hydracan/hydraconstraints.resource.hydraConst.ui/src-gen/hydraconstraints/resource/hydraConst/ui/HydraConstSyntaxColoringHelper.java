/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.ui;

public class HydraConstSyntaxColoringHelper {
	
	public static enum StyleProperty {
		
		BOLD("bold"),
		ITALIC("italic"),
		ENABLE("enable"),
		UNDERLINE("underline"),
		STRIKETHROUGH("strikethrough"),
		COLOR("color");
		
		private String suffix;
		
		private StyleProperty(String suffix) {
			this.suffix = suffix;
		}
		
		public String getSuffix() {
			return suffix;
		}
	}
	
	public static String getPreferenceKey(String languageID, String tokenName, StyleProperty styleProperty) {
		return languageID + "$" + tokenName + "$" + styleProperty.getSuffix();
	}
}
