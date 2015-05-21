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

package com.google.api.ads.dfa.axis.utils;

import com.google.api.ads.dfa.lib.auth.LoginTokensHelper;
import com.google.api.ads.dfa.lib.client.DfaServiceClient;
import com.google.api.ads.dfa.lib.client.DfaSession;
import com.google.api.ads.dfa.lib.factory.DfaServiceClientFactory;
import com.google.inject.Inject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Implementation of {@link LoginTokensHelper} for Axis.
 *
 * @author Adam Rogal
 */
public class DfaAxisLoginTokensHelper implements LoginTokensHelper {

  private final DfaServiceClientFactory dfaServiceClientFactory;

  /**
   * Constructor.
   * @param dfaServiceClientFactory the DFA service client factory
   */
  @Inject
  public DfaAxisLoginTokensHelper(DfaServiceClientFactory dfaServiceClientFactory) {
    this.dfaServiceClientFactory = dfaServiceClientFactory;
  }

  /**
   * Retrieves the {@code Class} object representing the login service.
   *
   * @param stubPackage the package where all generated stubs are located
   * @return the {@code Class} object representing the login service
   * @throws ClassNotFoundException if the class cannot be resolved
   */
  @Override
  public Class<?> getLoginClass(String stubPackage) throws ClassNotFoundException {
    return Class.forName(stubPackage + ".LoginRemote");
  }

  /**
   * Retrieves the {@code Class} object representing user profiles.
   *
   * @param stubPackage the package where all generated stubs are located
   * @return the {@code Class} object representing user profiles
   * @throws ClassNotFoundException if the class cannot be resolved
   */
  @Override
  public Class<?> getUserProfileClass(String stubPackage) throws ClassNotFoundException {
    return Class.forName(stubPackage + ".UserProfile");
  }

  /**
   * Returns a {@link DfaServiceClient} wrapping the login service.
   *
   * @param session the DFA session
   * @param loginClass the {@code Class} type of the login service
   * @return a client pointing to the login service
   */
  @Override
  public Object getLoginService(DfaSession session, Class<?> loginClass) {
    return dfaServiceClientFactory.getServiceClientAsInterface(session, loginClass);
  }

  /**
   * Authenticates against the DFA API.
   *
   * @param username the username
   * @param password the password
   * @param loginClass the {@code Class} type of the login service
   * @param loginService a service client object wrapping the login service
   * @return the {@code UserProfile} response from the API
   * @throws IllegalArgumentException if one of the arguments used in
   *     authenticating is not allowed
   * @throws IllegalAccessException if the {@code authenticate} method cannot be
   *     accessed
   * @throws InvocationTargetException if an error occurs while invoking the
   *     {@code authenticate} method
   * @throws NoSuchMethodException if the {@code authenticate method} cannot be
   *     located
   */
  @Override
  public Object authenticate(String username, String password, Class<?> loginClass,
      Object loginService) throws IllegalArgumentException, IllegalAccessException,
      InvocationTargetException, NoSuchMethodException {
    Class<?> paramTypes[] = {String.class, String.class};
    Method authMethod = loginClass.getDeclaredMethod("authenticate", paramTypes);
    Object argList[] = {username, password};
    return authMethod.invoke(loginService, argList);
  }

  /**
   * Retrieves the user's authentication token from the {@code UserProfile}
   * returned by the DFA API.
   *
   * @param userProfile the {@code UserProfile} object returned by the API
   * @return the users authentication token
   * @throws ClassNotFoundException if the {@code UserProfile} class cannot be
   *     located
   * @throws InvocationTargetException if an error occurs while invoking
   *     {@code getToken} on the given object
   * @throws NoSuchMethodException if the {@code getToken} method cannot be
   *     found.
   * @throws IllegalAccessException if the {@code getToken} method cannot be
   *     accessed.
   */
  @Override
  public String retrieveToken(Object userProfile) throws ClassNotFoundException,
      InvocationTargetException, NoSuchMethodException, IllegalAccessException {
    Class<?> paramTypes[] = new Class<?>[] {};
    Object argList[] = new Object[] {};
    Method getToken = userProfile.getClass().getMethod("getToken", paramTypes);
    return (String) getToken.invoke(userProfile, argList);
  }
}
