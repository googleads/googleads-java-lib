
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Use verticals to target videos based on the category into which the
 *             video falls (for example, "Pets &amp; Animals/Pets/Dogs"). <a href=
 *             "/adwords/api/docs/appendix/verticals">
 *             View the complete list of available vertical categories.</a>
 *           
 * 
 * <p>Java class for Topic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Topic">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201402}BaseCriterion">
 *       &lt;sequence>
 *         &lt;element name="verticalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="verticalPath" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Topic", propOrder = {
    "verticalId",
    "verticalPath"
})
public class Topic
    extends BaseCriterion
{

    protected Long verticalId;
    protected List<String> verticalPath;

    /**
     * Gets the value of the verticalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerticalId() {
        return verticalId;
    }

    /**
     * Sets the value of the verticalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerticalId(Long value) {
        this.verticalId = value;
    }

    /**
     * Gets the value of the verticalPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVerticalPath() {
        if (verticalPath == null) {
            verticalPath = new ArrayList<String>();
        }
        return this.verticalPath;
    }

}
