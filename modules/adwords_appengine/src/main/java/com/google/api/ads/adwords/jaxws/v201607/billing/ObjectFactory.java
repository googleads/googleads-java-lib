
package com.google.api.ads.adwords.jaxws.v201607.billing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201607.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201607.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201607.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201607.billing package. 
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

    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/billing/v201607", "RequestHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/billing/v201607", "ApiExceptionFault");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/billing/v201607", "ResponseHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201607.billing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mutate }
     * 
     */
    public Mutate createMutate() {
        return new Mutate();
    }

    /**
     * Create an instance of {@link BudgetOrderOperation }
     * 
     */
    public BudgetOrderOperation createBudgetOrderOperation() {
        return new BudgetOrderOperation();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link BudgetOrderPage }
     * 
     */
    public BudgetOrderPage createBudgetOrderPage() {
        return new BudgetOrderPage();
    }

    /**
     * Create an instance of {@link GetBillingAccounts }
     * 
     */
    public GetBillingAccounts createGetBillingAccounts() {
        return new GetBillingAccounts();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link MutateResponse }
     * 
     */
    public MutateResponse createMutateResponse() {
        return new MutateResponse();
    }

    /**
     * Create an instance of {@link BudgetOrderReturnValue }
     * 
     */
    public BudgetOrderReturnValue createBudgetOrderReturnValue() {
        return new BudgetOrderReturnValue();
    }

    /**
     * Create an instance of {@link GetBillingAccountsResponse }
     * 
     */
    public GetBillingAccountsResponse createGetBillingAccountsResponse() {
        return new GetBillingAccountsResponse();
    }

    /**
     * Create an instance of {@link BillingAccount }
     * 
     */
    public BillingAccount createBillingAccount() {
        return new BillingAccount();
    }

    /**
     * Create an instance of {@link BudgetOrderRequest }
     * 
     */
    public BudgetOrderRequest createBudgetOrderRequest() {
        return new BudgetOrderRequest();
    }

    /**
     * Create an instance of {@link BudgetOrderError }
     * 
     */
    public BudgetOrderError createBudgetOrderError() {
        return new BudgetOrderError();
    }

    /**
     * Create an instance of {@link BudgetOrder }
     * 
     */
    public BudgetOrder createBudgetOrder() {
        return new BudgetOrder();
    }

    /**
     * Create an instance of {@link CustomerOrderLineError }
     * 
     */
    public CustomerOrderLineError createCustomerOrderLineError() {
        return new CustomerOrderLineError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/billing/v201607", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/billing/v201607", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/billing/v201607", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

}
