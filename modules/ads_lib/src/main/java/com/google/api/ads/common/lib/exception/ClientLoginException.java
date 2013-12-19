// Copyright 2010, Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.exception;

import com.google.api.ads.common.lib.auth.CaptchaInformation;

import java.io.IOException;

/**
 * An exception thrown when the ClientLogin API was unable to successfully
 * generate a token.
 *
 * @author Adam Rogal
 * @deprecated Use {@link com.google.api.client.googleapis.auth.clientlogin
 *             .ClientLoginResponseException ClientLoginResponseException}
 *             instead
 */
@Deprecated
public class ClientLoginException extends AuthenticationException {

  private final Integer httpStatusCode;
  private final String httpResponseBody;
  private final String errorCode;
  private final CaptchaInformation captchaInfo;
  private final IOException ioException;

  /**
   * Constructor.
   *
   * @param httpStatusCode the HTTP status code
   * @param httpResponseBody the HTTP response body
   * @param errorCode the client login error code if present
   * @param captchaInfo the captcha information if present
   * @param ioException the {@code IOException} that caused the authentication
   *     failure
   */
  public ClientLoginException(Integer httpStatusCode, String httpResponseBody, String errorCode,
      CaptchaInformation captchaInfo, IOException ioException) {
    super("ClientLogin exception", ioException);
    this.httpStatusCode = httpStatusCode;
    this.httpResponseBody = httpResponseBody;
    this.errorCode = errorCode;
    this.captchaInfo = captchaInfo;
    this.ioException = ioException;
  }

  /**
   * @return the httpStatusCode the HTTP status code
   */
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

  /**
   * @return the httpResponseBody the HTTP response body
   */
  public String getHttpResponseBody() {
    return httpResponseBody;
  }

  /**
   * @return the errorCode the client login error code if present.
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * @return the captchaInfo the captcha information if present.
   */
  public CaptchaInformation getCaptchaInfo() {
    return captchaInfo;
  }

  /**
   * @return the ioException the {@code IOException} that caused the failure
   */
  public IOException getIoException() {
    return ioException;
  }

  /**
   * @see java.lang.Throwable#getMessage()
   */
  @Override
  public String getMessage() {
    if (errorCode != null) {
      return "Auth token could not be retrieved because of error: " + errorCode;
    } else if (httpStatusCode != null) {
      return "Auth token could not be retrieved because of http status code: " + httpStatusCode;
    } else if (ioException != null){
      return "Auth token could not be retrieved because of IOException: "
          + ioException.getMessage();
    } else {
      return "Auth token could not be retrieved because of unkown reasons";
    }
  }
}
