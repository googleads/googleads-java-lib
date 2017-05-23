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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.lang.reflect.Method;

/**
 * Test for the {@link SoapCall} class.
 */
@RunWith(JUnit4.class)
public class SoapCallTest {

  public SoapCallTest() {}

  @Test
  public void testEquals() throws Exception {
    Method method1 = MethodHolder.class.getDeclaredMethod("equals", Object.class);
    Method method2 = MethodHolder.class.getDeclaredMethod("toString");
    Object object1 = new Object();
    Object[] objectArray = new Object[] {new Object()};
    SoapCall<Object> soapCall1 = new SoapCall<Object>(method1, object1, objectArray);
    SoapCall<Object> soapCall2 = new SoapCall<Object>(method1, object1, objectArray);

    assertTrue(soapCall1.equals(soapCall2) && soapCall2.equals(soapCall1));

    SoapCall<Object> soapCall3 = new SoapCall<Object>(method1, new Object(), objectArray);
    SoapCall<Object> soapCall4 = new SoapCall<Object>(method1, object1, new Object[] {});
    SoapCall<Object> soapCall5 = new SoapCall<Object>(method2, object1, objectArray);

    assertFalse(soapCall1.equals(soapCall3) || soapCall3.equals(soapCall1));
    assertFalse(soapCall1.equals(soapCall4) || soapCall4.equals(soapCall1));
    assertFalse(soapCall1.equals(soapCall5) || soapCall5.equals(soapCall1));
  }

  @Test
  public void testHashCode() throws Exception {
    Method method1 = MethodHolder.class.getDeclaredMethod("equals", Object.class);
    Method method2 = MethodHolder.class.getDeclaredMethod("toString");
    SoapCall<Object> soapCall1 = new SoapCall<Object>(method1, new Object(), new Object[] {});
    SoapCall<Object> soapCall2 = new SoapCall<Object>(method2, new Object(), new Object[] {});

    assertEquals(soapCall1.hashCode(), soapCall1.hashCode());
    assertFalse(soapCall1.hashCode() == soapCall2.hashCode());
  }

  /**
   * Helper class containing methods to be retrieved and passed into the
   * {@link SoapCall} constructor.
   *
   */
  private static class MethodHolder {

    private MethodHolder() {}

    @Override
    public String toString() {
      return "";
    }

    @Override
    public boolean equals(Object obj) {
      return this == obj;
    }

    @Override
    public int hashCode() {
      return System.identityHashCode(this);
    }
  }
}
