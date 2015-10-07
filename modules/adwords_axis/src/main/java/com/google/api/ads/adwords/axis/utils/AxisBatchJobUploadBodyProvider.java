// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils;

import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.api.client.http.ByteArrayContent;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import org.apache.axis.encoding.SerializationContext;
import org.xml.sax.Attributes;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.namespace.QName;

/**
 * Implementation of {@link BatchJobUploadBodyProvider} for Axis requests.
 */
public class AxisBatchJobUploadBodyProvider implements BatchJobUploadBodyProvider {
  /**
   * For incremental uploads, each request's contents must have a length
   * divisible by this size. 
   */
  private static final int REQUIRED_CONTENT_LENGTH_INCREMENT = 262144;

  @Override
  public ByteArrayContent getHttpContent(BatchJobMutateRequestInterface request,
      boolean isFirstRequest, boolean isLastRequest) throws BatchJobException {
    Preconditions.checkNotNull(request, "Null request");

    StringWriter writer = new StringWriter();
    SerializationContext context = new SerializationContext(writer) {
      /**
       * Override the serialize method called by the Axis serializer and force it to
       * pass {@code includeNull = false}.
       */
      @SuppressWarnings("rawtypes")
      @Override
      public void serialize(QName elemQName, Attributes attributes, Object value, QName xmlType,
          Class javaType) throws IOException {
        super.serialize(elemQName, attributes, value, xmlType, javaType, false, null);
      }
    };
    context.setSendDecl(false);
    context.setPretty(true);
    
    AxisSerializer serializer = new AxisSerializer();
    serializer.serialize(request, context);

    String serializedRequest =
        trimStartEndElements(writer.toString(), isFirstRequest, isLastRequest);

    // If the request is part of a set of incremental uploads, then pad to the required content
    // length. This is not necessary if all operations for the job are being uploaded in this
    // one single request.
    if (!(isFirstRequest && isLastRequest)) {
      int numBytes = serializedRequest.getBytes().length;
      int remainder = numBytes % REQUIRED_CONTENT_LENGTH_INCREMENT;
      if (remainder > 0) {
        int pad = REQUIRED_CONTENT_LENGTH_INCREMENT - remainder;
        serializedRequest = Strings.padEnd(serializedRequest, numBytes + pad, ' ');
      }
    }
    return new ByteArrayContent("application/xml", serializedRequest.getBytes());
  }

  @VisibleForTesting
  String trimStartEndElements(
      String serializedRequest, boolean isFirstRequest, boolean isLastRequest) {
    int beginIndex = 0;
    int endIndex = serializedRequest.length();
    if (!isFirstRequest) {
      beginIndex = serializedRequest.indexOf('>') + 1;
    }
    if (!isLastRequest) {
      endIndex = serializedRequest.lastIndexOf('<');
    }
    return serializedRequest.substring(beginIndex, endIndex);
  }
}
