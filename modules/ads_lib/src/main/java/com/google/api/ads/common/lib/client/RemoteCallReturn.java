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

package com.google.api.ads.common.lib.client;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/**
 * Used to package a remote call's return. Contains the return value, the request and response info,
 * and the exception (if applicable).
 */
public class RemoteCallReturn {

  private Object returnValue;
  private RequestInfo requestInfo;
  private ResponseInfo responseInfo;
  private Throwable exception;

  private RemoteCallReturn() {}

  /**
   * Gets the return value from the remote call that was made.
   *
   * @return the return value from the remote call that was made or {@code null}
   *     if there was an exception
   */
  public Object getReturnValue() {
    return returnValue;
  }

  /**
   * Gets the request info from the remote call that was made.
   */
  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  /**
   * Gets the response info from the remote call that was made.
   */
  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  /**
   * Gets the exception from the remote call that was made if one occurred.
   *
   * @return the exception from the remote call that was made or {@code null}
   *     if there was no exception
   */
  public Throwable getException() {
    return exception;
  }

  /**
   * Builder for {@link RemoteCallReturn} objects.
   *
   */
  public static class Builder {

    private RemoteCallReturn remoteCallReturn;

    /**
     * Constructor.
     */
    public Builder() {
      this.remoteCallReturn = new RemoteCallReturn();
    }

    /**
     * Adds a return value to the RemoteCallReturn under construction.
     *
     * @param returnValue the return value to add to the RemoteCallReturn
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withReturnValue(Object returnValue) {
     remoteCallReturn.returnValue = returnValue;
     return this;
    }

    /**
     * Adds a response info to the RemoteCallReturn under construction.
     *
     * @param responseInfo the response info to add to the RemoteCallReturn
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withResponseInfo(ResponseInfo responseInfo) {
      remoteCallReturn.responseInfo = responseInfo;
      return this;
    }

    /**
     * Adds a request info to the RemoteCallReturn under construction.
     *
     * @param requestInfo the request info to add to the RemoteCallReturn
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withRequestInfo(RequestInfo requestInfo) {
      remoteCallReturn.requestInfo = requestInfo;
      return this;
    }

    /**
     * Adds an exception to the RemoteCallReturn under construction.
     *
     * @param exception the exception to add to the RemoteCallReturn
     * @return this builder
     */
    @CanIgnoreReturnValue
    public Builder withException(Throwable exception) {
      remoteCallReturn.exception = exception;
      return this;
    }

    /**
     * Returns the RemoteCallReturn this Builder has been constructing.
     *
     * @return the built RemoteCallReturn object
     */
    public RemoteCallReturn build() {
      return remoteCallReturn;
    }
  }
}
