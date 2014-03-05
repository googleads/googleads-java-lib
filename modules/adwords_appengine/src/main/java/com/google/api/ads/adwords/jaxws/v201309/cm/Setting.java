
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base type for AdWords campaign settings.
 *           
 * 
 * <p>Java class for Setting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Setting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Setting.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Setting", propOrder = {
    "settingType"
})
@XmlSeeAlso({
    TargetingSetting.class,
    GeoTargetTypeSetting.class,
    TrackingSetting.class,
    ExplorerAutoOptimizerSetting.class,
    KeywordMatchSetting.class,
    RealTimeBiddingSetting.class
})
public abstract class Setting {

    @XmlElement(name = "Setting.Type")
    protected String settingType;

    /**
     * Gets the value of the settingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingType() {
        return settingType;
    }

    /**
     * Sets the value of the settingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingType(String value) {
        this.settingType = value;
    }

}
