
package com.google.api.ads.adwords.jaxws.v201406.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The taxonomy of ProductBiddingCategory dimension values.
 *             
 *             <p>Clients use this to convert between human-readable category names / display strings and
 *             ProductBiddingCategory instances.
 *           
 * 
 * <p>Java class for ProductBiddingCategoryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductBiddingCategoryData">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}ConstantData">
 *       &lt;sequence>
 *         &lt;element name="dimensionValue" type="{https://adwords.google.com/api/adwords/cm/v201406}ProductBiddingCategory" minOccurs="0"/>
 *         &lt;element name="parentDimensionValue" type="{https://adwords.google.com/api/adwords/cm/v201406}ProductBiddingCategory" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayValue" type="{https://adwords.google.com/api/adwords/cm/v201406}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductBiddingCategoryData", propOrder = {
    "dimensionValue",
    "parentDimensionValue",
    "country",
    "displayValue"
})
public class ProductBiddingCategoryData
    extends ConstantData
{

    protected ProductBiddingCategory dimensionValue;
    protected ProductBiddingCategory parentDimensionValue;
    protected String country;
    protected List<StringStringMapEntry> displayValue;

    /**
     * Gets the value of the dimensionValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBiddingCategory }
     *     
     */
    public ProductBiddingCategory getDimensionValue() {
        return dimensionValue;
    }

    /**
     * Sets the value of the dimensionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBiddingCategory }
     *     
     */
    public void setDimensionValue(ProductBiddingCategory value) {
        this.dimensionValue = value;
    }

    /**
     * Gets the value of the parentDimensionValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProductBiddingCategory }
     *     
     */
    public ProductBiddingCategory getParentDimensionValue() {
        return parentDimensionValue;
    }

    /**
     * Sets the value of the parentDimensionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductBiddingCategory }
     *     
     */
    public void setParentDimensionValue(ProductBiddingCategory value) {
        this.parentDimensionValue = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the displayValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringMapEntry }
     * 
     * 
     */
    public List<StringStringMapEntry> getDisplayValue() {
        if (displayValue == null) {
            displayValue = new ArrayList<StringStringMapEntry>();
        }
        return this.displayValue;
    }

}
