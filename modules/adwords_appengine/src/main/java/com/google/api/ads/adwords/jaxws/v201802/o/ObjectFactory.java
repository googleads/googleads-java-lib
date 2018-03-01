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


package com.google.api.ads.adwords.jaxws.v201802.o;

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
 * generated in the com.google.api.ads.adwords.jaxws.v201802.o package. 
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

    private final static QName _ApiExceptionFault_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201802", "ApiExceptionFault");
    private final static QName _ResponseHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201802", "ResponseHeader");
    private final static QName _RequestHeader_QNAME = new QName("https://adwords.google.com/api/adwords/o/v201802", "RequestHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.adwords.jaxws.v201802.o
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SeedAdGroupIdSearchParameter }
     * 
     */
    public SeedAdGroupIdSearchParameter createSeedAdGroupIdSearchParameter() {
        return new SeedAdGroupIdSearchParameter();
    }

    /**
     * Create an instance of {@link KeywordAttribute }
     * 
     */
    public KeywordAttribute createKeywordAttribute() {
        return new KeywordAttribute();
    }

    /**
     * Create an instance of {@link TargetingIdea }
     * 
     */
    public TargetingIdea createTargetingIdea() {
        return new TargetingIdea();
    }

    /**
     * Create an instance of {@link StringAttribute }
     * 
     */
    public StringAttribute createStringAttribute() {
        return new StringAttribute();
    }

    /**
     * Create an instance of {@link TypeAttributeMapEntry }
     * 
     */
    public TypeAttributeMapEntry createTypeAttributeMapEntry() {
        return new TypeAttributeMapEntry();
    }

    /**
     * Create an instance of {@link MonthlySearchVolumeAttribute }
     * 
     */
    public MonthlySearchVolumeAttribute createMonthlySearchVolumeAttribute() {
        return new MonthlySearchVolumeAttribute();
    }

    /**
     * Create an instance of {@link KeywordEstimateRequest }
     * 
     */
    public KeywordEstimateRequest createKeywordEstimateRequest() {
        return new KeywordEstimateRequest();
    }

    /**
     * Create an instance of {@link IdeaTypeAttribute }
     * 
     */
    public IdeaTypeAttribute createIdeaTypeAttribute() {
        return new IdeaTypeAttribute();
    }

    /**
     * Create an instance of {@link LongAttribute }
     * 
     */
    public LongAttribute createLongAttribute() {
        return new LongAttribute();
    }

    /**
     * Create an instance of {@link TargetingIdeaError }
     * 
     */
    public TargetingIdeaError createTargetingIdeaError() {
        return new TargetingIdeaError();
    }

    /**
     * Create an instance of {@link CategoryProductsAndServicesSearchParameter }
     * 
     */
    public CategoryProductsAndServicesSearchParameter createCategoryProductsAndServicesSearchParameter() {
        return new CategoryProductsAndServicesSearchParameter();
    }

    /**
     * Create an instance of {@link IdeaTextFilterSearchParameter }
     * 
     */
    public IdeaTextFilterSearchParameter createIdeaTextFilterSearchParameter() {
        return new IdeaTextFilterSearchParameter();
    }

    /**
     * Create an instance of {@link CriterionAttribute }
     * 
     */
    public CriterionAttribute createCriterionAttribute() {
        return new CriterionAttribute();
    }

    /**
     * Create an instance of {@link IntegerSetAttribute }
     * 
     */
    public IntegerSetAttribute createIntegerSetAttribute() {
        return new IntegerSetAttribute();
    }

    /**
     * Create an instance of {@link RelatedToUrlSearchParameter }
     * 
     */
    public RelatedToUrlSearchParameter createRelatedToUrlSearchParameter() {
        return new RelatedToUrlSearchParameter();
    }

    /**
     * Create an instance of {@link LanguageSearchParameter }
     * 
     */
    public LanguageSearchParameter createLanguageSearchParameter() {
        return new LanguageSearchParameter();
    }

    /**
     * Create an instance of {@link Range }
     * 
     */
    public Range createRange() {
        return new Range();
    }

    /**
     * Create an instance of {@link IntegerAttribute }
     * 
     */
    public IntegerAttribute createIntegerAttribute() {
        return new IntegerAttribute();
    }

    /**
     * Create an instance of {@link DoubleAttribute }
     * 
     */
    public DoubleAttribute createDoubleAttribute() {
        return new DoubleAttribute();
    }

    /**
     * Create an instance of {@link PlatformCampaignEstimate }
     * 
     */
    public PlatformCampaignEstimate createPlatformCampaignEstimate() {
        return new PlatformCampaignEstimate();
    }

    /**
     * Create an instance of {@link LongRangeAttribute }
     * 
     */
    public LongRangeAttribute createLongRangeAttribute() {
        return new LongRangeAttribute();
    }

    /**
     * Create an instance of {@link TrafficEstimatorSelector }
     * 
     */
    public TrafficEstimatorSelector createTrafficEstimatorSelector() {
        return new TrafficEstimatorSelector();
    }

    /**
     * Create an instance of {@link BooleanAttribute }
     * 
     */
    public BooleanAttribute createBooleanAttribute() {
        return new BooleanAttribute();
    }

    /**
     * Create an instance of {@link Estimate }
     * 
     */
    public Estimate createEstimate() {
        return new Estimate();
    }

    /**
     * Create an instance of {@link AdGroupEstimate }
     * 
     */
    public AdGroupEstimate createAdGroupEstimate() {
        return new AdGroupEstimate();
    }

    /**
     * Create an instance of {@link WebpageDescriptorAttribute }
     * 
     */
    public WebpageDescriptorAttribute createWebpageDescriptorAttribute() {
        return new WebpageDescriptorAttribute();
    }

    /**
     * Create an instance of {@link WebpageDescriptor }
     * 
     */
    public WebpageDescriptor createWebpageDescriptor() {
        return new WebpageDescriptor();
    }

    /**
     * Create an instance of {@link TargetingIdeaPage }
     * 
     */
    public TargetingIdeaPage createTargetingIdeaPage() {
        return new TargetingIdeaPage();
    }

    /**
     * Create an instance of {@link CampaignEstimate }
     * 
     */
    public CampaignEstimate createCampaignEstimate() {
        return new CampaignEstimate();
    }

    /**
     * Create an instance of {@link MoneyAttribute }
     * 
     */
    public MoneyAttribute createMoneyAttribute() {
        return new MoneyAttribute();
    }

    /**
     * Create an instance of {@link TrafficEstimatorResult }
     * 
     */
    public TrafficEstimatorResult createTrafficEstimatorResult() {
        return new TrafficEstimatorResult();
    }

    /**
     * Create an instance of {@link TargetingIdeaSelector }
     * 
     */
    public TargetingIdeaSelector createTargetingIdeaSelector() {
        return new TargetingIdeaSelector();
    }

    /**
     * Create an instance of {@link CompetitionSearchParameter }
     * 
     */
    public CompetitionSearchParameter createCompetitionSearchParameter() {
        return new CompetitionSearchParameter();
    }

    /**
     * Create an instance of {@link SearchVolumeSearchParameter }
     * 
     */
    public SearchVolumeSearchParameter createSearchVolumeSearchParameter() {
        return new SearchVolumeSearchParameter();
    }

    /**
     * Create an instance of {@link LongComparisonOperation }
     * 
     */
    public LongComparisonOperation createLongComparisonOperation() {
        return new LongComparisonOperation();
    }

    /**
     * Create an instance of {@link CampaignEstimateRequest }
     * 
     */
    public CampaignEstimateRequest createCampaignEstimateRequest() {
        return new CampaignEstimateRequest();
    }

    /**
     * Create an instance of {@link LocationSearchParameter }
     * 
     */
    public LocationSearchParameter createLocationSearchParameter() {
        return new LocationSearchParameter();
    }

    /**
     * Create an instance of {@link NetworkSearchParameter }
     * 
     */
    public NetworkSearchParameter createNetworkSearchParameter() {
        return new NetworkSearchParameter();
    }

    /**
     * Create an instance of {@link MonthlySearchVolume }
     * 
     */
    public MonthlySearchVolume createMonthlySearchVolume() {
        return new MonthlySearchVolume();
    }

    /**
     * Create an instance of {@link AdGroupEstimateRequest }
     * 
     */
    public AdGroupEstimateRequest createAdGroupEstimateRequest() {
        return new AdGroupEstimateRequest();
    }

    /**
     * Create an instance of {@link IncludeAdultContentSearchParameter }
     * 
     */
    public IncludeAdultContentSearchParameter createIncludeAdultContentSearchParameter() {
        return new IncludeAdultContentSearchParameter();
    }

    /**
     * Create an instance of {@link TrafficEstimatorError }
     * 
     */
    public TrafficEstimatorError createTrafficEstimatorError() {
        return new TrafficEstimatorError();
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
     * Create an instance of {@link RelatedToQuerySearchParameter }
     * 
     */
    public RelatedToQuerySearchParameter createRelatedToQuerySearchParameter() {
        return new RelatedToQuerySearchParameter();
    }

    /**
     * Create an instance of {@link KeywordEstimate }
     * 
     */
    public KeywordEstimate createKeywordEstimate() {
        return new KeywordEstimate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201802", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201802", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://adwords.google.com/api/adwords/o/v201802", name = "RequestHeader")
    public JAXBElement<SoapHeader> createRequestHeader(SoapHeader value) {
        return new JAXBElement<SoapHeader>(_RequestHeader_QNAME, SoapHeader.class, null, value);
    }

}
