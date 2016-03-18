
package com.google.api.ads.dfp.jaxws.v201508;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates new {@link ProductPackageItem} objects.
 *             
 *             @param productPackageItems the product package items to create
 *             @return the created product package items with their IDs filled in
 *           
 * 
 * <p>Java class for createProductPackageItems element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createProductPackageItems">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="productPackageItems" type="{https://www.google.com/apis/ads/publisher/v201508}ProductPackageItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "productPackageItems"
})
@XmlRootElement(name = "createProductPackageItems")
public class ProductPackageItemServiceInterfacecreateProductPackageItems {

    protected List<ProductPackageItem> productPackageItems;

    /**
     * Gets the value of the productPackageItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPackageItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPackageItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPackageItem }
     * 
     * 
     */
    public List<ProductPackageItem> getProductPackageItems() {
        if (productPackageItems == null) {
            productPackageItems = new ArrayList<ProductPackageItem>();
        }
        return this.productPackageItems;
    }

}
