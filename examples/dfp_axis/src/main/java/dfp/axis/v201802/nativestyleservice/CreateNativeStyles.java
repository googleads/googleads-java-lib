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

package dfp.axis.v201802.nativestyleservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.NativeStyle;
import com.google.api.ads.dfp.axis.v201802.NativeStyleServiceInterface;
import com.google.api.ads.dfp.axis.v201802.Size;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a new native style.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateNativeStyles {

  /**
   * Runs the example.
   *
   * @param dfpServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(DfpServices dfpServices, DfpSession session)
      throws RemoteException {
    // Get the NativeStyleService.
    NativeStyleServiceInterface nativeStyleService =
        dfpServices.get(session, NativeStyleServiceInterface.class);

    String htmlSnippet = new StringBuilder()
        .append("<div id=\"adunit\" style=\"overflow: hidden;\">\n")
        .append("  <img src='[%Thirdpartyimpressiontracker%]' style='display:none'>\n")
        .append("  <div class='attribution'>Ad</div>\n")
        .append("  <div class='image'>\n")
        .append("    <a class='image-link' ")
        .append("href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' target='_top'>")
        .append("<img src=\"[%Image%]\"></a>\n")
        .append("  </div>\n")
        .append("  <div class='app-icon'><img src=\"[%Appicon%]\"/></div>\n")
        .append("  <div class='title'>\n")
        .append("    <a class='title-link' ")
        .append("href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' ")
        .append("target='_top'>[%Headline%]</a>\n")
        .append("  </div>\n")
        .append("  <div class='reviews'></div>\n")
        .append("  <div class='body'>\n")
        .append("    <a class='body-link' ")
        .append("href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' ")
        .append("target='_top'>[%Body%]</a>\n")
        .append("  </div>\n")
        .append("  <div class='price'>[%Price%]</div>\n")
        .append("  <div class='button'>\n")
        .append("    <a class='button-link' ")
        .append("href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' ")
        .append("target='_top'>[%Calltoaction%]</a>\n")
        .append("  </div>\n")
        .append("</div>\n")
        .toString();

    String cssSnippet = new StringBuilder()
        .append("body {")
        .append("    background-color: rgba(255, 255, 255, 1);")
        .append("    font-family: \"Roboto-Regular\", sans-serif;")
        .append("    font-weight: normal;")
        .append("    font-size: 12px;")
        .append("    line-height: 14px;")
        .append("}")
        .append(".attribution {")
        .append("    background-color: rgba(236, 182, 0, 1);")
        .append("    color: rgba(255, 255, 255, 1);")
        .append("    font-size: 13px;")
        .append("    display: table;")
        .append("    margin: 4px 8px;")
        .append("    padding: 0 3px;")
        .append("    border-radius: 2px;")
        .append("}")
        .append(".image {")
        .append("    text-align: center;")
        .append("    margin: 8px;")
        .append("}")
        .append(".image img,")
        .append(".image-link {")
        .append("    width: 100%;")
        .append("}")
        .append(".app-icon {")
        .append("    float: left;")
        .append("    margin: 0 8px 4px 8px;")
        .append("    height: 40px;")
        .append("    width: 40px;")
        .append("    background-color: transparent;")
        .append("}")
        .append(".app-icon img {")
        .append("    height: 100%;")
        .append("    width: 100%;")
        .append("    border-radius: 20%;")
        .append("}")
        .append(".title,")
        .append(".promo-headline {")
        .append("    font-weight: bold;")
        .append("    font-size: 14px;")
        .append("    line-height: 20px;")
        .append("    margin: 8px 8px 4px 8px;")
        .append("}")
        .append(".title a,")
        .append(".promo-headline {")
        .append("    color: rgba(112, 112, 112, 1);")
        .append("    text-decoration: none;")
        .append("}")
        .append(".reviews {")
        .append("    float: left;")
        .append("}")
        .append(".reviews svg {")
        .append("    fill: rgba(0, 0, 0, 0.7);")
        .append("}")
        .append(".body {")
        .append("    clear: left;")
        .append("    margin: 8px;")
        .append("}")
        .append(".body a {")
        .append("    color: rgba(110, 110, 110, 1);")
        .append("    text-decoration: none;")
        .append("}")
        .append(".price {")
        .append("    display: none;")
        .append("}")
        .append(".button {")
        .append("    font-size: 14px;")
        .append("    font-weight: bold;")
        .append("    float: right;")
        .append("    margin: 0px 16px 16px 0px;")
        .append("    white-space: nowrap;")
        .append("}")
        .append(".button a {")
        .append("    color: #2196F3;")
        .append("    text-decoration: none;")
        .append("}")
        .append(".button svg {")
        .append("    display: none;")
        .append("}")
        .toString();

    // This is the creative template ID for the system-defined native app
    // install ad format, which we will create the native style from. Use
    // CreativeTemplateService.getCreativeTemplatesByStatement() and
    // CreativeTemplate.isNativeEligible to get other native ad formats
    // available in your network.
    long nativeAppInstallTemplateId = 10004400L;

    // Set the size for the native style.
    Size size = new Size();
    size.setWidth(300);
    size.setHeight(250);
    size.setIsAspectRatio(false);

    // Create a style for native app install ads.
    NativeStyle nativeStyle = new NativeStyle();
    nativeStyle.setName("Native style #" + new Random().nextInt(Integer.MAX_VALUE));
    nativeStyle.setCreativeTemplateId(nativeAppInstallTemplateId);
    nativeStyle.setSize(size);
    nativeStyle.setHtmlSnippet(htmlSnippet);
    nativeStyle.setCssSnippet(cssSnippet);

    // Create the native style on the server.
    NativeStyle[] nativeStyles =
        nativeStyleService.createNativeStyles(new NativeStyle[] {nativeStyle});

    for (NativeStyle createdNativeStyle : nativeStyles) {
      System.out.printf("A native style with ID %d and name '%s' was created.%n",
          createdNativeStyle.getId(),
          createdNativeStyle.getName());
    }
  }

  public static void main(String[] args) {
    DfpSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder().forApi(Api.DFP).fromFile().build().generateCredential();

      // Construct a DfpSession.
      session = new DfpSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
          "Failed to load configuration from the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
          "Invalid configuration in the %s file. Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
          "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
              + "Exception: %s%n",
          DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }

    DfpServices dfpServices = new DfpServices();

    try {
      runExample(dfpServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the dfp.axis
      // packages will return a meaningful value from toString
      //
      // ApiException extends RemoteException, so this catch block must appear before the
      // catch block for RemoteException.
      System.err.println("Request failed due to ApiException. Underlying ApiErrors:");
      if (apiException.getErrors() != null) {
        int i = 0;
        for (ApiError apiError : apiException.getErrors()) {
          System.err.printf("  Error %d: %s%n", i++, apiError);
        }
      }
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    }
  }
}
