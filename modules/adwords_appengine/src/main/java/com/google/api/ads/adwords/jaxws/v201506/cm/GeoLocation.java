
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Class representing a location with its geographic coordinates.
 *           
 * 
 * <p>Java class for GeoLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geoPoint" type="{https://adwords.google.com/api/adwords/cm/v201506}GeoPoint" minOccurs="0"/>
 *         &lt;element name="address" type="{https://adwords.google.com/api/adwords/cm/v201506}Address" minOccurs="0"/>
 *         &lt;element name="encodedLocation" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="GeoLocation.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocation", propOrder = {
    "geoPoint",
    "address",
    "encodedLocation",
    "geoLocationType"
})
@XmlSeeAlso({
    InvalidGeoLocation.class
})
public class GeoLocation {

    protected GeoPoint geoPoint;
    protected Address address;
    protected byte[] encodedLocation;
    @XmlElement(name = "GeoLocation.Type")
    protected String geoLocationType;

    /**
     * Gets the value of the geoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPoint }
     *     
     */
    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the value of the geoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPoint }
     *     
     */
    public void setGeoPoint(GeoPoint value) {
        this.geoPoint = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the encodedLocation property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEncodedLocation() {
        return encodedLocation;
    }

    /**
     * Sets the value of the encodedLocation property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEncodedLocation(byte[] value) {
        this.encodedLocation = value;
    }

    /**
     * Gets the value of the geoLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoLocationType() {
        return geoLocationType;
    }

    /**
     * Sets the value of the geoLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoLocationType(String value) {
        this.geoLocationType = value;
    }

}
