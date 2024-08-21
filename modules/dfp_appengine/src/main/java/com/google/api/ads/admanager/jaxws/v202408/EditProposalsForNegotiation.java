// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Opens the fields of a {@link Proposal} for edit.
 *             
 *             <p>This proposal will not receive updates from Marketplace while it's open for edit. If the buyer
 *             updates the proposal while it is open for local editing, Google will set {@link
 *             ProposalMarketplaceInfo#isNewVersionFromBuyer} to {@code true}. You will then need to call {@link
 *             DiscardProposalDrafts} to revert your edits to get the buyer's latest changes, and then perform
 *             this action to start making your edits again.
 *           
 * 
 * <p>Java class for EditProposalsForNegotiation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EditProposalsForNegotiation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202408}ProposalAction"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditProposalsForNegotiation")
public class EditProposalsForNegotiation
    extends ProposalAction
{


}
