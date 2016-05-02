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
 * Contains information about the response from the request that was made.
 */
public class ResponseInfo {

  private String soapResponseXml;
  private String requestId;

  /**
   * Constructor.
   */
  public ResponseInfo() {}

  /**
   * Gets the SOAP response XML.
   */
  public String getSoapResponseXml() {
    return soapResponseXml;
  }

  /**
   * Gets the SOAP response request ID.
   */
  public String getRequestId() {
    return requestId;
  }
  
  /**
   * Builder for {@link ResponseInfo} objects.
   *
   */
  public static class Builder {

    private ResponseInfo responseInfo;

    /**
     * Constructor.
     */
    public Builder() {
      responseInfo = new ResponseInfo();
    }

    /**
     * Adds the SOAP response XML to the ResponseInfo under construction.
     *
     * @param soapResponseXml the SOAP response XML to add to the ResponseInfo
     * @return this builder
     */
    public Builder withSoapResponseXml(String soapResponseXml) {
      responseInfo.soapResponseXml = soapResponseXml;
      return this;
    }

    /**
     * Adds the SOAP response request ID to the ResponseInfo under construction.
     * 
     * @return this builder
     */
    public Builder withRequestId(String requestId) {
      responseInfo.requestId = requestId;
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
