
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Content Label for category exclusion.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ContentLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentLabel">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}Criterion">
 *       &lt;sequence>
 *         &lt;element name="contentLabelType" type="{https://adwords.google.com/api/adwords/cm/v201309}ContentLabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentLabel", propOrder = {
    "contentLabelType"
})
public class ContentLabel
    extends Criterion
{

    protected ContentLabelType contentLabelType;

    /**
     * Gets the value of the contentLabelType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentLabelType }
     *     
     */
    public ContentLabelType getContentLabelType() {
        return contentLabelType;
    }

    /**
     * Sets the value of the contentLabelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentLabelType }
     *     
     */
    public void setContentLabelType(ContentLabelType value) {
        this.contentLabelType = value;
    }

}
