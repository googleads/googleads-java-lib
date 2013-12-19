// Copyright 2013 Google Inc. All Rights Reserved.
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

package dfa.axis.v1_20;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfa.axis.factory.DfaServices;
import com.google.api.ads.dfa.axis.v1_20.Size;
import com.google.api.ads.dfa.axis.v1_20.SizeRecordSet;
import com.google.api.ads.dfa.axis.v1_20.SizeRemote;
import com.google.api.ads.dfa.axis.v1_20.SizeSearchCriteria;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example gets the size ID for a given width and height.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: size.getSize
 *
 * @author Joseph DiLallo
 */
public class GetSize {

  // Provide size dimensions to search for.
  private static final String WIDTH = "INSERT_WIDTH_HERE";
  private static final String HEIGHT = "INSERT_HEIGHT_HERE";

  public static void runExample(
      DfaServices dfaServices, DfaSession session, int width, int height) throws Exception {
    // Request the size service from the service client factory.
    SizeRemote sizeService = dfaServices.get(session, SizeRemote.class);

    // Get size.
    SizeSearchCriteria sizeSearchCriteria = new SizeSearchCriteria();
    sizeSearchCriteria.setHeight(height);
    sizeSearchCriteria.setWidth(width);
    SizeRecordSet sizeRecordSet = sizeService.getSizes(sizeSearchCriteria);

    // Display size ID.
    if (sizeRecordSet.getRecords().length > 0) {
      for (Size size: sizeRecordSet.getRecords()) {
        System.out.printf("Size ID for \"%sx%s\" is \"%s\".%n", width, height, size.getId());
      }
    } else {
      System.out.println("No sizes found for your criteria.");
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential, which replaces legacy passwords
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFA)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfaSession.
    DfaSession session = new DfaSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfaServices dfaServices = new DfaServices();

    int width = Integer.parseInt(WIDTH);
    int height = Integer.parseInt(HEIGHT);

    runExample(dfaServices, session, width, height);
  }
}
