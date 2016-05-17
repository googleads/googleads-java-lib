
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for submitting {@link Proposal} objects for archival. It will start a workflow
 *             to request approvals in order to proceed with archival. Using {@link SubmitProposalsForArchival}
 *             is mandatory for {@link Proposal proposals} when they are sold, but not completed.
 *           
 * 
 * <p>Java class for SubmitProposalsForArchival complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitProposalsForArchival">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201605}ProposalAction">
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
@XmlType(name = "SubmitProposalsForArchival")
public class SubmitProposalsForArchival
    extends ProposalAction
{


}
