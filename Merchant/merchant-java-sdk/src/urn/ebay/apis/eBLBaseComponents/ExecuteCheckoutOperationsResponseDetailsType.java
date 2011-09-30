
/**
 * Auto generated code
 */

package urn.ebay.apis.eBLBaseComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import urn.ebay.apis.eBLBaseComponents.AuthorizationResponseType;
import urn.ebay.apis.eBLBaseComponents.SetDataResponseType;


/**
 */
public class ExecuteCheckoutOperationsResponseDetailsType {

	/**
	 *
	 * @Required
	 */
	private SetDataResponseType SetDataResponse;
	public SetDataResponseType getSetDataResponse() {
		return SetDataResponse;
	}
	public void setSetDataResponse(SetDataResponseType value) {
		this.SetDataResponse = value;
	}

	/**
	 */
	private AuthorizationResponseType AuthorizationResponse;
	public AuthorizationResponseType getAuthorizationResponse() {
		return AuthorizationResponse;
	}
	public void setAuthorizationResponse(AuthorizationResponseType value) {
		this.AuthorizationResponse = value;
	}


	public ExecuteCheckoutOperationsResponseDetailsType() {
	}
	 private  boolean isWhitespaceNode(Node n) {
		 if (n.getNodeType() == Node.TEXT_NODE) { 
				String val = n.getNodeValue();
				return val.trim().length() == 0; 
		 } else {
				return false;
		 } 
	 } 
	 private String convertToXML(Node node){ 
		 StringBuffer bf = new StringBuffer(); 
		 do{ 
		 if (node.getChildNodes().getLength() == 1 && node.getChildNodes().item(0).getNodeType()==Node.TEXT_NODE) { 
				bf.append("<" + node.getNodeName() + ">" + node.getTextContent()+ "</" + node.getNodeName() + ">"); 
				return bf.toString(); 
			} 
			bf.append("<" + node.getNodeName() + ">"); 
			NodeList childNode = node.getChildNodes(); 
			for (int j = 0; j < childNode.getLength(); j++) { 
				Node offspring = childNode.item(j); 
				if (offspring.getChildNodes().getLength() == 1) { 
					if (!isWhitespaceNode(offspring)) { 
						bf.append("<" + offspring.getNodeName() + ">"+ offspring.getTextContent() + "</"+ offspring.getNodeName() + ">");
					}
				} else {
					bf.append(convertToXML(offspring));
				}
			}
			bf.append("</" + node.getNodeName() + ">");
			return bf.toString();
		 }while(true);
		}
	 public ExecuteCheckoutOperationsResponseDetailsType(Object xmlSoap) throws IOException,SAXException,ParserConfigurationException	{
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		 DocumentBuilder builder = builderFactory.newDocumentBuilder();
		 InputSource inStream = new InputSource(); 
		 inStream.setCharacterStream(new StringReader((String)xmlSoap));
		 Document document = builder.parse(inStream);
		 NodeList nodeList= null; 
		 String xmlString ="";
		 if(document.getElementsByTagName("SetDataResponse").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("SetDataResponse").item(0))){ 
		 nodeList = document.getElementsByTagName("SetDataResponse");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.SetDataResponse =  new SetDataResponseType(xmlString);

}
	}
		 if(document.getElementsByTagName("AuthorizationResponse").getLength()!=0){		 if(!isWhitespaceNode(document.getElementsByTagName("AuthorizationResponse").item(0))){ 
		 nodeList = document.getElementsByTagName("AuthorizationResponse");
			 xmlString = convertToXML(nodeList.item(0)); 
			 this.AuthorizationResponse =  new AuthorizationResponseType(xmlString);

}
	}
	}
}