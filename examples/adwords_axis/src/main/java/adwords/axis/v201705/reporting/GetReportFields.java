// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201705.reporting;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201705.cm.ReportDefinitionField;
import com.google.api.ads.adwords.axis.v201705.cm.ReportDefinitionReportType;
import com.google.api.ads.adwords.axis.v201705.cm.ReportDefinitionServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets report fields.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetReportFields {

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

    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServicesInterface adWordsServices, AdWordsSession session) throws Exception {
    // Get the ReportDefinitionService.
    ReportDefinitionServiceInterface reportDefinitionService =
        adWordsServices.get(session, ReportDefinitionServiceInterface.class);

    // Get report fields.
    ReportDefinitionField[] reportDefinitionFields =
        reportDefinitionService
            .getReportFields(ReportDefinitionReportType.KEYWORDS_PERFORMANCE_REPORT);

    // Display report fields.
    System.out.println("Available fields for report:");

    for (ReportDefinitionField reportDefinitionField : reportDefinitionFields) {
      System.out.printf("\t %s(%s) := [", reportDefinitionField.getFieldName(),
          reportDefinitionField.getFieldType());
      if (reportDefinitionField.getEnumValues() != null) {
        for (String enumValue : reportDefinitionField.getEnumValues()) {
          System.out.printf("%s, ", enumValue);
        }
      }
      System.out.println("]");
    }
  }
}
