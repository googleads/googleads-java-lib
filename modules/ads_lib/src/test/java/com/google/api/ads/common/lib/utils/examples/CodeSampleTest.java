// Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.api.ads.common.lib.utils.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

/**
 * Tests for {@link CodeSampleParams}.
 */
@RunWith(JUnit4.class)
public class CodeSampleTest {

  static class TestSampleParams extends CodeSampleParams {
    @Parameter(names = "--stringParam", required = true)
    String stringParam;

    @Parameter(names = "--longParam", required = true)
    Long longParam;

    @Parameter(names = "--longOptionalParam")
    Long longOptionalParam;
  }

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private Runtime mockRuntime = Mockito.mock(Runtime.class);

  @Before
  public void before() {
    doThrow(RuntimeException.class).when(mockRuntime).exit(anyInt());
  }

  @Test
  public void testParseArgumentsReturnsFalseWithNoArgs() throws Exception {
    TestSampleParams p = new TestSampleParams();
    assertFalse(p.parseArguments(new String[] {}));
  }

  @Test
  public void testParseArgumentsReturnsTrueWithAllRequiredArgs() throws Exception {
    String[] args = new String[] {"--stringParam", "abc", "--longParam", "123"};
    TestSampleParams p = new TestSampleParams();

    assertTrue(p.parseArguments(args));
  }

  @Test
  public void testParseArgumentsReturnsTrueWithAllArgs() throws Exception {
    String[] args = new String[] {"--stringParam", "abc", "--longParam", "123",
        "--longOptionalParam", "456"};
    TestSampleParams p = new TestSampleParams();

    assertTrue(p.parseArguments(args));
  }

  @Test
  public void testParseArgumentsThrowsExceptionWithPartialRequiredArgs() throws Exception {
    String[] args = new String[] {"--stringParam", "abc"};
    TestSampleParams p = new TestSampleParams();

    exception.expect(ParameterException.class);
    p.parseArguments(args);
  }

  @Test
  public void testParseArgumentsPrintsUsageAndExitsWithHelp() throws Exception {
    TestSampleParams p = new TestSampleParams();
    PrintStream mockPrintStream = Mockito.mock(PrintStream.class);

    try {
      p.parseArguments(new String[]{"--help"}, mockRuntime, mockPrintStream);
      fail("parseArguments above should have called runtime.exit(0)");
    } catch (RuntimeException e) {
      // This is expected, succeed.
    } finally {
      verify(mockPrintStream, times(1)).println(anyString());
    }
  }

}
