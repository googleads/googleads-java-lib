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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.api.ads.dfp.jaxws.v201802 package. 
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

    private final static QName _ResponseHeader_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201802", "ResponseHeader");
    private final static QName _RequestHeader_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201802", "RequestHeader");
    private final static QName _ApiExceptionFault_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201802", "ApiExceptionFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.api.ads.dfp.jaxws.v201802
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoapResponseHeader }
     * 
     */
    public SoapResponseHeader createSoapResponseHeader() {
        return new SoapResponseHeader();
    }

    /**
     * Create an instance of {@link GetAdUnitSizesByStatementResponse }
     * 
     */
    public GetAdUnitSizesByStatementResponse createGetAdUnitSizesByStatementResponse() {
        return new GetAdUnitSizesByStatementResponse();
    }

    /**
     * Create an instance of {@link AdUnitSize }
     * 
     */
    public AdUnitSize createAdUnitSize() {
        return new AdUnitSize();
    }

    /**
     * Create an instance of {@link UpdateAdUnitsResponse }
     * 
     */
    public UpdateAdUnitsResponse createUpdateAdUnitsResponse() {
        return new UpdateAdUnitsResponse();
    }

    /**
     * Create an instance of {@link AdUnit }
     * 
     */
    public AdUnit createAdUnit() {
        return new AdUnit();
    }

    /**
     * Create an instance of {@link GetAdUnitSizesByStatement }
     * 
     */
    public GetAdUnitSizesByStatement createGetAdUnitSizesByStatement() {
        return new GetAdUnitSizesByStatement();
    }

    /**
     * Create an instance of {@link Statement }
     * 
     */
    public Statement createStatement() {
        return new Statement();
    }

    /**
     * Create an instance of {@link ApiException }
     * 
     */
    public ApiException createApiException() {
        return new ApiException();
    }

    /**
     * Create an instance of {@link PerformAdUnitActionResponse }
     * 
     */
    public PerformAdUnitActionResponse createPerformAdUnitActionResponse() {
        return new PerformAdUnitActionResponse();
    }

    /**
     * Create an instance of {@link UpdateResult }
     * 
     */
    public UpdateResult createUpdateResult() {
        return new UpdateResult();
    }

    /**
     * Create an instance of {@link GetAdUnitsByStatement }
     * 
     */
    public GetAdUnitsByStatement createGetAdUnitsByStatement() {
        return new GetAdUnitsByStatement();
    }

    /**
     * Create an instance of {@link PerformAdUnitAction }
     * 
     */
    public PerformAdUnitAction createPerformAdUnitAction() {
        return new PerformAdUnitAction();
    }

    /**
     * Create an instance of {@link GetAdUnitsByStatementResponse }
     * 
     */
    public GetAdUnitsByStatementResponse createGetAdUnitsByStatementResponse() {
        return new GetAdUnitsByStatementResponse();
    }

    /**
     * Create an instance of {@link AdUnitPage }
     * 
     */
    public AdUnitPage createAdUnitPage() {
        return new AdUnitPage();
    }

    /**
     * Create an instance of {@link CreateAdUnits }
     * 
     */
    public CreateAdUnits createCreateAdUnits() {
        return new CreateAdUnits();
    }

    /**
     * Create an instance of {@link SoapRequestHeader }
     * 
     */
    public SoapRequestHeader createSoapRequestHeader() {
        return new SoapRequestHeader();
    }

    /**
     * Create an instance of {@link UpdateAdUnits }
     * 
     */
    public UpdateAdUnits createUpdateAdUnits() {
        return new UpdateAdUnits();
    }

    /**
     * Create an instance of {@link CreateAdUnitsResponse }
     * 
     */
    public CreateAdUnitsResponse createCreateAdUnitsResponse() {
        return new CreateAdUnitsResponse();
    }

    /**
     * Create an instance of {@link ReserveAndOverbookLineItems }
     * 
     */
    public ReserveAndOverbookLineItems createReserveAndOverbookLineItems() {
        return new ReserveAndOverbookLineItems();
    }

    /**
     * Create an instance of {@link VastRedirectCreative }
     * 
     */
    public VastRedirectCreative createVastRedirectCreative() {
        return new VastRedirectCreative();
    }

    /**
     * Create an instance of {@link UnarchiveOrders }
     * 
     */
    public UnarchiveOrders createUnarchiveOrders() {
        return new UnarchiveOrders();
    }

    /**
     * Create an instance of {@link SubmitOrdersForApproval }
     * 
     */
    public SubmitOrdersForApproval createSubmitOrdersForApproval() {
        return new SubmitOrdersForApproval();
    }

    /**
     * Create an instance of {@link AvailabilityForecastOptions }
     * 
     */
    public AvailabilityForecastOptions createAvailabilityForecastOptions() {
        return new AvailabilityForecastOptions();
    }

    /**
     * Create an instance of {@link VideoPositionWithinPod }
     * 
     */
    public VideoPositionWithinPod createVideoPositionWithinPod() {
        return new VideoPositionWithinPod();
    }

    /**
     * Create an instance of {@link ResultSet }
     * 
     */
    public ResultSet createResultSet() {
        return new ResultSet();
    }

    /**
     * Create an instance of {@link OperatingSystemVersionTargeting }
     * 
     */
    public OperatingSystemVersionTargeting createOperatingSystemVersionTargeting() {
        return new OperatingSystemVersionTargeting();
    }

    /**
     * Create an instance of {@link AdRuleTargetingError }
     * 
     */
    public AdRuleTargetingError createAdRuleTargetingError() {
        return new AdRuleTargetingError();
    }

    /**
     * Create an instance of {@link PackageActionError }
     * 
     */
    public PackageActionError createPackageActionError() {
        return new PackageActionError();
    }

    /**
     * Create an instance of {@link ReportQuery }
     * 
     */
    public ReportQuery createReportQuery() {
        return new ReportQuery();
    }

    /**
     * Create an instance of {@link CreativeTemplate }
     * 
     */
    public CreativeTemplate createCreativeTemplate() {
        return new CreativeTemplate();
    }

    /**
     * Create an instance of {@link TemplateInstantiatedCreativeError }
     * 
     */
    public TemplateInstantiatedCreativeError createTemplateInstantiatedCreativeError() {
        return new TemplateInstantiatedCreativeError();
    }

    /**
     * Create an instance of {@link AudienceSegmentPremiumFeature }
     * 
     */
    public AudienceSegmentPremiumFeature createAudienceSegmentPremiumFeature() {
        return new AudienceSegmentPremiumFeature();
    }

    /**
     * Create an instance of {@link PublisherQueryLanguageContextError }
     * 
     */
    public PublisherQueryLanguageContextError createPublisherQueryLanguageContextError() {
        return new PublisherQueryLanguageContextError();
    }

    /**
     * Create an instance of {@link ContentMetadataTargetingError }
     * 
     */
    public ContentMetadataTargetingError createContentMetadataTargetingError() {
        return new ContentMetadataTargetingError();
    }

    /**
     * Create an instance of {@link NoPoddingAdRuleSlot }
     * 
     */
    public NoPoddingAdRuleSlot createNoPoddingAdRuleSlot() {
        return new NoPoddingAdRuleSlot();
    }

    /**
     * Create an instance of {@link DeactivateAdUnits }
     * 
     */
    public DeactivateAdUnits createDeactivateAdUnits() {
        return new DeactivateAdUnits();
    }

    /**
     * Create an instance of {@link UnsupportedCreative }
     * 
     */
    public UnsupportedCreative createUnsupportedCreative() {
        return new UnsupportedCreative();
    }

    /**
     * Create an instance of {@link CustomFieldError }
     * 
     */
    public CustomFieldError createCustomFieldError() {
        return new CustomFieldError();
    }

    /**
     * Create an instance of {@link AdSenseAccountError }
     * 
     */
    public AdSenseAccountError createAdSenseAccountError() {
        return new AdSenseAccountError();
    }

    /**
     * Create an instance of {@link PlacementTargeting }
     * 
     */
    public PlacementTargeting createPlacementTargeting() {
        return new PlacementTargeting();
    }

    /**
     * Create an instance of {@link DeleteAdRules }
     * 
     */
    public DeleteAdRules createDeleteAdRules() {
        return new DeleteAdRules();
    }

    /**
     * Create an instance of {@link MarketplaceComment }
     * 
     */
    public MarketplaceComment createMarketplaceComment() {
        return new MarketplaceComment();
    }

    /**
     * Create an instance of {@link ProposalCompanyAssociation }
     * 
     */
    public ProposalCompanyAssociation createProposalCompanyAssociation() {
        return new ProposalCompanyAssociation();
    }

    /**
     * Create an instance of {@link DeliveryForecast }
     * 
     */
    public DeliveryForecast createDeliveryForecast() {
        return new DeliveryForecast();
    }

    /**
     * Create an instance of {@link ProposalLineItemMarketplaceInfo }
     * 
     */
    public ProposalLineItemMarketplaceInfo createProposalLineItemMarketplaceInfo() {
        return new ProposalLineItemMarketplaceInfo();
    }

    /**
     * Create an instance of {@link CreativeTemplateError }
     * 
     */
    public CreativeTemplateError createCreativeTemplateError() {
        return new CreativeTemplateError();
    }

    /**
     * Create an instance of {@link MobileDeviceTargeting }
     * 
     */
    public MobileDeviceTargeting createMobileDeviceTargeting() {
        return new MobileDeviceTargeting();
    }

    /**
     * Create an instance of {@link ArchiveMobileApplications }
     * 
     */
    public ArchiveMobileApplications createArchiveMobileApplications() {
        return new ArchiveMobileApplications();
    }

    /**
     * Create an instance of {@link ReconciliationReportRow }
     * 
     */
    public ReconciliationReportRow createReconciliationReportRow() {
        return new ReconciliationReportRow();
    }

    /**
     * Create an instance of {@link MobileDeviceSubmodelTargeting }
     * 
     */
    public MobileDeviceSubmodelTargeting createMobileDeviceSubmodelTargeting() {
        return new MobileDeviceSubmodelTargeting();
    }

    /**
     * Create an instance of {@link ActivityError }
     * 
     */
    public ActivityError createActivityError() {
        return new ActivityError();
    }

    /**
     * Create an instance of {@link CurrencyCodeError }
     * 
     */
    public CurrencyCodeError createCurrencyCodeError() {
        return new CurrencyCodeError();
    }

    /**
     * Create an instance of {@link UserTeamAssociation }
     * 
     */
    public UserTeamAssociation createUserTeamAssociation() {
        return new UserTeamAssociation();
    }

    /**
     * Create an instance of {@link PopulateAudienceSegments }
     * 
     */
    public PopulateAudienceSegments createPopulateAudienceSegments() {
        return new PopulateAudienceSegments();
    }

    /**
     * Create an instance of {@link SubmitReconciliationOrderReports }
     * 
     */
    public SubmitReconciliationOrderReports createSubmitReconciliationOrderReports() {
        return new SubmitReconciliationOrderReports();
    }

    /**
     * Create an instance of {@link ForecastError }
     * 
     */
    public ForecastError createForecastError() {
        return new ForecastError();
    }

    /**
     * Create an instance of {@link ApproveSuggestedAdUnits }
     * 
     */
    public ApproveSuggestedAdUnits createApproveSuggestedAdUnits() {
        return new ApproveSuggestedAdUnits();
    }

    /**
     * Create an instance of {@link ArchiveProductTemplates }
     * 
     */
    public ArchiveProductTemplates createArchiveProductTemplates() {
        return new ArchiveProductTemplates();
    }

    /**
     * Create an instance of {@link ArchiveLineItems }
     * 
     */
    public ArchiveLineItems createArchiveLineItems() {
        return new ArchiveLineItems();
    }

    /**
     * Create an instance of {@link RuleBasedFirstPartyAudienceSegment }
     * 
     */
    public RuleBasedFirstPartyAudienceSegment createRuleBasedFirstPartyAudienceSegment() {
        return new RuleBasedFirstPartyAudienceSegment();
    }

    /**
     * Create an instance of {@link RevertReconciliationOrderReports }
     * 
     */
    public RevertReconciliationOrderReports createRevertReconciliationOrderReports() {
        return new RevertReconciliationOrderReports();
    }

    /**
     * Create an instance of {@link ActivateUsers }
     * 
     */
    public ActivateUsers createActivateUsers() {
        return new ActivateUsers();
    }

    /**
     * Create an instance of {@link DateTimeRangeTargetingError }
     * 
     */
    public DateTimeRangeTargetingError createDateTimeRangeTargetingError() {
        return new DateTimeRangeTargetingError();
    }

    /**
     * Create an instance of {@link Placement }
     * 
     */
    public Placement createPlacement() {
        return new Placement();
    }

    /**
     * Create an instance of {@link MobileApplication }
     * 
     */
    public MobileApplication createMobileApplication() {
        return new MobileApplication();
    }

    /**
     * Create an instance of {@link NativeStyle }
     * 
     */
    public NativeStyle createNativeStyle() {
        return new NativeStyle();
    }

    /**
     * Create an instance of {@link GenericTargetingError }
     * 
     */
    public GenericTargetingError createGenericTargetingError() {
        return new GenericTargetingError();
    }

    /**
     * Create an instance of {@link ActivateAdRules }
     * 
     */
    public ActivateAdRules createActivateAdRules() {
        return new ActivateAdRules();
    }

    /**
     * Create an instance of {@link CompanySettings }
     * 
     */
    public CompanySettings createCompanySettings() {
        return new CompanySettings();
    }

    /**
     * Create an instance of {@link ServerError }
     * 
     */
    public ServerError createServerError() {
        return new ServerError();
    }

    /**
     * Create an instance of {@link AdExclusionRule }
     * 
     */
    public AdExclusionRule createAdExclusionRule() {
        return new AdExclusionRule();
    }

    /**
     * Create an instance of {@link LabelPage }
     * 
     */
    public LabelPage createLabelPage() {
        return new LabelPage();
    }

    /**
     * Create an instance of {@link DeviceCapabilityPremiumFeature }
     * 
     */
    public DeviceCapabilityPremiumFeature createDeviceCapabilityPremiumFeature() {
        return new DeviceCapabilityPremiumFeature();
    }

    /**
     * Create an instance of {@link Stats }
     * 
     */
    public Stats createStats() {
        return new Stats();
    }

    /**
     * Create an instance of {@link PrecisionError }
     * 
     */
    public PrecisionError createPrecisionError() {
        return new PrecisionError();
    }

    /**
     * Create an instance of {@link RichMediaStudioCreative }
     * 
     */
    public RichMediaStudioCreative createRichMediaStudioCreative() {
        return new RichMediaStudioCreative();
    }

    /**
     * Create an instance of {@link OperatingSystem }
     * 
     */
    public OperatingSystem createOperatingSystem() {
        return new OperatingSystem();
    }

    /**
     * Create an instance of {@link NativeStyleError }
     * 
     */
    public NativeStyleError createNativeStyleError() {
        return new NativeStyleError();
    }

    /**
     * Create an instance of {@link AudienceSegmentPage }
     * 
     */
    public AudienceSegmentPage createAudienceSegmentPage() {
        return new AudienceSegmentPage();
    }

    /**
     * Create an instance of {@link ProductTemplateMarketplaceInfo }
     * 
     */
    public ProductTemplateMarketplaceInfo createProductTemplateMarketplaceInfo() {
        return new ProductTemplateMarketplaceInfo();
    }

    /**
     * Create an instance of {@link AdRuleFrequencyCapError }
     * 
     */
    public AdRuleFrequencyCapError createAdRuleFrequencyCapError() {
        return new AdRuleFrequencyCapError();
    }

    /**
     * Create an instance of {@link CustomFieldOption }
     * 
     */
    public CustomFieldOption createCustomFieldOption() {
        return new CustomFieldOption();
    }

    /**
     * Create an instance of {@link ProductTemplate }
     * 
     */
    public ProductTemplate createProductTemplate() {
        return new ProductTemplate();
    }

    /**
     * Create an instance of {@link PremiumRateValue }
     * 
     */
    public PremiumRateValue createPremiumRateValue() {
        return new PremiumRateValue();
    }

    /**
     * Create an instance of {@link UserDomainTargetingError }
     * 
     */
    public UserDomainTargetingError createUserDomainTargetingError() {
        return new UserDomainTargetingError();
    }

    /**
     * Create an instance of {@link ClickTag }
     * 
     */
    public ClickTag createClickTag() {
        return new ClickTag();
    }

    /**
     * Create an instance of {@link ProductPackageItemPage }
     * 
     */
    public ProductPackageItemPage createProductPackageItemPage() {
        return new ProductPackageItemPage();
    }

    /**
     * Create an instance of {@link CustomCreativeError }
     * 
     */
    public CustomCreativeError createCustomCreativeError() {
        return new CustomCreativeError();
    }

    /**
     * Create an instance of {@link RequiredSizeError }
     * 
     */
    public RequiredSizeError createRequiredSizeError() {
        return new RequiredSizeError();
    }

    /**
     * Create an instance of {@link DaiIngestError }
     * 
     */
    public DaiIngestError createDaiIngestError() {
        return new DaiIngestError();
    }

    /**
     * Create an instance of {@link FlashCreative }
     * 
     */
    public FlashCreative createFlashCreative() {
        return new FlashCreative();
    }

    /**
     * Create an instance of {@link VideoCreative }
     * 
     */
    public VideoCreative createVideoCreative() {
        return new VideoCreative();
    }

    /**
     * Create an instance of {@link BrowserLanguage }
     * 
     */
    public BrowserLanguage createBrowserLanguage() {
        return new BrowserLanguage();
    }

    /**
     * Create an instance of {@link BooleanValue }
     * 
     */
    public BooleanValue createBooleanValue() {
        return new BooleanValue();
    }

    /**
     * Create an instance of {@link DeleteOrders }
     * 
     */
    public DeleteOrders createDeleteOrders() {
        return new DeleteOrders();
    }

    /**
     * Create an instance of {@link RequiredCollectionError }
     * 
     */
    public RequiredCollectionError createRequiredCollectionError() {
        return new RequiredCollectionError();
    }

    /**
     * Create an instance of {@link DeviceCategory }
     * 
     */
    public DeviceCategory createDeviceCategory() {
        return new DeviceCategory();
    }

    /**
     * Create an instance of {@link ProposalLineItemActionError }
     * 
     */
    public ProposalLineItemActionError createProposalLineItemActionError() {
        return new ProposalLineItemActionError();
    }

    /**
     * Create an instance of {@link ApproveAndOverbookOrders }
     * 
     */
    public ApproveAndOverbookOrders createApproveAndOverbookOrders() {
        return new ApproveAndOverbookOrders();
    }

    /**
     * Create an instance of {@link EditProposalsForNegotiation }
     * 
     */
    public EditProposalsForNegotiation createEditProposalsForNegotiation() {
        return new EditProposalsForNegotiation();
    }

    /**
     * Create an instance of {@link TextValue }
     * 
     */
    public TextValue createTextValue() {
        return new TextValue();
    }

    /**
     * Create an instance of {@link CreativePage }
     * 
     */
    public CreativePage createCreativePage() {
        return new CreativePage();
    }

    /**
     * Create an instance of {@link ProductTemplatePage }
     * 
     */
    public ProductTemplatePage createProductTemplatePage() {
        return new ProductTemplatePage();
    }

    /**
     * Create an instance of {@link CompanyCreditStatusError }
     * 
     */
    public CompanyCreditStatusError createCompanyCreditStatusError() {
        return new CompanyCreditStatusError();
    }

    /**
     * Create an instance of {@link LineItemCreativeAssociationPage }
     * 
     */
    public LineItemCreativeAssociationPage createLineItemCreativeAssociationPage() {
        return new LineItemCreativeAssociationPage();
    }

    /**
     * Create an instance of {@link OperatingSystemTargeting }
     * 
     */
    public OperatingSystemTargeting createOperatingSystemTargeting() {
        return new OperatingSystemTargeting();
    }

    /**
     * Create an instance of {@link CustomTargetingKey }
     * 
     */
    public CustomTargetingKey createCustomTargetingKey() {
        return new CustomTargetingKey();
    }

    /**
     * Create an instance of {@link CreativeWrapperPage }
     * 
     */
    public CreativeWrapperPage createCreativeWrapperPage() {
        return new CreativeWrapperPage();
    }

    /**
     * Create an instance of {@link ClickTrackingCreative }
     * 
     */
    public ClickTrackingCreative createClickTrackingCreative() {
        return new ClickTrackingCreative();
    }

    /**
     * Create an instance of {@link SuggestedAdUnit }
     * 
     */
    public SuggestedAdUnit createSuggestedAdUnit() {
        return new SuggestedAdUnit();
    }

    /**
     * Create an instance of {@link ContactError }
     * 
     */
    public ContactError createContactError() {
        return new ContactError();
    }

    /**
     * Create an instance of {@link LiveStreamEventPage }
     * 
     */
    public LiveStreamEventPage createLiveStreamEventPage() {
        return new LiveStreamEventPage();
    }

    /**
     * Create an instance of {@link ProductPage }
     * 
     */
    public ProductPage createProductPage() {
        return new ProductPage();
    }

    /**
     * Create an instance of {@link ActivatePlacements }
     * 
     */
    public ActivatePlacements createActivatePlacements() {
        return new ActivatePlacements();
    }

    /**
     * Create an instance of {@link LongCreativeTemplateVariable }
     * 
     */
    public LongCreativeTemplateVariable createLongCreativeTemplateVariable() {
        return new LongCreativeTemplateVariable();
    }

    /**
     * Create an instance of {@link ThirdPartyAudienceSegment }
     * 
     */
    public ThirdPartyAudienceSegment createThirdPartyAudienceSegment() {
        return new ThirdPartyAudienceSegment();
    }

    /**
     * Create an instance of {@link ArchiveNativeStyles }
     * 
     */
    public ArchiveNativeStyles createArchiveNativeStyles() {
        return new ArchiveNativeStyles();
    }

    /**
     * Create an instance of {@link ThirdPartyCreative }
     * 
     */
    public ThirdPartyCreative createThirdPartyCreative() {
        return new ThirdPartyCreative();
    }

    /**
     * Create an instance of {@link CustomTargetingPremiumFeature }
     * 
     */
    public CustomTargetingPremiumFeature createCustomTargetingPremiumFeature() {
        return new CustomTargetingPremiumFeature();
    }

    /**
     * Create an instance of {@link QuotaError }
     * 
     */
    public QuotaError createQuotaError() {
        return new QuotaError();
    }

    /**
     * Create an instance of {@link FlashOverlayCreative }
     * 
     */
    public FlashOverlayCreative createFlashOverlayCreative() {
        return new FlashOverlayCreative();
    }

    /**
     * Create an instance of {@link WorkflowActionError }
     * 
     */
    public WorkflowActionError createWorkflowActionError() {
        return new WorkflowActionError();
    }

    /**
     * Create an instance of {@link CompanyPage }
     * 
     */
    public CompanyPage createCompanyPage() {
        return new CompanyPage();
    }

    /**
     * Create an instance of {@link ProposalLineItemConstraints }
     * 
     */
    public ProposalLineItemConstraints createProposalLineItemConstraints() {
        return new ProposalLineItemConstraints();
    }

    /**
     * Create an instance of {@link BrowserLanguageTargeting }
     * 
     */
    public BrowserLanguageTargeting createBrowserLanguageTargeting() {
        return new BrowserLanguageTargeting();
    }

    /**
     * Create an instance of {@link SharedAudienceSegment }
     * 
     */
    public SharedAudienceSegment createSharedAudienceSegment() {
        return new SharedAudienceSegment();
    }

    /**
     * Create an instance of {@link CreativeWrapperError }
     * 
     */
    public CreativeWrapperError createCreativeWrapperError() {
        return new CreativeWrapperError();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link TargetingCriteriaBreakdown }
     * 
     */
    public TargetingCriteriaBreakdown createTargetingCriteriaBreakdown() {
        return new TargetingCriteriaBreakdown();
    }

    /**
     * Create an instance of {@link MobileCarrier }
     * 
     */
    public MobileCarrier createMobileCarrier() {
        return new MobileCarrier();
    }

    /**
     * Create an instance of {@link ActivateAdExclusionRules }
     * 
     */
    public ActivateAdExclusionRules createActivateAdExclusionRules() {
        return new ActivateAdExclusionRules();
    }

    /**
     * Create an instance of {@link DeleteLineItemCreativeAssociations }
     * 
     */
    public DeleteLineItemCreativeAssociations createDeleteLineItemCreativeAssociations() {
        return new DeleteLineItemCreativeAssociations();
    }

    /**
     * Create an instance of {@link BrowserPremiumFeature }
     * 
     */
    public BrowserPremiumFeature createBrowserPremiumFeature() {
        return new BrowserPremiumFeature();
    }

    /**
     * Create an instance of {@link PremiumRatePage }
     * 
     */
    public PremiumRatePage createPremiumRatePage() {
        return new PremiumRatePage();
    }

    /**
     * Create an instance of {@link ClickTrackingLineItemError }
     * 
     */
    public ClickTrackingLineItemError createClickTrackingLineItemError() {
        return new ClickTrackingLineItemError();
    }

    /**
     * Create an instance of {@link ResumeOrders }
     * 
     */
    public ResumeOrders createResumeOrders() {
        return new ResumeOrders();
    }

    /**
     * Create an instance of {@link ProposalLineItemPage }
     * 
     */
    public ProposalLineItemPage createProposalLineItemPage() {
        return new ProposalLineItemPage();
    }

    /**
     * Create an instance of {@link GrpDemographicBreakdown }
     * 
     */
    public GrpDemographicBreakdown createGrpDemographicBreakdown() {
        return new GrpDemographicBreakdown();
    }

    /**
     * Create an instance of {@link ListStringCreativeTemplateVariableVariableChoice }
     * 
     */
    public ListStringCreativeTemplateVariableVariableChoice createListStringCreativeTemplateVariableVariableChoice() {
        return new ListStringCreativeTemplateVariableVariableChoice();
    }

    /**
     * Create an instance of {@link ParseError }
     * 
     */
    public ParseError createParseError() {
        return new ParseError();
    }

    /**
     * Create an instance of {@link CreativeTargeting }
     * 
     */
    public CreativeTargeting createCreativeTargeting() {
        return new CreativeTargeting();
    }

    /**
     * Create an instance of {@link MobileApplicationActionError }
     * 
     */
    public MobileApplicationActionError createMobileApplicationActionError() {
        return new MobileApplicationActionError();
    }

    /**
     * Create an instance of {@link SetTopBoxCreativeError }
     * 
     */
    public SetTopBoxCreativeError createSetTopBoxCreativeError() {
        return new SetTopBoxCreativeError();
    }

    /**
     * Create an instance of {@link ArchivePlacements }
     * 
     */
    public ArchivePlacements createArchivePlacements() {
        return new ArchivePlacements();
    }

    /**
     * Create an instance of {@link CreativePlaceholder }
     * 
     */
    public CreativePlaceholder createCreativePlaceholder() {
        return new CreativePlaceholder();
    }

    /**
     * Create an instance of {@link ListStringCreativeTemplateVariable }
     * 
     */
    public ListStringCreativeTemplateVariable createListStringCreativeTemplateVariable() {
        return new ListStringCreativeTemplateVariable();
    }

    /**
     * Create an instance of {@link VideoPositionTarget }
     * 
     */
    public VideoPositionTarget createVideoPositionTarget() {
        return new VideoPositionTarget();
    }

    /**
     * Create an instance of {@link SetValue }
     * 
     */
    public SetValue createSetValue() {
        return new SetValue();
    }

    /**
     * Create an instance of {@link ReconciliationOrderReportPage }
     * 
     */
    public ReconciliationOrderReportPage createReconciliationOrderReportPage() {
        return new ReconciliationOrderReportPage();
    }

    /**
     * Create an instance of {@link UnarchiveProductPackages }
     * 
     */
    public UnarchiveProductPackages createUnarchiveProductPackages() {
        return new UnarchiveProductPackages();
    }

    /**
     * Create an instance of {@link AdRuleDateError }
     * 
     */
    public AdRuleDateError createAdRuleDateError() {
        return new AdRuleDateError();
    }

    /**
     * Create an instance of {@link PremiumRate }
     * 
     */
    public PremiumRate createPremiumRate() {
        return new PremiumRate();
    }

    /**
     * Create an instance of {@link TeamError }
     * 
     */
    public TeamError createTeamError() {
        return new TeamError();
    }

    /**
     * Create an instance of {@link LiveStreamEventActionError }
     * 
     */
    public LiveStreamEventActionError createLiveStreamEventActionError() {
        return new LiveStreamEventActionError();
    }

    /**
     * Create an instance of {@link DeactivateLineItemCreativeAssociations }
     * 
     */
    public DeactivateLineItemCreativeAssociations createDeactivateLineItemCreativeAssociations() {
        return new DeactivateLineItemCreativeAssociations();
    }

    /**
     * Create an instance of {@link DayPartTargeting }
     * 
     */
    public DayPartTargeting createDayPartTargeting() {
        return new DayPartTargeting();
    }

    /**
     * Create an instance of {@link ProductSegmentation }
     * 
     */
    public ProductSegmentation createProductSegmentation() {
        return new ProductSegmentation();
    }

    /**
     * Create an instance of {@link SamSessionError }
     * 
     */
    public SamSessionError createSamSessionError() {
        return new SamSessionError();
    }

    /**
     * Create an instance of {@link ProgrammaticError }
     * 
     */
    public ProgrammaticError createProgrammaticError() {
        return new ProgrammaticError();
    }

    /**
     * Create an instance of {@link VideoRedirectAsset }
     * 
     */
    public VideoRedirectAsset createVideoRedirectAsset() {
        return new VideoRedirectAsset();
    }

    /**
     * Create an instance of {@link StandardPoddingAdRuleSlot }
     * 
     */
    public StandardPoddingAdRuleSlot createStandardPoddingAdRuleSlot() {
        return new StandardPoddingAdRuleSlot();
    }

    /**
     * Create an instance of {@link CompanyError }
     * 
     */
    public CompanyError createCompanyError() {
        return new CompanyError();
    }

    /**
     * Create an instance of {@link AudienceSegmentDataProvider }
     * 
     */
    public AudienceSegmentDataProvider createAudienceSegmentDataProvider() {
        return new AudienceSegmentDataProvider();
    }

    /**
     * Create an instance of {@link ProductPackageItemError }
     * 
     */
    public ProductPackageItemError createProductPackageItemError() {
        return new ProductPackageItemError();
    }

    /**
     * Create an instance of {@link TypeError }
     * 
     */
    public TypeError createTypeError() {
        return new TypeError();
    }

    /**
     * Create an instance of {@link ContentMetadataKeyHierarchyError }
     * 
     */
    public ContentMetadataKeyHierarchyError createContentMetadataKeyHierarchyError() {
        return new ContentMetadataKeyHierarchyError();
    }

    /**
     * Create an instance of {@link ResumeAndOverbookOrders }
     * 
     */
    public ResumeAndOverbookOrders createResumeAndOverbookOrders() {
        return new ResumeAndOverbookOrders();
    }

    /**
     * Create an instance of {@link InvalidPhoneNumberError }
     * 
     */
    public InvalidPhoneNumberError createInvalidPhoneNumberError() {
        return new InvalidPhoneNumberError();
    }

    /**
     * Create an instance of {@link ProductPackageItem }
     * 
     */
    public ProductPackageItem createProductPackageItem() {
        return new ProductPackageItem();
    }

    /**
     * Create an instance of {@link TimeZoneError }
     * 
     */
    public TimeZoneError createTimeZoneError() {
        return new TimeZoneError();
    }

    /**
     * Create an instance of {@link AdRuleSlotError }
     * 
     */
    public AdRuleSlotError createAdRuleSlotError() {
        return new AdRuleSlotError();
    }

    /**
     * Create an instance of {@link VideoRedirectCreative }
     * 
     */
    public VideoRedirectCreative createVideoRedirectCreative() {
        return new VideoRedirectCreative();
    }

    /**
     * Create an instance of {@link AdSenseCreative }
     * 
     */
    public AdSenseCreative createAdSenseCreative() {
        return new AdSenseCreative();
    }

    /**
     * Create an instance of {@link MobileApplicationTargeting }
     * 
     */
    public MobileApplicationTargeting createMobileApplicationTargeting() {
        return new MobileApplicationTargeting();
    }

    /**
     * Create an instance of {@link ReserveInventoryProgressAction }
     * 
     */
    public ReserveInventoryProgressAction createReserveInventoryProgressAction() {
        return new ReserveInventoryProgressAction();
    }

    /**
     * Create an instance of {@link Label }
     * 
     */
    public Label createLabel() {
        return new Label();
    }

    /**
     * Create an instance of {@link DeactivateCreativeWrappers }
     * 
     */
    public DeactivateCreativeWrappers createDeactivateCreativeWrappers() {
        return new DeactivateCreativeWrappers();
    }

    /**
     * Create an instance of {@link FrequencyCapError }
     * 
     */
    public FrequencyCapError createFrequencyCapError() {
        return new FrequencyCapError();
    }

    /**
     * Create an instance of {@link ActivateRateCards }
     * 
     */
    public ActivateRateCards createActivateRateCards() {
        return new ActivateRateCards();
    }

    /**
     * Create an instance of {@link CustomCriteria }
     * 
     */
    public CustomCriteria createCustomCriteria() {
        return new CustomCriteria();
    }

    /**
     * Create an instance of {@link BaseContact }
     * 
     */
    public BaseContact createBaseContact() {
        return new BaseContact();
    }

    /**
     * Create an instance of {@link ProductError }
     * 
     */
    public ProductError createProductError() {
        return new ProductError();
    }

    /**
     * Create an instance of {@link ActivateAdUnits }
     * 
     */
    public ActivateAdUnits createActivateAdUnits() {
        return new ActivateAdUnits();
    }

    /**
     * Create an instance of {@link DeactivateTeams }
     * 
     */
    public DeactivateTeams createDeactivateTeams() {
        return new DeactivateTeams();
    }

    /**
     * Create an instance of {@link ArchiveOrders }
     * 
     */
    public ArchiveOrders createArchiveOrders() {
        return new ArchiveOrders();
    }

    /**
     * Create an instance of {@link ContentPage }
     * 
     */
    public ContentPage createContentPage() {
        return new ContentPage();
    }

    /**
     * Create an instance of {@link DeactivateCustomFields }
     * 
     */
    public DeactivateCustomFields createDeactivateCustomFields() {
        return new DeactivateCustomFields();
    }

    /**
     * Create an instance of {@link CreativeAssetMacroError }
     * 
     */
    public CreativeAssetMacroError createCreativeAssetMacroError() {
        return new CreativeAssetMacroError();
    }

    /**
     * Create an instance of {@link MobileDevice }
     * 
     */
    public MobileDevice createMobileDevice() {
        return new MobileDevice();
    }

    /**
     * Create an instance of {@link CustomCreative }
     * 
     */
    public CustomCreative createCustomCreative() {
        return new CustomCreative();
    }

    /**
     * Create an instance of {@link RequestError }
     * 
     */
    public RequestError createRequestError() {
        return new RequestError();
    }

    /**
     * Create an instance of {@link BandwidthPremiumFeature }
     * 
     */
    public BandwidthPremiumFeature createBandwidthPremiumFeature() {
        return new BandwidthPremiumFeature();
    }

    /**
     * Create an instance of {@link DeactivateAdRules }
     * 
     */
    public DeactivateAdRules createDeactivateAdRules() {
        return new DeactivateAdRules();
    }

    /**
     * Create an instance of {@link AdUnitHierarchyError }
     * 
     */
    public AdUnitHierarchyError createAdUnitHierarchyError() {
        return new AdUnitHierarchyError();
    }

    /**
     * Create an instance of {@link DeactivateProducts }
     * 
     */
    public DeactivateProducts createDeactivateProducts() {
        return new DeactivateProducts();
    }

    /**
     * Create an instance of {@link ProposalLink }
     * 
     */
    public ProposalLink createProposalLink() {
        return new ProposalLink();
    }

    /**
     * Create an instance of {@link AdSenseSettings }
     * 
     */
    public AdSenseSettings createAdSenseSettings() {
        return new AdSenseSettings();
    }

    /**
     * Create an instance of {@link CdnConfiguration }
     * 
     */
    public CdnConfiguration createCdnConfiguration() {
        return new CdnConfiguration();
    }

    /**
     * Create an instance of {@link UserPage }
     * 
     */
    public UserPage createUserPage() {
        return new UserPage();
    }

    /**
     * Create an instance of {@link VideoPosition }
     * 
     */
    public VideoPosition createVideoPosition() {
        return new VideoPosition();
    }

    /**
     * Create an instance of {@link ImageError }
     * 
     */
    public ImageError createImageError() {
        return new ImageError();
    }

    /**
     * Create an instance of {@link StatementError }
     * 
     */
    public StatementError createStatementError() {
        return new StatementError();
    }

    /**
     * Create an instance of {@link UnArchiveProductPackageItems }
     * 
     */
    public UnArchiveProductPackageItems createUnArchiveProductPackageItems() {
        return new UnArchiveProductPackageItems();
    }

    /**
     * Create an instance of {@link BandwidthGroup }
     * 
     */
    public BandwidthGroup createBandwidthGroup() {
        return new BandwidthGroup();
    }

    /**
     * Create an instance of {@link PauseLineItems }
     * 
     */
    public PauseLineItems createPauseLineItems() {
        return new PauseLineItems();
    }

    /**
     * Create an instance of {@link PoddingError }
     * 
     */
    public PoddingError createPoddingError() {
        return new PoddingError();
    }

    /**
     * Create an instance of {@link LineItemSummary }
     * 
     */
    public LineItemSummary createLineItemSummary() {
        return new LineItemSummary();
    }

    /**
     * Create an instance of {@link DeleteContentMetadataKeyHierarchies }
     * 
     */
    public DeleteContentMetadataKeyHierarchies createDeleteContentMetadataKeyHierarchies() {
        return new DeleteContentMetadataKeyHierarchies();
    }

    /**
     * Create an instance of {@link SavedQuery }
     * 
     */
    public SavedQuery createSavedQuery() {
        return new SavedQuery();
    }

    /**
     * Create an instance of {@link PlacementPage }
     * 
     */
    public PlacementPage createPlacementPage() {
        return new PlacementPage();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link PauseLiveStreamEventAds }
     * 
     */
    public PauseLiveStreamEventAds createPauseLiveStreamEventAds() {
        return new PauseLiveStreamEventAds();
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link SetTopBoxInfo }
     * 
     */
    public SetTopBoxInfo createSetTopBoxInfo() {
        return new SetTopBoxInfo();
    }

    /**
     * Create an instance of {@link DisapproveOrdersWithoutReservationChanges }
     * 
     */
    public DisapproveOrdersWithoutReservationChanges createDisapproveOrdersWithoutReservationChanges() {
        return new DisapproveOrdersWithoutReservationChanges();
    }

    /**
     * Create an instance of {@link AuthenticationError }
     * 
     */
    public AuthenticationError createAuthenticationError() {
        return new AuthenticationError();
    }

    /**
     * Create an instance of {@link LineItemTemplate }
     * 
     */
    public LineItemTemplate createLineItemTemplate() {
        return new LineItemTemplate();
    }

    /**
     * Create an instance of {@link WorkflowExternalConditionRequest }
     * 
     */
    public WorkflowExternalConditionRequest createWorkflowExternalConditionRequest() {
        return new WorkflowExternalConditionRequest();
    }

    /**
     * Create an instance of {@link ReservationDetailsError }
     * 
     */
    public ReservationDetailsError createReservationDetailsError() {
        return new ReservationDetailsError();
    }

    /**
     * Create an instance of {@link MobileApplicationError }
     * 
     */
    public MobileApplicationError createMobileApplicationError() {
        return new MobileApplicationError();
    }

    /**
     * Create an instance of {@link ContentTargeting }
     * 
     */
    public ContentTargeting createContentTargeting() {
        return new ContentTargeting();
    }

    /**
     * Create an instance of {@link InternalApiError }
     * 
     */
    public InternalApiError createInternalApiError() {
        return new InternalApiError();
    }

    /**
     * Create an instance of {@link CreativeError }
     * 
     */
    public CreativeError createCreativeError() {
        return new CreativeError();
    }

    /**
     * Create an instance of {@link LineItemFlightDateError }
     * 
     */
    public LineItemFlightDateError createLineItemFlightDateError() {
        return new LineItemFlightDateError();
    }

    /**
     * Create an instance of {@link UpdateOrderWithSellerData }
     * 
     */
    public UpdateOrderWithSellerData createUpdateOrderWithSellerData() {
        return new UpdateOrderWithSellerData();
    }

    /**
     * Create an instance of {@link ContentMetadataKeyHierarchy }
     * 
     */
    public ContentMetadataKeyHierarchy createContentMetadataKeyHierarchy() {
        return new ContentMetadataKeyHierarchy();
    }

    /**
     * Create an instance of {@link StringCreativeTemplateVariable }
     * 
     */
    public StringCreativeTemplateVariable createStringCreativeTemplateVariable() {
        return new StringCreativeTemplateVariable();
    }

    /**
     * Create an instance of {@link PublisherQueryLanguageSyntaxError }
     * 
     */
    public PublisherQueryLanguageSyntaxError createPublisherQueryLanguageSyntaxError() {
        return new PublisherQueryLanguageSyntaxError();
    }

    /**
     * Create an instance of {@link CdnConfigurationError }
     * 
     */
    public CdnConfigurationError createCdnConfigurationError() {
        return new CdnConfigurationError();
    }

    /**
     * Create an instance of {@link UnarchiveProposals }
     * 
     */
    public UnarchiveProposals createUnarchiveProposals() {
        return new UnarchiveProposals();
    }

    /**
     * Create an instance of {@link HtmlBundleProcessorError }
     * 
     */
    public HtmlBundleProcessorError createHtmlBundleProcessorError() {
        return new HtmlBundleProcessorError();
    }

    /**
     * Create an instance of {@link ProgrammaticCreative }
     * 
     */
    public ProgrammaticCreative createProgrammaticCreative() {
        return new ProgrammaticCreative();
    }

    /**
     * Create an instance of {@link ProgrammaticProductError }
     * 
     */
    public ProgrammaticProductError createProgrammaticProductError() {
        return new ProgrammaticProductError();
    }

    /**
     * Create an instance of {@link ActivateProducts }
     * 
     */
    public ActivateProducts createActivateProducts() {
        return new ActivateProducts();
    }

    /**
     * Create an instance of {@link ContentBundlePage }
     * 
     */
    public ContentBundlePage createContentBundlePage() {
        return new ContentBundlePage();
    }

    /**
     * Create an instance of {@link DeviceManufacturerTargeting }
     * 
     */
    public DeviceManufacturerTargeting createDeviceManufacturerTargeting() {
        return new DeviceManufacturerTargeting();
    }

    /**
     * Create an instance of {@link LegacyDfpCreative }
     * 
     */
    public LegacyDfpCreative createLegacyDfpCreative() {
        return new LegacyDfpCreative();
    }

    /**
     * Create an instance of {@link SetTopBoxCreative }
     * 
     */
    public SetTopBoxCreative createSetTopBoxCreative() {
        return new SetTopBoxCreative();
    }

    /**
     * Create an instance of {@link CustomFieldPage }
     * 
     */
    public CustomFieldPage createCustomFieldPage() {
        return new CustomFieldPage();
    }

    /**
     * Create an instance of {@link CustomizableAttributes }
     * 
     */
    public CustomizableAttributes createCustomizableAttributes() {
        return new CustomizableAttributes();
    }

    /**
     * Create an instance of {@link FrequencyCapPremiumFeature }
     * 
     */
    public FrequencyCapPremiumFeature createFrequencyCapPremiumFeature() {
        return new FrequencyCapPremiumFeature();
    }

    /**
     * Create an instance of {@link LineItemActivityAssociation }
     * 
     */
    public LineItemActivityAssociation createLineItemActivityAssociation() {
        return new LineItemActivityAssociation();
    }

    /**
     * Create an instance of {@link NotNullError }
     * 
     */
    public NotNullError createNotNullError() {
        return new NotNullError();
    }

    /**
     * Create an instance of {@link Technology }
     * 
     */
    public Technology createTechnology() {
        return new Technology();
    }

    /**
     * Create an instance of {@link ImageRedirectCreative }
     * 
     */
    public ImageRedirectCreative createImageRedirectCreative() {
        return new ImageRedirectCreative();
    }

    /**
     * Create an instance of {@link DeleteBaseRates }
     * 
     */
    public DeleteBaseRates createDeleteBaseRates() {
        return new DeleteBaseRates();
    }

    /**
     * Create an instance of {@link WorkflowRequestError }
     * 
     */
    public WorkflowRequestError createWorkflowRequestError() {
        return new WorkflowRequestError();
    }

    /**
     * Create an instance of {@link ResumeProposalLineItems }
     * 
     */
    public ResumeProposalLineItems createResumeProposalLineItems() {
        return new ResumeProposalLineItems();
    }

    /**
     * Create an instance of {@link AdRulePriorityError }
     * 
     */
    public AdRulePriorityError createAdRulePriorityError() {
        return new AdRulePriorityError();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link DaypartPremiumFeature }
     * 
     */
    public DaypartPremiumFeature createDaypartPremiumFeature() {
        return new DaypartPremiumFeature();
    }

    /**
     * Create an instance of {@link TechnologyTargetingError }
     * 
     */
    public TechnologyTargetingError createTechnologyTargetingError() {
        return new TechnologyTargetingError();
    }

    /**
     * Create an instance of {@link ReportJob }
     * 
     */
    public ReportJob createReportJob() {
        return new ReportJob();
    }

    /**
     * Create an instance of {@link BuyerRfp }
     * 
     */
    public BuyerRfp createBuyerRfp() {
        return new BuyerRfp();
    }

    /**
     * Create an instance of {@link GeoTargeting }
     * 
     */
    public GeoTargeting createGeoTargeting() {
        return new GeoTargeting();
    }

    /**
     * Create an instance of {@link BaseRateError }
     * 
     */
    public BaseRateError createBaseRateError() {
        return new BaseRateError();
    }

    /**
     * Create an instance of {@link AdRulePage }
     * 
     */
    public AdRulePage createAdRulePage() {
        return new AdRulePage();
    }

    /**
     * Create an instance of {@link DeliveryData }
     * 
     */
    public DeliveryData createDeliveryData() {
        return new DeliveryData();
    }

    /**
     * Create an instance of {@link DeleteCustomTargetingKeys }
     * 
     */
    public DeleteCustomTargetingKeys createDeleteCustomTargetingKeys() {
        return new DeleteCustomTargetingKeys();
    }

    /**
     * Create an instance of {@link RequestApprovalProgressAction }
     * 
     */
    public RequestApprovalProgressAction createRequestApprovalProgressAction() {
        return new RequestApprovalProgressAction();
    }

    /**
     * Create an instance of {@link AudienceExtensionError }
     * 
     */
    public AudienceExtensionError createAudienceExtensionError() {
        return new AudienceExtensionError();
    }

    /**
     * Create an instance of {@link RangeError }
     * 
     */
    public RangeError createRangeError() {
        return new RangeError();
    }

    /**
     * Create an instance of {@link LiveStreamEvent }
     * 
     */
    public LiveStreamEvent createLiveStreamEvent() {
        return new LiveStreamEvent();
    }

    /**
     * Create an instance of {@link RetractOrders }
     * 
     */
    public RetractOrders createRetractOrders() {
        return new RetractOrders();
    }

    /**
     * Create an instance of {@link NativeStylePage }
     * 
     */
    public NativeStylePage createNativeStylePage() {
        return new NativeStylePage();
    }

    /**
     * Create an instance of {@link LineItem }
     * 
     */
    public LineItem createLineItem() {
        return new LineItem();
    }

    /**
     * Create an instance of {@link SubmitProposalsForArchival }
     * 
     */
    public SubmitProposalsForArchival createSubmitProposalsForArchival() {
        return new SubmitProposalsForArchival();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link BillingError }
     * 
     */
    public BillingError createBillingError() {
        return new BillingError();
    }

    /**
     * Create an instance of {@link RateCardPage }
     * 
     */
    public RateCardPage createRateCardPage() {
        return new RateCardPage();
    }

    /**
     * Create an instance of {@link LineItemCreativeAssociation }
     * 
     */
    public LineItemCreativeAssociation createLineItemCreativeAssociation() {
        return new LineItemCreativeAssociation();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link LabelFrequencyCap }
     * 
     */
    public LabelFrequencyCap createLabelFrequencyCap() {
        return new LabelFrequencyCap();
    }

    /**
     * Create an instance of {@link LineItemCreativeAssociationOperationError }
     * 
     */
    public LineItemCreativeAssociationOperationError createLineItemCreativeAssociationOperationError() {
        return new LineItemCreativeAssociationOperationError();
    }

    /**
     * Create an instance of {@link UnarchiveProposalLineItems }
     * 
     */
    public UnarchiveProposalLineItems createUnarchiveProposalLineItems() {
        return new UnarchiveProposalLineItems();
    }

    /**
     * Create an instance of {@link LiveStreamEventCdnSettingsError }
     * 
     */
    public LiveStreamEventCdnSettingsError createLiveStreamEventCdnSettingsError() {
        return new LiveStreamEventCdnSettingsError();
    }

    /**
     * Create an instance of {@link TemplateCreative }
     * 
     */
    public TemplateCreative createTemplateCreative() {
        return new TemplateCreative();
    }

    /**
     * Create an instance of {@link ReportDownloadOptions }
     * 
     */
    public ReportDownloadOptions createReportDownloadOptions() {
        return new ReportDownloadOptions();
    }

    /**
     * Create an instance of {@link ExchangeRateError }
     * 
     */
    public ExchangeRateError createExchangeRateError() {
        return new ExchangeRateError();
    }

    /**
     * Create an instance of {@link Size }
     * 
     */
    public Size createSize() {
        return new Size();
    }

    /**
     * Create an instance of {@link ReconciliationLineItemReportPage }
     * 
     */
    public ReconciliationLineItemReportPage createReconciliationLineItemReportPage() {
        return new ReconciliationLineItemReportPage();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link RequestBuyerAcceptance }
     * 
     */
    public RequestBuyerAcceptance createRequestBuyerAcceptance() {
        return new RequestBuyerAcceptance();
    }

    /**
     * Create an instance of {@link AvailableBillingError }
     * 
     */
    public AvailableBillingError createAvailableBillingError() {
        return new AvailableBillingError();
    }

    /**
     * Create an instance of {@link CreativeNativeStylePreview }
     * 
     */
    public CreativeNativeStylePreview createCreativeNativeStylePreview() {
        return new CreativeNativeStylePreview();
    }

    /**
     * Create an instance of {@link ProposalPage }
     * 
     */
    public ProposalPage createProposalPage() {
        return new ProposalPage();
    }

    /**
     * Create an instance of {@link InternalRedirectCreative }
     * 
     */
    public InternalRedirectCreative createInternalRedirectCreative() {
        return new InternalRedirectCreative();
    }

    /**
     * Create an instance of {@link ActivityGroup }
     * 
     */
    public ActivityGroup createActivityGroup() {
        return new ActivityGroup();
    }

    /**
     * Create an instance of {@link LineItemCreativeAssociationError }
     * 
     */
    public LineItemCreativeAssociationError createLineItemCreativeAssociationError() {
        return new LineItemCreativeAssociationError();
    }

    /**
     * Create an instance of {@link CreativeSet }
     * 
     */
    public CreativeSet createCreativeSet() {
        return new CreativeSet();
    }

    /**
     * Create an instance of {@link SalespersonSplit }
     * 
     */
    public SalespersonSplit createSalespersonSplit() {
        return new SalespersonSplit();
    }

    /**
     * Create an instance of {@link ReconciliationReportPage }
     * 
     */
    public ReconciliationReportPage createReconciliationReportPage() {
        return new ReconciliationReportPage();
    }

    /**
     * Create an instance of {@link ActivateLineItems }
     * 
     */
    public ActivateLineItems createActivateLineItems() {
        return new ActivateLineItems();
    }

    /**
     * Create an instance of {@link PreferredDealError }
     * 
     */
    public PreferredDealError createPreferredDealError() {
        return new PreferredDealError();
    }

    /**
     * Create an instance of {@link ProductActionError }
     * 
     */
    public ProductActionError createProductActionError() {
        return new ProductActionError();
    }

    /**
     * Create an instance of {@link ContentMetadataKeyHierarchyPage }
     * 
     */
    public ContentMetadataKeyHierarchyPage createContentMetadataKeyHierarchyPage() {
        return new ContentMetadataKeyHierarchyPage();
    }

    /**
     * Create an instance of {@link AdMobBackfillCreative }
     * 
     */
    public AdMobBackfillCreative createAdMobBackfillCreative() {
        return new AdMobBackfillCreative();
    }

    /**
     * Create an instance of {@link DeactivateRateCards }
     * 
     */
    public DeactivateRateCards createDeactivateRateCards() {
        return new DeactivateRateCards();
    }

    /**
     * Create an instance of {@link ProductPackage }
     * 
     */
    public ProductPackage createProductPackage() {
        return new ProductPackage();
    }

    /**
     * Create an instance of {@link ProposalMarketplaceInfo }
     * 
     */
    public ProposalMarketplaceInfo createProposalMarketplaceInfo() {
        return new ProposalMarketplaceInfo();
    }

    /**
     * Create an instance of {@link VideoMetadata }
     * 
     */
    public VideoMetadata createVideoMetadata() {
        return new VideoMetadata();
    }

    /**
     * Create an instance of {@link DeleteLineItems }
     * 
     */
    public DeleteLineItems createDeleteLineItems() {
        return new DeleteLineItems();
    }

    /**
     * Create an instance of {@link ProductPackageItemActionError }
     * 
     */
    public ProductPackageItemActionError createProductPackageItemActionError() {
        return new ProductPackageItemActionError();
    }

    /**
     * Create an instance of {@link ActivateCustomFields }
     * 
     */
    public ActivateCustomFields createActivateCustomFields() {
        return new ActivateCustomFields();
    }

    /**
     * Create an instance of {@link DeviceManufacturerPremiumFeature }
     * 
     */
    public DeviceManufacturerPremiumFeature createDeviceManufacturerPremiumFeature() {
        return new DeviceManufacturerPremiumFeature();
    }

    /**
     * Create an instance of {@link ReserveProposalLineItems }
     * 
     */
    public ReserveProposalLineItems createReserveProposalLineItems() {
        return new ReserveProposalLineItems();
    }

    /**
     * Create an instance of {@link UnknownAdRuleSlot }
     * 
     */
    public UnknownAdRuleSlot createUnknownAdRuleSlot() {
        return new UnknownAdRuleSlot();
    }

    /**
     * Create an instance of {@link TechnologyTargeting }
     * 
     */
    public TechnologyTargeting createTechnologyTargeting() {
        return new TechnologyTargeting();
    }

    /**
     * Create an instance of {@link UnknownPremiumFeature }
     * 
     */
    public UnknownPremiumFeature createUnknownPremiumFeature() {
        return new UnknownPremiumFeature();
    }

    /**
     * Create an instance of {@link FlashRedirectCreative }
     * 
     */
    public FlashRedirectCreative createFlashRedirectCreative() {
        return new FlashRedirectCreative();
    }

    /**
     * Create an instance of {@link PlacementError }
     * 
     */
    public PlacementError createPlacementError() {
        return new PlacementError();
    }

    /**
     * Create an instance of {@link ProposalActionError }
     * 
     */
    public ProposalActionError createProposalActionError() {
        return new ProposalActionError();
    }

    /**
     * Create an instance of {@link SuggestedAdUnitPage }
     * 
     */
    public SuggestedAdUnitPage createSuggestedAdUnitPage() {
        return new SuggestedAdUnitPage();
    }

    /**
     * Create an instance of {@link ProductPackageItemBaseRate }
     * 
     */
    public ProductPackageItemBaseRate createProductPackageItemBaseRate() {
        return new ProductPackageItemBaseRate();
    }

    /**
     * Create an instance of {@link SubmitProposalsForApprovalBypassValidation }
     * 
     */
    public SubmitProposalsForApprovalBypassValidation createSubmitProposalsForApprovalBypassValidation() {
        return new SubmitProposalsForApprovalBypassValidation();
    }

    /**
     * Create an instance of {@link SwiffyConversionError }
     * 
     */
    public SwiffyConversionError createSwiffyConversionError() {
        return new SwiffyConversionError();
    }

    /**
     * Create an instance of {@link ActivateTeams }
     * 
     */
    public ActivateTeams createActivateTeams() {
        return new ActivateTeams();
    }

    /**
     * Create an instance of {@link CreativeAsset }
     * 
     */
    public CreativeAsset createCreativeAsset() {
        return new CreativeAsset();
    }

    /**
     * Create an instance of {@link FlashRedirectOverlayCreative }
     * 
     */
    public FlashRedirectOverlayCreative createFlashRedirectOverlayCreative() {
        return new FlashRedirectOverlayCreative();
    }

    /**
     * Create an instance of {@link ActivateCustomTargetingKeys }
     * 
     */
    public ActivateCustomTargetingKeys createActivateCustomTargetingKeys() {
        return new ActivateCustomTargetingKeys();
    }

    /**
     * Create an instance of {@link ActivityPage }
     * 
     */
    public ActivityPage createActivityPage() {
        return new ActivityPage();
    }

    /**
     * Create an instance of {@link ContentBundlePremiumFeature }
     * 
     */
    public ContentBundlePremiumFeature createContentBundlePremiumFeature() {
        return new ContentBundlePremiumFeature();
    }

    /**
     * Create an instance of {@link LabelError }
     * 
     */
    public LabelError createLabelError() {
        return new LabelError();
    }

    /**
     * Create an instance of {@link PauseOrders }
     * 
     */
    public PauseOrders createPauseOrders() {
        return new PauseOrders();
    }

    /**
     * Create an instance of {@link DropDownCustomField }
     * 
     */
    public DropDownCustomField createDropDownCustomField() {
        return new DropDownCustomField();
    }

    /**
     * Create an instance of {@link NullError }
     * 
     */
    public NullError createNullError() {
        return new NullError();
    }

    /**
     * Create an instance of {@link MarketplaceCommentPage }
     * 
     */
    public MarketplaceCommentPage createMarketplaceCommentPage() {
        return new MarketplaceCommentPage();
    }

    /**
     * Create an instance of {@link SourceContentConfiguration }
     * 
     */
    public SourceContentConfiguration createSourceContentConfiguration() {
        return new SourceContentConfiguration();
    }

    /**
     * Create an instance of {@link ApiVersionError }
     * 
     */
    public ApiVersionError createApiVersionError() {
        return new ApiVersionError();
    }

    /**
     * Create an instance of {@link SubmitOrdersForApprovalAndOverbook }
     * 
     */
    public SubmitOrdersForApprovalAndOverbook createSubmitOrdersForApprovalAndOverbook() {
        return new SubmitOrdersForApprovalAndOverbook();
    }

    /**
     * Create an instance of {@link ReconciliationOrderReport }
     * 
     */
    public ReconciliationOrderReport createReconciliationOrderReport() {
        return new ReconciliationOrderReport();
    }

    /**
     * Create an instance of {@link ProductTemplateError }
     * 
     */
    public ProductTemplateError createProductTemplateError() {
        return new ProductTemplateError();
    }

    /**
     * Create an instance of {@link CreativeSetPage }
     * 
     */
    public CreativeSetPage createCreativeSetPage() {
        return new CreativeSetPage();
    }

    /**
     * Create an instance of {@link StringLengthError }
     * 
     */
    public StringLengthError createStringLengthError() {
        return new StringLengthError();
    }

    /**
     * Create an instance of {@link CollectionSizeError }
     * 
     */
    public CollectionSizeError createCollectionSizeError() {
        return new CollectionSizeError();
    }

    /**
     * Create an instance of {@link DateTimeValue }
     * 
     */
    public DateTimeValue createDateTimeValue() {
        return new DateTimeValue();
    }

    /**
     * Create an instance of {@link ImageRedirectOverlayCreative }
     * 
     */
    public ImageRedirectOverlayCreative createImageRedirectOverlayCreative() {
        return new ImageRedirectOverlayCreative();
    }

    /**
     * Create an instance of {@link ActivityGroupPage }
     * 
     */
    public ActivityGroupPage createActivityGroupPage() {
        return new ActivityGroupPage();
    }

    /**
     * Create an instance of {@link DeleteUserTeamAssociations }
     * 
     */
    public DeleteUserTeamAssociations createDeleteUserTeamAssociations() {
        return new DeleteUserTeamAssociations();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link InvalidEmailError }
     * 
     */
    public InvalidEmailError createInvalidEmailError() {
        return new InvalidEmailError();
    }

    /**
     * Create an instance of {@link MediaLocationSettings }
     * 
     */
    public MediaLocationSettings createMediaLocationSettings() {
        return new MediaLocationSettings();
    }

    /**
     * Create an instance of {@link FeatureError }
     * 
     */
    public FeatureError createFeatureError() {
        return new FeatureError();
    }

    /**
     * Create an instance of {@link GrpSettingsError }
     * 
     */
    public GrpSettingsError createGrpSettingsError() {
        return new GrpSettingsError();
    }

    /**
     * Create an instance of {@link TokenError }
     * 
     */
    public TokenError createTokenError() {
        return new TokenError();
    }

    /**
     * Create an instance of {@link ReleaseLineItems }
     * 
     */
    public ReleaseLineItems createReleaseLineItems() {
        return new ReleaseLineItems();
    }

    /**
     * Create an instance of {@link RateCard }
     * 
     */
    public RateCard createRateCard() {
        return new RateCard();
    }

    /**
     * Create an instance of {@link Money }
     * 
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link CustomTargetingValue }
     * 
     */
    public CustomTargetingValue createCustomTargetingValue() {
        return new CustomTargetingValue();
    }

    /**
     * Create an instance of {@link ChangeHistoryValue }
     * 
     */
    public ChangeHistoryValue createChangeHistoryValue() {
        return new ChangeHistoryValue();
    }

    /**
     * Create an instance of {@link ApproveOrdersWithoutReservationChanges }
     * 
     */
    public ApproveOrdersWithoutReservationChanges createApproveOrdersWithoutReservationChanges() {
        return new ApproveOrdersWithoutReservationChanges();
    }

    /**
     * Create an instance of {@link DisapproveOrders }
     * 
     */
    public DisapproveOrders createDisapproveOrders() {
        return new DisapproveOrders();
    }

    /**
     * Create an instance of {@link RequiredError }
     * 
     */
    public RequiredError createRequiredError() {
        return new RequiredError();
    }

    /**
     * Create an instance of {@link OrderActionError }
     * 
     */
    public OrderActionError createOrderActionError() {
        return new OrderActionError();
    }

    /**
     * Create an instance of {@link PlacementPremiumFeature }
     * 
     */
    public PlacementPremiumFeature createPlacementPremiumFeature() {
        return new PlacementPremiumFeature();
    }

    /**
     * Create an instance of {@link DayPart }
     * 
     */
    public DayPart createDayPart() {
        return new DayPart();
    }

    /**
     * Create an instance of {@link VideoPositionPremiumFeature }
     * 
     */
    public VideoPositionPremiumFeature createVideoPositionPremiumFeature() {
        return new VideoPositionPremiumFeature();
    }

    /**
     * Create an instance of {@link SwiffyFallbackAsset }
     * 
     */
    public SwiffyFallbackAsset createSwiffyFallbackAsset() {
        return new SwiffyFallbackAsset();
    }

    /**
     * Create an instance of {@link ProductTemplateBaseRate }
     * 
     */
    public ProductTemplateBaseRate createProductTemplateBaseRate() {
        return new ProductTemplateBaseRate();
    }

    /**
     * Create an instance of {@link OrderError }
     * 
     */
    public OrderError createOrderError() {
        return new OrderError();
    }

    /**
     * Create an instance of {@link ResumeLineItems }
     * 
     */
    public ResumeLineItems createResumeLineItems() {
        return new ResumeLineItems();
    }

    /**
     * Create an instance of {@link DeleteExchangeRates }
     * 
     */
    public DeleteExchangeRates createDeleteExchangeRates() {
        return new DeleteExchangeRates();
    }

    /**
     * Create an instance of {@link CrossSellError }
     * 
     */
    public CrossSellError createCrossSellError() {
        return new CrossSellError();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link ContentBundle }
     * 
     */
    public ContentBundle createContentBundle() {
        return new ContentBundle();
    }

    /**
     * Create an instance of {@link ActivateProductPackages }
     * 
     */
    public ActivateProductPackages createActivateProductPackages() {
        return new ActivateProductPackages();
    }

    /**
     * Create an instance of {@link ReconciliationReport }
     * 
     */
    public ReconciliationReport createReconciliationReport() {
        return new ReconciliationReport();
    }

    /**
     * Create an instance of {@link ReconciliationLineItemReport }
     * 
     */
    public ReconciliationLineItemReport createReconciliationLineItemReport() {
        return new ReconciliationLineItemReport();
    }

    /**
     * Create an instance of {@link AdUnitTargeting }
     * 
     */
    public AdUnitTargeting createAdUnitTargeting() {
        return new AdUnitTargeting();
    }

    /**
     * Create an instance of {@link ActivateLineItemCreativeAssociations }
     * 
     */
    public ActivateLineItemCreativeAssociations createActivateLineItemCreativeAssociations() {
        return new ActivateLineItemCreativeAssociations();
    }

    /**
     * Create an instance of {@link BillableRevenueOverrides }
     * 
     */
    public BillableRevenueOverrides createBillableRevenueOverrides() {
        return new BillableRevenueOverrides();
    }

    /**
     * Create an instance of {@link InventoryTargetingError }
     * 
     */
    public InventoryTargetingError createInventoryTargetingError() {
        return new InventoryTargetingError();
    }

    /**
     * Create an instance of {@link ApproveOrders }
     * 
     */
    public ApproveOrders createApproveOrders() {
        return new ApproveOrders();
    }

    /**
     * Create an instance of {@link DayPartTargetingError }
     * 
     */
    public DayPartTargetingError createDayPartTargetingError() {
        return new DayPartTargetingError();
    }

    /**
     * Create an instance of {@link LineItemOperationError }
     * 
     */
    public LineItemOperationError createLineItemOperationError() {
        return new LineItemOperationError();
    }

    /**
     * Create an instance of {@link CustomTargetingError }
     * 
     */
    public CustomTargetingError createCustomTargetingError() {
        return new CustomTargetingError();
    }

    /**
     * Create an instance of {@link FirstPartyAudienceSegmentRule }
     * 
     */
    public FirstPartyAudienceSegmentRule createFirstPartyAudienceSegmentRule() {
        return new FirstPartyAudienceSegmentRule();
    }

    /**
     * Create an instance of {@link WorkflowValidationError }
     * 
     */
    public WorkflowValidationError createWorkflowValidationError() {
        return new WorkflowValidationError();
    }

    /**
     * Create an instance of {@link WorkflowRequestPage }
     * 
     */
    public WorkflowRequestPage createWorkflowRequestPage() {
        return new WorkflowRequestPage();
    }

    /**
     * Create an instance of {@link AssetError }
     * 
     */
    public AssetError createAssetError() {
        return new AssetError();
    }

    /**
     * Create an instance of {@link CreativeSetError }
     * 
     */
    public CreativeSetError createCreativeSetError() {
        return new CreativeSetError();
    }

    /**
     * Create an instance of {@link AdRule }
     * 
     */
    public AdRule createAdRule() {
        return new AdRule();
    }

    /**
     * Create an instance of {@link ApproveWorkflowApprovalRequests }
     * 
     */
    public ApproveWorkflowApprovalRequests createApproveWorkflowApprovalRequests() {
        return new ApproveWorkflowApprovalRequests();
    }

    /**
     * Create an instance of {@link FrequencyCap }
     * 
     */
    public FrequencyCap createFrequencyCap() {
        return new FrequencyCap();
    }

    /**
     * Create an instance of {@link InvalidUrlError }
     * 
     */
    public InvalidUrlError createInvalidUrlError() {
        return new InvalidUrlError();
    }

    /**
     * Create an instance of {@link DealError }
     * 
     */
    public DealError createDealError() {
        return new DealError();
    }

    /**
     * Create an instance of {@link UserDomainPremiumFeature }
     * 
     */
    public UserDomainPremiumFeature createUserDomainPremiumFeature() {
        return new UserDomainPremiumFeature();
    }

    /**
     * Create an instance of {@link LongCreativeTemplateVariableValue }
     * 
     */
    public LongCreativeTemplateVariableValue createLongCreativeTemplateVariableValue() {
        return new LongCreativeTemplateVariableValue();
    }

    /**
     * Create an instance of {@link EntityChildrenLimitReachedError }
     * 
     */
    public EntityChildrenLimitReachedError createEntityChildrenLimitReachedError() {
        return new EntityChildrenLimitReachedError();
    }

    /**
     * Create an instance of {@link NumberValue }
     * 
     */
    public NumberValue createNumberValue() {
        return new NumberValue();
    }

    /**
     * Create an instance of {@link AlternativeUnitTypeForecast }
     * 
     */
    public AlternativeUnitTypeForecast createAlternativeUnitTypeForecast() {
        return new AlternativeUnitTypeForecast();
    }

    /**
     * Create an instance of {@link ReconciliationImportError }
     * 
     */
    public ReconciliationImportError createReconciliationImportError() {
        return new ReconciliationImportError();
    }

    /**
     * Create an instance of {@link CmsContent }
     * 
     */
    public CmsContent createCmsContent() {
        return new CmsContent();
    }

    /**
     * Create an instance of {@link CreativeWrapper }
     * 
     */
    public CreativeWrapper createCreativeWrapper() {
        return new CreativeWrapper();
    }

    /**
     * Create an instance of {@link CustomFieldValueError }
     * 
     */
    public CustomFieldValueError createCustomFieldValueError() {
        return new CustomFieldValueError();
    }

    /**
     * Create an instance of {@link RichMediaStudioCreativeError }
     * 
     */
    public RichMediaStudioCreativeError createRichMediaStudioCreativeError() {
        return new RichMediaStudioCreativeError();
    }

    /**
     * Create an instance of {@link LineItemError }
     * 
     */
    public LineItemError createLineItemError() {
        return new LineItemError();
    }

    /**
     * Create an instance of {@link UrlCreativeTemplateVariableValue }
     * 
     */
    public UrlCreativeTemplateVariableValue createUrlCreativeTemplateVariableValue() {
        return new UrlCreativeTemplateVariableValue();
    }

    /**
     * Create an instance of {@link ActivateProductTemplates }
     * 
     */
    public ActivateProductTemplates createActivateProductTemplates() {
        return new ActivateProductTemplates();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link DeleteCustomTargetingValues }
     * 
     */
    public DeleteCustomTargetingValues createDeleteCustomTargetingValues() {
        return new DeleteCustomTargetingValues();
    }

    /**
     * Create an instance of {@link ActivateContentBundles }
     * 
     */
    public ActivateContentBundles createActivateContentBundles() {
        return new ActivateContentBundles();
    }

    /**
     * Create an instance of {@link BrowserTargeting }
     * 
     */
    public BrowserTargeting createBrowserTargeting() {
        return new BrowserTargeting();
    }

    /**
     * Create an instance of {@link CdnConfigurationPage }
     * 
     */
    public CdnConfigurationPage createCdnConfigurationPage() {
        return new CdnConfigurationPage();
    }

    /**
     * Create an instance of {@link ConversionEventTrackingUrlsMapEntry }
     * 
     */
    public ConversionEventTrackingUrlsMapEntry createConversionEventTrackingUrlsMapEntry() {
        return new ConversionEventTrackingUrlsMapEntry();
    }

    /**
     * Create an instance of {@link BandwidthGroupTargeting }
     * 
     */
    public BandwidthGroupTargeting createBandwidthGroupTargeting() {
        return new BandwidthGroupTargeting();
    }

    /**
     * Create an instance of {@link ProposalTermsAndConditions }
     * 
     */
    public ProposalTermsAndConditions createProposalTermsAndConditions() {
        return new ProposalTermsAndConditions();
    }

    /**
     * Create an instance of {@link InventoryUnitError }
     * 
     */
    public InventoryUnitError createInventoryUnitError() {
        return new InventoryUnitError();
    }

    /**
     * Create an instance of {@link AssetCreativeTemplateVariable }
     * 
     */
    public AssetCreativeTemplateVariable createAssetCreativeTemplateVariable() {
        return new AssetCreativeTemplateVariable();
    }

    /**
     * Create an instance of {@link ReconciliationError }
     * 
     */
    public ReconciliationError createReconciliationError() {
        return new ReconciliationError();
    }

    /**
     * Create an instance of {@link InvalidColorError }
     * 
     */
    public InvalidColorError createInvalidColorError() {
        return new InvalidColorError();
    }

    /**
     * Create an instance of {@link ArchiveLiveStreamEvents }
     * 
     */
    public ArchiveLiveStreamEvents createArchiveLiveStreamEvents() {
        return new ArchiveLiveStreamEvents();
    }

    /**
     * Create an instance of {@link LineItemTemplatePage }
     * 
     */
    public LineItemTemplatePage createLineItemTemplatePage() {
        return new LineItemTemplatePage();
    }

    /**
     * Create an instance of {@link ContentMetadataKeyHierarchyLevel }
     * 
     */
    public ContentMetadataKeyHierarchyLevel createContentMetadataKeyHierarchyLevel() {
        return new ContentMetadataKeyHierarchyLevel();
    }

    /**
     * Create an instance of {@link ReconciliationReportRowPage }
     * 
     */
    public ReconciliationReportRowPage createReconciliationReportRowPage() {
        return new ReconciliationReportRowPage();
    }

    /**
     * Create an instance of {@link SiteTargetingInfo }
     * 
     */
    public SiteTargetingInfo createSiteTargetingInfo() {
        return new SiteTargetingInfo();
    }

    /**
     * Create an instance of {@link ArchiveProposalLineItems }
     * 
     */
    public ArchiveProposalLineItems createArchiveProposalLineItems() {
        return new ArchiveProposalLineItems();
    }

    /**
     * Create an instance of {@link CustomCriteriaSet }
     * 
     */
    public CustomCriteriaSet createCustomCriteriaSet() {
        return new CustomCriteriaSet();
    }

    /**
     * Create an instance of {@link OfflineError }
     * 
     */
    public OfflineError createOfflineError() {
        return new OfflineError();
    }

    /**
     * Create an instance of {@link BrowserLanguagePremiumFeature }
     * 
     */
    public BrowserLanguagePremiumFeature createBrowserLanguagePremiumFeature() {
        return new BrowserLanguagePremiumFeature();
    }

    /**
     * Create an instance of {@link DeviceManufacturer }
     * 
     */
    public DeviceManufacturer createDeviceManufacturer() {
        return new DeviceManufacturer();
    }

    /**
     * Create an instance of {@link ActivateCustomTargetingValues }
     * 
     */
    public ActivateCustomTargetingValues createActivateCustomTargetingValues() {
        return new ActivateCustomTargetingValues();
    }

    /**
     * Create an instance of {@link ReserveLineItems }
     * 
     */
    public ReserveLineItems createReserveLineItems() {
        return new ReserveLineItems();
    }

    /**
     * Create an instance of {@link RejectWorkflowApprovalRequests }
     * 
     */
    public RejectWorkflowApprovalRequests createRejectWorkflowApprovalRequests() {
        return new RejectWorkflowApprovalRequests();
    }

    /**
     * Create an instance of {@link ExchangeRatePage }
     * 
     */
    public ExchangeRatePage createExchangeRatePage() {
        return new ExchangeRatePage();
    }

    /**
     * Create an instance of {@link CreativePreviewError }
     * 
     */
    public CreativePreviewError createCreativePreviewError() {
        return new CreativePreviewError();
    }

    /**
     * Create an instance of {@link SavedQueryPage }
     * 
     */
    public SavedQueryPage createSavedQueryPage() {
        return new SavedQueryPage();
    }

    /**
     * Create an instance of {@link PauseLiveStreamEvents }
     * 
     */
    public PauseLiveStreamEvents createPauseLiveStreamEvents() {
        return new PauseLiveStreamEvents();
    }

    /**
     * Create an instance of {@link PublishProducts }
     * 
     */
    public PublishProducts createPublishProducts() {
        return new PublishProducts();
    }

    /**
     * Create an instance of {@link TrackingUrls }
     * 
     */
    public TrackingUrls createTrackingUrls() {
        return new TrackingUrls();
    }

    /**
     * Create an instance of {@link InventoryUnitSizesError }
     * 
     */
    public InventoryUnitSizesError createInventoryUnitSizesError() {
        return new InventoryUnitSizesError();
    }

    /**
     * Create an instance of {@link MobileCarrierPremiumFeature }
     * 
     */
    public MobileCarrierPremiumFeature createMobileCarrierPremiumFeature() {
        return new MobileCarrierPremiumFeature();
    }

    /**
     * Create an instance of {@link SubmitOrdersForApprovalWithoutReservationChanges }
     * 
     */
    public SubmitOrdersForApprovalWithoutReservationChanges createSubmitOrdersForApprovalWithoutReservationChanges() {
        return new SubmitOrdersForApprovalWithoutReservationChanges();
    }

    /**
     * Create an instance of {@link DiscardLocalVersionEdits }
     * 
     */
    public DiscardLocalVersionEdits createDiscardLocalVersionEdits() {
        return new DiscardLocalVersionEdits();
    }

    /**
     * Create an instance of {@link DeactivateContentBundles }
     * 
     */
    public DeactivateContentBundles createDeactivateContentBundles() {
        return new DeactivateContentBundles();
    }

    /**
     * Create an instance of {@link StringFormatError }
     * 
     */
    public StringFormatError createStringFormatError() {
        return new StringFormatError();
    }

    /**
     * Create an instance of {@link ProductPackagePage }
     * 
     */
    public ProductPackagePage createProductPackagePage() {
        return new ProductPackagePage();
    }

    /**
     * Create an instance of {@link ProposalLineItemError }
     * 
     */
    public ProposalLineItemError createProposalLineItemError() {
        return new ProposalLineItemError();
    }

    /**
     * Create an instance of {@link RetractProposals }
     * 
     */
    public RetractProposals createRetractProposals() {
        return new RetractProposals();
    }

    /**
     * Create an instance of {@link PackageError }
     * 
     */
    public PackageError createPackageError() {
        return new PackageError();
    }

    /**
     * Create an instance of {@link CommonError }
     * 
     */
    public CommonError createCommonError() {
        return new CommonError();
    }

    /**
     * Create an instance of {@link AudienceSegmentError }
     * 
     */
    public AudienceSegmentError createAudienceSegmentError() {
        return new AudienceSegmentError();
    }

    /**
     * Create an instance of {@link RetractionDetails }
     * 
     */
    public RetractionDetails createRetractionDetails() {
        return new RetractionDetails();
    }

    /**
     * Create an instance of {@link GeoTargetingError }
     * 
     */
    public GeoTargetingError createGeoTargetingError() {
        return new GeoTargetingError();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link OperatingSystemVersion }
     * 
     */
    public OperatingSystemVersion createOperatingSystemVersion() {
        return new OperatingSystemVersion();
    }

    /**
     * Create an instance of {@link ActivateCreativeWrappers }
     * 
     */
    public ActivateCreativeWrappers createActivateCreativeWrappers() {
        return new ActivateCreativeWrappers();
    }

    /**
     * Create an instance of {@link UnarchiveMobileApplications }
     * 
     */
    public UnarchiveMobileApplications createUnarchiveMobileApplications() {
        return new UnarchiveMobileApplications();
    }

    /**
     * Create an instance of {@link AudienceSegmentCriteria }
     * 
     */
    public AudienceSegmentCriteria createAudienceSegmentCriteria() {
        return new AudienceSegmentCriteria();
    }

    /**
     * Create an instance of {@link UserTeamAssociationPage }
     * 
     */
    public UserTeamAssociationPage createUserTeamAssociationPage() {
        return new UserTeamAssociationPage();
    }

    /**
     * Create an instance of {@link ProductPackageRateCardAssociationError }
     * 
     */
    public ProductPackageRateCardAssociationError createProductPackageRateCardAssociationError() {
        return new ProductPackageRateCardAssociationError();
    }

    /**
     * Create an instance of {@link CustomTargetingKeyPage }
     * 
     */
    public CustomTargetingKeyPage createCustomTargetingKeyPage() {
        return new CustomTargetingKeyPage();
    }

    /**
     * Create an instance of {@link DeactivateAudienceSegments }
     * 
     */
    public DeactivateAudienceSegments createDeactivateAudienceSegments() {
        return new DeactivateAudienceSegments();
    }

    /**
     * Create an instance of {@link ActualizeProposalLineItems }
     * 
     */
    public ActualizeProposalLineItems createActualizeProposalLineItems() {
        return new ActualizeProposalLineItems();
    }

    /**
     * Create an instance of {@link CustomCreativeAsset }
     * 
     */
    public CustomCreativeAsset createCustomCreativeAsset() {
        return new CustomCreativeAsset();
    }

    /**
     * Create an instance of {@link ProposalLineItemPremium }
     * 
     */
    public ProposalLineItemPremium createProposalLineItemPremium() {
        return new ProposalLineItemPremium();
    }

    /**
     * Create an instance of {@link ProgressStep }
     * 
     */
    public ProgressStep createProgressStep() {
        return new ProgressStep();
    }

    /**
     * Create an instance of {@link FieldPathElement }
     * 
     */
    public FieldPathElement createFieldPathElement() {
        return new FieldPathElement();
    }

    /**
     * Create an instance of {@link UserDomainTargeting }
     * 
     */
    public UserDomainTargeting createUserDomainTargeting() {
        return new UserDomainTargeting();
    }

    /**
     * Create an instance of {@link LineItemCreativeAssociationStats }
     * 
     */
    public LineItemCreativeAssociationStats createLineItemCreativeAssociationStats() {
        return new LineItemCreativeAssociationStats();
    }

    /**
     * Create an instance of {@link LineItemDeliveryForecast }
     * 
     */
    public LineItemDeliveryForecast createLineItemDeliveryForecast() {
        return new LineItemDeliveryForecast();
    }

    /**
     * Create an instance of {@link ArchiveProductPackageItems }
     * 
     */
    public ArchiveProductPackageItems createArchiveProductPackageItems() {
        return new ArchiveProductPackageItems();
    }

    /**
     * Create an instance of {@link PackagePage }
     * 
     */
    public PackagePage createPackagePage() {
        return new PackagePage();
    }

    /**
     * Create an instance of {@link FileError }
     * 
     */
    public FileError createFileError() {
        return new FileError();
    }

    /**
     * Create an instance of {@link Targeting }
     * 
     */
    public Targeting createTargeting() {
        return new Targeting();
    }

    /**
     * Create an instance of {@link StringCreativeTemplateVariableValue }
     * 
     */
    public StringCreativeTemplateVariableValue createStringCreativeTemplateVariableValue() {
        return new StringCreativeTemplateVariableValue();
    }

    /**
     * Create an instance of {@link TerminateNegotiations }
     * 
     */
    public TerminateNegotiations createTerminateNegotiations() {
        return new TerminateNegotiations();
    }

    /**
     * Create an instance of {@link StringValueMapEntry }
     * 
     */
    public StringValueMapEntry createStringValueMapEntry() {
        return new StringValueMapEntry();
    }

    /**
     * Create an instance of {@link DateValue }
     * 
     */
    public DateValue createDateValue() {
        return new DateValue();
    }

    /**
     * Create an instance of {@link ProductTemplateActionError }
     * 
     */
    public ProductTemplateActionError createProductTemplateActionError() {
        return new ProductTemplateActionError();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link ArchiveProductPackages }
     * 
     */
    public ArchiveProductPackages createArchiveProductPackages() {
        return new ArchiveProductPackages();
    }

    /**
     * Create an instance of {@link ReportError }
     * 
     */
    public ReportError createReportError() {
        return new ReportError();
    }

    /**
     * Create an instance of {@link LiveStreamEventDateTimeError }
     * 
     */
    public LiveStreamEventDateTimeError createLiveStreamEventDateTimeError() {
        return new LiveStreamEventDateTimeError();
    }

    /**
     * Create an instance of {@link CreativeTemplatePage }
     * 
     */
    public CreativeTemplatePage createCreativeTemplatePage() {
        return new CreativeTemplatePage();
    }

    /**
     * Create an instance of {@link BypassProposalWorkflowRules }
     * 
     */
    public BypassProposalWorkflowRules createBypassProposalWorkflowRules() {
        return new BypassProposalWorkflowRules();
    }

    /**
     * Create an instance of {@link SkipWorkflowExternalConditionRequests }
     * 
     */
    public SkipWorkflowExternalConditionRequests createSkipWorkflowExternalConditionRequests() {
        return new SkipWorkflowExternalConditionRequests();
    }

    /**
     * Create an instance of {@link SecurityPolicySettings }
     * 
     */
    public SecurityPolicySettings createSecurityPolicySettings() {
        return new SecurityPolicySettings();
    }

    /**
     * Create an instance of {@link VideoPositionTargeting }
     * 
     */
    public VideoPositionTargeting createVideoPositionTargeting() {
        return new VideoPositionTargeting();
    }

    /**
     * Create an instance of {@link ProposalLineItemProgrammaticError }
     * 
     */
    public ProposalLineItemProgrammaticError createProposalLineItemProgrammaticError() {
        return new ProposalLineItemProgrammaticError();
    }

    /**
     * Create an instance of {@link AdUnitCodeError }
     * 
     */
    public AdUnitCodeError createAdUnitCodeError() {
        return new AdUnitCodeError();
    }

    /**
     * Create an instance of {@link DeviceCategoryTargeting }
     * 
     */
    public DeviceCategoryTargeting createDeviceCategoryTargeting() {
        return new DeviceCategoryTargeting();
    }

    /**
     * Create an instance of {@link MobileApplicationPage }
     * 
     */
    public MobileApplicationPage createMobileApplicationPage() {
        return new MobileApplicationPage();
    }

    /**
     * Create an instance of {@link SetTopBoxLineItemError }
     * 
     */
    public SetTopBoxLineItemError createSetTopBoxLineItemError() {
        return new SetTopBoxLineItemError();
    }

    /**
     * Create an instance of {@link CancelRetractionForProposals }
     * 
     */
    public CancelRetractionForProposals createCancelRetractionForProposals() {
        return new CancelRetractionForProposals();
    }

    /**
     * Create an instance of {@link DeactivatePlacements }
     * 
     */
    public DeactivatePlacements createDeactivatePlacements() {
        return new DeactivatePlacements();
    }

    /**
     * Create an instance of {@link ProgressRule }
     * 
     */
    public ProgressRule createProgressRule() {
        return new ProgressRule();
    }

    /**
     * Create an instance of {@link EntityLimitReachedError }
     * 
     */
    public EntityLimitReachedError createEntityLimitReachedError() {
        return new EntityLimitReachedError();
    }

    /**
     * Create an instance of {@link HlsSettings }
     * 
     */
    public HlsSettings createHlsSettings() {
        return new HlsSettings();
    }

    /**
     * Create an instance of {@link WorkflowProgress }
     * 
     */
    public WorkflowProgress createWorkflowProgress() {
        return new WorkflowProgress();
    }

    /**
     * Create an instance of {@link DeviceCapability }
     * 
     */
    public DeviceCapability createDeviceCapability() {
        return new DeviceCapability();
    }

    /**
     * Create an instance of {@link AdExclusionRulePage }
     * 
     */
    public AdExclusionRulePage createAdExclusionRulePage() {
        return new AdExclusionRulePage();
    }

    /**
     * Create an instance of {@link ColumnType }
     * 
     */
    public ColumnType createColumnType() {
        return new ColumnType();
    }

    /**
     * Create an instance of {@link DeliveryForecastOptions }
     * 
     */
    public DeliveryForecastOptions createDeliveryForecastOptions() {
        return new DeliveryForecastOptions();
    }

    /**
     * Create an instance of {@link IncludeContentInContentBundle }
     * 
     */
    public IncludeContentInContentBundle createIncludeContentInContentBundle() {
        return new IncludeContentInContentBundle();
    }

    /**
     * Create an instance of {@link RequiredNumberError }
     * 
     */
    public RequiredNumberError createRequiredNumberError() {
        return new RequiredNumberError();
    }

    /**
     * Create an instance of {@link UnarchiveLineItems }
     * 
     */
    public UnarchiveLineItems createUnarchiveLineItems() {
        return new UnarchiveLineItems();
    }

    /**
     * Create an instance of {@link DeactivateUsers }
     * 
     */
    public DeactivateUsers createDeactivateUsers() {
        return new DeactivateUsers();
    }

    /**
     * Create an instance of {@link WithdrawProducts }
     * 
     */
    public WithdrawProducts createWithdrawProducts() {
        return new WithdrawProducts();
    }

    /**
     * Create an instance of {@link ProposalError }
     * 
     */
    public ProposalError createProposalError() {
        return new ProposalError();
    }

    /**
     * Create an instance of {@link LineItemActivityAssociationError }
     * 
     */
    public LineItemActivityAssociationError createLineItemActivityAssociationError() {
        return new LineItemActivityAssociationError();
    }

    /**
     * Create an instance of {@link RejectAudienceSegments }
     * 
     */
    public RejectAudienceSegments createRejectAudienceSegments() {
        return new RejectAudienceSegments();
    }

    /**
     * Create an instance of {@link TriggerWorkflowExternalConditionRequests }
     * 
     */
    public TriggerWorkflowExternalConditionRequests createTriggerWorkflowExternalConditionRequests() {
        return new TriggerWorkflowExternalConditionRequests();
    }

    /**
     * Create an instance of {@link DeactivateAdExclusionRules }
     * 
     */
    public DeactivateAdExclusionRules createDeactivateAdExclusionRules() {
        return new DeactivateAdExclusionRules();
    }

    /**
     * Create an instance of {@link GeographyPremiumFeature }
     * 
     */
    public GeographyPremiumFeature createGeographyPremiumFeature() {
        return new GeographyPremiumFeature();
    }

    /**
     * Create an instance of {@link PremiumRateError }
     * 
     */
    public PremiumRateError createPremiumRateError() {
        return new PremiumRateError();
    }

    /**
     * Create an instance of {@link DeviceCapabilityTargeting }
     * 
     */
    public DeviceCapabilityTargeting createDeviceCapabilityTargeting() {
        return new DeviceCapabilityTargeting();
    }

    /**
     * Create an instance of {@link ProductMarketplaceInfo }
     * 
     */
    public ProductMarketplaceInfo createProductMarketplaceInfo() {
        return new ProductMarketplaceInfo();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     * 
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link OrderPage }
     * 
     */
    public OrderPage createOrderPage() {
        return new OrderPage();
    }

    /**
     * Create an instance of {@link TeamPage }
     * 
     */
    public TeamPage createTeamPage() {
        return new TeamPage();
    }

    /**
     * Create an instance of {@link AppliedLabel }
     * 
     */
    public AppliedLabel createAppliedLabel() {
        return new AppliedLabel();
    }

    /**
     * Create an instance of {@link WorkflowApprovalRequest }
     * 
     */
    public WorkflowApprovalRequest createWorkflowApprovalRequest() {
        return new WorkflowApprovalRequest();
    }

    /**
     * Create an instance of {@link UnlinkProposalLineItems }
     * 
     */
    public UnlinkProposalLineItems createUnlinkProposalLineItems() {
        return new UnlinkProposalLineItems();
    }

    /**
     * Create an instance of {@link ActivateLabels }
     * 
     */
    public ActivateLabels createActivateLabels() {
        return new ActivateLabels();
    }

    /**
     * Create an instance of {@link BaseRatePage }
     * 
     */
    public BaseRatePage createBaseRatePage() {
        return new BaseRatePage();
    }

    /**
     * Create an instance of {@link ContendingLineItem }
     * 
     */
    public ContendingLineItem createContendingLineItem() {
        return new ContendingLineItem();
    }

    /**
     * Create an instance of {@link RegExError }
     * 
     */
    public RegExError createRegExError() {
        return new RegExError();
    }

    /**
     * Create an instance of {@link ImageOverlayCreative }
     * 
     */
    public ImageOverlayCreative createImageOverlayCreative() {
        return new ImageOverlayCreative();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link AdUnitParent }
     * 
     */
    public AdUnitParent createAdUnitParent() {
        return new AdUnitParent();
    }

    /**
     * Create an instance of {@link ResumeAndOverbookLineItems }
     * 
     */
    public ResumeAndOverbookLineItems createResumeAndOverbookLineItems() {
        return new ResumeAndOverbookLineItems();
    }

    /**
     * Create an instance of {@link TargetingValue }
     * 
     */
    public TargetingValue createTargetingValue() {
        return new TargetingValue();
    }

    /**
     * Create an instance of {@link UniqueError }
     * 
     */
    public UniqueError createUniqueError() {
        return new UniqueError();
    }

    /**
     * Create an instance of {@link SuggestedAdUnitUpdateResult }
     * 
     */
    public SuggestedAdUnitUpdateResult createSuggestedAdUnitUpdateResult() {
        return new SuggestedAdUnitUpdateResult();
    }

    /**
     * Create an instance of {@link PermissionError }
     * 
     */
    public PermissionError createPermissionError() {
        return new PermissionError();
    }

    /**
     * Create an instance of {@link UnarchiveProductTemplates }
     * 
     */
    public UnarchiveProductTemplates createUnarchiveProductTemplates() {
        return new UnarchiveProductTemplates();
    }

    /**
     * Create an instance of {@link UserRecord }
     * 
     */
    public UserRecord createUserRecord() {
        return new UserRecord();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

    /**
     * Create an instance of {@link DeviceCategoryPremiumFeature }
     * 
     */
    public DeviceCategoryPremiumFeature createDeviceCategoryPremiumFeature() {
        return new DeviceCategoryPremiumFeature();
    }

    /**
     * Create an instance of {@link Browser }
     * 
     */
    public Browser createBrowser() {
        return new Browser();
    }

    /**
     * Create an instance of {@link LongStatsMapEntry }
     * 
     */
    public LongStatsMapEntry createLongStatsMapEntry() {
        return new LongStatsMapEntry();
    }

    /**
     * Create an instance of {@link MobileDeviceSubmodel }
     * 
     */
    public MobileDeviceSubmodel createMobileDeviceSubmodel() {
        return new MobileDeviceSubmodel();
    }

    /**
     * Create an instance of {@link AspectRatioImageCreative }
     * 
     */
    public AspectRatioImageCreative createAspectRatioImageCreative() {
        return new AspectRatioImageCreative();
    }

    /**
     * Create an instance of {@link AdExclusionRuleError }
     * 
     */
    public AdExclusionRuleError createAdExclusionRuleError() {
        return new AdExclusionRuleError();
    }

    /**
     * Create an instance of {@link NonRuleBasedFirstPartyAudienceSegment }
     * 
     */
    public NonRuleBasedFirstPartyAudienceSegment createNonRuleBasedFirstPartyAudienceSegment() {
        return new NonRuleBasedFirstPartyAudienceSegment();
    }

    /**
     * Create an instance of {@link LineItemPage }
     * 
     */
    public LineItemPage createLineItemPage() {
        return new LineItemPage();
    }

    /**
     * Create an instance of {@link PauseProposalLineItems }
     * 
     */
    public PauseProposalLineItems createPauseProposalLineItems() {
        return new PauseProposalLineItems();
    }

    /**
     * Create an instance of {@link AdExchangeCreative }
     * 
     */
    public AdExchangeCreative createAdExchangeCreative() {
        return new AdExchangeCreative();
    }

    /**
     * Create an instance of {@link RuleBasedFirstPartyAudienceSegmentSummary }
     * 
     */
    public RuleBasedFirstPartyAudienceSegmentSummary createRuleBasedFirstPartyAudienceSegmentSummary() {
        return new RuleBasedFirstPartyAudienceSegmentSummary();
    }

    /**
     * Create an instance of {@link DeliveryIndicator }
     * 
     */
    public DeliveryIndicator createDeliveryIndicator() {
        return new DeliveryIndicator();
    }

    /**
     * Create an instance of {@link UrlCreativeTemplateVariable }
     * 
     */
    public UrlCreativeTemplateVariable createUrlCreativeTemplateVariable() {
        return new UrlCreativeTemplateVariable();
    }

    /**
     * Create an instance of {@link GrpSettings }
     * 
     */
    public GrpSettings createGrpSettings() {
        return new GrpSettings();
    }

    /**
     * Create an instance of {@link ApproveAudienceSegments }
     * 
     */
    public ApproveAudienceSegments createApproveAudienceSegments() {
        return new ApproveAudienceSegments();
    }

    /**
     * Create an instance of {@link RichMediaStudioChildAssetProperty }
     * 
     */
    public RichMediaStudioChildAssetProperty createRichMediaStudioChildAssetProperty() {
        return new RichMediaStudioChildAssetProperty();
    }

    /**
     * Create an instance of {@link VideoPositionTargetingError }
     * 
     */
    public VideoPositionTargetingError createVideoPositionTargetingError() {
        return new VideoPositionTargetingError();
    }

    /**
     * Create an instance of {@link SendNotificationProgressAction }
     * 
     */
    public SendNotificationProgressAction createSendNotificationProgressAction() {
        return new SendNotificationProgressAction();
    }

    /**
     * Create an instance of {@link AdUnitPremiumFeature }
     * 
     */
    public AdUnitPremiumFeature createAdUnitPremiumFeature() {
        return new AdUnitPremiumFeature();
    }

    /**
     * Create an instance of {@link BaseRateActionError }
     * 
     */
    public BaseRateActionError createBaseRateActionError() {
        return new BaseRateActionError();
    }

    /**
     * Create an instance of {@link ContactPage }
     * 
     */
    public ContactPage createContactPage() {
        return new ContactPage();
    }

    /**
     * Create an instance of {@link AvailabilityForecast }
     * 
     */
    public AvailabilityForecast createAvailabilityForecast() {
        return new AvailabilityForecast();
    }

    /**
     * Create an instance of {@link MobileCarrierTargeting }
     * 
     */
    public MobileCarrierTargeting createMobileCarrierTargeting() {
        return new MobileCarrierTargeting();
    }

    /**
     * Create an instance of {@link AudienceSegment }
     * 
     */
    public AudienceSegment createAudienceSegment() {
        return new AudienceSegment();
    }

    /**
     * Create an instance of {@link CustomFieldValue }
     * 
     */
    public CustomFieldValue createCustomFieldValue() {
        return new CustomFieldValue();
    }

    /**
     * Create an instance of {@link CreateProposalLineItemsFromPackages }
     * 
     */
    public CreateProposalLineItemsFromPackages createCreateProposalLineItemsFromPackages() {
        return new CreateProposalLineItemsFromPackages();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link ReserveProposals }
     * 
     */
    public ReserveProposals createReserveProposals() {
        return new ReserveProposals();
    }

    /**
     * Create an instance of {@link ProspectiveLineItem }
     * 
     */
    public ProspectiveLineItem createProspectiveLineItem() {
        return new ProspectiveLineItem();
    }

    /**
     * Create an instance of {@link ProgrammaticEntitiesError }
     * 
     */
    public ProgrammaticEntitiesError createProgrammaticEntitiesError() {
        return new ProgrammaticEntitiesError();
    }

    /**
     * Create an instance of {@link CreativeTemplateOperationError }
     * 
     */
    public CreativeTemplateOperationError createCreativeTemplateOperationError() {
        return new CreativeTemplateOperationError();
    }

    /**
     * Create an instance of {@link ImageCreative }
     * 
     */
    public ImageCreative createImageCreative() {
        return new ImageCreative();
    }

    /**
     * Create an instance of {@link ActivateAudienceSegments }
     * 
     */
    public ActivateAudienceSegments createActivateAudienceSegments() {
        return new ActivateAudienceSegments();
    }

    /**
     * Create an instance of {@link OperatingSystemPremiumFeature }
     * 
     */
    public OperatingSystemPremiumFeature createOperatingSystemPremiumFeature() {
        return new OperatingSystemPremiumFeature();
    }

    /**
     * Create an instance of {@link CustomTargetingValuePage }
     * 
     */
    public CustomTargetingValuePage createCustomTargetingValuePage() {
        return new CustomTargetingValuePage();
    }

    /**
     * Create an instance of {@link DeactivateLabels }
     * 
     */
    public DeactivateLabels createDeactivateLabels() {
        return new DeactivateLabels();
    }

    /**
     * Create an instance of {@link Html5Creative }
     * 
     */
    public Html5Creative createHtml5Creative() {
        return new Html5Creative();
    }

    /**
     * Create an instance of {@link NetworkError }
     * 
     */
    public NetworkError createNetworkError() {
        return new NetworkError();
    }

    /**
     * Create an instance of {@link UnknownBaseRate }
     * 
     */
    public UnknownBaseRate createUnknownBaseRate() {
        return new UnknownBaseRate();
    }

    /**
     * Create an instance of {@link InventoryTargeting }
     * 
     */
    public InventoryTargeting createInventoryTargeting() {
        return new InventoryTargeting();
    }

    /**
     * Create an instance of {@link CustomFieldAction }
     * 
     */
    public CustomFieldAction createCustomFieldAction() {
        return new CustomFieldAction();
    }

    /**
     * Create an instance of {@link ProposalLineItem }
     * 
     */
    public ProposalLineItem createProposalLineItem() {
        return new ProposalLineItem();
    }

    /**
     * Create an instance of {@link InventoryUnitRefreshRateError }
     * 
     */
    public InventoryUnitRefreshRateError createInventoryUnitRefreshRateError() {
        return new InventoryUnitRefreshRateError();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link SubmitProposalsForApproval }
     * 
     */
    public SubmitProposalsForApproval createSubmitProposalsForApproval() {
        return new SubmitProposalsForApproval();
    }

    /**
     * Create an instance of {@link Proposal }
     * 
     */
    public Proposal createProposal() {
        return new Proposal();
    }

    /**
     * Create an instance of {@link NonProgrammaticProductError }
     * 
     */
    public NonProgrammaticProductError createNonProgrammaticProductError() {
        return new NonProgrammaticProductError();
    }

    /**
     * Create an instance of {@link DropDownCustomFieldValue }
     * 
     */
    public DropDownCustomFieldValue createDropDownCustomFieldValue() {
        return new DropDownCustomFieldValue();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DeactivateProductPackages }
     * 
     */
    public DeactivateProductPackages createDeactivateProductPackages() {
        return new DeactivateProductPackages();
    }

    /**
     * Create an instance of {@link ArchiveAdUnits }
     * 
     */
    public ArchiveAdUnits createArchiveAdUnits() {
        return new ArchiveAdUnits();
    }

    /**
     * Create an instance of {@link ReleaseProposalLineItems }
     * 
     */
    public ReleaseProposalLineItems createReleaseProposalLineItems() {
        return new ReleaseProposalLineItems();
    }

    /**
     * Create an instance of {@link RateCardActionError }
     * 
     */
    public RateCardActionError createRateCardActionError() {
        return new RateCardActionError();
    }

    /**
     * Create an instance of {@link ArchiveProposals }
     * 
     */
    public ArchiveProposals createArchiveProposals() {
        return new ArchiveProposals();
    }

    /**
     * Create an instance of {@link AssetCreativeTemplateVariableValue }
     * 
     */
    public AssetCreativeTemplateVariableValue createAssetCreativeTemplateVariableValue() {
        return new AssetCreativeTemplateVariableValue();
    }

    /**
     * Create an instance of {@link RetractOrdersWithoutReservationChanges }
     * 
     */
    public RetractOrdersWithoutReservationChanges createRetractOrdersWithoutReservationChanges() {
        return new RetractOrdersWithoutReservationChanges();
    }

    /**
     * Create an instance of {@link TimeOfDay }
     * 
     */
    public TimeOfDay createTimeOfDay() {
        return new TimeOfDay();
    }

    /**
     * Create an instance of {@link ActivateLiveStreamEvents }
     * 
     */
    public ActivateLiveStreamEvents createActivateLiveStreamEvents() {
        return new ActivateLiveStreamEvents();
    }

    /**
     * Create an instance of {@link LabelEntityAssociationError }
     * 
     */
    public LabelEntityAssociationError createLabelEntityAssociationError() {
        return new LabelEntityAssociationError();
    }

    /**
     * Create an instance of {@link ContentMetadataKeyHierarchyTargeting }
     * 
     */
    public ContentMetadataKeyHierarchyTargeting createContentMetadataKeyHierarchyTargeting() {
        return new ContentMetadataKeyHierarchyTargeting();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link RateCardError }
     * 
     */
    public RateCardError createRateCardError() {
        return new RateCardError();
    }

    /**
     * Create an instance of {@link ProductBaseRate }
     * 
     */
    public ProductBaseRate createProductBaseRate() {
        return new ProductBaseRate();
    }

    /**
     * Create an instance of {@link OptimizedPoddingAdRuleSlot }
     * 
     */
    public OptimizedPoddingAdRuleSlot createOptimizedPoddingAdRuleSlot() {
        return new OptimizedPoddingAdRuleSlot();
    }

    /**
     * Create an instance of {@link ExcludeContentFromContentBundle }
     * 
     */
    public ExcludeContentFromContentBundle createExcludeContentFromContentBundle() {
        return new ExcludeContentFromContentBundle();
    }

    /**
     * Create an instance of {@link DeactivateProductTemplates }
     * 
     */
    public DeactivateProductTemplates createDeactivateProductTemplates() {
        return new DeactivateProductTemplates();
    }

    /**
     * Create an instance of {@link ProductPackageActionError }
     * 
     */
    public ProductPackageActionError createProductPackageActionError() {
        return new ProductPackageActionError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapResponseHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.google.com/apis/ads/publisher/v201802", name = "ResponseHeader")
    public JAXBElement<SoapResponseHeader> createResponseHeader(SoapResponseHeader value) {
        return new JAXBElement<SoapResponseHeader>(_ResponseHeader_QNAME, SoapResponseHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapRequestHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.google.com/apis/ads/publisher/v201802", name = "RequestHeader")
    public JAXBElement<SoapRequestHeader> createRequestHeader(SoapRequestHeader value) {
        return new JAXBElement<SoapRequestHeader>(_RequestHeader_QNAME, SoapRequestHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.google.com/apis/ads/publisher/v201802", name = "ApiExceptionFault")
    public JAXBElement<ApiException> createApiExceptionFault(ApiException value) {
        return new JAXBElement<ApiException>(_ApiExceptionFault_QNAME, ApiException.class, null, value);
    }

}
