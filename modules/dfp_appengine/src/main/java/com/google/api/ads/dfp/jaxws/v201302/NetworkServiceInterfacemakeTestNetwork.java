
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new blank network for testing purposes using the current login.
 *             <p>
 *             Each login(i.e. email address) can only have one test network. Data from
 *             any of your existing networks will not be transferred to the new test network.
 *             Once the test network is created, the test network can be used in the API
 *             by supplying the {@link Network#networkCode} in the SOAP header or by
 *             logging into the DFP UI.
 *             <p>
 *             Test networks are limited in the following ways:
 *             <ul>
 *             <li>Test networks cannot serve ads.</li>
 *             <li>Because test networks cannot serve ads, reports will always come
 *             back without data.</li>
 *             <li>Since forecasting requires serving history, forecast service results
 *             will be faked. See {@link ForecastService} for more info.</li>
 *             <li>Test networks are, by default, small business networks and do not have any
 *             premium features. To have additional features turned on, please contact your
 *             account manager. </li>
 *             <li>Test networks are limited to 10,000 objects per entity type.</li>
 *             </ul>
 *             </p>
 *           
 * 
 * <p>Java class for makeTestNetwork element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="makeTestNetwork">
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
@XmlRootElement(name = "makeTestNetwork")
public class NetworkServiceInterfacemakeTestNetwork {


}
