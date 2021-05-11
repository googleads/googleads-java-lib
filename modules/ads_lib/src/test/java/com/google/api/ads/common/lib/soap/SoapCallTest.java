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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/** Test for the {@link SoapCall} class. */
@RunWith(JUnit4.class)
public class SoapCallTest {

  @Test
  public void testEquals() throws Exception {
    Method method1 = Object.class.getDeclaredMethod("equals", Object.class);
    Method method2 = Object.class.getDeclaredMethod("toString");
    Object object1 = new Object();
    Object[] objectArray = new Object[] {new Object()};
    SoapCall<Object> soapCall1 = new SoapCall<Object>(method1, object1, objectArray);

    SoapCall<Object> soapCall2 = new SoapCall<Object>(method1, object1, objectArray);
    assertTrue(soapCall1.equals(soapCall2));
    assertTrue(soapCall2.equals(soapCall1));

    SoapCall<Object> soapCall3 = new SoapCall<Object>(method1, new Object(), objectArray);
    assertFalse(soapCall1.equals(soapCall3));
    assertFalse(soapCall3.equals(soapCall1));

    SoapCall<Object> soapCall4 = new SoapCall<Object>(method1, object1, new Object[] {});
    assertFalse(soapCall1.equals(soapCall4));
    assertFalse(soapCall4.equals(soapCall1));

    SoapCall<Object> soapCall5 = new SoapCall<Object>(method2, object1, objectArray);
    assertFalse(soapCall1.equals(soapCall5));
    assertFalse(soapCall5.equals(soapCall1));
  }

  @Test
  public void testHashCode() throws Exception {
    Method method1 = Object.class.getDeclaredMethod("equals", Object.class);
    Method method2 = Object.class.getDeclaredMethod("toString");

    Object commonObject = new Object();

    SoapCall<Object> soapCall1 = new SoapCall<Object>(method1, commonObject, new Integer[] {5});
    SoapCall<Object> soapCall2 = new SoapCall<Object>(method2, commonObject, new Integer[] {5});
    SoapCall<Object> soapCall3 = new SoapCall<Object>(method1, commonObject, new Integer[] {42});
    SoapCall<Object> soapCall4 = new SoapCall<Object>(method1, new Object(), new Integer[] {42});

    assertTrue("Hash code is not stable", soapCall1.hashCode() == soapCall1.hashCode());
    assertFalse(
        "Hash code unaffected by method change", soapCall1.hashCode() == soapCall2.hashCode());
    assertFalse(
        "Hash code unaffected by array change", soapCall1.hashCode() == soapCall3.hashCode());
    assertFalse(
        "Hash code unaffected by array change", soapCall1.hashCode() == soapCall3.hashCode());
    assertFalse(
        "Hash code unaffected by client change", soapCall1.hashCode() == soapCall4.hashCode());
  }
}
