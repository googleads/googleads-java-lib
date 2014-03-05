// Copyright 2011 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.lib.auth;

import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.inject.Inject;

import java.lang.reflect.InvocationTargetException;

/**
 * A utility class that can authenticate against the DFA API and return
 * authentication tokens.
 *
 * @author Joseph DiLallo
 */
public class LoginTokens {

  private final LoginTokensHelper loginTokensHelper;

  /**
   * Constructor.
   * @param loginTokensHelper the login ticket provider helper
   */
  @Inject
  public LoginTokens(LoginTokensHelper loginTokensHelper) {
    this.loginTokensHelper = loginTokensHelper;
  }

  /**
   * Generates a new authentication token using reflection.
   *
   * @param stubPackage the package where all generated stubs are located
   * @param session the DFA session
   * @return an authentication token
   * @throws LoginTokenException thrown if generating a token fails
   */
  public String generateToken(String stubPackage, DfaSession session)
      throws LoginTokenException {
    try {
      // Instantiate a SOAP client connected to the login service.
      Class<?> loginClass = loginTokensHelper.getLoginClass(stubPackage);
      Object loginService = loginTokensHelper.getLoginService(session, loginClass);

      // Authenticate.
      Object userProfile =
          loginTokensHelper.authenticate(session.getUsername(), session.getPassword(),
              loginClass, loginService);

      // Fetch the token from the returned UserProfile.
      String token = loginTokensHelper.retrieveToken(userProfile);
      return token;
    } catch (ClassNotFoundException e) {
      throw new LoginTokenException(
          "Unable to generate authentication token because of error:", e);
    } catch (NoSuchMethodException e) {
      throw new LoginTokenException(
          "Unable to generate authentication token because of error:", e);
    } catch (InvocationTargetException e) {
      throw new LoginTokenException("Unable to generate authentication token because of error:",
          e.getTargetException());
    } catch (IllegalAccessException e) {
      throw new LoginTokenException(
          "Unable to generate authentication token because of error:", e);
    }
  }
}
