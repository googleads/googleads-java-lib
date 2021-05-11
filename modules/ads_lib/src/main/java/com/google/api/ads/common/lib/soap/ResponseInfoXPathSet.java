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

package com.google.api.ads.common.lib.soap;

import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.api.ads.common.lib.utils.IterableXPath;
import com.google.api.ads.common.lib.utils.NodeExtractor;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.primitives.Longs;
import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;

/** XPaths to capture from SOAP responses. */
public class ResponseInfoXPathSet {

  private final IterableXPath requestIdXPath;
  private final IterableXPath responseTimeXPath;
  private final IterableXPath operationsCountXPath;
  private final NodeExtractor nodeExtractor;

  @Inject
  public ResponseInfoXPathSet(AdsApiConfiguration apiConfig, NodeExtractor nodeExtractor) {
    this.requestIdXPath = new IterableXPath(apiConfig.getRequestIdXPath());
    this.responseTimeXPath = new IterableXPath(apiConfig.getResponseTimeXPath());
    this.operationsCountXPath = new IterableXPath(apiConfig.getResponseOperationsCountXPath());
    this.nodeExtractor = nodeExtractor;
  }

  public IterableXPath getRequestIdXPath() {
    return requestIdXPath;
  }

  public IterableXPath getResponseTimeXPath() {
    return responseTimeXPath;
  }

  public IterableXPath getOperationsCountXPath() {
    return operationsCountXPath;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("requestIdXPath", requestIdXPath)
        .add("responseTimeXPath", responseTimeXPath)
        .add("operationsCountXPath", operationsCountXPath)
        .toString();
  }

  public ResponseInfo.Builder parseMessage(ResponseInfo.Builder builder, SOAPMessage soapMessage) {
    Preconditions.checkNotNull(builder, "Null builder");
    if (soapMessage == null) {
      return builder;
    }
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      soapMessage.writeTo(outputStream);
      builder.withPayload(outputStream.toString(StandardCharsets.UTF_8.name()));
    } catch (SOAPException | IOException e) {
      builder.withPayload("Unable to read response due to exception: " + e);
    }

    try {
      SOAPHeader soapHeader = soapMessage.getSOAPHeader();
      String responseTimeString = nodeExtractor.extractNodeValue(soapHeader, responseTimeXPath);
      String operationsString = nodeExtractor.extractNodeValue(soapHeader, operationsCountXPath);
      builder
          .withRequestId(nodeExtractor.extractNodeValue(soapHeader, requestIdXPath))
          .withResponseTimeMillis(Longs.tryParse(Strings.nullToEmpty(responseTimeString)))
          .withOperationsCount(Longs.tryParse(Strings.nullToEmpty(operationsString)));
    } catch (SOAPException e) {
      // Since requestId is arguably the most important value extracted above, put the exception
      // in the requestId field. Adding the exception to every field of the builder would be
      // redundant.
      builder.withRequestId("Unable to extract the requestId due to exception: " + e);
    }
    return builder;
  }
}
