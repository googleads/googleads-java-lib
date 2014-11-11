
package com.google.api.ads.dfp.jaxws.v201411;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@code CreativeWrapper} objects.
 *             
 *             @param creativeWrappers the creative wrappers to update
 *             @return the updated creative wrapper objects
 *             @throws ApiException
 *           
 * 
 * <p>Java class for updateCreativeWrappers element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCreativeWrappers">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creativeWrappers" type="{https://www.google.com/apis/ads/publisher/v201411}CreativeWrapper" maxOccurs="unbounded" minOccurs="0"/>
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
    "creativeWrappers"
})
@XmlRootElement(name = "updateCreativeWrappers")
public class CreativeWrapperServiceInterfaceupdateCreativeWrappers {

    protected List<CreativeWrapper> creativeWrappers;

    /**
     * Gets the value of the creativeWrappers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativeWrappers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativeWrappers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativeWrapper }
     * 
     * 
     */
    public List<CreativeWrapper> getCreativeWrappers() {
        if (creativeWrappers == null) {
            creativeWrappers = new ArrayList<CreativeWrapper>();
        }
        return this.creativeWrappers;
    }

}
