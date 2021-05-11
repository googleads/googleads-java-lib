// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.factory;

import static org.junit.Assert.assertThat;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.SessionUtility;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Module;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Tests for {@link DependencyBootstrapperImpl}.
 */
@RunWith(JUnit4.class)
public class DependencyBootstrapperImplTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  private DependencyBootstrapper bootstrapper;

  @Mock private AdWordsSession session;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    Module testModule =
        new AbstractModule() {
          @Override
          protected void configure() {
            bind(HttpTransport.class).to(NetHttpTransport.class);
          }
        };
    bootstrapper = new DependencyBootstrapperImpl(Guice.createInjector(testModule));
  }

  /**
   * Tests that the bootstrapper is able to retrieve an instance of a type that is not annotated
   * with {@link SessionUtility}.
   */
  @Test
  public void testGetNonSessionUtility() {
    HttpTransport httpTransport = bootstrapper.getInstanceOf(session, HttpTransport.class);
    assertThat(httpTransport, Matchers.instanceOf(NetHttpTransport.class));
  }

  /**
   * Tests that the bootstrapper fails to retrieve an instance of a type that is annotated with
   * {@link SessionUtility}.
   */
  @Test
  public void testGetSessionUtility_fails() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("SessionUtility");
    bootstrapper.getInstanceOf(session, MockSessionUtility.class);
  }

  @SessionUtility
  private static class MockSessionUtility {}
}
