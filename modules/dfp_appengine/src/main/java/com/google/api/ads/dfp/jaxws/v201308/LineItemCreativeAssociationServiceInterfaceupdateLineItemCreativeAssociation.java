
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link LineItemCreativeAssociation}.
 *             
 *             @param lineItemCreativeAssociation the line item creative association to
 *             update
 *             @return the updated line item creative association
 *           
 * 
 * <p>Java class for updateLineItemCreativeAssociation element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateLineItemCreativeAssociation">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItemCreativeAssociation" type="{https://www.google.com/apis/ads/publisher/v201308}LineItemCreativeAssociation" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItemCreativeAssociation"
})
@XmlRootElement(name = "updateLineItemCreativeAssociation")
public class LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociation {

    protected LineItemCreativeAssociation lineItemCreativeAssociation;

    /**
     * Gets the value of the lineItemCreativeAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemCreativeAssociation }
     *     
     */
    public LineItemCreativeAssociation getLineItemCreativeAssociation() {
        return lineItemCreativeAssociation;
    }

    /**
     * Sets the value of the lineItemCreativeAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemCreativeAssociation }
     *     
     */
    public void setLineItemCreativeAssociation(LineItemCreativeAssociation value) {
        this.lineItemCreativeAssociation = value;
    }

}
