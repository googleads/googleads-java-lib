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

import org.junit.Test;

/**
 * Tests for {@link ReportingConfiguration}.
 * 
 * @author Josh Radcliff
 */
public class ReportingConfigurationTest {

  @Test
  public void testBuilder_allOptionsTrue() {
    ReportingConfiguration reportingConfiguration =
        new Builder().skipReportHeader(true).skipReportSummary(true).build();
    assertTrue(reportingConfiguration.isSkipReportHeader());
    assertTrue(reportingConfiguration.isSkipReportSummary());
  }
  
  @Test
  public void testBuilder_mixedOptions_trueFalse() {
    ReportingConfiguration reportingConfiguration =
        new Builder().skipReportHeader(true).skipReportSummary(false).build();
    assertTrue(reportingConfiguration.isSkipReportHeader());
    assertFalse(reportingConfiguration.isSkipReportSummary());
  }

  @Test
  public void testBuilder_nullOptions() {
    ReportingConfiguration reportingConfiguration =
        new Builder().skipReportHeader(null).skipReportSummary(null).build();
    assertNull(reportingConfiguration.isSkipReportHeader());
    assertNull(reportingConfiguration.isSkipReportSummary());
  }
  
  @Test
  public void testBuilder_noOptions() {
    ReportingConfiguration reportingConfiguration =
        new Builder().build();
    assertNull(reportingConfiguration.isSkipReportHeader());
    assertNull(reportingConfiguration.isSkipReportSummary());
  }

  /**
   * Makes sure the builder returns a copy so that making changes
   * in the builder doesn't mutate previously built objects.
   */
  @Test
  public void testBuilder_returnsCopies() throws Exception {
    Builder builder = new Builder().skipReportHeader(true).skipReportSummary(true);
    
    ReportingConfiguration config1 = builder.build();
    assertTrue(config1.isSkipReportHeader());
    
    assertNotSame("Build did not return a new instance on multiple invocations", config1,
        builder.build());

    builder.skipReportHeader(false);
    
    ReportingConfiguration config2 = builder.build();
    
    assertNotSame("Build did not return a new instance on multiple invocations", config1, config2);

    assertTrue("Changes to builder should not pass through to built instances",
        config1.isSkipReportHeader());

    assertFalse("Lastest changes to builder should be reflected in each call to build",
        config2.isSkipReportHeader());
  }
  
  @Test
  public void testValidate_supportedVersion_succeeds() {
    ReportingConfiguration config =
        new Builder().skipReportHeader(true).skipReportSummary(true).build();
    config.validate(ReportingConfiguration.MINIMUM_REPORTING_CONFIGURATION_VERSION);
    assertTrue("Validation should succeed", true);
  }

  @Test
  public void testValidate_nullVersion_succeeds() {
    ReportingConfiguration config =
        new Builder().skipReportHeader(true).skipReportSummary(true).build();
    config.validate(null);
    assertTrue("Validation should succeed", true);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testValidate_unsupportedVersion_succeeds() {
    ReportingConfiguration config =
        new Builder().skipReportHeader(true).skipReportSummary(true).build();
    config.validate("v201406");
  }
}
