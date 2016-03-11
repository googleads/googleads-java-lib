
package com.google.api.ads.dfp.jaxws.v201511;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ProductPackage} objects.
 *             
 *             @param productPackages the product packages to update
 *             @return the updated product packages
 *           
 * 
 * <p>Java class for updateProductPackages element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateProductPackages">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productPackages" type="{https://www.google.com/apis/ads/publisher/v201511}ProductPackage" maxOccurs="unbounded" minOccurs="0"/>
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
    "productPackages"
})
@XmlRootElement(name = "updateProductPackages")
public class ProductPackageServiceInterfaceupdateProductPackages {

    protected List<ProductPackage> productPackages;

    /**
     * Gets the value of the productPackages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPackages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPackages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPackage }
     * 
     * 
     */
    public List<ProductPackage> getProductPackages() {
        if (productPackages == null) {
            productPackages = new ArrayList<ProductPackage>();
        }
        return this.productPackages;
    }

}
