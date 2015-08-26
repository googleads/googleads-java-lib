
package com.google.api.ads.adwords.jaxws.v201502.express;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a page of {@link ProductService}s with no stats.
 *           
 * 
 * <p>Java class for ProductServicePage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductServicePage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/express/v201502}NoStatsPage">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/express/v201502}ProductService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductServicePage", propOrder = {
    "entries"
})
public class ProductServicePage
    extends NoStatsPage
{

    protected List<ProductService> entries;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductService }
     * 
     * 
     */
    public List<ProductService> getEntries() {
        if (entries == null) {
            entries = new ArrayList<ProductService>();
        }
        return this.entries;
    }

}
