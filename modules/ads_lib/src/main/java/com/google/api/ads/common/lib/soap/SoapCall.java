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

import org.apache.commons.lang.builder.HashCodeBuilder;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Represents a single call to the SOAP client.
 *
 * @param <T> the SOAP client type
 *
 * @author Adam Rogal
 */
public class SoapCall<T> {

  private Method soapClientMethod;
  private T soapClient;
  private Object[] soapArgs;

  /**
   * Constructor.
   *
   * @param soapClientMethod the SOAP client method to invoke on the underlying
   *     SOAP client.
   * @param soapClient the underlying SOAP client that the call will be made on
   * @param soapArgs the arguments that will be passed into the SOAP call.
   */
  public SoapCall(Method soapClientMethod, T soapClient, Object[] soapArgs) {
    this.soapClientMethod = soapClientMethod;
    this.soapClient = soapClient;
    this.soapArgs = soapArgs;
  }

  /**
   * Returns the method to invoke on the underlying SOAP client.
   */
  public Method getSoapClientMethod() {
    return soapClientMethod;
  }

  /**
   * Returns the underlying SOAP client that call will be made on.
   */
  public T getSoapClient() {
    return soapClient;
  }

  /**
   * Returns the arguments that will be passed into the SOAP call.
   */
  public Object[] getSoapArgs() {
    return soapArgs;
  }

  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SoapCall) {
      SoapCall<?> soapCall = (SoapCall<?>) obj;

      return this == soapCall
          || (Arrays.equals(this.getSoapArgs(), soapCall.getSoapArgs())
              && this.getSoapClient().equals(soapCall.getSoapClient()) && this
              .getSoapClientMethod().equals(soapCall.getSoapClientMethod()));
    }
    return false;
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}
