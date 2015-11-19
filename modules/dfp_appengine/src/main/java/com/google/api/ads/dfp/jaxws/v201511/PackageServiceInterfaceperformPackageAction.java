
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link Package} objects that match the given {@link Statement}.
 *             
 *             @param packageAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of packages
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performPackageAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performPackageAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="packageAction" type="{https://www.google.com/apis/ads/publisher/v201511}PackageAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
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
    "packageAction",
    "filterStatement"
})
@XmlRootElement(name = "performPackageAction")
public class PackageServiceInterfaceperformPackageAction {

    protected PackageAction packageAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the packageAction property.
     * 
     * @return
     *     possible object is
     *     {@link PackageAction }
     *     
     */
    public PackageAction getPackageAction() {
        return packageAction;
    }

    /**
     * Sets the value of the packageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageAction }
     *     
     */
    public void setPackageAction(PackageAction value) {
        this.packageAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
