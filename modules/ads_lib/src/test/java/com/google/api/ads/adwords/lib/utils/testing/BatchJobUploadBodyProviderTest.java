// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.testing;

import static org.apache.commons.lang.CharEncoding.UTF_8;

import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.api.ads.common.lib.soap.testing.CustomDifferenceListener;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.http.ByteArrayContent;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.DifferenceListener;
import org.custommonkey.xmlunit.XMLAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Base class for tests of {@link BatchJobUploadBodyProvider} implementations.
 * 
 * <p>
 * Abstract methods allow subclasses to provide version and SOAP toolkit-specific objects
 * for testing.
 */
@RunWith(JUnit4.class)
public abstract class BatchJobUploadBodyProviderTest<
    RequestT extends BatchJobMutateRequestInterface> {

  /**
   * Creates a new {@link BatchJobMutateRequestInterface}.
   */
  protected abstract RequestT createMutateRequest();

  /**
   * Returns the AdWords API version for this test.
   */
  protected abstract String getApiVersion();

  /**
   * Adds a {@code BudgetOperation} with the specified attributes.
   */
  protected abstract void addBudgetOperation(
      RequestT request,
      long budgetId,
      String budgetName,
      long budgetAmountInMicros,
      String deliveryMethod);

  /**
   * Adds a {@code CampaignOperation} with the specified attributes.
   */
  protected abstract void addCampaignOperation(
      RequestT request,
      long campaignId,
      String campaignName,
      String status,
      String advertisingChannelType,
      long budgetId,
      String biddingStrategyType,
      boolean enhancedCpcEnabled);

  /**
   * Adds a {@code NegativeCampaignCriterion} with the specified attributes.
   */
  protected abstract void addCampaignNegativeKeywordOperation(
      RequestT request, long campaignId, String keywordText, String keywordMatchType);

  @Test
  public void testValidOperations() throws BatchJobException, IOException, SAXException {
    RequestT request = createMutateRequest();
    addBudgetOperation(request, -1L, "Test budget", 50000000L, "STANDARD");
    addCampaignOperation(
        request, -2L, "Test campaign #1", "PAUSED", "SEARCH", -1L, "MANUAL_CPC", false);
    addCampaignOperation(
        request, -3L, "Test campaign #2", "PAUSED", "SEARCH", -1L, "MANUAL_CPC", false);
    addCampaignNegativeKeywordOperation(request, -2L, "venus", "BROAD");
    addCampaignNegativeKeywordOperation(request, -3L, "venus", "BROAD");
    ByteArrayContent httpContent =
        request.createBatchJobUploadBodyProvider().getHttpContent(request, true, true);
    String actualRequestXml = Streams.readAll(httpContent.getInputStream(), Charset.forName(UTF_8));
    actualRequestXml =
        SoapRequestXmlProvider.normalizeXmlForComparison(actualRequestXml, getApiVersion());
    String expectedRequestXml = SoapRequestXmlProvider.getTestBatchUploadRequest(getApiVersion());

    // Perform an XML diff using the custom difference listener that properly handles namespaces
    // and attributes.
    Diff diff = new Diff(expectedRequestXml, actualRequestXml);
    DifferenceListener diffListener = new CustomDifferenceListener();
    diff.overrideDifferenceListener(diffListener);
    XMLAssert.assertXMLEqual("Serialized upload request does not match expected XML", diff, true);
  }
}
