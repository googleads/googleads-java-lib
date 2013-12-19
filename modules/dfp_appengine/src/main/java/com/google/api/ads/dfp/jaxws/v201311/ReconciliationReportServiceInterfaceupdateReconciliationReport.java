
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ReconciliationReport}.
 *             
 *             @param reconciliationReport the reconciliation report to be updated
 *             @return the updated reconciliation report
 *           
 * 
 * <p>Java class for updateReconciliationReport element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateReconciliationReport">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationReport" type="{https://www.google.com/apis/ads/publisher/v201311}ReconciliationReport" minOccurs="0"/>
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
    "reconciliationReport"
})
@XmlRootElement(name = "updateReconciliationReport")
public class ReconciliationReportServiceInterfaceupdateReconciliationReport {

    protected ReconciliationReport reconciliationReport;

    /**
     * Gets the value of the reconciliationReport property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationReport }
     *     
     */
    public ReconciliationReport getReconciliationReport() {
        return reconciliationReport;
    }

    /**
     * Sets the value of the reconciliationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationReport }
     *     
     */
    public void setReconciliationReport(ReconciliationReport value) {
        this.reconciliationReport = value;
    }

}
