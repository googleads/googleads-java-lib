
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CustomCreativeAsset} is an association between a
 *             {@link CustomCreative} and an asset. Any assets that are associated with a
 *             creative can be inserted into its HTML snippet.
 *           
 * 
 * <p>Java class for CustomCreativeAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCreativeAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="macroName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assetByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomCreativeAsset", propOrder = {
    "macroName",
    "assetId",
    "assetByteArray",
    "fileName",
    "fileSize"
})
public class CustomCreativeAsset {

    protected String macroName;
    protected Long assetId;
    protected byte[] assetByteArray;
    protected String fileName;
    protected Long fileSize;

    /**
     * Gets the value of the macroName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacroName() {
        return macroName;
    }

    /**
     * Sets the value of the macroName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacroName(String value) {
        this.macroName = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetId(Long value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAssetByteArray() {
        return assetByteArray;
    }

    /**
     * Sets the value of the assetByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAssetByteArray(byte[] value) {
        this.assetByteArray = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

}
