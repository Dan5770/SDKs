/**
 * Auto generated code
 */
package urn.ebay.apis.eBLBaseComponents;

public enum OptionTypeListType {

NOOPTIONTYPE("NoOptionType"),
FULL("FULL"),
EMI("EMI"),
VARIABLE("VARIABLE"),
	;
private String value;
OptionTypeListType(String val){
value=val;
}public String getValue(){
return value;
}
public static OptionTypeListType fromValue(String v) {
		for (OptionTypeListType c : values())
			if (c.value.equals(v))
				return c;
throw new IllegalArgumentException(v);
}
}
