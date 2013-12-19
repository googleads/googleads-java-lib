
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ReconciliationOrderReport} object uniquely identified by given ID.
 *             
 *             @param reconciliationOrderReportId the ID of the {@link ReconciliationOrderReport},
 *             which must already exist.
 *             @return the {@link ReconciliationOrderReport} uniquely identified by given ID.
 *           
 * 
 * <p>Java class for getReconciliationOrderReport element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReconciliationOrderReport">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationOrderReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "reconciliationOrderReportId"
})
@XmlRootElement(name = "getReconciliationOrderReport")
public class ReconciliationOrderReportServiceInterfacegetReconciliationOrderReport {

    protected Long reconciliationOrderReportId;

    /**
     * Gets the value of the reconciliationOrderReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciliationOrderReportId() {
        return reconciliationOrderReportId;
    }

    /**
     * Sets the value of the reconciliationOrderReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciliationOrderReportId(Long value) {
        this.reconciliationOrderReportId = value;
    }

}
