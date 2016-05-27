
package com.google.api.ads.adwords.jaxws.v201605.express;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201605.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201605.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201605.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201605.express package. 
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

    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201605", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201605", "ApiExceptionFault");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201605", "RequestHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201605.express
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KeywordGroup }
     * 
     */
    public KeywordGroup createKeywordGroup() {
        return new KeywordGroup();
    }

    /**
     * Create an instance of {@link BusinessHour }
     * 
     */
    public BusinessHour createBusinessHour() {
        return new BusinessHour();
    }

    /**
     * Create an instance of {@link ExpressBusinessError }
     * 
     */
    public ExpressBusinessError createExpressBusinessError() {
        return new ExpressBusinessError();
    }

    /**
     * Create an instance of {@link ExpressBusinessOperation }
     * 
     */
    public ExpressBusinessOperation createExpressBusinessOperation() {
        return new ExpressBusinessOperation();
    }

    /**
     * Create an instance of {@link PromotionError }
     * 
     */
    public PromotionError createPromotionError() {
        return new PromotionError();
    }

    /**
     * Create an instance of {@link Promotion }
     * 
     */
    public Promotion createPromotion() {
        return new Promotion();
    }

    /**
     * Create an instance of {@link ExpressBusiness }
     * 
     */
    public ExpressBusiness createExpressBusiness() {
        return new ExpressBusiness();
    }

    /**
     * Create an instance of {@link ExpressBusinessPage }
     * 
     */
    public ExpressBusinessPage createExpressBusinessPage() {
        return new ExpressBusinessPage();
    }

    /**
     * Create an instance of {@link PromotionPage }
     * 
     */
    public PromotionPage createPromotionPage() {
        return new PromotionPage();
    }

    /**
     * Create an instance of {@link KeywordSet }
     * 
     */
    public KeywordSet createKeywordSet() {
        return new KeywordSet();
    }

    /**
     * Create an instance of {@link Creative }
     * 
     */
    public Creative createCreative() {
        return new Creative();
    }

    /**
     * Create an instance of {@link NegativeCriterion }
     * 
     */
    public NegativeCriterion createNegativeCriterion() {
        return new NegativeCriterion();
    }

    /**
     * Create an instance of {@link BudgetSuggestionSelector }
     * 
     */
    public BudgetSuggestionSelector createBudgetSuggestionSelector() {
        return new BudgetSuggestionSelector();
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
     * Create an instance of {@link ExpressSoapHeader }
     * 
     */
    public ExpressSoapHeader createExpressSoapHeader() {
        return new ExpressSoapHeader();
    }

    /**
     * Create an instance of {@link ProductService }
     * 
     */
    public ProductService createProductService() {
        return new ProductService();
    }

    /**
     * Create an instance of {@link PromotionOperation }
     * 
     */
    public PromotionOperation createPromotionOperation() {
        return new PromotionOperation();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link ProductServicePage }
     * 
     */
    public ProductServicePage createProductServicePage() {
        return new ProductServicePage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201605", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201605", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/express/v201605", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

}
