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

package com.google.api.ads.adwords.jaxws;

import com.google.api.ads.adwords.jaxws.factory.AdWordsServices;
import com.google.api.ads.adwords.jaxws.v201802.cm.Budget;
import com.google.api.ads.adwords.jaxws.v201802.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.jaxws.v201802.cm.BudgetOperation;
import com.google.api.ads.adwords.jaxws.v201802.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.soap.testing.SoapResponseXmlProvider;
import com.google.api.ads.common.lib.testing.MockHttpIntegrationTest;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.common.collect.Lists;
import javax.xml.ws.WebServiceException;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests that the SOAP timeout is properly set and honored for an AdWords JAX-WS SOAP call.
 */
@RunWith(JUnit4.class)
public class AdWordsJaxWsSoapTimeoutIntegrationTest extends MockHttpIntegrationTest {
  
  private static final String API_VERSION = "v201802";
  
  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  @BeforeClass
  public static void setupClass() {
    System.setProperty("api.adwords.soapRequestTimeout", "100");
  }
  /**
   * Tests that the request timeout in ads.properties is enforced.
   */
  @Test
  public void testRequestTimeoutEnforced() throws Exception {
    testHttpServer.setMockResponseBody(SoapResponseXmlProvider.getTestSoapResponse(API_VERSION));
    testHttpServer.setDelay(200L);
    
    GoogleCredential credential = new GoogleCredential.Builder().setTransport(
        new NetHttpTransport()).setJsonFactory(new JacksonFactory()).build();
    credential.setAccessToken("TEST_ACCESS_TOKEN");
  
    AdWordsSession session = new AdWordsSession.Builder()
        .withUserAgent("TEST_APP")
        .withOAuth2Credential(credential)
        .withEndpoint(testHttpServer.getServerUrl())
        .withDeveloperToken("TEST_DEVELOPER_TOKEN")
        .withClientCustomerId("TEST_CLIENT_CUSTOMER_ID")
        .build();
  
    BudgetServiceInterface budgetService =
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
    
    thrown.expect(WebServiceException.class);
    thrown.expectMessage("Read timed out");
    budgetService.mutate(Lists.newArrayList(operation));
  }
}
