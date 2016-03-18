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

package com.google.api.ads.common.lib.soap;

/**
 * Contains information about the request that was made.
 */
public class RequestInfo {

  private String soapRequestXml;
  private String serviceName;
  private String methodName;
  private String url;

  /**
   * Constructor.
   */
  public RequestInfo() {}

  /**
   * Gets the SOAP request XML.
   */
  public String getSoapRequestXml() {
    return soapRequestXml;
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
   * Builder for {@link RequestInfo} objects.
   *
   */
  public static class Builder {

    private RequestInfo requestInfo;

    /**
     * Constructor.
     */
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
     * Adds the SOAP request XML to the RequestInfo under construction.
     *
     * @param soapRequestXml the raw SOAP request XML to add to the RequestInfo
     * @return this builder
     */
    // TODO(jdilallo): Look into copying string to dereference message context.
    public Builder withSoapRequestXml(String soapRequestXml) {
      requestInfo.soapRequestXml = soapRequestXml;
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
     * Returns the RequestInfo this Builder has been constructing.
     *
     * @return the built RequestInfo object
     */
    public RequestInfo build() {
      return requestInfo;
    }
  }
}
