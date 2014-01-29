
package com.google.api.ads.adwords.jaxws.v201309.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains a list of {@link AdFormatSpec} values.
 *           
 * 
 * <p>Java class for AdFormatSpecListAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdFormatSpecListAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201309}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201309}AdFormatSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdFormatSpecListAttribute", propOrder = {
    "value"
})
public class AdFormatSpecListAttribute
    extends Attribute
{

    protected List<AdFormatSpec> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdFormatSpec }
     * 
     * 
     */
    public List<AdFormatSpec> getValue() {
        if (value == null) {
            value = new ArrayList<AdFormatSpec>();
        }
        return this.value;
    }

}
