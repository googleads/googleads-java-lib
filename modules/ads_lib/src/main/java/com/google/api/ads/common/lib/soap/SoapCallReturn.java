// Copyright 2012 Google Inc. All Rights Reserved.
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
 * Used to package a SOAP call's return. Contains the return value, the request
 * and response info, and the originating {@link SoapCall}.
 *
 * @author Adam Rogal
 */
public class SoapCallReturn {

  private Object returnValue;
  private RequestInfo requestInfo;
  private ResponseInfo responseInfo;
  private Throwable exception;

  /**
   * Constructor.
   */
  public SoapCallReturn(){
    requestInfo = new RequestInfo();
    responseInfo = new ResponseInfo();
  }

  /**
   * Gets the return value from the SOAP call that was made.
   *
   * @return the return value from the SOAP call that was made or {@code null}
   *     if there was an exception
   */
  public Object getReturnValue() {
    return returnValue;
  }

  /**
   * Gets the request info from the SOAP call that was made.
   */
  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  /**
   * Gets the response info from the SOAP call that was made.
   */
  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  /**
   * Gets the exception from the SOAP call that was made if one occurred.
   *
   * @return the exception from the SOAP call that was made or {@code null}
   *     if there was no exception
   */
  public Throwable getException() {
    return exception;
  }

  /**
   * Builder for {@link SoapCallReturn} objects.
   *
   * @author Adam Rogal
   */
  public static class Builder {

    private SoapCallReturn soapCallReturn;

    /**
     * Constructor.
     */
    public Builder() {
      this.soapCallReturn = new SoapCallReturn();
    }

    /**
     * Adds a return value to the SoapCallReturn under construction.
     *
     * @param returnValue the return value to add to the SoapCallReturn
     * @return this builder
     */
    public Builder withReturnValue(Object returnValue) {
     soapCallReturn.returnValue = returnValue;
     return this;
    }

    /**
     * Adds a response info to the SoapCallReturn under construction.
     *
     * @param responseInfo the response info to add to the SoapCallReturn
     * @return this builder
     */
    public Builder withResponseInfo(ResponseInfo responseInfo) {
      soapCallReturn.responseInfo = responseInfo;
      return this;
    }

    /**
     * Adds a request info to the SoapCallReturn under construction.
     *
     * @param requestInfo the request info to add to the SoapCallReturn
     * @return this builder
     */
    public Builder withRequestInfo(RequestInfo requestInfo) {
      soapCallReturn.requestInfo = requestInfo;
      return this;
    }

    /**
     * Adds an exception to the SoapCallReturn under construction.
     *
     * @param exception the exception to add to the SoapCallReturn
     * @return this builder
     */
    public Builder withException(Throwable exception) {
      soapCallReturn.exception = exception;
      return this;
    }

    /**
     * Returns the SoapCallReturn this Builder has been constructing.
     *
     * @return the built SoapCallReturn object
     */
    public SoapCallReturn build() {
      return soapCallReturn;
    }
  }
}
