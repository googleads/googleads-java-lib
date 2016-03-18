
package com.google.api.ads.adwords.jaxws.v201506.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A custom parameter of date type. Supported date formats are listed as follows:
 *             <ul>
 *             <li> 2011-03-31T12:20:19-05:00
 *             <li> 03/31/2011 12:20:19-05:00
 *             <li> Fri, Mar 31 2011 12:20:19 EST
 *             <li> Fri, Mar 31 12:20:19 EST 2011
 *             </ul>
 *             <p>
 *             If time zone information is not present in the value,
 *             it is assumed to be PST. If time value is not specified,
 *             it defaults to midnight of the day.
 *           
 * 
 * <p>Java class for DateKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateKey", propOrder = {
    "name"
})
public class DateKey {

    protected String name;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
