
package com.google.api.ads.adwords.jaxws.v201402.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Scope of products in a shopping campaign. Contains a set of product dimensions, all of which
 *             a product has to match to be included in the campaign. A campaign can contain multiple
 *             ProductScope criterion and that products are included as long as they match at least one
 *             ProductScope. Non-existence of ProductScope means all products are included in the campaign.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for ProductScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductScope">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Criterion">
 *       &lt;sequence>
 *         &lt;element name="dimensions" type="{https://adwords.google.com/api/adwords/cm/v201402}ProductDimension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductScope", propOrder = {
    "dimensions"
})
public class ProductScope
    extends Criterion
{

    protected List<ProductDimension> dimensions;

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDimension }
     * 
     * 
     */
    public List<ProductDimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<ProductDimension>();
        }
        return this.dimensions;
    }

}
