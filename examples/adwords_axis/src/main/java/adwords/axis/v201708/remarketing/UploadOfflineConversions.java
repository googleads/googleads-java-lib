// Copyright 2017 Google Inc. All Rights Reserved.
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

package adwords.axis.v201708.remarketing;

import com.beust.jcommander.Parameter;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201708.cm.OfflineConversionFeed;
import com.google.api.ads.adwords.axis.v201708.cm.OfflineConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201708.cm.OfflineConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201708.cm.OfflineConversionFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201708.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.utils.examples.ArgumentNames;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This code example imports offline conversion values for specific clicks to
 * your account. To get Google Click ID for a click, run
 * CLICK_PERFORMANCE_REPORT. To set up a conversion tracker, run the
 * AddConversionTrackers.java example.
 */
public class UploadOfflineConversions {

  private static class UploadOfflineConversionsParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CONVERSION_NAME, required = true,
        description = "Name of the conversion tracker to upload to.")
    private String conversionName;

    @Parameter(names = ArgumentNames.GCL_ID, required = true,
        description = "Google Click ID should be newer than 30 days.")
    private String gclId;

    @Parameter(names = ArgumentNames.CONVERSION_TIME, required = true,
        description = "Conversion time should be after the click time.")
    private String conversionTime;

    @Parameter(names = ArgumentNames.CONVERSION_VALUE, required = true)
    private Double conversionValue;
  }

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

    
    
    UploadOfflineConversionsParams params = new UploadOfflineConversionsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.conversionName = "INSERT_CONVERSION_NAME_HERE";
      params.gclId = "INSERT_GCL_ID_HERE";
      params.conversionTime = "INSERT_CONVERSION_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
    }

    runExample(adWordsServices, session, params.conversionName, params.gclId, params.conversionTime,
        params.conversionValue);
  }

  public static void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session, 
      String conversionName, String gClid, String conversionTime, 
      double conversionValue) throws Exception {

    // Get the OfflineConversionFeedService.
    OfflineConversionFeedServiceInterface offlineConversionFeedService =
        adWordsServices.get(session, OfflineConversionFeedServiceInterface.class);

    // Associate offline conversions with the existing named conversion tracker. If this tracker
    // was newly created, it may be a few hours before it can accept conversions.
    OfflineConversionFeed feed = new OfflineConversionFeed();
    feed.setConversionName(conversionName);
    feed.setConversionTime(conversionTime);
    feed.setConversionValue(conversionValue);
    feed.setGoogleClickId(gClid);

    OfflineConversionFeedOperation offlineConversionOperation =
        new OfflineConversionFeedOperation();
    offlineConversionOperation.setOperator(Operator.ADD);
    offlineConversionOperation.setOperand(feed);

    OfflineConversionFeedReturnValue offlineConversionReturnValue = offlineConversionFeedService
        .mutate(new OfflineConversionFeedOperation[] {offlineConversionOperation});

    OfflineConversionFeed newFeed = offlineConversionReturnValue.getValue(0);

    System.out.printf(
        "Uploaded offline conversion value of %.4f for Google Click ID '%s' to '%s'.%n",
        newFeed.getConversionValue(), newFeed.getGoogleClickId(), newFeed.getConversionName());
  }
}
