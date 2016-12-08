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

package dfp.axis.v201611.teamservice;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201611.Team;
import com.google.api.ads.dfp.axis.v201611.TeamAccessType;
import com.google.api.ads.dfp.axis.v201611.TeamServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.client.auth.oauth2.Credential;
import java.util.Random;

/**
 * This example creates new teams. To determine which teams exist, run
 * GetAllTeams.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateTeams {

  public static void runExample(DfpServices dfpServices, DfpSession session) throws Exception {
    // Get the TeamService.
    TeamServiceInterface teamService =
        dfpServices.get(session, TeamServiceInterface.class);

    // Create a read/write team.
    Team readWriteTeam = new Team();
    readWriteTeam.setName("Read/write team #" + new Random().nextInt(Integer.MAX_VALUE));
    readWriteTeam.setTeamAccessType(TeamAccessType.READ_WRITE);
    readWriteTeam.setHasAllCompanies(false);
    readWriteTeam.setHasAllInventory(false);

    // Create a read-only team.
    Team readOnlyTeam = new Team();
    readOnlyTeam.setName("Read-only team #" + new Random().nextInt(Integer.MAX_VALUE));
    readOnlyTeam.setTeamAccessType(TeamAccessType.READ_ONLY);
    readOnlyTeam.setHasAllCompanies(false);
    readOnlyTeam.setHasAllInventory(false);

    // Create the teams on the server.
    Team[] teams = teamService.createTeams(new Team[] {readWriteTeam, readOnlyTeam});

    for (Team createdTeam : teams) {
      System.out.printf("A team with ID %d and name '%s' was created.%n",
          createdTeam.getId(), createdTeam.getName());
    }
  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
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

    runExample(dfpServices, session);
  }
}
