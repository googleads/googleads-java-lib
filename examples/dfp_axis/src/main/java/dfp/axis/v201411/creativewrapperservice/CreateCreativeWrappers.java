// Copyright 2014 Google Inc. All Rights Reserved.
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

package dfp.axis.v201411.creativewrapperservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201411.CreativeWrapper;
import com.google.api.ads.dfp.axis.v201411.CreativeWrapperHtmlSnippet;
import com.google.api.ads.dfp.axis.v201411.CreativeWrapperOrdering;
import com.google.api.ads.dfp.axis.v201411.CreativeWrapperServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example creates a new creative wrapper. Creative wrappers must be
 * associated with a LabelType.CREATIVE_WRAPPER label and applied to ad units by
 * AdUnit.appliedLabels. To determine which creative wrappers exist, run
 * GetAllCreativeWrappers.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CreativeWrapperService.createCreativeWrappers
 *
 * @author Adam Rogal
 */
public class CreateCreativeWrappers {

  // Set the ID of the label that can be associated with creative wrappers.
  private static final String LABEL_ID = "INSERT_CREATIVE_WRAPPER_LABEL_ID_HERE";

  public static void runExample(DfpServices dfpServices, DfpSession session, long labelId)
      throws Exception {
    // Get the CreativeWrapperService.
    CreativeWrapperServiceInterface creativeWrapperService =
        dfpServices.get(session, CreativeWrapperServiceInterface.class);

    // Create a creative wrapper.
    CreativeWrapper innerCreativeWrapper = new CreativeWrapper();
    // A label can only be associated with one creative wrapper.
    innerCreativeWrapper.setLabelId(labelId);
    innerCreativeWrapper.setOrdering(CreativeWrapperOrdering.INNER);
    innerCreativeWrapper.setHeader(
        new CreativeWrapperHtmlSnippet("<b>My creative wrapper header</b>"));
    innerCreativeWrapper.setFooter(
        new CreativeWrapperHtmlSnippet("<b>My creative wrapper footer</b>"));

    // Create the creative wrapper on the server.
    CreativeWrapper[] creativeWrappers =
        creativeWrapperService.createCreativeWrappers(new CreativeWrapper[] {innerCreativeWrapper});

    for (CreativeWrapper createdCreativeWrapper : creativeWrappers) {
      System.out.printf(
          "Creative wrapper with ID \"%d\" applying to label \"%d\" was created.\n",
          createdCreativeWrapper.getId(), createdCreativeWrapper.getLabelId());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    runExample(dfpServices, session, Long.parseLong(LABEL_ID));
  }
}
