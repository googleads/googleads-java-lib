// Copyright 2015 Google Inc. All Rights Reserved.

package com.google.api.ads.adwords.lib.jaxb.v201502;

import static org.junit.Assert.assertTrue;

import com.google.api.ads.common.lib.soap.jaxb.JaxBSerializer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.namespace.QName;

/**
 * Tests the integration between JaxB generated code (ReportDefinitions) and our
 * serializer.
 */
@RunWith(JUnit4.class)
public class JaxbSerializationTest {

  @Test
  public void testSerialization() throws Exception {
    ReportDefinition report = new ReportDefinition();
    report.setReportName("My Report");
    JaxBSerializer<ReportDefinition> serializer =
        new JaxBSerializer<ReportDefinition>(
            ReportDefinition.class, new QName("reportDefinition"));
    String xml = serializer.serialize(report);
    assertTrue(xml.contains("My Report"));
  }
}
