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

package com.google.api.ads.common.lib.soap.testing;

/**
 * Mock SOAP client with a few methods.
 */
public class MockSoapClient implements MockSoapClientInterface {

  public static final RuntimeException EXCEPTION = new RuntimeException("Mocked exception");

  /**
   * Returns the passed in {@code arg} as a single {@code Object}.
   */
  @Override
  public Object identityCall(Object[] arg) {
    return arg;
  }

  /**
   * Returns the passed in {@code arg} as a single {@code Object}.
   */
  @Override
  public Object identityCallSingle(Object arg) {
    return arg;
  }

  /**
   * Returns {@code arg1} and has an overloaded name.
   */
  @Override
  public Object testOverloaded(String arg1, String arg2) {
    return arg1;
  }

  /**
   * Returns {@code arg1} and has an overloaded name.
   */
  @Override
  public Object testOverloaded(int arg1) {
    return arg1;
  }

  /**
   * Returns the passed in {@code arg} as a single {@code Object}.
   */
  @Override
  public Object lotsOfArgsCall(Object arg, Object[] arg1, Object arg2, Object arg3) {
    return arg;
  }

  /**
   * Void call.
   */
  @Override
  public void voidCall(Object[] arg) {}

  /**
   * Empty call.
   */
  @Override
  public void emptyCall() {}

  /**
   * Throws an exception.
   */
  @Override
  public Object throwException(Object[] arg) {
    throw EXCEPTION;
  }
}
