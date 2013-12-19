
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Class to represent a set of sitelinks and their order of preference.
 *           
 * 
 * <p>Java class for SitelinksExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SitelinksExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="sitelinks" type="{https://adwords.google.com/api/adwords/cm/v201306}Sitelink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitelinksExtension", propOrder = {
    "sitelinks"
})
public class SitelinksExtension
    extends AdExtension
{

    protected List<Sitelink> sitelinks;

    /**
     * Gets the value of the sitelinks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitelinks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitelinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sitelink }
     * 
     * 
     */
    public List<Sitelink> getSitelinks() {
        if (sitelinks == null) {
            sitelinks = new ArrayList<Sitelink>();
        }
        return this.sitelinks;
    }

}
