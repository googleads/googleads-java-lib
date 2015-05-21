
package com.google.api.ads.adwords.jaxws.v201502.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specification for an ad size. This specification allows customization by
 *             display options for more fine-grained control over returns, so that
 *             customers can associate ad options with specific sizes. For example,
 *             suppose the customer in general would like to see placements with
 *             {@code DisplayOption.STANDARD} and {@code DisplayOption.POP_UNDER} -
 *             except for 300x250 ads which should only be STANDARD. The customer would
 *             create a {@code DisplayAdSpec} with {@code DisplayOption.STANDARD} and
 *             {@code DisplayOption.POP_UNDER}, and also send in an {@code AdSizeSpec}
 *             with {@code width} of 300, {@code} height of 250, and {@code displayOptionFilter}
 *             set to {@code DisplayOption.STANDARD}.
 *           
 * 
 * <p>Java class for DisplayAdSpec.AdSizeSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayAdSpec.AdSizeSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="activationOptionFilter" type="{https://adwords.google.com/api/adwords/o/v201502}DisplayAdSpec.ActivationOption" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayAdSpec.AdSizeSpec", propOrder = {
    "width",
    "height",
    "activationOptionFilter"
})
public class DisplayAdSpecAdSizeSpec {

    protected Long width;
    protected Long height;
    protected List<DisplayAdSpecActivationOption> activationOptionFilter;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWidth(Long value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeight(Long value) {
        this.height = value;
    }

    /**
     * Gets the value of the activationOptionFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activationOptionFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivationOptionFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayAdSpecActivationOption }
     * 
     * 
     */
    public List<DisplayAdSpecActivationOption> getActivationOptionFilter() {
        if (activationOptionFilter == null) {
            activationOptionFilter = new ArrayList<DisplayAdSpecActivationOption>();
        }
        return this.activationOptionFilter;
    }

}
