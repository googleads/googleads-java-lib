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

package adwords.axis.v201609.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201609.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignSharedSet;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignSharedSetPage;
import com.google.api.ads.adwords.axis.v201609.cm.CampaignSharedSetServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Criterion;
import com.google.api.ads.adwords.axis.v201609.cm.CriterionType;
import com.google.api.ads.adwords.axis.v201609.cm.Keyword;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.axis.v201609.cm.Placement;
import com.google.api.ads.adwords.axis.v201609.cm.SharedCriterion;
import com.google.api.ads.adwords.axis.v201609.cm.SharedCriterionOperation;
import com.google.api.ads.adwords.axis.v201609.cm.SharedCriterionPage;
import com.google.api.ads.adwords.axis.v201609.cm.SharedCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.SharedCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.SharedSetType;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201609.cm.CampaignSharedSetField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.base.Functions;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import java.util.List;

/**
 * This example demonstrates how to find and remove shared sets and shared set criteria.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class FindAndRemoveCriteriaFromSharedSet {

  private static final int PAGE_SIZE = 100;
  
  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    Long campaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, campaignId);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session,
      Long campaignId) throws Exception {
    // Get the CampaignSharedSetService.
    CampaignSharedSetServiceInterface campaignSharedSetService =
        adWordsServices.get(session, CampaignSharedSetServiceInterface.class);

    // First, retrieve all shared sets associated with the campaign.
    int offset = 0;
    SelectorBuilder selectorBuilder = new SelectorBuilder()
      .fields(
          CampaignSharedSetField.SharedSetId,
          CampaignSharedSetField.CampaignId,
          CampaignSharedSetField.SharedSetName,
          CampaignSharedSetField.SharedSetType)
      .equals(CampaignSharedSetField.CampaignId, campaignId.toString())
      .in(
          CampaignSharedSetField.SharedSetType,
          SharedSetType.NEGATIVE_KEYWORDS.getValue(),
          SharedSetType.NEGATIVE_PLACEMENTS.getValue())
      .limit(PAGE_SIZE);
    
    List<Long> sharedSetIds = Lists.newArrayList();
    CampaignSharedSetPage campaignSharedSetPage;
    do {
      selectorBuilder.offset(offset);
      campaignSharedSetPage = campaignSharedSetService.get(selectorBuilder.build());
      for (CampaignSharedSet campaignSharedSet : campaignSharedSetPage.getEntries()) {
        sharedSetIds.add(campaignSharedSet.getSharedSetId());
        System.out.printf("Campaign shared set ID %d and name '%s' found for campaign ID %d.%n",
            campaignSharedSet.getSharedSetId(), campaignSharedSet.getSharedSetName(),
            campaignSharedSet.getCampaignId());
      }
      offset += PAGE_SIZE;
    } while (offset < campaignSharedSetPage.getTotalNumEntries());

    if (sharedSetIds.isEmpty()) {
      System.out.printf("No shared sets found for campaign ID %d.%n", campaignId);
      return;
    }

    // Next, retrieve criterion IDs for all found shared sets.
    SharedCriterionServiceInterface sharedCriterionService =
        adWordsServices.get(session, SharedCriterionServiceInterface.class);

    // Transform shared set IDs to strings.
    String[] sharedSetIdStrings = Collections2.transform(sharedSetIds, Functions.toStringFunction())
        .toArray(new String[sharedSetIds.size()]);
    
    offset = 0;
    selectorBuilder = new SelectorBuilder()
      .fields("SharedSetId", "Id", "KeywordText", "KeywordMatchType", "PlacementUrl")
      .in("SharedSetId", sharedSetIdStrings)
      .limit(PAGE_SIZE);
    
    List<SharedCriterionOperation> removeCriterionOperations = Lists.newArrayList();
    SharedCriterionPage sharedCriterionPage;
    do {
      selectorBuilder.offset(offset);
      sharedCriterionPage = sharedCriterionService.get(selectorBuilder.build());
      for (SharedCriterion sharedCriterion : sharedCriterionPage.getEntries()) {
        if (CriterionType.KEYWORD.equals(sharedCriterion.getCriterion().getType())) {
          Keyword keyword = (Keyword) sharedCriterion.getCriterion();
          System.out.printf("Shared negative keyword with ID %d and text '%s' was found.%n",
              keyword.getId(), keyword.getText());
        } else if (CriterionType.PLACEMENT.equals(sharedCriterion.getCriterion().getType())) {
          Placement placement = (Placement) sharedCriterion.getCriterion();
          System.out.printf("Shared negative placement with ID %d and URL '%s' was found.%n",
              placement.getId(), placement.getUrl());
        } else {
          System.out.printf("Shared criterion with ID %d was found.%n",
              sharedCriterion.getCriterion().getId());
        }

        // Create an operation to remove this criterion.
        SharedCriterionOperation removeCriterionOperation = new SharedCriterionOperation();
        removeCriterionOperation.setOperator(Operator.REMOVE);
        
        SharedCriterion sharedCriterionToRemove = new SharedCriterion();
        
        Criterion criterionToRemove = new Criterion();
        criterionToRemove.setId(sharedCriterion.getCriterion().getId());
        
        sharedCriterionToRemove.setCriterion(criterionToRemove);
        sharedCriterionToRemove.setSharedSetId(sharedCriterion.getSharedSetId());
        
        removeCriterionOperation.setOperand(sharedCriterionToRemove);

        removeCriterionOperations.add(removeCriterionOperation);
      }
      offset += PAGE_SIZE;
    } while (offset < sharedCriterionPage.getTotalNumEntries());

    // Finally, remove the criteria.
    if (removeCriterionOperations.isEmpty()) {
      System.out.printf("No shared criteria to remove.%n");
    } else {
      SharedCriterionReturnValue sharedCriterionReturnValue =
          sharedCriterionService.mutate(removeCriterionOperations.toArray(
              new SharedCriterionOperation[removeCriterionOperations.size()]));
      for (SharedCriterion removedCriterion : sharedCriterionReturnValue.getValue()) {
        System.out.printf(
            "Shared criterion ID %d was successfully removed from shared set ID %d.%n",
            removedCriterion.getCriterion().getId(), removedCriterion.getSharedSetId());
      }
    }
  }
}
