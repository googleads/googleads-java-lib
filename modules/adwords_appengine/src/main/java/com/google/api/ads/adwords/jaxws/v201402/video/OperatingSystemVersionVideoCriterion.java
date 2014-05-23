
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the operating system criterion used for campaign scheduling.
 *             This criterion is immutable
 *           
 * 
 * <p>Java class for OperatingSystemVersionVideoCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingSystemVersionVideoCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201402}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="osMajorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="osMinorVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operatorType" type="{https://adwords.google.com/api/adwords/video/v201402}OperatingSystemVersion.OperatorType" minOccurs="0"/>
 *         &lt;element name="operatingSystemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="obsolete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingSystemVersionVideoCriterion", propOrder = {
    "name",
    "osMajorVersion",
    "osMinorVersion",
    "operatorType",
    "operatingSystemId",
    "obsolete"
})
public class OperatingSystemVersionVideoCriterion
    extends BaseCriterion
{

    protected String name;
    protected Integer osMajorVersion;
    protected Integer osMinorVersion;
    protected OperatingSystemVersionOperatorType operatorType;
    protected Long operatingSystemId;
    protected Boolean obsolete;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the osMajorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOsMajorVersion() {
        return osMajorVersion;
    }

    /**
     * Sets the value of the osMajorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOsMajorVersion(Integer value) {
        this.osMajorVersion = value;
    }

    /**
     * Gets the value of the osMinorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOsMinorVersion() {
        return osMinorVersion;
    }

    /**
     * Sets the value of the osMinorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOsMinorVersion(Integer value) {
        this.osMinorVersion = value;
    }

    /**
     * Gets the value of the operatorType property.
     * 
     * @return
     *     possible object is
     *     {@link OperatingSystemVersionOperatorType }
     *     
     */
    public OperatingSystemVersionOperatorType getOperatorType() {
        return operatorType;
    }

    /**
     * Sets the value of the operatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingSystemVersionOperatorType }
     *     
     */
    public void setOperatorType(OperatingSystemVersionOperatorType value) {
        this.operatorType = value;
    }

    /**
     * Gets the value of the operatingSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOperatingSystemId() {
        return operatingSystemId;
    }

    /**
     * Sets the value of the operatingSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOperatingSystemId(Long value) {
        this.operatingSystemId = value;
    }

    /**
     * Gets the value of the obsolete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObsolete() {
        return obsolete;
    }

    /**
     * Sets the value of the obsolete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObsolete(Boolean value) {
        this.obsolete = value;
    }

}
