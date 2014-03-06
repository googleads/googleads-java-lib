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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Base class for SOAP client handlers. Calling {@link #invoke(SoapCall)} will
 * perform the method retrieved from {@link SoapCall#getSoapClientMethod()} on
 * the {@link SoapCall#getSoapClient()} with the arguments retrieved from
 * {@link SoapCall#getSoapArgs()}.
 *
 * @param <T> the SOAP client type
 *
 * @author Adam Rogal
 * @see SoapClientHandlerInterface
 */
public abstract class SoapClientHandler<T> implements SoapClientHandlerInterface<T> {

  /**
   * Default constructor.
   */
  protected SoapClientHandler() {}

  /**
   * Processes the arguments such that they will be ready to be passed into the
   * supplied SOAP client method. This method can be overridden in the case that
   * a particular framework must additionally process the arguments.
   * <p>
   * In the default implementation of processing arguments, if the number of
   * arguments is too small, the argument list will be padded with {@code null}.
   * If {@code args} is {@code null}, {@code null} will be returned.
   * </p>
   *
   * @param soapClientMethod the SOAP client method that will be called with the
   *     {@code args}
   * @param args the arguments that will be processed
   * @return the arguments ready to be passed into the {@code soapClientMethod}.
   */
  protected Object[] processSoapArguments(Method soapClientMethod, Object[] args) {
    List<Object> argsList = new ArrayList<Object>();
    if (args != null) {
      Collections.addAll(argsList, args);
    } else {
      return null;
    }
    int curretNumArgs = argsList.size();
    while (curretNumArgs < soapClientMethod.getParameterTypes().length) {
      argsList.add(null);
      curretNumArgs++;
    }
    return argsList.toArray(new Object[0]);
  }

  /**
   * Gets the method from the SOAP client that matches the supplied method.
   * <p>
   * In the default implementation, only the method name and return type
   * will be matched.
   * </p>
   *
   * @param soapClient the SOAP client within which to search for the method
   * @param method the method to match
   * @return the SOAP client's matching method
   * @throws NoSuchMethodException thrown if the SOAP client does not contain
   *     the requested method.
   *
   * TODO(api.arogal): Needs to check parameter types as well as name/return.
   */
  public Method getSoapClientMethod(T soapClient, Method method) throws NoSuchMethodException {
    for (Method soapClientMethod : soapClient.getClass().getMethods()) {
      if (method.getName().equals(soapClientMethod.getName())
          && method.getReturnType().equals(soapClientMethod.getReturnType())) {
        return soapClientMethod;
      }
    }
    throw new NoSuchMethodException("No method named " + method.getName() + " with return type "
        + method.getReturnType() + " found.");
  }

  /**
   * Takes a {@link SoapCall} object and invokes the method by reflection.
   *
   * @param soapCall contains the SOAP method, SOAP client, and args to be
   *     called
   * @return the response from the SOAP web service
   * @throws Exception thrown if calling the operation on the remote service
   *     fails
   */
  protected Object invoke(SoapCall<T> soapCall) throws Exception {
    Method soapClientMethod = soapCall.getSoapClientMethod();
    Object[] soapArgs = soapCall.getSoapArgs();
    soapArgs = processSoapArguments(soapClientMethod, soapArgs);
    return soapClientMethod.invoke(soapCall.getSoapClient(), soapArgs);
  }
}
