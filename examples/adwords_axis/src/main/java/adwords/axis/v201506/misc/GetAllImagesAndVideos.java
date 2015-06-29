// Copyright 2015 Google Inc. All Rights Reserved.
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

package adwords.axis.v201506.misc;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201506.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201506.cm.Dimensions;
import com.google.api.ads.adwords.axis.v201506.cm.Media;
import com.google.api.ads.adwords.axis.v201506.cm.MediaPage;
import com.google.api.ads.adwords.axis.v201506.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201506.cm.MediaSize;
import com.google.api.ads.adwords.axis.v201506.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201506.cm.MediaField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Map;

/**
 * This example gets all images and videos. To upload an image, run
 * UploadImage.java. To upload video, see:
 * http://adwords.google.com/support/aw/bin/answer.py?hl=en&answer=39454.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: MediaService.get
 *
 * @author Kevin Winter
 */
public class GetAllImagesAndVideos {

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

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the MediaService.
    MediaServiceInterface mediaService =
        adWordsServices.get(session, MediaServiceInterface.class);

    int offset = 0;

    // Create selector.
    SelectorBuilder builder = new SelectorBuilder();
    Selector selector = builder
        .fields(MediaField.MediaId, MediaField.Width, MediaField.Height, MediaField.MimeType)
        .orderAscBy(MediaField.MediaId)
        .offset(offset)
        .limit(PAGE_SIZE)
        .in(MediaField.Type, "IMAGE", "VIDEO")
        .build();

    MediaPage page = null;

    do {
      // Get all images.
      page = mediaService.get(selector);

      // Display images.
      if (page != null && page.getEntries() != null) {
        for (Media media : page.getEntries()) {
          Map<MediaSize, Dimensions> dimensions = Maps.toMap(media.getDimensions());
          System.out.printf("Media with ID %d, dimensions %s, and MIME type '%s' was found.%n",
              media.getMediaId(), toString(dimensions.get(MediaSize.FULL)), media.getMediaType());
        }
      } else {
        System.out.println("No images/videos were found.");
      }
      offset += PAGE_SIZE;
      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
    } while (offset < page.getTotalNumEntries());
  }
  
  /**
   * Returns a String representation of the provided Dimensions object, or null if the object is
   * null.
   */
  private static String toString(Dimensions dimensions) {
    return dimensions == null 
        ? null
        : String.format("%dx%d", dimensions.getWidth(), dimensions.getHeight());
  }
}
