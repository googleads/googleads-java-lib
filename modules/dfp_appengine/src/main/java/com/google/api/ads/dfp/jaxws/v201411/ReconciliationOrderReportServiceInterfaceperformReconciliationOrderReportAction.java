
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on the {@link ReconciliationOrderReport} objects that match the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code orderId}</td>
 *             <td>{@link ReconciliationOrderReport#orderId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalId}</td>
 *             <td>{@link ReconciliationOrderReport#proposalId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciliationReportId}</td>
 *             <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
 *             </tr>
 *             </table>
 *             The following statement patterns are supported:
 *             <ul>
 *             <li>reconciliationReportId = :reconciliationReportId AND orderId = :orderId</li>
 *             <li>reconciliationReportId = :reconciliationReportId AND proposalId = :proposalId</li>
 *             <li>reconciliationReportId = :reconciliationReportId
 *             AND (orderId IN (...) OR proposalId IN (...))</li>
 *             </ul>
 *             The IN clause could be expanded to multiple OR expressions like
 *             (orderId = :orderId OR orderId = :orderId OR ...)
 *             Only orders to which the API user has access will be included.
 *             
 *             @param reconciliationOrderReportAction the action to perform.
 *             @param filterStatement a Publisher Query Language statement used to filter a set of orders and
 *             one reconciliation report.
 *             @return the result of the action performed.
 *           
 * 
 * <p>Java class for performReconciliationOrderReportAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performReconciliationOrderReportAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reconciliationOrderReportAction" type="{https://www.google.com/apis/ads/publisher/v201411}ReconciliationOrderReportAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201411}Statement" minOccurs="0"/>
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
    "reconciliationOrderReportAction",
    "filterStatement"
})
@XmlRootElement(name = "performReconciliationOrderReportAction")
public class ReconciliationOrderReportServiceInterfaceperformReconciliationOrderReportAction {

    protected ReconciliationOrderReportAction reconciliationOrderReportAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the reconciliationOrderReportAction property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationOrderReportAction }
     *     
     */
    public ReconciliationOrderReportAction getReconciliationOrderReportAction() {
        return reconciliationOrderReportAction;
    }

    /**
     * Sets the value of the reconciliationOrderReportAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationOrderReportAction }
     *     
     */
    public void setReconciliationOrderReportAction(ReconciliationOrderReportAction value) {
        this.reconciliationOrderReportAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
