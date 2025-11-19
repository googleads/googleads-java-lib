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

package admanager.axis.v202511.nativestyleservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202511.ApiError;
import com.google.api.ads.admanager.axis.v202511.ApiException;
import com.google.api.ads.admanager.axis.v202511.NativeStyle;
import com.google.api.ads.admanager.axis.v202511.NativeStyleServiceInterface;
import com.google.api.ads.admanager.axis.v202511.Size;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * This example creates a new native style.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the "ads.properties" file.
 * See README for more info.
 */
public class CreateNativeStyles {

  /**
   * Runs the example.
   *
   * @param adManagerServices the services factory.
   * @param session the session.
   * @throws ApiException if the API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   */
  public static void runExample(AdManagerServices adManagerServices, AdManagerSession session)
      throws RemoteException {
    // Get the NativeStyleService.
    NativeStyleServiceInterface nativeStyleService =
        adManagerServices.get(session, NativeStyleServiceInterface.class);

    String htmlSnippet =
        "<div id=\"adunit\" style=\"overflow: hidden;\">\n"
            + "  <img src='[%Thirdpartyimpressiontracker%]' style='display:none'>\n"
            + "  <div class='attribution'>Ad</div>\n"
            + "  <div class='image'>\n"
            + "    <a class='image-link' "
            + "href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' target='_top'>"
            + "<img src=\"[%Image%]\"></a>\n"
            + "  </div>\n"
            + "  <div class='app-icon'><img src=\"[%Appicon%]\"/></div>\n"
            + "  <div class='title'>\n"
            + "    <a class='title-link' "
            + "href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' "
            + "target='_top'>[%Headline%]</a>\n"
            + "  </div>\n"
            + "  <div class='reviews'></div>\n"
            + "  <div class='body'>\n"
            + "    <a class='body-link' "
            + "href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' "
            + "target='_top'>[%Body%]</a>\n"
            + "  </div>\n"
            + "  <div class='price'>[%Price%]</div>\n"
            + "  <div class='button'>\n"
            + "    <a class='button-link' "
            + "href='%%CLICK_URL_UNESC%%[%Thirdpartyclicktracker%]%%DEST_URL%%' "
            + "target='_top'>[%Calltoaction%]</a>\n"
            + "  </div>\n"
            + "</div>\n";

    String cssSnippet =
        "body {"
            + "    background-color: rgba(255, 255, 255, 1);"
            + "    font-family: \"Roboto-Regular\", sans-serif;"
            + "    font-weight: normal;"
            + "    font-size: 12px;"
            + "    line-height: 14px;"
            + "}"
            + ".attribution {"
            + "    background-color: rgba(236, 182, 0, 1);"
            + "    color: rgba(255, 255, 255, 1);"
            + "    font-size: 13px;"
            + "    display: table;"
            + "    margin: 4px 8px;"
            + "    padding: 0 3px;"
            + "    border-radius: 2px;"
            + "}"
            + ".image {"
            + "    text-align: center;"
            + "    margin: 8px;"
            + "}"
            + ".image img,"
            + ".image-link {"
            + "    width: 100%;"
            + "}"
            + ".app-icon {"
            + "    float: left;"
            + "    margin: 0 8px 4px 8px;"
            + "    height: 40px;"
            + "    width: 40px;"
            + "    background-color: transparent;"
            + "}"
            + ".app-icon img {"
            + "    height: 100%;"
            + "    width: 100%;"
            + "    border-radius: 20%;"
            + "}"
            + ".title {"
            + "    font-weight: bold;"
            + "    font-size: 14px;"
            + "    line-height: 20px;"
            + "    margin: 8px 8px 4px 8px;"
            + "}"
            + ".title a {"
            + "    color: rgba(112, 112, 112, 1);"
            + "    text-decoration: none;"
            + "}"
            + ".reviews {"
            + "    float: left;"
            + "}"
            + ".reviews svg {"
            + "    fill: rgba(0, 0, 0, 0.7);"
            + "}"
            + ".body {"
            + "    clear: left;"
            + "    margin: 8px;"
            + "}"
            + ".body a {"
            + "    color: rgba(110, 110, 110, 1);"
            + "    text-decoration: none;"
            + "}"
            + ".price {"
            + "    display: none;"
            + "}"
            + ".button {"
            + "    font-size: 14px;"
            + "    font-weight: bold;"
            + "    float: right;"
            + "    margin: 0px 16px 16px 0px;"
            + "    white-space: nowrap;"
            + "}"
            + ".button a {"
            + "    color: #2196F3;"
            + "    text-decoration: none;"
            + "}"
            + ".button svg {"
            + "    display: none;"
            + "}";

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
      System.out.printf(
          "A native style with ID %d and name '%s' was created.%n",
          createdNativeStyle.getId(), createdNativeStyle.getName());
    }
  }

  public static void main(String[] args) {
    AdManagerSession session;
    try {
      // Generate a refreshable OAuth2 credential.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.AD_MANAGER)
              .fromFile()
              .build()
              .generateCredential();

      // Construct a AdManagerSession.
      session =
          new AdManagerSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
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

    AdManagerServices adManagerServices = new AdManagerServices();

    try {
      runExample(adManagerServices, session);
    } catch (ApiException apiException) {
      // ApiException is the base class for most exceptions thrown by an API request. Instances
      // of this exception have a message and a collection of ApiErrors that indicate the
      // type and underlying cause of the exception. Every exception object in the admanager.axis
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
