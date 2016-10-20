// Copyright 2014, Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.testing.SoapRequestXmlProvider;
import com.google.api.ads.adwords.axis.v201609.cm.Budget;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201609.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201609.cm.Money;
import com.google.api.ads.adwords.axis.v201609.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;

import org.custommonkey.xmlunit.XMLAssert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests that a AdWords Axis SOAP call can be made end-to-end when SOAP compression is enabled.
 * This test should be run in its own JVM because it makes changes to system properties that could
 * cause issues with other integration tests.
 */
@RunWith(JUnit4.class)
public class AdWordsAxisSoapCompressionIntegrationTest extends MockHttpIntegrationTest {

  private static final String API_VERSION = "v201609";

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.adwords.useCompression", "true");
  }

  /**
   * Tests making an Axis AdWords API call with OAuth2 and compression enabled.
   */
  @Test
  public void testGoldenSoap_oauth2_compressionEnabled() throws Exception {
    testHttpServer.setMockResponseBody(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION));
  
    GoogleCredential credential = new GoogleCredential.Builder().setTransport(
        new NetHttpTransport()).setJsonFactory(new JacksonFactory()).build();
    credential.setAccessToken("TEST_ACCESS_TOKEN");
  
    AdWordsSession session = new AdWordsSession.Builder().withUserAgent("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint(testHttpServer.getServerUrl())
        .withDeveloperToken("TEST_DEVELOPER_TOKEN")
        .withClientCustomerId("TEST_CLIENT_CUSTOMER_ID")
        .build();
  
    BudgetServiceInterface companyService =
        new AdWordsServices().get(session, BudgetServiceInterface.class);
    
    Budget budget = new Budget();
    budget.setName("Test Budget Name");
    Money money = new Money();
    money.setMicroAmount(50000000L);
    budget.setAmount(money);
    budget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    BudgetOperation operation = new BudgetOperation();
    operation.setOperand(budget);
    operation.setOperator(Operator.ADD);
    
    Budget responseBudget = companyService.mutate(new BudgetOperation[] {operation}).getValue(0);
  
    assertEquals("Budget ID does not match", 251877074L, responseBudget.getBudgetId().longValue());
    assertEquals("Budget name does not match", budget.getName(), responseBudget.getName());
    assertEquals("Budget amount does not match", budget.getAmount().getMicroAmount(),
        responseBudget.getAmount().getMicroAmount());
    assertEquals("Budget delivery method does not match", budget.getDeliveryMethod(),
        responseBudget.getDeliveryMethod());
    
    assertTrue("Compression was enabled but the last request body was not compressed",
        testHttpServer.wasLastRequestBodyCompressed());
    XMLAssert.assertXMLEqual(SoapRequestXmlProvider.getOAuth2SoapRequest(API_VERSION),
        testHttpServer.getLastRequestBody());
    assertEquals("Bearer TEST_ACCESS_TOKEN", testHttpServer.getLastAuthorizationHttpHeader());
  }
}
