
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a specific version of an operating system.
 *           
 * 
 * <p>Java class for OperatingSystemVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemVersion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}Technology">
 *       &lt;sequence>
 *         &lt;element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="microVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemVersion", propOrder = {
    "majorVersion",
    "minorVersion",
    "microVersion"
})
public class OperatingSystemVersion
    extends Technology
{

    protected Integer majorVersion;
    protected Integer minorVersion;
    protected Integer microVersion;

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorVersion(Integer value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorVersion(Integer value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the microVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMicroVersion() {
        return microVersion;
    }

    /**
     * Sets the value of the microVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMicroVersion(Integer value) {
        this.microVersion = value;
    }

}
