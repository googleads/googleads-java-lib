
package com.google.api.ads.adwords.jaxws.v201603.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains a subset of DraftAsyncErrors resulting from the filtering and paging of
 *             {@link DraftAsyncErrorService#get} call.
 *           
 * 
 * <p>Java class for DraftAsyncErrorPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DraftAsyncErrorPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/cm/v201603}DraftAsyncError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DraftAsyncErrorPage", propOrder = {
    "entries"
})
public class DraftAsyncErrorPage
    extends Page
{

    protected List<DraftAsyncError> entries;

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
     * {@link DraftAsyncError }
     * 
     * 
     */
    public List<DraftAsyncError> getEntries() {
        if (entries == null) {
            entries = new ArrayList<DraftAsyncError>();
        }
        return this.entries;
    }

}
