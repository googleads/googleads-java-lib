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

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.client.HeaderHandler;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;
import com.google.api.ads.common.lib.soap.axis.AxisHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

import org.apache.axis.client.Stub;

import javax.inject.Inject;

/**
 * AdWords Express-specific header handler.
 */
public class AdWordsAxisExpressHeaderHandler implements
    HeaderHandler<AdWordsSession, AdWordsServiceDescriptor> {

  private final AxisHandler axisHandler;

  @VisibleForTesting
  static final String EXPRESS_BUSINESS_ID_LOCAL_PART = "expressBusinessId";
  @VisibleForTesting
  static final String PLUS_PAGE_ID_LOCAL_PART = "pageId";
  
  @Inject
  public AdWordsAxisExpressHeaderHandler(AxisHandler axisHandler) {
    this.axisHandler = axisHandler;
  }

  @Override
  public void setHeaders(Object soapClient, AdWordsSession adWordsSession,
      AdWordsServiceDescriptor adWordsServiceDescriptor) throws ServiceException,
      AuthenticationException {
    if (adWordsSession.getExpressBusinessId() != null
        || adWordsSession.getExpressPlusPageId() != null) {
      Preconditions.checkArgument(!(adWordsSession.getExpressBusinessId() != null
          && adWordsSession.getExpressPlusPageId() != null),
          "Both expressBusinessId and expressPlusPageId are not null. Please set "
          + "expressBusinessId, expressPlusPageId or neither, but not both.");
      Preconditions.checkArgument(soapClient instanceof Stub,
          "soapClient must be Stub but was: %s", soapClient);
      Stub stub = (Stub) soapClient;
      if (adWordsSession.getExpressPlusPageId() != null) {
        axisHandler.setHeaderChild(stub, AdWordsAxisHeaderHandler.REQUEST_HEADER_LOCAL_PART,
            PLUS_PAGE_ID_LOCAL_PART, adWordsSession.getExpressPlusPageId());
      } else {
        axisHandler.setHeaderChild(stub, AdWordsAxisHeaderHandler.REQUEST_HEADER_LOCAL_PART,
            EXPRESS_BUSINESS_ID_LOCAL_PART, adWordsSession.getExpressBusinessId());
      }
    }
  }
}
