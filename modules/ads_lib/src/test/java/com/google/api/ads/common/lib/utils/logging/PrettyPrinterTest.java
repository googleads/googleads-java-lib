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

package com.google.api.ads.common.lib.utils.logging;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;

/**
 * Test for the {@link PrettyPrinter} class.
 */
@RunWith(JUnit4.class)
public class PrettyPrinterTest {

  public PrettyPrinterTest() {}

  /**
   * Tests that unexpected exceptions get logged correctly.
   */
  @Test
  public void testException() throws TransformerException {
    Transformer transformer = Mockito.mock(Transformer.class);
    String html =
        "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n<html><a></a></html>";
    Mockito.doThrow(new ArrayIndexOutOfBoundsException())
        .when(transformer).transform((Source) Mockito.anyObject(), (Result) Mockito.anyObject());

    assertEquals(html, new PrettyPrinter(transformer).prettyPrint(html));
  }
}
