
package com.google.api.ads.adwords.jaxws.v201509.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adds labels to the {@linkplain Campaign campaign} or removes
 *             {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}s from the
 *             {@linkplain Campaign campaign}.
 *             <p>Add - Apply an existing label to an existing
 *             {@linkplain Campaign campaign}. The {@code campaignId} must reference an existing
 *             {@linkplain Campaign}. The {@code labelId} must reference an existing
 *             {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
 *             <p>Remove - Removes the link between the specified
 *             {@linkplain Campaign campaign} and
 *             {@linkplain com.google.ads.api.services.campaignmgmt.label.Label label}.</p>
 *             @param operations the operations to apply.
 *             @return a list of {@linkplain CampaignLabel}s where each entry in the list is the result of
 *             applying the operation in the input list with the same index. For an
 *             add operation, the returned CampaignLabel contains the CampaignId and the LabelId.
 *             In the case of a remove operation, the returned CampaignLabel will only have CampaignId.
 *             @throws ApiException when there are one or more errors with the request.
 *           
 * 
 * <p>Java class for mutateLabel element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLabel">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/cm/v201509}CampaignLabelOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutateLabel")
public class CampaignServiceInterfacemutateLabel {

    protected List<CampaignLabelOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignLabelOperation }
     * 
     * 
     */
    public List<CampaignLabelOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<CampaignLabelOperation>();
        }
        return this.operations;
    }

}
