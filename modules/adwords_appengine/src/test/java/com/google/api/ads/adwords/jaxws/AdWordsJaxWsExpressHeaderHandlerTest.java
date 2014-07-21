// Copyright 2013 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.conf.AdWordsApiConfiguration;
import com.google.api.ads.common.lib.soap.jaxws.JaxWsHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.verification.VerificationMode;

import javax.xml.ws.BindingProvider;

/**
 * Tests for {@link AdWordsJaxWsExpressHeaderHandler}.
 *
 * @author Josh Radcliff (jradcliff@google.com)
 */
@RunWith(JUnit4.class)
public class AdWordsJaxWsExpressHeaderHandlerTest {

  private AdWordsJaxWsExpressHeaderHandler expressHandler;

  @Mock
  private AdWordsApiConfiguration apiConfiguration;
  @Mock
  private JaxWsHandler jaxHandler;
  @Mock
  private AdWordsSession adWordsSession;
  @Mock
  private AdWordsServiceDescriptor adWordsServiceDescriptor;
  @Mock
  private BindingProvider bindingProvider;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    expressHandler = new AdWordsJaxWsExpressHeaderHandler(jaxHandler, apiConfiguration);
  }

  /**
   * Tests setHeaders when business ID is not null on the session.
   */
  @Test
  public void testSetHeaders_withBusinessId() throws Exception {
    testSetHeaders(123456789L, times(1));
  }

  /**
   * Tests setHeaders when business ID is null on the session.
   */
  @Test
  public void testSetHeaders_withoutBusinessId() throws Exception {
    testSetHeaders(null, never());
  }

  /**
   * Tests setHeaders using the provided businessId. Will verify that setHeaderChild was (or was
   * not) invoked according to setHeaderChildVerificationMode.
   */
  private void testSetHeaders(Long businessId, VerificationMode setHeaderChildVerificationMode)
      throws Exception {
    when(adWordsSession.getExpressBusinessId()).thenReturn(businessId);

    String version = "v201406";
    String namespacePrefix = "http://www.example.com";

    when(adWordsServiceDescriptor.getVersion()).thenReturn(version);
    when(apiConfiguration.getNamespacePrefix()).thenReturn(namespacePrefix);

    String expectedNamespace = "http://www.example.com/express/v201406";

    expressHandler.setHeaders(bindingProvider, adWordsSession, adWordsServiceDescriptor);

    verify(jaxHandler, setHeaderChildVerificationMode).setHeaderChildString(bindingProvider,
        AdWordsJaxWsHeaderHandler.REQUEST_HEADER_LOCAL_PART, expectedNamespace,
        AdWordsJaxWsExpressHeaderHandler.EXPRESS_BUSINESS_ID_LOCAL_PART,
        businessId == null ? null : businessId.toString());
  }

}
