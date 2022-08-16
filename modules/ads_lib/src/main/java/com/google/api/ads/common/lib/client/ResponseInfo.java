// Copyright 2011, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.client;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.Nullable;

/** Contains information about the response from the request that was made. */
public class ResponseInfo {

  private String payload;
  private String requestId;
  private Long operationsCount;
  private Long responseTimeMillis;

  private ResponseInfo() {}

  /** Gets the response payload (e.g., XML, HTTP request). */
  public String getPayload() {
    return payload;
  }

  /** Gets the SOAP response request ID. */
  public String getRequestId() {
    return requestId;
  }

  /** Returns the number of operationsCount from the response. */
  @Nullable
  public Long getOperationsCount() {
    return operationsCount;
  }

  /** Returns the response time in milliseconds. */
  @Nullable
  public Long getResponseTime() {
    return responseTimeMillis;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("requestId", requestId)
        .add("operationsCount", operationsCount)
        .add("responseTimeMillis", responseTimeMillis)
        // Return payload length, since the payload could be large.
        .add("payload.length", Strings.nullToEmpty(payload).length())
        .toString();
  }

  /** Builder for {@link ResponseInfo} objects. */
  public static class Builder {

    private ResponseInfo responseInfo;

    public Builder() {
      responseInfo = new ResponseInfo();
    }

    /**
     * Adds the response payload to the ResponseInfo under construction.
     *
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withPayload(String payload) {
      responseInfo.payload = payload;
      return this;
    }

    /**
     * Adds the SOAP response request ID to the ResponseInfo under construction.
     *
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withRequestId(String requestId) {
      responseInfo.requestId = requestId;
      return this;
    }

    @CanIgnoreReturnValue
    public Builder withOperationsCount(@Nullable Long operationsCount) {
      responseInfo.operationsCount = operationsCount;
      return this;
    }

    @CanIgnoreReturnValue
    public Builder withResponseTimeMillis(@Nullable Long responseTimeMillis) {
      responseInfo.responseTimeMillis = responseTimeMillis;
      return this;
    }

    /**
     * Returns the ResponseInfo this Builder has been constructing.
     *
     * @return the built ResponseInfo object
     */
    public ResponseInfo build() {
      return responseInfo;
    }
  }
}
