
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Package} objects.
 *           
 * 
 * <p>Java class for PackageAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageOperator" type="{https://www.google.com/apis/ads/publisher/v201505}PackageOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageAction", propOrder = {
    "packageOperator"
})
@XmlSeeAlso({
    CreateProposalLineItemsFromPackages.class
})
public abstract class PackageAction {

    @XmlSchemaType(name = "string")
    protected PackageOperator packageOperator;

    /**
     * Gets the value of the packageOperator property.
     * 
     * @return
     *     possible object is
     *     {@link PackageOperator }
     *     
     */
    public PackageOperator getPackageOperator() {
        return packageOperator;
    }

    /**
     * Sets the value of the packageOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageOperator }
     *     
     */
    public void setPackageOperator(PackageOperator value) {
        this.packageOperator = value;
    }

}
