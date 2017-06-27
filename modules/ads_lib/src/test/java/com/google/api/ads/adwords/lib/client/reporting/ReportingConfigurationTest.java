// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.client.reporting;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.lib.client.reporting.ReportingConfiguration.Builder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link ReportingConfiguration}.
 */
@RunWith(JUnit4.class)
public class ReportingConfigurationTest {

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testBuilder_allOptionsTrue() {
    ReportingConfiguration reportingConfiguration =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .skipReportSummary(true)
            .includeZeroImpressions(true)
            .useRawEnumValues(true)
            .build();
    assertTrue(reportingConfiguration.isSkipReportHeader());
    assertTrue(reportingConfiguration.isSkipColumnHeader());
    assertTrue(reportingConfiguration.isSkipReportSummary());
    assertTrue(reportingConfiguration.isIncludeZeroImpressions());
    assertTrue(reportingConfiguration.isUseRawEnumValues());
  }

  @Test
  public void testBuilder_mixedOptions_trueFalse() {
    ReportingConfiguration reportingConfiguration =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .skipReportSummary(false)
            .includeZeroImpressions(false)
            .useRawEnumValues(true)
            .build();
    assertTrue(reportingConfiguration.isSkipReportHeader());
    assertTrue(reportingConfiguration.isSkipColumnHeader());
    assertFalse(reportingConfiguration.isSkipReportSummary());
    assertFalse(reportingConfiguration.isIncludeZeroImpressions());
    assertTrue(reportingConfiguration.isUseRawEnumValues());
  }

  @Test
  public void testBuilder_nullOptions() {
    ReportingConfiguration reportingConfiguration =
        new Builder()
            .skipReportHeader(null)
            .skipReportSummary(null)
            .includeZeroImpressions(null)
            .useRawEnumValues(null)
            .build();
    assertNull(reportingConfiguration.isSkipReportHeader());
    assertNull(reportingConfiguration.isSkipColumnHeader());
    assertNull(reportingConfiguration.isSkipReportSummary());
    assertNull(reportingConfiguration.isIncludeZeroImpressions());
    assertNull(reportingConfiguration.isUseRawEnumValues());
  }

  @Test
  public void testBuilder_noOptions() {
    ReportingConfiguration reportingConfiguration = new Builder().build();
    assertNull(reportingConfiguration.isSkipReportHeader());
    assertNull(reportingConfiguration.isSkipColumnHeader());
    assertNull(reportingConfiguration.isSkipReportSummary());
    assertNull(reportingConfiguration.isIncludeZeroImpressions());
    assertNull(reportingConfiguration.isUseRawEnumValues());
  }

  /**
   * Makes sure the builder returns a copy so that making changes in the builder doesn't mutate
   * previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    Builder builder =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(false)
            .skipReportSummary(true)
            .includeZeroImpressions(false)
            .useRawEnumValues(true);

    ReportingConfiguration config1 = builder.build();
    assertTrue(config1.isSkipReportHeader());
    assertFalse(config1.isSkipColumnHeader());
    assertTrue(config1.isSkipReportSummary());
    assertFalse(config1.isIncludeZeroImpressions());
    assertTrue(config1.isUseRawEnumValues());

    assertNotSame("Build did not return a new instance on multiple invocations", config1,
        builder.build());

    builder.skipReportHeader(false);

    ReportingConfiguration config2 = builder.build();

    assertNotSame("Build did not return a new instance on multiple invocations", config1, config2);

    assertTrue("Changes to builder should not pass through to built instances",
        config1.isSkipReportHeader());

    assertFalse("Latest changes to builder should be reflected in each call to build",
        config2.isSkipReportHeader());
  }

  @Test
  public void testValidate_nullVersion_succeeds() {
    ReportingConfiguration config =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .skipReportSummary(true)
            .includeZeroImpressions(true)
            .useRawEnumValues(true)
            .reportDownloadTimeout(60_000)
            .build();
    config.validate(null);
    assertTrue("Validation should succeed", true);
  }

  @Test
  public void testValidate_supportedVersions_succeeds() {
    ReportingConfiguration config =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .skipReportSummary(true)
            .includeZeroImpressions(true)
            .useRawEnumValues(true)
            // A timeout of 0 is acceptable. This means do not time out.
            .reportDownloadTimeout(0)
            .build();
    config.validate("v201609");
    assertTrue("Validation should succeed for v201609", true);
    config.validate("v201702");
    assertTrue("Validation should succeed for v201702", true);
    config.validate("v201705");
    assertTrue("Validation should succeed for v201705", true);
  }

  @Test
  public void testValidate_negativeTimeout_fails() {
    ReportingConfiguration config =
        new Builder()
            .skipReportHeader(true)
            .skipColumnHeader(true)
            .reportDownloadTimeout(-1)
            .build();
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("timeout");
    config.validate(null);
  }
}
