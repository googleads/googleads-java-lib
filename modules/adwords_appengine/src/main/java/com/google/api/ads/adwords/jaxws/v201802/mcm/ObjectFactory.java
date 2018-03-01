// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201802.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201802.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201802.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201802.mcm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201802", "RequestHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201802", "ApiExceptionFault");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201802", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201802.mcm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerError }
     * 
     */
    public CustomerError createCustomerError() {
        return new CustomerError();
    }

    /**
     * Create an instance of {@link PendingInvitation }
     * 
     */
    public PendingInvitation createPendingInvitation() {
        return new PendingInvitation();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ManagedCustomerLabel }
     * 
     */
    public ManagedCustomerLabel createManagedCustomerLabel() {
        return new ManagedCustomerLabel();
    }

    /**
     * Create an instance of {@link ConversionTrackingSettings }
     * 
     */
    public ConversionTrackingSettings createConversionTrackingSettings() {
        return new ConversionTrackingSettings();
    }

    /**
     * Create an instance of {@link LabelServiceError }
     * 
     */
    public LabelServiceError createLabelServiceError() {
        return new LabelServiceError();
    }

    /**
     * Create an instance of {@link MutateLinkResults }
     * 
     */
    public MutateLinkResults createMutateLinkResults() {
        return new MutateLinkResults();
    }

    /**
     * Create an instance of {@link ManagedCustomerLabelOperation }
     * 
     */
    public ManagedCustomerLabelOperation createManagedCustomerLabelOperation() {
        return new ManagedCustomerLabelOperation();
    }

    /**
     * Create an instance of {@link AccountLabelOperation }
     * 
     */
    public AccountLabelOperation createAccountLabelOperation() {
        return new AccountLabelOperation();
    }

    /**
     * Create an instance of {@link ServiceLinkOperation }
     * 
     */
    public ServiceLinkOperation createServiceLinkOperation() {
        return new ServiceLinkOperation();
    }

    /**
     * Create an instance of {@link AccountLabelReturnValue }
     * 
     */
    public AccountLabelReturnValue createAccountLabelReturnValue() {
        return new AccountLabelReturnValue();
    }

    /**
     * Create an instance of {@link PendingInvitationSelector }
     * 
     */
    public PendingInvitationSelector createPendingInvitationSelector() {
        return new PendingInvitationSelector();
    }

    /**
     * Create an instance of {@link MoveOperation }
     * 
     */
    public MoveOperation createMoveOperation() {
        return new MoveOperation();
    }

    /**
     * Create an instance of {@link ServiceLink }
     * 
     */
    public ServiceLink createServiceLink() {
        return new ServiceLink();
    }

    /**
     * Create an instance of {@link ManagedCustomerPage }
     * 
     */
    public ManagedCustomerPage createManagedCustomerPage() {
        return new ManagedCustomerPage();
    }

    /**
     * Create an instance of {@link RemarketingSettings }
     * 
     */
    public RemarketingSettings createRemarketingSettings() {
        return new RemarketingSettings();
    }

    /**
     * Create an instance of {@link AccountLabel }
     * 
     */
    public AccountLabel createAccountLabel() {
        return new AccountLabel();
    }

    /**
     * Create an instance of {@link ManagedCustomer }
     * 
     */
    public ManagedCustomer createManagedCustomer() {
        return new ManagedCustomer();
    }

    /**
     * Create an instance of {@link ManagedCustomerLink }
     * 
     */
    public ManagedCustomerLink createManagedCustomerLink() {
        return new ManagedCustomerLink();
    }

    /**
     * Create an instance of {@link LinkOperation }
     * 
     */
    public LinkOperation createLinkOperation() {
        return new LinkOperation();
    }

    /**
     * Create an instance of {@link ManagedCustomerServiceError }
     * 
     */
    public ManagedCustomerServiceError createManagedCustomerServiceError() {
        return new ManagedCustomerServiceError();
    }

    /**
     * Create an instance of {@link ManagedCustomerLabelReturnValue }
     * 
     */
    public ManagedCustomerLabelReturnValue createManagedCustomerLabelReturnValue() {
        return new ManagedCustomerLabelReturnValue();
    }

    /**
     * Create an instance of {@link ManagedCustomerReturnValue }
     * 
     */
    public ManagedCustomerReturnValue createManagedCustomerReturnValue() {
        return new ManagedCustomerReturnValue();
    }

    /**
     * Create an instance of {@link MutateManagerResults }
     * 
     */
    public MutateManagerResults createMutateManagerResults() {
        return new MutateManagerResults();
    }

    /**
     * Create an instance of {@link ManagedCustomerOperation }
     * 
     */
    public ManagedCustomerOperation createManagedCustomerOperation() {
        return new ManagedCustomerOperation();
    }

    /**
     * Create an instance of {@link CurrencyCodeError }
     * 
     */
    public CurrencyCodeError createCurrencyCodeError() {
        return new CurrencyCodeError();
    }

    /**
     * Create an instance of {@link AccountLabelPage }
     * 
     */
    public AccountLabelPage createAccountLabelPage() {
        return new AccountLabelPage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201802", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201802", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201802", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

}
