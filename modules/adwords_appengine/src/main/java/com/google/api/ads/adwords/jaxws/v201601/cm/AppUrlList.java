
package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Wrapper object for a list of AppUrls. The list can be cleared if a request contains
 *             an AppUrlList with an empty urls list.
 *           
 * 
 * <p>Java class for AppUrlList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppUrlList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appUrls" type="{https://adwords.google.com/api/adwords/cm/v201601}AppUrl" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppUrlList", propOrder = {
    "appUrls"
})
public class AppUrlList {

    protected List<AppUrl> appUrls;

    /**
     * Gets the value of the appUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppUrl }
     * 
     * 
     */
    public List<AppUrl> getAppUrls() {
        if (appUrls == null) {
            appUrls = new ArrayList<AppUrl>();
        }
        return this.appUrls;
    }

}
