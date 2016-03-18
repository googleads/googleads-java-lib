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

package adwords.axis.v201601.misc;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201601.cm.Dimensions;
import com.google.api.ads.adwords.axis.v201601.cm.Image;
import com.google.api.ads.adwords.axis.v201601.cm.Media;
import com.google.api.ads.adwords.axis.v201601.cm.MediaMediaType;
import com.google.api.ads.adwords.axis.v201601.cm.MediaServiceInterface;
import com.google.api.ads.adwords.axis.v201601.cm.MediaSize;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.Maps;
import com.google.api.client.auth.oauth2.Credential;

import java.util.Map;

/**
 * This example uploads an image. To get images, run GetAllImagesAndVideos.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class UploadImage {

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

    runExample(adWordsServices, session);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session) throws Exception {
    // Get the MediaService.
    MediaServiceInterface mediaService =
        adWordsServices.get(session, MediaServiceInterface.class);

    // Create image.
    Image image = new Image();
    image.setData(
        com.google.api.ads.common.lib.utils.Media.getMediaDataFromUrl("http://goo.gl/HJM3L"));
    image.setType(MediaMediaType.IMAGE);

    Media[] media = new Media[] {image};

    // Upload image.
    Media[] result = mediaService.upload(media);

    // Display images.
    image = (Image) result[0];
    Map<MediaSize, Dimensions> dimensions = Maps.toMap(image.getDimensions());
    System.out.printf("Image with ID %d, dimensions %dx%d, and MIME type '%s' was "
        + "uploaded.%n", image.getMediaId(), dimensions.get(MediaSize.FULL).getWidth(),
        dimensions.get(MediaSize.FULL).getHeight(), image.getMediaType());
  }
}
