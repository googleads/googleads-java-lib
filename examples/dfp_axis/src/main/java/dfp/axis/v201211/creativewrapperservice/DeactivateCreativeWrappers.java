// Copyright 2012 Google Inc. All Rights Reserved.
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

package dfp.axis.v201211.creativewrapperservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.utils.v201211.StatementBuilder;
import com.google.api.ads.dfp.axis.v201211.CreativeWrapper;
import com.google.api.ads.dfp.axis.v201211.CreativeWrapperPage;
import com.google.api.ads.dfp.axis.v201211.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.axis.v201211.CreativeWrapperStatus;
import com.google.api.ads.dfp.axis.v201211.UpdateResult;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

import java.util.ArrayList;
import java.util.List;

/**
 * This code example deactivates a creative wrapper belonging to a label.
 * 
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeWrapperService.getCreativeWrapperByStatement
 * Tags: CreativeWrapperService.performCreativeWrapperAction
 *
 * @author Adam Rogal
 */
public class DeactivateCreativeWrappers {

private static final String LABEL_ID = "INSERT_CREATIVE_WRAPPER_LABEL_ID_HERE";
  
  public static void runExample(DfpServices dfpServices, DfpSession session, long labelId)
      throws Exception {
    // Get the CreativeWrapperService.
    CreativeWrapperServiceInterface creativeWrapperService =
        dfpServices.get(session, CreativeWrapperServiceInterface.class);

    // Create a statement to select the active creative wrappers for the
    // given label.
    StatementBuilder statementBuilder = new StatementBuilder()
        .where("WHERE status = :status AND labelId = :labelId")
        .limit(StatementBuilder.SUGGESTED_PAGE_LIMIT)
        .withBindVariableValue("status", CreativeWrapperStatus.ACTIVE.toString())        
        .withBindVariableValue("labelId", labelId);
    
    // Default for total result set size.
    int totalResultSetSize = 0;
    List<Long> creativeWrapperIds = new ArrayList<Long>();

    do {
      // Get creative wrappers by statement.
      CreativeWrapperPage page =
          creativeWrapperService.getCreativeWrappersByStatement(statementBuilder.toStatement());

      if (page.getResults() != null) {
        totalResultSetSize = page.getTotalResultSetSize();
        int i = page.getStartIndex();
        for (CreativeWrapper creativeWrapper : page.getResults()) {
          System.out.printf("%d) Creative wrapper with ID \"%d\" applying to label"
              + " \"%s\" will be deactivated.\n", i++, creativeWrapper.getId(),
              creativeWrapper.getLabelId());
          creativeWrapperIds.add(creativeWrapper.getId());
        }
      }

      statementBuilder.increaseOffsetBy(StatementBuilder.SUGGESTED_PAGE_LIMIT);
    } while (statementBuilder.getOffset() < totalResultSetSize);
    
    System.out.printf("Number of creative wrappers to be deactivated: %s\n", totalResultSetSize);

    if (!creativeWrapperIds.isEmpty()) {
      // Remove limit and offset from statement.
      statementBuilder.removeLimitAndOffset();

      // Create action.
      com.google.api.ads.dfp.axis.v201211.DeactivateCreativeWrappers action =
          new com.google.api.ads.dfp.axis.v201211.DeactivateCreativeWrappers();

      // Perform action.
      UpdateResult result = creativeWrapperService.performCreativeWrapperAction(
          action, statementBuilder.toStatement());

      if (result != null && result.getNumChanges() > 0) {
        System.out.println("Number of creative wrappers deactivated: " + result.getNumChanges());
      } else {
        System.out.println("No creative wrappers were deactivated.");
      }
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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
    
    Long labelId = Long.parseLong(LABEL_ID);

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, labelId);
  }
}
