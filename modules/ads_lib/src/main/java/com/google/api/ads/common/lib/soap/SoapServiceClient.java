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

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.exception.ServiceException;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * The {@code SoapServiceClient} class pairs together the {@code soapClient} and
 * {@code soapClientHandler} so that calls made through the
 * {@link #invoke(Object, Method, Object[])} method can be dispatched and
 * handled correctly in the SOAP layer. This class is not aware of what API it
 * uses and relies on the {@code soapClientHandler} to determine how the SOAP
 * framework should be used.
 *
 * @param <T> the type of SOAP client
 */
public abstract class SoapServiceClient<T> implements InvocationHandler {

  private final SoapClientHandlerInterface<T> soapClientHandler;
  private final T soapClient;

  /**
   * Protected constructor.
   *
   * @param soapClientHandler the SOAP client handler
   * @param soapClient the SOAP client
   */
  protected SoapServiceClient(SoapClientHandlerInterface<T> soapClientHandler,
      T soapClient) {
    this.soapClient = soapClient;
    this.soapClientHandler = soapClientHandler;
  }

  /**
   * Called from {@link #invoke(Object, Method, Object[])} if the method is
   * intended for the SOAP client. Extending classes should override this method
   * if they wish to wrap the call, such in cases of reauthentication or
   * exception handling. The actual SOAP call is synchronized on the SOAP client
   * so that only one request to the SOAP client can be made with without
   * interruption, useful for logging and exception handling.
   *
   * @param soapCall the call to send to the SOAP client
   * @return the return value from the {@code soapCall}
   */
  protected synchronized RemoteCallReturn callSoapClient(SoapCall<T> soapCall) {
    return soapClientHandler.invokeSoapCall(soapCall);
  }

  /**
   * Wraps the underlying SOAP RPC such that first the method, by its name,
   * is applied to the runtime class. If no such method exists, it is assumed
   * that the call is meant for the SOAP client. In this case, the SOAP client
   * handler will invoke the SOAP client method with provided arguments.
   *
   * @param proxy the proxy class that invoke was called on
   * @param method the method to apply to the proxy class or the underlying SOAP
   *     client
   * @param args the method arguments
   * @return the return from the {@code SoapServiceClient} or a
   *     {@link RemoteCallReturn} object containing the result from the SOAP call
   * @see InvocationHandler#invoke(Object, Method, Object[])
   * @throws Throwable thrown if the SOAP call passed into this method results
   *     in an exception. The exception thrown will be not be wrapped - it will
   *     adhere to the "throws" clause of the passed in {@code Method}.
   */
  @Override
  public Object invoke(Object proxy, final Method method, final Object[] args)
      throws Throwable {
    try {
      return getClass().getMethod(method.getName(), method.getParameterTypes())
          .invoke(this, args);
    } catch (NoSuchMethodException e) {
      // Ignore and let the SOAP client handler take over.
    }
    setHeaders();
    RemoteCallReturn remoteCallReturn = callSoapClient(
        createSoapCall(soapClientHandler.getSoapClientMethod(soapClient, method), args));
    logSoapCall(remoteCallReturn);
    return unwrapRemoteCallReturn(remoteCallReturn);
  }

  /**
   * Creates the {@link SoapCall} from the  {@code soapClientMethod} and its
   * {@code args}.
   */
  protected SoapCall<T> createSoapCall(Method soapClientMethod, Object[] args) {
    return new SoapCall<T>(soapClientMethod, soapClient, args);
  }

  /**
   * Sets the endpoint address of the underlying SOAP client.
   */
  public void setEndpointAddress(String endpointAddress) {
    soapClientHandler.setEndpointAddress(soapClient, endpointAddress);
  }

  /**
   * Returns the underlying SOAP client.
   */
  public Object getSoapClient() {
    return soapClient;
  }

  /**
   * Returns the SOAP client handler.
   */
  protected SoapClientHandlerInterface<T> getSoapClientHandler() {
    return soapClientHandler;
  }

  /**
   * Logs a SOAP call.
   *
   * @param remoteCallReturn
   */
  protected abstract void logSoapCall(RemoteCallReturn remoteCallReturn);

  /**
   * Sets the headers for the service client.
   *
   * @throws ServiceException if there was a problem setting the headers
   * @throws AuthenticationException if there was a problem authenticating while
   *     setting headers
   */
  protected abstract void setHeaders() throws ServiceException, AuthenticationException;

  /**
   * Handles the exception.
   * <p>
   * Default behavior is to return the exception unchanged.
   * </p>
   *
   * @param e the exception to handle
   * @return the exception which may have been modified (wrapped/unwrapped)
   */
  protected Throwable handleException(Throwable e) {
    return e;
  }

  /**
   * Unwraps a SOAP remote call return such that if there was an exception, it is
   * thrown and if it was a successful call, the return value of the SOAP call
   * is returned.
   *
   * @param remoteCallReturn the {@link RemoteCallReturn} to unwrap
   * @return the {@link RemoteCallReturn#getReturnValue()} if the call was
   *     successful
   * @throws Throwable the exception captured in the
   *     {@link RemoteCallReturn#getException()} if present
   */
  protected Object unwrapRemoteCallReturn(RemoteCallReturn remoteCallReturn) throws Throwable {
    if (remoteCallReturn.getException() != null) {
      throw handleException(remoteCallReturn.getException());
    } else {
      return remoteCallReturn.getReturnValue();
    }
  }
}
