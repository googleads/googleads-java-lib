// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;

import com.google.api.ads.adwords.lib.client.AdWordsServiceDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Tests for the {@link AdWordsAxisSoapHeaderFactory} class. */
@RunWith(Parameterized.class)
public class AdWordsAxisSoapHeaderFactoryTest {

  private AdWordsAxisSoapHeaderFactory headerFactory;

  @Mock private AdWordsServiceDescriptor adWordsServiceDescriptor;

  private final Class<?> interfaceClass;

  private final Class<?> headerClass;

  private final String headerClassPartialName;

  public AdWordsAxisSoapHeaderFactoryTest(Class<?> interfaceClass, Class<?> headerClass) {
    this.interfaceClass = interfaceClass;
    this.headerClass = headerClass;
    this.headerClassPartialName = headerClass.getName().replaceFirst("java.", "");
  }

  @Parameters(name = "interface={0}, headerClass={1}")
  public static Collection<Object[]> data() {
    Collection<Object[]> parameters = new ArrayList<Object[]>();

    // Create multiple instances of this test with different header classes in various siblings of
    // the java.util package.
    parameters.add(new Object[] {ArrayList.class, String.class});
    parameters.add(new Object[] {ArrayList.class, ReentrantLock.class});

    return parameters;
  }

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    headerFactory = new AdWordsAxisSoapHeaderFactory(headerClassPartialName);
  }

  @Test
  public void testCreateHeader() throws Exception {
    // Asserts that the factory will navigate up one package level from the interface
    // class and then down to the header class based on the header class partial name.
    doReturn(interfaceClass).when(adWordsServiceDescriptor).getInterfaceClass();

    Object soapHeader = headerFactory.createSoapHeader(adWordsServiceDescriptor);

    assertEquals(
        "Factory did not create an instance of the expected type",
        headerClass,
        soapHeader.getClass());
  }
}
