
package com.google.api.ads.adwords.jaxws.v201502.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A mutation job, which was submitted using
 *             {@link MutateJobService#mutate}, and will execute asynchronously
 *             sometime after submission.
 *           
 * 
 * <p>Java class for SimpleMutateJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleMutateJob">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}Job">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201502}BasicJobStatus" minOccurs="0"/>
 *         &lt;element name="history" type="{https://adwords.google.com/api/adwords/cm/v201502}JobEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleMutateJob", propOrder = {
    "id",
    "status",
    "history"
})
public class SimpleMutateJob
    extends Job
{

    protected Long id;
    protected BasicJobStatus status;
    protected List<JobEvent> history;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BasicJobStatus }
     *     
     */
    public BasicJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicJobStatus }
     *     
     */
    public void setStatus(BasicJobStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the history property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobEvent }
     * 
     * 
     */
    public List<JobEvent> getHistory() {
        if (history == null) {
            history = new ArrayList<JobEvent>();
        }
        return this.history;
    }

}
