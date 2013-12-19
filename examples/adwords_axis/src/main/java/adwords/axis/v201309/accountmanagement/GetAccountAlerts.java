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

package adwords.axis.v201309.accountmanagement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201309.cm.Paging;
import com.google.api.ads.adwords.axis.v201309.mcm.Alert;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertPage;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertQuery;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertSelector;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertServiceInterface;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertSeverity;
import com.google.api.ads.adwords.axis.v201309.mcm.AlertType;
import com.google.api.ads.adwords.axis.v201309.mcm.ClientSpec;
import com.google.api.ads.adwords.axis.v201309.mcm.FilterSpec;
import com.google.api.ads.adwords.axis.v201309.mcm.TriggerTimeSpec;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets all alerts for all clients of an MCC account. This example
 * assumes the email and password belong to an MCC.
 *
 * Note: this code example won't work with test accounts. See
 * https://developers.google.com/adwords/api/docs/test-accounts
 *
 * Tags: AlertService.get
 *
 * @author Kevin Winter
 */
public class GetAccountAlerts {

  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
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

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session)
      throws Exception {
    // Get the AlertService.
    AlertServiceInterface alertService =
      adWordsServices.get(session, AlertServiceInterface.class);

    // Create alert query.
    AlertQuery alertQuery = new AlertQuery();
    alertQuery.setClientSpec(ClientSpec.ALL);
    alertQuery.setFilterSpec(FilterSpec.ALL);
    alertQuery.setTypes(new AlertType[] {AlertType.ACCOUNT_BUDGET_BURN_RATE,
        AlertType.ACCOUNT_BUDGET_ENDING, AlertType.ACCOUNT_ON_TARGET, AlertType.CAMPAIGN_ENDED,
        AlertType.CAMPAIGN_ENDING, AlertType.CREDIT_CARD_EXPIRING, AlertType.DECLINED_PAYMENT,
        AlertType.MANAGER_LINK_PENDING, AlertType.MISSING_BANK_REFERENCE_NUMBER,
        AlertType.PAYMENT_NOT_ENTERED, AlertType.TV_ACCOUNT_BUDGET_ENDING,
        AlertType.TV_ACCOUNT_ON_TARGET, AlertType.TV_ZERO_DAILY_SPENDING_LIMIT,
        AlertType.USER_INVITE_ACCEPTED, AlertType.USER_INVITE_PENDING,
        AlertType.ZERO_DAILY_SPENDING_LIMIT});
    alertQuery.setSeverities(new AlertSeverity[] {AlertSeverity.GREEN, AlertSeverity.YELLOW,
        AlertSeverity.RED});
    alertQuery.setTriggerTimeSpec(TriggerTimeSpec.ALL_TIME);

    int offset = 0;

    // Create selector.
    AlertSelector selector = new AlertSelector();
    selector.setQuery(alertQuery);
    selector.setPaging(new Paging(offset, PAGE_SIZE));

    AlertPage page = null;
    do {
      // Get all alerts.
      page = alertService.get(selector);

      // Display alerts.
      if (page.getEntries() != null && page.getEntries().length > 0) {
        for (Alert alert : page.getEntries()) {
          System.out.printf(
              "Alert of type '%s' and severity '%s' for account '%d' was found.\n",
              alert.getAlertType(), alert.getAlertSeverity(),
              alert.getClientCustomerId());
        }
      } else {
        System.out.println("No alerts were found.\n");
      }
      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());
  }
}
