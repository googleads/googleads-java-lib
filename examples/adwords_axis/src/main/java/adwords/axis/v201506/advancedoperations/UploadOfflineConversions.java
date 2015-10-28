// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201506.advancedoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerCategory;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerOperation;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.ConversionTrackerServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.OfflineConversionFeed;
import com.google.api.ads.adwords.axis.v201506.cm.OfflineConversionFeedOperation;
import com.google.api.ads.adwords.axis.v201506.cm.OfflineConversionFeedReturnValue;
import com.google.api.ads.adwords.axis.v201506.cm.OfflineConversionFeedServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.Operator;
import com.google.api.ads.adwords.axis.v201506.cm.UploadConversion;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This code example imports offline conversion values for specific clicks to
 * your account. To get Google Click ID for a click, run
 * CLICK_PERFORMANCE_REPORT.
 */
public class UploadOfflineConversions {

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

    AdWordsServices adWordsServices = new AdWordsServices();

    String conversionName = "INSERT_CONVERSION_NAME_HERE";
    
    // Google Click ID should be newer than 30 days.
    String gClId = "INSERT_GOOGLE_CLICK_ID_HERE";
    
    // Conversion time should be after the click time.
    String conversionTime = "INSERT_CONVERSION_TIME_HERE";
    Double conversionValue = Double.valueOf("INSERT_CONVERSION_VALUE_HERE");

    runExample(adWordsServices, session, conversionName, gClId, conversionTime, conversionValue);
  }

  public static void runExample(AdWordsServices adWordsServices, AdWordsSession session, 
      String conversionName, String gClid, String conversionTime, 
      double conversionValue) throws Exception {

    // Get the ConversionTrackerService.
    ConversionTrackerServiceInterface conversionTrackerService =
        adWordsServices.get(session, ConversionTrackerServiceInterface.class);

    // Get the OfflineConversionFeedService.
    OfflineConversionFeedServiceInterface offlineConversionFeedService =
        adWordsServices.get(session, OfflineConversionFeedServiceInterface.class);

    // Create an upload conversion. Once created, this entry will be visible
    // under Tools and Analysis->Conversion and will have "Source = Import".
    UploadConversion uploadConversion = new UploadConversion();
    uploadConversion.setCategory(ConversionTrackerCategory.PAGE_VIEW);
    uploadConversion.setName(conversionName);
    uploadConversion.setViewthroughLookbackWindow(30);
    uploadConversion.setCtcLookbackWindow(90);

    ConversionTrackerOperation uploadConversionOperation = new ConversionTrackerOperation();
    uploadConversionOperation.setOperator(Operator.ADD);
    uploadConversionOperation.setOperand(uploadConversion);

    ConversionTrackerReturnValue conversionTrackerReturnValue = conversionTrackerService.mutate(
        new ConversionTrackerOperation[] {uploadConversionOperation});

    UploadConversion newUploadConversion =
        (UploadConversion) conversionTrackerReturnValue.getValue(0);

    System.out.printf("New upload conversion type with name = '%s' and ID = %d was created.\n",
        newUploadConversion.getName(), newUploadConversion.getId());

    // Associate offline conversions with the upload conversion we created.
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
        "Uploaded offline conversion value of '%s' for Google Click ID = '%s' to '%s'.\n",
        newFeed.getConversionValue(), newFeed.getGoogleClickId(), newFeed.getConversionName());
  }
}
