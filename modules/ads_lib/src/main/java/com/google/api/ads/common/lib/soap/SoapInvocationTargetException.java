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

import java.lang.reflect.InvocationTargetException;

/**
 * A {@link InvocationTargetException} that occurred in the SOAP layer.
 */
public class SoapInvocationTargetException extends InvocationTargetException {
  public SoapCallReturn soapCallReturn;

  /**
   * Constructor.
   *
   * @param soapCallReturn the SOAP call return
   * @param target the target cause of the exception
   */
  public SoapInvocationTargetException(SoapCallReturn soapCallReturn, Throwable target) {
    super(target);
    this.soapCallReturn = soapCallReturn;
  }

  /**
   * Returns the SOAP call return.
   */
  public SoapCallReturn getSoapCallReturn() {
    return soapCallReturn;
  }
}
