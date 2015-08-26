
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Retrieves rows of data that satisfy the given {@link Statement#query} from
 *             the system.
 *             
 *             @param selectStatement a Publisher Query Language statement used to
 *             specify what data needs to returned
 *             
 *             @return a result set of data that matches the given filter
 *           
 * 
 * <p>Java class for select element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="select">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selectStatement" type="{https://www.google.com/apis/ads/publisher/v201411}Statement" minOccurs="0"/>
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
    "selectStatement"
})
@XmlRootElement(name = "select")
public class PublisherQueryLanguageServiceInterfaceselect {

    protected Statement selectStatement;

    /**
     * Gets the value of the selectStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getSelectStatement() {
        return selectStatement;
    }

    /**
     * Sets the value of the selectStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setSelectStatement(Statement value) {
        this.selectStatement = value;
    }

}
