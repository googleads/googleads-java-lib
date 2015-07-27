
package com.google.api.ads.adwords.jaxws.v201502.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Placement request/response object which provides details about instream
 *             ad types, options, and other available configuration variables.
 *           
 * 
 * <p>Java class for InStreamAdSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InStreamAdSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inStreamTypes" type="{https://adwords.google.com/api/adwords/o/v201502}InStreamAdSpec.InStreamType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="durations" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InStreamAdSpec", propOrder = {
    "inStreamTypes",
    "durations"
})
public class InStreamAdSpec {

    @XmlSchemaType(name = "string")
    protected List<InStreamAdSpecInStreamType> inStreamTypes;
    @XmlElement(type = Long.class)
    protected List<Long> durations;

    /**
     * Gets the value of the inStreamTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inStreamTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInStreamTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InStreamAdSpecInStreamType }
     * 
     * 
     */
    public List<InStreamAdSpecInStreamType> getInStreamTypes() {
        if (inStreamTypes == null) {
            inStreamTypes = new ArrayList<InStreamAdSpecInStreamType>();
        }
        return this.inStreamTypes;
    }

    /**
     * Gets the value of the durations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDurations() {
        if (durations == null) {
            durations = new ArrayList<Long>();
        }
        return this.durations;
    }

}
