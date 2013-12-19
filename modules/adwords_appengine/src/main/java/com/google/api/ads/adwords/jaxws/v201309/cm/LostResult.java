
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the result of processing an individual mutate operation that
 *             however failed to get durably saved despite the service's best efforts.
 *             
 *             <p>The operation is considered to have completed processing because it
 *             either was successfully performed or failed with validation errors, and
 *             cannot be retried without the risk of doing duplicate work.
 *           
 * 
 * <p>Java class for LostResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LostResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}OperationResult">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LostResult")
public class LostResult
    extends OperationResult
{


}
