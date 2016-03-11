
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Top level class for Dimensions.
 *           
 * 
 * <p>Java class for DimensionProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionProperties">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201601}DataEntry">
 *       &lt;sequence>
 *         &lt;element name="levelOfDetail" type="{https://adwords.google.com/api/adwords/cm/v201601}LevelOfDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionProperties", propOrder = {
    "levelOfDetail"
})
@XmlSeeAlso({
    DomainCategory.class
})
public abstract class DimensionProperties
    extends DataEntry
{

    protected LevelOfDetail levelOfDetail;

    /**
     * Gets the value of the levelOfDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LevelOfDetail }
     *     
     */
    public LevelOfDetail getLevelOfDetail() {
        return levelOfDetail;
    }

    /**
     * Sets the value of the levelOfDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelOfDetail }
     *     
     */
    public void setLevelOfDetail(LevelOfDetail value) {
        this.levelOfDetail = value;
    }

}
