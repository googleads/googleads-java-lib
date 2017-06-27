// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201705.proposallineitemservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201705.DateTimes;
import com.google.api.ads.dfp.axis.v201705.AdExchangeEnvironment;
import com.google.api.ads.dfp.axis.v201705.AdUnitTargeting;
import com.google.api.ads.dfp.axis.v201705.CreativePlaceholder;
import com.google.api.ads.dfp.axis.v201705.DeliveryRateType;
import com.google.api.ads.dfp.axis.v201705.Goal;
import com.google.api.ads.dfp.axis.v201705.InventoryTargeting;
import com.google.api.ads.dfp.axis.v201705.LineItemType;
import com.google.api.ads.dfp.axis.v201705.Money;
import com.google.api.ads.dfp.axis.v201705.NetworkServiceInterface;
import com.google.api.ads.dfp.axis.v201705.ProposalLineItem;
import com.google.api.ads.dfp.axis.v201705.ProposalLineItemMarketplaceInfo;
import com.google.api.ads.dfp.axis.v201705.ProposalLineItemServiceInterface;
import com.google.api.ads.dfp.axis.v201705.RateType;
import com.google.api.ads.dfp.axis.v201705.Size;
import com.google.api.ads.dfp.axis.v201705.Targeting;
import com.google.api.ads.dfp.axis.v201705.UnitType;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;
import org.joda.time.Duration;
import org.joda.time.Instant;

/**
 * This example creates a new programmatic proposal line item in a non-Sales Management network.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateProgrammaticProposalLineItemsForNonSalesManagement {

  private static class CreateProgrammaticProposalLineItemsForNonSalesManagementParams
      extends CodeSampleParams {
    @Parameter(names = ArgumentNames.PROPOSAL_ID, required = true,
        description = "The ID of the proposal that the proposal line items will belong to.")
    private Long proposalId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session, long proposalId
      ) throws Exception {
    ProposalLineItemServiceInterface proposalLineItemService =
        dfpServices.get(session, ProposalLineItemServiceInterface.class);

    NetworkServiceInterface networkService =
        dfpServices.get(session, NetworkServiceInterface.class);
    
    ProposalLineItem proposalLineItem = new ProposalLineItem();
    
    // Setting required Marketplace information.
    ProposalLineItemMarketplaceInfo proposalLineItemMarketplaceInfo =
        new ProposalLineItemMarketplaceInfo();
    proposalLineItemMarketplaceInfo.setAdExchangeEnvironment(AdExchangeEnvironment.DISPLAY);
    proposalLineItem.setMarketplaceInfo(proposalLineItemMarketplaceInfo);
    
    // Set common required fields for a programmatic proposal line item.
    proposalLineItem.setName("Programmatic proposal line item #"
        + new Random().nextInt(Integer.MAX_VALUE));
    proposalLineItem.setProposalId(proposalId);
    proposalLineItem.setLineItemType(LineItemType.STANDARD);
    
    // Get the root ad unit ID used to target the whole site.
    String rootAdUnitId = networkService.getCurrentNetwork().getEffectiveRootAdUnitId();

    // Create inventory targeting.
    InventoryTargeting inventoryTargeting = new InventoryTargeting();

    // Create ad unit targeting for the root ad unit (i.e. the whole network).
    AdUnitTargeting adUnitTargeting = new AdUnitTargeting();
    adUnitTargeting.setAdUnitId(rootAdUnitId);
    adUnitTargeting.setIncludeDescendants(true);

    inventoryTargeting.setTargetedAdUnits(new AdUnitTargeting[] {adUnitTargeting});

    // Create targeting.
    Targeting targeting = new Targeting();
    targeting.setInventoryTargeting(inventoryTargeting);
    
    proposalLineItem.setTargeting(targeting);
    
    // Create creative placeholder size.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Create the creative placeholder.
    CreativePlaceholder creativePlaceholder = new CreativePlaceholder();
    creativePlaceholder.setSize(size);

    // Set the size of creatives that can be associated with this proposal line item.
    proposalLineItem.setCreativePlaceholders(new CreativePlaceholder[] {creativePlaceholder});
    
    // Set the length of the proposal line item to run.
    proposalLineItem.setStartDateTime(DateTimes.toDateTime(Instant.now(), "America/New_York"));
    proposalLineItem.setEndDateTime(
        DateTimes.toDateTime(Instant.now().plus(Duration.standardDays(30L)), "America/New_York"));
    
    // Set delivery specifications for the proposal line item.
    proposalLineItem.setDeliveryRateType(DeliveryRateType.EVENLY);
   
    // Set pricing for the proposal line item for 1000 impressions at a CPM of $2
    // for a total value of $2.
    Goal goal = new Goal();
    goal.setUnits(1000L);
    goal.setUnitType(UnitType.IMPRESSIONS);
    proposalLineItem.setGoal(goal);

    proposalLineItem.setNetCost(new Money("USD", 2000000L));
    proposalLineItem.setNetRate(new Money("USD", 2000000L));
    proposalLineItem.setRateType(RateType.CPM);
    
    ProposalLineItem[] proposalLineItems = proposalLineItemService.createProposalLineItems(
        new ProposalLineItem[] {proposalLineItem});

    for (ProposalLineItem createdProposalLineItem : proposalLineItems) {
      System.out.printf("A programmatic proposal line item with ID %d and name '%s' was created.%n",
          createdProposalLineItem.getId(), createdProposalLineItem.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    CreateProgrammaticProposalLineItemsForNonSalesManagementParams params =
        new CreateProgrammaticProposalLineItemsForNonSalesManagementParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.proposalId = Long.parseLong("INSERT_PROPOSAL_ID_HERE");
    }

    runExample(dfpServices, session, params.proposalId);
  }
}
