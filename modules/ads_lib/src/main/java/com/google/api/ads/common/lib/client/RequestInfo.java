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

/**
 * Contains information about the request that was made.
 */
public class RequestInfo {

  private String payload;
  private String serviceName;
  private String methodName;
  private String url;
  private String contextName;
  private String contextValue;

  private RequestInfo() {}

  /**
   * Gets the SOAP request XML.
   */
  public String getPayload() {
    return payload;
  }

  /**
   * Gets the service name.
   */
  public String getServiceName() {
    return serviceName;
  }


  /**
   * Gets the method name.
   */
  public String getMethodName() {
    return methodName;
  }

  /**
   * Gets the URL the request was made to.
   */
  public String getUrl() {
    return url;
  }
  
  /**
   * Gets the name corresponding to {@link #getContextValue()}. For example,
   * {@code clientCustomerId} for AdWords, or {@code networkCode} for DFP.
   */
  public String getContextName() {
    return contextName;
  }
  
  /**
   * Returns the context value, such as the clientCustomerId for AdWords, or the networkCode for
   * DFP.
   */
  public String getContextValue() {
    return contextValue;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("serviceName", serviceName)
        .add("methodName", methodName)
        .add("url", url)
        .add("contextName", contextName)
        .add("contextValue", contextValue)
        // Return payload length, since the payload could be large.
        .add("payload.length", Strings.nullToEmpty(payload).length())
        .toString();
  }
  
  /**
   * Builder for {@link RequestInfo} objects.
   *
   */
  public static class Builder {

    private RequestInfo requestInfo;

    public Builder() {
      requestInfo = new RequestInfo();
    }

    /**
     * Adds a method name to the RequestInfo under construction.
     *
     * @param methodName the method name to add to the RequestInfo
     * @return this builder
     */
    public Builder withMethodName(String methodName) {
      requestInfo.methodName = methodName;
      return this;
    }

    /**
     * Adds a service name to the RequestInfo under construction.
     *
     * @param serviceName the service name to add to the RequestInfo
     * @return this builder
     */
    public Builder withServiceName(String serviceName) {
      requestInfo.serviceName = serviceName;
      return this;
    }

    /**
     * Adds the request payload to the RequestInfo under construction.
     *
     * @param payload the raw request string to add to the RequestInfo
     * @return this builder
     */
    public Builder withPayload(String payload) {
      requestInfo.payload = payload;
      return this;
    }

    /**
     * Adds the target URL to the RequestInfo under construction.
     *
     * @param url the URL that the request was made to
     * @return this builder
     */
    public Builder withUrl(String url) {
      requestInfo.url = url;
      return this;
    }
    
    /**
     * Adds the name/value pair for the context of this request.
     * @param contextName name for the value
     * @param contextValue the value
     * @return this builder
     */
    public Builder withContext(String contextName, String contextValue) {
      requestInfo.contextName = contextName;
      requestInfo.contextValue = contextValue;
      return this;
    }
    
    /**
     * Returns the RequestInfo this Builder has been constructing.
     *
     * @return the built RequestInfo object
     */
    public RequestInfo build() {
      return requestInfo;
    }
  }
}
