
package com.google.api.ads.adwords.jaxws.v201406.o;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.google.api.ads.adwords.jaxws.v201406.cm.ApiException;
import com.google.api.ads.adwords.jaxws.v201406.cm.SoapHeader;
import com.google.api.ads.adwords.jaxws.v201406.cm.SoapResponseHeader;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.adwords.jaxws.v201406.o package. 
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

    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201406", "RequestHeader");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201406", "ResponseHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201406", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201406.o
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrafficEstimatorServiceInterfaceget }
     * 
     */
    public TrafficEstimatorServiceInterfaceget createTrafficEstimatorServiceInterfaceget() {
        return new TrafficEstimatorServiceInterfaceget();
    }

    /**
     * Create an instance of {@link TrafficEstimatorServiceInterfacegetResponse }
     * 
     */
    public TrafficEstimatorServiceInterfacegetResponse createTrafficEstimatorServiceInterfacegetResponse() {
        return new TrafficEstimatorServiceInterfacegetResponse();
    }

    /**
     * Create an instance of {@link TrafficEstimatorResult }
     * 
     */
    public TrafficEstimatorResult createTrafficEstimatorResult() {
        return new TrafficEstimatorResult();
    }

    /**
     * Create an instance of {@link Estimate }
     * 
     */
    public Estimate createEstimate() {
        return new Estimate();
    }

    /**
     * Create an instance of {@link KeywordEstimate }
     * 
     */
    public KeywordEstimate createKeywordEstimate() {
        return new KeywordEstimate();
    }

    /**
     * Create an instance of {@link MatchesRegexError }
     * 
     */
    public MatchesRegexError createMatchesRegexError() {
        return new MatchesRegexError();
    }

    /**
     * Create an instance of {@link CampaignEstimateRequest }
     * 
     */
    public CampaignEstimateRequest createCampaignEstimateRequest() {
        return new CampaignEstimateRequest();
    }

    /**
     * Create an instance of {@link TrafficEstimatorError }
     * 
     */
    public TrafficEstimatorError createTrafficEstimatorError() {
        return new TrafficEstimatorError();
    }

    /**
     * Create an instance of {@link CampaignEstimate }
     * 
     */
    public CampaignEstimate createCampaignEstimate() {
        return new CampaignEstimate();
    }

    /**
     * Create an instance of {@link KeywordEstimateRequest }
     * 
     */
    public KeywordEstimateRequest createKeywordEstimateRequest() {
        return new KeywordEstimateRequest();
    }

    /**
     * Create an instance of {@link AdGroupEstimateRequest }
     * 
     */
    public AdGroupEstimateRequest createAdGroupEstimateRequest() {
        return new AdGroupEstimateRequest();
    }

    /**
     * Create an instance of {@link CurrencyCodeError }
     * 
     */
    public CurrencyCodeError createCurrencyCodeError() {
        return new CurrencyCodeError();
    }

    /**
     * Create an instance of {@link StatsEstimate }
     * 
     */
    public StatsEstimate createStatsEstimate() {
        return new StatsEstimate();
    }

    /**
     * Create an instance of {@link AdGroupEstimate }
     * 
     */
    public AdGroupEstimate createAdGroupEstimate() {
        return new AdGroupEstimate();
    }

    /**
     * Create an instance of {@link TrafficEstimatorSelector }
     * 
     */
    public TrafficEstimatorSelector createTrafficEstimatorSelector() {
        return new TrafficEstimatorSelector();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201406", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201406", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201406", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
