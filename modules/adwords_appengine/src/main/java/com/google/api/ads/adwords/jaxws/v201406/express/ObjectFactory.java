
package com.google.api.ads.adwords.jaxws.v201406.express;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201406.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201406.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201406.express package. 
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

    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201406", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201406", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201406", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201406.express
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExpressSoapHeader }
     * 
     */
    public ExpressSoapHeader createExpressSoapHeader() {
        return new ExpressSoapHeader();
    }

    /**
     * Create an instance of {@link BudgetSuggestionServiceInterfaceget }
     * 
     */
    public BudgetSuggestionServiceInterfaceget createBudgetSuggestionServiceInterfaceget() {
        return new BudgetSuggestionServiceInterfaceget();
    }

    /**
     * Create an instance of {@link BudgetSuggestionServiceInterfacegetResponse }
     * 
     */
    public BudgetSuggestionServiceInterfacegetResponse createBudgetSuggestionServiceInterfacegetResponse() {
        return new BudgetSuggestionServiceInterfacegetResponse();
    }

    /**
     * Create an instance of {@link BudgetSuggestion }
     * 
     */
    public BudgetSuggestion createBudgetSuggestion() {
        return new BudgetSuggestion();
    }

    /**
     * Create an instance of {@link NegativeKeyword }
     * 
     */
    public NegativeKeyword createNegativeKeyword() {
        return new NegativeKeyword();
    }

    /**
     * Create an instance of {@link KeywordSet }
     * 
     */
    public KeywordSet createKeywordSet() {
        return new KeywordSet();
    }

    /**
     * Create an instance of {@link BudgetSuggestionSelector }
     * 
     */
    public BudgetSuggestionSelector createBudgetSuggestionSelector() {
        return new BudgetSuggestionSelector();
    }

    /**
     * Create an instance of {@link ProductService }
     * 
     */
    public ProductService createProductService() {
        return new ProductService();
    }

    /**
     * Create an instance of {@link NegativeCriterion }
     * 
     */
    public NegativeCriterion createNegativeCriterion() {
        return new NegativeCriterion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressSoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201406", name = "RequestHeader")
    public JAXBElement<ExpressSoapHeader> createRequestHeader(ExpressSoapHeader value) {
        return new JAXBElement<ExpressSoapHeader>(_RequestHeader_QNAME, ExpressSoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201406", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201406", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
