
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Location based ad extension.
 *           
 * 
 * <p>Java class for LocationExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="address" type="{https://adwords.google.com/api/adwords/cm/v201306}Address" minOccurs="0"/>
 *         &lt;element name="geoPoint" type="{https://adwords.google.com/api/adwords/cm/v201306}GeoPoint" minOccurs="0"/>
 *         &lt;element name="encodedLocation" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{https://adwords.google.com/api/adwords/cm/v201306}LocationExtension.Source" minOccurs="0"/>
 *         &lt;element name="iconMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="imageMediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationExtension", propOrder = {
    "address",
    "geoPoint",
    "encodedLocation",
    "companyName",
    "phoneNumber",
    "source",
    "iconMediaId",
    "imageMediaId"
})
public class LocationExtension
    extends AdExtension
{

    protected Address address;
    protected GeoPoint geoPoint;
    protected byte[] encodedLocation;
    protected String companyName;
    protected String phoneNumber;
    protected LocationExtensionSource source;
    protected Long iconMediaId;
    protected Long imageMediaId;

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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link LocationExtensionSource }
     *     
     */
    public LocationExtensionSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationExtensionSource }
     *     
     */
    public void setSource(LocationExtensionSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the iconMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIconMediaId() {
        return iconMediaId;
    }

    /**
     * Sets the value of the iconMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIconMediaId(Long value) {
        this.iconMediaId = value;
    }

    /**
     * Gets the value of the imageMediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImageMediaId() {
        return imageMediaId;
    }

    /**
     * Sets the value of the imageMediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImageMediaId(Long value) {
        this.imageMediaId = value;
    }

}
