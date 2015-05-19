// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfa.axis.testing.mocks.v1_12;

/**
 * Mock login remote. Named similarly enough to be mistaken for the DFA API's
 * login service. Used to test {@code DfaServiceClient} and
 * {@code LoginTokens}.
 *
 * @author Joseph DiLallo
 */
public class LoginSoapBindingStub implements LoginRemote {

  public static final UserProfile USER_PROFILE = new UserProfile();
  /**
   * Mock of DFA's login service authenticate operation.
   *
   * @param username DFA user profile name
   * @param password DFA user profile password
   * @return a user profile
   */
  @Override
  public UserProfile authenticate(String username, String password) {
    return USER_PROFILE;
  }

  /**
   * Mock of DFA's login service impersonateUser operation.
   *
   * @param username DFA superuser profile name
   * @param password DFA superuser profile password
   * @param targetUsername username to impersonate
   * @return a user profile
   */
  @Override
  public UserProfile impersonateUser(String username, String password, String targetUsername) {
    return USER_PROFILE;
  }

  /**
   * Mock of DFA's login service impersonateNetwork operation.
   *
   * @param username DFA superuser profile name
   * @param password DFA superuser profile token
   * @param networkId network to impersonate
   * @return a user profile
   */
  @Override
  public UserProfile impersonateNetwork(String username, String password, long networkId) {
    return USER_PROFILE;
  }
}
