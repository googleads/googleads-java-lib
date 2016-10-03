// Copyright 2016 Google Inc. All Rights Reserved.
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

package adwords.axis.v201609.remarketing;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineCallConversionFeed;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineCallConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineCallConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201609.cm.OfflineCallConversionFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example imports offline call conversion values for calls related to the ads in your account.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class UploadOfflineCallConversions {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential =
        new OfflineCredentials.Builder()
            .forApi(Api.ADWORDS)
            .fromFile()
            .build()
            .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();

    AdWordsServices adWordsServices = new AdWordsServices();

    // Replace with valid values of your account.
    String callerId = "INSERT_CALLER_ID_HERE";

    // For times, use the format yyyyMMdd HHmmss tz. For more details on formats, see:
    // https://developers.google.com/adwords/api/docs/appendix/codes-formats#date-and-time-formats
    // For time zones, see:
    // https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids
    String callStartTime = "INSERT_CALL_START_TIME_HERE";

    // Name of the conversion tracker to upload to.
    String conversionName = "INSERT_CONVERSION_NAME_HERE";

    String conversionTime = "INSERT_CONVERSION_TIME_HERE";
    Double conversionValue = Double.valueOf("INSERT_CONVERSION_VALUE_HERE");

    runExample(
        adWordsServices,
        session,
        callerId,
        callStartTime,
        conversionName,
        conversionTime,
        conversionValue);
  }

  public static void runExample(
      AdWordsServices adWordsServices,
      AdWordsSession session,
      String callerId,
      String callStartTime,
      String conversionName,
      String conversionTime,
      double conversionValue)
      throws Exception {

    // Get the OfflineCallConversionFeedService.
    OfflineCallConversionFeedServiceInterface offlineCallConversionFeedService =
        adWordsServices.get(session, OfflineCallConversionFeedServiceInterface.class);

    // Associate offline call conversions with the existing named conversion tracker. If this
    // tracker was newly created, it may be a few hours before it can accept conversions.
    OfflineCallConversionFeed feed = new OfflineCallConversionFeed();
    feed.setCallerId(callerId);
    feed.setCallStartTime(callStartTime);
    feed.setConversionName(conversionName);
    feed.setConversionTime(conversionTime);
    feed.setConversionValue(conversionValue);

    OfflineCallConversionFeedOperation offlineCallConversionOperation =
        new OfflineCallConversionFeedOperation();
    offlineCallConversionOperation.setOperator(Operator.ADD);
    offlineCallConversionOperation.setOperand(feed);

    // This example uploads only one call conversion, but you can upload multiple call conversions
    // by passing additional operations.
    OfflineCallConversionFeedReturnValue offlineCallConversionReturnValue =
        offlineCallConversionFeedService.mutate(
            new OfflineCallConversionFeedOperation[] {offlineCallConversionOperation});

    // Display results.
    for (OfflineCallConversionFeed feedResult : offlineCallConversionReturnValue.getValue()) {
      System.out.printf(
          "Uploaded offline conversion value of %.4f for caller ID '%s'.%n",
          feedResult.getConversionValue(), feedResult.getCallerId());
    }
  }
}
