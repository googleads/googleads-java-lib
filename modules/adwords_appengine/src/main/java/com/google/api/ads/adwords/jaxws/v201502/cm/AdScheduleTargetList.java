
package com.google.api.ads.adwords.jaxws.v201502.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             List of ad schedule targets.
 *           
 * 
 * <p>Java class for AdScheduleTargetList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdScheduleTargetList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}TargetList">
 *       &lt;sequence>
 *         &lt;element name="targets" type="{https://adwords.google.com/api/adwords/cm/v201502}AdScheduleTarget" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdScheduleTargetList", propOrder = {
    "targets"
})
public class AdScheduleTargetList
    extends TargetList
{

    protected List<AdScheduleTarget> targets;

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdScheduleTarget }
     * 
     * 
     */
    public List<AdScheduleTarget> getTargets() {
        if (targets == null) {
            targets = new ArrayList<AdScheduleTarget>();
        }
        return this.targets;
    }

}
