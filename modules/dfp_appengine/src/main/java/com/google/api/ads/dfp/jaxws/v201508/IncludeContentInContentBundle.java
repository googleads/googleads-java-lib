
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for explicitly including specific content in a {@link ContentBundle} object.
 *           
 * 
 * <p>Java class for IncludeContentInContentBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncludeContentInContentBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}ContentBundleAction">
 *       &lt;sequence>
 *         &lt;element name="contentStatement" type="{https://www.google.com/apis/ads/publisher/v201508}Statement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludeContentInContentBundle", propOrder = {
    "contentStatement"
})
public class IncludeContentInContentBundle
    extends ContentBundleAction
{

    protected Statement contentStatement;

    /**
     * Gets the value of the contentStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getContentStatement() {
        return contentStatement;
    }

    /**
     * Sets the value of the contentStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setContentStatement(Statement value) {
        this.contentStatement = value;
    }

}
