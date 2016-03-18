
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with content hierarchies.
 *           
 * 
 * <p>Java class for ContentMetadataKeyHierarchyError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentMetadataKeyHierarchyError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201602}ContentMetadataKeyHierarchyError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentMetadataKeyHierarchyError", propOrder = {
    "reason"
})
public class ContentMetadataKeyHierarchyError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected ContentMetadataKeyHierarchyErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ContentMetadataKeyHierarchyErrorReason }
     *     
     */
    public ContentMetadataKeyHierarchyErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentMetadataKeyHierarchyErrorReason }
     *     
     */
    public void setReason(ContentMetadataKeyHierarchyErrorReason value) {
        this.reason = value;
    }

}
