
package com.google.api.ads.adwords.jaxws.v201603.mcm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a list of AccountLabels.
 *           
 * 
 * <p>Java class for AccountLabelPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLabelPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="labels" type="{https://adwords.google.com/api/adwords/mcm/v201603}AccountLabel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLabelPage", propOrder = {
    "labels"
})
public class AccountLabelPage {

    protected List<AccountLabel> labels;

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountLabel }
     * 
     * 
     */
    public List<AccountLabel> getLabels() {
        if (labels == null) {
            labels = new ArrayList<AccountLabel>();
        }
        return this.labels;
    }

}
