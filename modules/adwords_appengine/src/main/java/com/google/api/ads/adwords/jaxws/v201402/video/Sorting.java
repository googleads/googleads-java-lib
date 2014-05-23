
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies the sorting of the results of a get.
 *           
 * 
 * <p>Java class for Sorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{https://adwords.google.com/api/adwords/video/v201402}Sortable" minOccurs="0"/>
 *         &lt;element name="sortOrder" type="{https://adwords.google.com/api/adwords/video/v201402}SortOrder" minOccurs="0"/>
 *         &lt;element name="fields" type="{https://adwords.google.com/api/adwords/video/v201402}Sortable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sortOrders" type="{https://adwords.google.com/api/adwords/video/v201402}SortOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sorting", propOrder = {
    "field",
    "sortOrder",
    "fields",
    "sortOrders"
})
public class Sorting {

    protected Sortable field;
    protected SortOrder sortOrder;
    protected List<Sortable> fields;
    protected List<SortOrder> sortOrders;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Sortable }
     *     
     */
    public Sortable getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sortable }
     *     
     */
    public void setField(Sortable value) {
        this.field = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sortable }
     * 
     * 
     */
    public List<Sortable> getFields() {
        if (fields == null) {
            fields = new ArrayList<Sortable>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the sortOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortOrder }
     * 
     * 
     */
    public List<SortOrder> getSortOrders() {
        if (sortOrders == null) {
            sortOrders = new ArrayList<SortOrder>();
        }
        return this.sortOrders;
    }

}
