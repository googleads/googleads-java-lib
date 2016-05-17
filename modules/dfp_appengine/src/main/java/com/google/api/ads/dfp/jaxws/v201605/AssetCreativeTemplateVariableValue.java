
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Stores values of {@link CreativeTemplateVariable} of {@link VariableType#ASSET}.
 *           
 * 
 * <p>Java class for AssetCreativeTemplateVariableValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetCreativeTemplateVariableValue">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201605}BaseCreativeTemplateVariableValue">
 *       &lt;sequence>
 *         &lt;element name="asset" type="{https://www.google.com/apis/ads/publisher/v201605}CreativeAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetCreativeTemplateVariableValue", propOrder = {
    "asset"
})
public class AssetCreativeTemplateVariableValue
    extends BaseCreativeTemplateVariableValue
{

    protected CreativeAsset asset;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setAsset(CreativeAsset value) {
        this.asset = value;
    }

}
