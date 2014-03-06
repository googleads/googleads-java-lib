
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on the {@link ReconciliationOrderReport} objects.
 *           
 * 
 * <p>Java class for ReconciliationOrderReportAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationOrderReportAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReconciliationOrderReportAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationOrderReportAction", propOrder = {
    "reconciliationOrderReportActionType"
})
@XmlSeeAlso({
    RevertReconciliationOrderReports.class,
    SubmitReconciliationOrderReports.class
})
public abstract class ReconciliationOrderReportAction {

    @XmlElement(name = "ReconciliationOrderReportAction.Type")
    protected String reconciliationOrderReportActionType;

    /**
     * Gets the value of the reconciliationOrderReportActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationOrderReportActionType() {
        return reconciliationOrderReportActionType;
    }

    /**
     * Sets the value of the reconciliationOrderReportActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationOrderReportActionType(String value) {
        this.reconciliationOrderReportActionType = value;
    }

}
