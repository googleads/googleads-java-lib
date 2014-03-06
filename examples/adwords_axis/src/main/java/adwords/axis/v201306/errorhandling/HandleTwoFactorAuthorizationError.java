// Copyright 2012 Google Inc. All Rights Reserved.
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

package adwords.axis.v201306.errorhandling;

import com.google.api.ads.common.lib.auth.ClientLoginTokens;
import com.google.api.ads.common.lib.auth.ClientLoginTokens.Api;
import com.google.api.client.googleapis.auth.clientlogin.ClientLoginResponseException;

/**
 * This example demonstrates how to handle two-factor authorization errors.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * @author Kevin Winter
 */
public class HandleTwoFactorAuthorizationError {

  static final String LOGIN_EMAIL = "2steptester@gmail.com";
  static final String PASSWORD = "testaccount";

  public static void main(String[] args) throws Exception {
    runExample(LOGIN_EMAIL, PASSWORD);
  }

  public static void runExample(String loginEmail, String password) throws Exception {
    try {
      System.out.println(new ClientLoginTokens.Builder().forApi(Api.ADWORDS)
          .withEmailAndPassword(loginEmail, password).build().requestToken());
    } catch (ClientLoginResponseException e) {
      if (e.getDetails().error.contains("InvalidSecondFactor")) {
        System.out
            .println("The user has enabled two factor authentication in this account. Have the "
                + "user generate an application-specific password to make calls against the "
                + "AdWords API. See "
                + "http://adwordsapi.blogspot.com/2011/02/authentication-changes-with-2-step.html"
                + " for more details.");
      } else {
        throw e;
      }
    }
  }
}
