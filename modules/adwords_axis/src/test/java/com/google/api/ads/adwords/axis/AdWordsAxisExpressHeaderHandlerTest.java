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

package com.google.api.ads.adwords.axis;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;

import org.apache.axis.client.Stub;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Test case for {@link AdWordsAxisExpressHeaderHandler}.
 * 
 * @author Josh Radcliff
 */
@RunWith(JUnit4.class)
public class AdWordsAxisExpressHeaderHandlerTest {

  private AdWordsAxisExpressHeaderHandler expressHandler;
  
  @Mock
  private AxisHandler axisHandler;
  @Mock
  private AdWordsSession adWordsSession;
  @Mock
  private Stub soapClient;
  @Mock
  private AdWordsServiceDescriptor adWordsServiceDescriptor;
  
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    
    expressHandler = new AdWordsAxisExpressHeaderHandler(axisHandler);
  }

  /**
   * Tests that the business ID will be set on the header when business ID
   * is set on the AdWordsSession.
   */
  @Test
  public void testSetHeaders_withBusinessId() throws ServiceException, AuthenticationException {
    Long businessId = 123456748L;
    when(adWordsSession.getExpressBusinessId()).thenReturn(businessId);
    expressHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);

    verify(axisHandler).setHeaderChild(soapClient,
        AdWordsAxisHeaderHandler.REQUEST_HEADER_LOCAL_PART,
        AdWordsAxisExpressHeaderHandler.EXPRESS_BUSINESS_ID_LOCAL_PART, businessId);
  }
  
  /**
   * Tests that neither the business ID nor the plus page ID will be set on the header when
   * neither business ID nor plus page ID is set on the AdWordsSession.
   */
  @Test
  public void testSetHeaders_withoutBusinessId_withoutPlusPageId() throws ServiceException,
      AuthenticationException {
    when(adWordsSession.getExpressBusinessId()).thenReturn(null);
    when(adWordsSession.getExpressPlusPageId()).thenReturn(null);
    expressHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);
    
    // setHeaders should be a no-op when there's no business ID or plus page ID on the session
    verify(axisHandler, never()).setHeaderChild(Mockito.<Stub>any(), anyString(), anyString(),
        any());    
  }

  /**
   * Tests that the plus page ID will be set on the header when plus page ID
   * is set on the AdWordsSession.
   */
  @Test
  public void testSetHeaders_withPlusPageId() throws ServiceException, AuthenticationException {
    String plusPageId = "1234567890";
    when(adWordsSession.getExpressBusinessId()).thenReturn(null);
    when(adWordsSession.getExpressPlusPageId()).thenReturn(plusPageId);
    expressHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);
  
    verify(axisHandler).setHeaderChild(soapClient,
        AdWordsAxisHeaderHandler.REQUEST_HEADER_LOCAL_PART,
        AdWordsAxisExpressHeaderHandler.PLUS_PAGE_ID_LOCAL_PART, plusPageId);
  }

  /**
   * Tests that the plus page ID will NOT be set on the header when plus page ID
   * is NOT set on the AdWordsSession.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testSetHeaders_bothIdsOnSession_fails() throws ServiceException,
      AuthenticationException {
    when(adWordsSession.getExpressBusinessId()).thenReturn(12345L);
    when(adWordsSession.getExpressPlusPageId()).thenReturn("ABCDE");

    expressHandler.setHeaders(soapClient, adWordsSession, adWordsServiceDescriptor);
  }

}
