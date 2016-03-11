
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action to skip {@link WorkflowExternalConditionRequest workflow external condition requests}.
 *             Doing so means that the rule did not trigger.
 *           
 * 
 * <p>Java class for SkipWorkflowExternalConditionRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SkipWorkflowExternalConditionRequests">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}WorkflowRequestAction">
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
@XmlType(name = "SkipWorkflowExternalConditionRequests")
public class SkipWorkflowExternalConditionRequests
    extends WorkflowRequestAction
{


}
