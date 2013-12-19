
package com.google.api.ads.adwords.jaxws.v201309.mcm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201309.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201309.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201309.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201309.mcm package. 
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

    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201309", "ResponseHeader");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201309", "RequestHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/mcm/v201309", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201309.mcm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManagedCustomerOperation }
     * 
     */
    public ManagedCustomerOperation createManagedCustomerOperation() {
        return new ManagedCustomerOperation();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link ManagedCustomerPage }
     * 
     */
    public ManagedCustomerPage createManagedCustomerPage() {
        return new ManagedCustomerPage();
    }

    /**
     * Create an instance of {@link ManagedCustomerLink }
     * 
     */
    public ManagedCustomerLink createManagedCustomerLink() {
        return new ManagedCustomerLink();
    }

    /**
     * Create an instance of {@link MutateLinkResults }
     * 
     */
    public MutateLinkResults createMutateLinkResults() {
        return new MutateLinkResults();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link AlertError }
     * 
     */
    public AlertError createAlertError() {
        return new AlertError();
    }

    /**
     * Create an instance of {@link PendingInvitation }
     * 
     */
    public PendingInvitation createPendingInvitation() {
        return new PendingInvitation();
    }

    /**
     * Create an instance of {@link LinkOperation }
     * 
     */
    public LinkOperation createLinkOperation() {
        return new LinkOperation();
    }

    /**
     * Create an instance of {@link AlertPage }
     * 
     */
    public AlertPage createAlertPage() {
        return new AlertPage();
    }

    /**
     * Create an instance of {@link ManagedCustomerServiceError }
     * 
     */
    public ManagedCustomerServiceError createManagedCustomerServiceError() {
        return new ManagedCustomerServiceError();
    }

    /**
     * Create an instance of {@link ManagedCustomerReturnValue }
     * 
     */
    public ManagedCustomerReturnValue createManagedCustomerReturnValue() {
        return new ManagedCustomerReturnValue();
    }

    /**
     * Create an instance of {@link PendingInvitationSelector }
     * 
     */
    public PendingInvitationSelector createPendingInvitationSelector() {
        return new PendingInvitationSelector();
    }

    /**
     * Create an instance of {@link Alert }
     * 
     */
    public Alert createAlert() {
        return new Alert();
    }

    /**
     * Create an instance of {@link MutateManagerResults }
     * 
     */
    public MutateManagerResults createMutateManagerResults() {
        return new MutateManagerResults();
    }

    /**
     * Create an instance of {@link AlertQuery }
     * 
     */
    public AlertQuery createAlertQuery() {
        return new AlertQuery();
    }

    /**
     * Create an instance of {@link MoveOperation }
     * 
     */
    public MoveOperation createMoveOperation() {
        return new MoveOperation();
    }

    /**
     * Create an instance of {@link ManagedCustomer }
     * 
     */
    public ManagedCustomer createManagedCustomer() {
        return new ManagedCustomer();
    }

    /**
     * Create an instance of {@link AlertSelector }
     * 
     */
    public AlertSelector createAlertSelector() {
        return new AlertSelector();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201309", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201309", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/mcm/v201309", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
