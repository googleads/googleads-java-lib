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

package dfp.axis.v201802.cdnconfigurationservice;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201802.ApiError;
import com.google.api.ads.dfp.axis.v201802.ApiException;
import com.google.api.ads.dfp.axis.v201802.CdnConfiguration;
import com.google.api.ads.dfp.axis.v201802.CdnConfigurationServiceInterface;
import com.google.api.ads.dfp.axis.v201802.CdnConfigurationType;
import com.google.api.ads.dfp.axis.v201802.MediaLocationSettings;
import com.google.api.ads.dfp.axis.v201802.OriginForwardingType;
import com.google.api.ads.dfp.axis.v201802.SecurityPolicySettings;
import com.google.api.ads.dfp.axis.v201802.SecurityPolicyType;
import com.google.api.ads.dfp.axis.v201802.SourceContentConfiguration;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.rmi.RemoteException;

/**
 * This example creates new CDN configurations.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateCdnConfigurations {

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
    // Get the CdnConfigurationService.
    CdnConfigurationServiceInterface cdnConfigurationService =
        dfpServices.get(session, CdnConfigurationServiceInterface.class);

    // Make CDN configuration objects.
    // Only LIVE_STREAM_SOURCE_CONTENT is currently supported by the API.
    // Basic example with no security policies.
    CdnConfiguration cdnConfigurationWithoutSecurityPolicy = new CdnConfiguration();

    SecurityPolicySettings noSecurityPolicy = new SecurityPolicySettings();
    noSecurityPolicy.setSecurityPolicyType(SecurityPolicyType.NONE);
    MediaLocationSettings mediaLocationSettings = new MediaLocationSettings();
    mediaLocationSettings.setUrlPrefix("example.google.com");
    mediaLocationSettings.setSecurityPolicy(noSecurityPolicy);

    SourceContentConfiguration sourceContentConfigWithNoSecurityPolicy =
        new SourceContentConfiguration();
    sourceContentConfigWithNoSecurityPolicy.setIngestSettings(mediaLocationSettings);
    sourceContentConfigWithNoSecurityPolicy.setDefaultDeliverySettings(mediaLocationSettings);

    cdnConfigurationWithoutSecurityPolicy.setName("ApiConfig1");
    cdnConfigurationWithoutSecurityPolicy.setCdnConfigurationType(
        CdnConfigurationType.LIVE_STREAM_SOURCE_CONTENT);
    cdnConfigurationWithoutSecurityPolicy.setSourceContentConfiguration(
        sourceContentConfigWithNoSecurityPolicy);

    // Complex example with security policies.
    CdnConfiguration cdnConfigurationWithSecurityPolicy = new CdnConfiguration();

    SecurityPolicySettings ingestSecurityPolicySettings = new SecurityPolicySettings();
    ingestSecurityPolicySettings.setSecurityPolicyType(SecurityPolicyType.AKAMAI);
    ingestSecurityPolicySettings.setDisableServerSideUrlSigning(false);
    ingestSecurityPolicySettings.setTokenAuthenticationKey("abc123");

    MediaLocationSettings ingestSettings = new MediaLocationSettings();
    ingestSettings.setUrlPrefix("example.google.com");
    ingestSettings.setSecurityPolicy(ingestSecurityPolicySettings);

    SecurityPolicySettings deliverySecurityPolicySettings = new SecurityPolicySettings();
    deliverySecurityPolicySettings.setSecurityPolicyType(SecurityPolicyType.AKAMAI);
    deliverySecurityPolicySettings.setDisableServerSideUrlSigning(false);
    deliverySecurityPolicySettings.setOriginForwardingType(OriginForwardingType.CONVENTIONAL);
    deliverySecurityPolicySettings.setOriginPathPrefix("/path/to/my/origin");

    MediaLocationSettings deliverySettings = new MediaLocationSettings();
    deliverySettings.setUrlPrefix("example.google.com");
    deliverySettings.setSecurityPolicy(deliverySecurityPolicySettings);

    SourceContentConfiguration sourceContentConfigurationWithSecurityPolicy =
        new SourceContentConfiguration();
    sourceContentConfigurationWithSecurityPolicy.setIngestSettings(ingestSettings);
    sourceContentConfigurationWithSecurityPolicy.setDefaultDeliverySettings(deliverySettings);

    cdnConfigurationWithSecurityPolicy.setName("ApiConfig2");
    cdnConfigurationWithSecurityPolicy.setCdnConfigurationType(
        CdnConfigurationType.LIVE_STREAM_SOURCE_CONTENT);
    cdnConfigurationWithSecurityPolicy.setSourceContentConfiguration(
        sourceContentConfigurationWithSecurityPolicy);

    // Create the cdnConfigurations on the server.
    CdnConfiguration[] cdnConfigurations =
        cdnConfigurationService.createCdnConfigurations(new CdnConfiguration[] {
            cdnConfigurationWithoutSecurityPolicy,
            cdnConfigurationWithSecurityPolicy});

    for (CdnConfiguration createdCdnConfiguration : cdnConfigurations) {
      System.out.printf("A CDN configuration with ID %d and name '%s' was created.%n",
          createdCdnConfiguration.getId(), createdCdnConfiguration.getName());
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
