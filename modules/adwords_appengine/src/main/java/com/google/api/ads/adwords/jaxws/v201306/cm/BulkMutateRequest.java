
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A request part of a {@link BulkMutateJob}.
 *           
 * 
 * <p>Java class for BulkMutateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMutateRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operationStreams" type="{https://adwords.google.com/api/adwords/cm/v201306}OperationStream" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMutateRequest", propOrder = {
    "partIndex",
    "operationStreams"
})
public class BulkMutateRequest {

    protected Integer partIndex;
    protected List<OperationStream> operationStreams;

    /**
     * Gets the value of the partIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPartIndex() {
        return partIndex;
    }

    /**
     * Sets the value of the partIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPartIndex(Integer value) {
        this.partIndex = value;
    }

    /**
     * Gets the value of the operationStreams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationStreams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationStreams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationStream }
     * 
     * 
     */
    public List<OperationStream> getOperationStreams() {
        if (operationStreams == null) {
            operationStreams = new ArrayList<OperationStream>();
        }
        return this.operationStreams;
    }

}
