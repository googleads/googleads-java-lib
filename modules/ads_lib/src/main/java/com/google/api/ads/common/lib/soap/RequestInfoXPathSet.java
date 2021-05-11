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

import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.conf.AdsApiConfiguration;
import com.google.api.ads.common.lib.utils.IterableXPath;
import com.google.api.ads.common.lib.utils.NodeExtractor;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import org.slf4j.Logger;

/** XPaths to capture from SOAP requests. */
public class RequestInfoXPathSet {

  private final IterableXPath contextXPath;
  private final String contextName;
  private final NodeExtractor nodeExtractor;
  private final Supplier<Transformer> transformerSupplier;
  private final Logger libLogger;

  @Inject
  public RequestInfoXPathSet(
      AdsApiConfiguration apiConfig,
      NodeExtractor nodeExtractor,
      Supplier<Transformer> transformerSupplier,
      @Named("libLogger") Logger libLogger) {
    Preconditions.checkNotNull(apiConfig);
    this.contextXPath = new IterableXPath(apiConfig.getRequestContextXPath());
    this.contextName =
        Iterables.isEmpty(this.contextXPath) ? null : Iterables.getLast(this.contextXPath);
    this.nodeExtractor = Preconditions.checkNotNull(nodeExtractor);
    this.transformerSupplier = Preconditions.checkNotNull(transformerSupplier);
    this.libLogger = Preconditions.checkNotNull(libLogger);
  }

  public IterableXPath getContextXPath() {
    return contextXPath;
  }

  public String getContextName() {
    return contextName;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("contextName", contextName)
        .add("contextXPath", contextXPath)
        .toString();
  }

  public RequestInfo.Builder parseMessage(RequestInfo.Builder builder, SOAPMessage soapMessage) {
    Preconditions.checkNotNull(builder, "Null builder");
    Transformer transformer = transformerSupplier.get();
    if (soapMessage == null || soapMessage.getSOAPPart() == null || transformer == null) {
      return builder;
    }
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      // Some SOAP frameworks don't include SOAP headers when calling SOAPMessage.writeTo.
      // Use an XML transformer to write the XML content instead.
      transformer.transform(soapMessage.getSOAPPart().getContent(), new StreamResult(outputStream));
      builder.withPayload(outputStream.toString(StandardCharsets.UTF_8.name()));
    } catch (TransformerException | SOAPException | IOException e) {
      builder.withPayload("Unable to read request content due to exception: " + e);
      libLogger.warn("Unable to read request content due to exception.", e);
    }

    try {
      SOAPHeader soapHeader = soapMessage.getSOAPHeader();
      builder.withContext(contextName, nodeExtractor.extractNodeValue(soapHeader, contextXPath));
    } catch (SOAPException e) {
      builder.withContext(
          contextName, "Unable to extract " + contextName + " from request due to exception: " + e);
    }
    return builder;
  }
}
