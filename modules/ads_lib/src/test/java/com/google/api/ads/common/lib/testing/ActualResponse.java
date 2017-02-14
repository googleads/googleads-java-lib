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

package com.google.api.ads.common.lib.testing;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/** Container for key attributes from request/response processing by a {@link MockHttpServer}. */
public class ActualResponse {
  private final ListMultimap<String, String> requestHeaders;
  private String requestBody;

  @SuppressWarnings("unchecked")
  public ActualResponse(Map<String, List<String>> map) {
    this.requestHeaders = ArrayListMultimap.create();
    for (Entry<String, List<String>> headerEntry : map.entrySet()) {
      this.requestHeaders.putAll(headerEntry.getKey(), headerEntry.getValue());
    }
  }

  public List<String> getRequestHeader(String name) {
    return requestHeaders.get(name);
  }

  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }

  public boolean wasRequestBodyCompressed() {
    return requestHeaders.get("Content-Encoding").contains("gzip");
  }
}
