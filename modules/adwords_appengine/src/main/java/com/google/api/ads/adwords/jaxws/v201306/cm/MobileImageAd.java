
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a mobile image ad.
 *             
 *             <p>For more information, see
 *             <a href="//support.google.com/adwords/bin/answer.py?answer=2472720">
 *             Create a mobile ad</a>.</p>
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for MobileImageAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileImageAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Ad">
 *       &lt;sequence>
 *         &lt;element name="markupLanguages" type="{https://adwords.google.com/api/adwords/cm/v201306}MarkupLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobileCarriers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="image" type="{https://adwords.google.com/api/adwords/cm/v201306}Image" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileImageAd", propOrder = {
    "markupLanguages",
    "mobileCarriers",
    "image"
})
public class MobileImageAd
    extends Ad
{

    protected List<MarkupLanguageType> markupLanguages;
    protected List<String> mobileCarriers;
    protected Image image;

    /**
     * Gets the value of the markupLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markupLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkupLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkupLanguageType }
     * 
     * 
     */
    public List<MarkupLanguageType> getMarkupLanguages() {
        if (markupLanguages == null) {
            markupLanguages = new ArrayList<MarkupLanguageType>();
        }
        return this.markupLanguages;
    }

    /**
     * Gets the value of the mobileCarriers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobileCarriers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileCarriers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobileCarriers() {
        if (mobileCarriers == null) {
            mobileCarriers = new ArrayList<String>();
        }
        return this.mobileCarriers;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

}
