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

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.api.client.http.ByteArrayContent;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedSet;
import java.io.IOException;
import java.io.StringWriter;
import java.util.SortedSet;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.SerializationContext;
import org.xml.sax.Attributes;

/**
 * Implementation of {@link BatchJobUploadBodyProvider} for Axis requests.
 */
public class AxisBatchJobUploadBodyProvider implements BatchJobUploadBodyProvider {
  
  private final SortedSet<String> namespaceUris;
  
  public AxisBatchJobUploadBodyProvider(Iterable<String> namespaceUris) {
    this.namespaceUris = ImmutableSortedSet.copyOf(namespaceUris);
  }
  
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
    
    // Pre-register namespaces using the *sorted* list of namespaces. This ensures that
    // when performing an incremental upload, the same namespace prefix will be used
    // for each namespace URI across all uploads.
    int namespaceIndex = 0;
    for(String namespaceUri : namespaceUris) {
      context.registerPrefixForURI(String.format("ns%d", namespaceIndex++),
          namespaceUri);
    }
    
    AxisSerializer serializer = new AxisSerializer();
    serializer.serialize(request, context);

    return new ByteArrayContent("application/xml", writer.toString().getBytes(UTF_8));
  }

}
