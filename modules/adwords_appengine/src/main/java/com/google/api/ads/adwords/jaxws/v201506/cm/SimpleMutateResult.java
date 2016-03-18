
package com.google.api.ads.adwords.jaxws.v201506.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The results of a simple mutation job.
 *           
 * 
 * <p>Java class for SimpleMutateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleMutateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="results" type="{https://adwords.google.com/api/adwords/cm/v201506}Operand" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errors" type="{https://adwords.google.com/api/adwords/cm/v201506}ApiError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleMutateResult", propOrder = {
    "results",
    "errors"
})
public class SimpleMutateResult {

    protected List<Operand> results;
    protected List<ApiError> errors;

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operand }
     * 
     * 
     */
    public List<Operand> getResults() {
        if (results == null) {
            results = new ArrayList<Operand>();
        }
        return this.results;
    }

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiError }
     * 
     * 
     */
    public List<ApiError> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ApiError>();
        }
        return this.errors;
    }

}
