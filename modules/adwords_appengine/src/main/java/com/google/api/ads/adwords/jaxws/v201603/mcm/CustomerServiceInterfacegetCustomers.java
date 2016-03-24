
package com.google.api.ads.adwords.jaxws.v201603.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns details of all the customers directly accessible by the user authenticating the call.
 *             Callers are discouraged from setting the {@code clientCustomerId} header field in calls to
 *             {@link CustomerService#getCustomers()}, as its value is ignored by this method, and its
 *             presence will trigger an authorization error if the caller does not have access to the
 *             customer with the included ID.
 *           
 * 
 * <p>Java class for getCustomers element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getCustomers">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
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
@XmlType(name = "")
@XmlRootElement(name = "getCustomers")
public class CustomerServiceInterfacegetCustomers {


}
