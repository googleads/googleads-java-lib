
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OAuthInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OAuthInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="httpMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpRequestUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="httpAuthorizationHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OAuthInfo", propOrder = {
    "httpMethod",
    "httpRequestUrl",
    "httpAuthorizationHeader"
})
public class OAuthInfo {

    protected String httpMethod;
    protected String httpRequestUrl;
    protected String httpAuthorizationHeader;

    /**
     * Gets the value of the httpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * Sets the value of the httpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpMethod(String value) {
        this.httpMethod = value;
    }

    /**
     * Gets the value of the httpRequestUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpRequestUrl() {
        return httpRequestUrl;
    }

    /**
     * Sets the value of the httpRequestUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpRequestUrl(String value) {
        this.httpRequestUrl = value;
    }

    /**
     * Gets the value of the httpAuthorizationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHttpAuthorizationHeader() {
        return httpAuthorizationHeader;
    }

    /**
     * Sets the value of the httpAuthorizationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHttpAuthorizationHeader(String value) {
        this.httpAuthorizationHeader = value;
    }

}
