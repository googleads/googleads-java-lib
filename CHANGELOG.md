3.12.0 - 2/1/2018
-----------------
AdWords:
  - Added support and examples for v201802.
  - Added support for tracking URL template and custom parameters in the
    [Shopping product partition utility](https://github.com/googleads/googleads-java-lib/wiki/Shopping-product-partition-utility-for-AdWords).

DFP:
  - No changes.

Common:
  - No changes.


3.11.0 - 2/13/2018
-----------------
AdWords:
  - Modified all examples to demonstrate proper exception handling.
  - Removed support and examples for v201702. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - Added v201710 ReportQuery and ServiceQuery utilities for JAX-WS and Axis to
    simplify the process of creating AWQL queries.

DFP:
  - Added support for v201802.
  - Removed support for v201702.
  - Removed v201705 examples.

Common:
  - Added list of available extensions and applications to README.md.
    See https://github.com/googleads/googleads-java-lib/issues/127.
  - Upgraded all dependencies in group IDs 'com.google.api-client' and
    'com.google.http-client' to version 1.23.0. Fixes
    https://github.com/googleads/googleads-java-lib/issues/130.


3.10.0 - 11/15/2017
-----------------
AdWords:
 - No changes.

DFP:
  - Added support for v201711.
  - Removed examples for v201702.
  - Removed support for v201611.

Common:
  - Added support for specifying the `serviceAccountUser` when creating an
    `OfflineCredential` for the service account OAuth2 flow. Fixes
    [issue 122](https://github.com/googleads/googleads-java-lib/issues/122).

3.9.0 - 10/10/2017
-----------------
AdWords:
  - Added support and examples for v201710.

DFP:
  - No changes.

Common:
  - No changes.

3.8.0 - 9/22/2017
-----------------
AdWords:
  - Removed support and examples for v201609. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates

DFP:
  - No changes.

Common:
  - No changes.

3.7.0 - 8/15/2017
-----------------
AdWords:
  - No changes.

DFP:
  - Added support for v201708.
  - Removed v201611 examples.
  - Removed support for v201608.

Common:
  - No changes.

3.6.0 - 8/9/2017
-----------------
AdWords:
  - Added support and examples for v201708.
  - Modified the default `log4j.properties` file to write to stderr instead of
    files.
  - Added a new `log4j.tofiles.properties` file as a sample of how to configure
    logging to files.

DFP:
  - Modified the default `log4j.properties` file to write to stderr instead of
    files.
  - Added a new `log4j.tofiles.properties` file as a sample of how to configure
    logging to files.

Common:
  - No changes.

3.5.0 - 6/27/2017
-----------------
AdWords:
  - Removed support and examples for v201607. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - All AdWords code examples now accept parameters from the command line.
  - Report downloads will now use the report download timeout from the
    ReportingConfiguration of the AdWordsSession, if present. Fixes
    [issue 106](https://github.com/googleads/googleads-java-lib/issues/106).

    **Note:** With this change, construction of a `ReportingConfiguration`
    object will fail if the report download timeout is negative. If you set the
    `api.adwords.reportDownloadTimeout` property in your `ads.properties` file
    or via a reporting configuration builder, please ensure that the value
    you provide is >= 0.
  - All loggers now use consistent logging levels. See the
    [updated logging guide](https://github.com/googleads/googleads-java-lib/wiki/Logging)
    for more details.

DFP:
  - All DFP code examples now accept parameters from the command line.
  - All loggers now use consistent logging levels. See the
    [updated logging guide](https://github.com/googleads/googleads-java-lib/wiki/Logging)
    for more details.

Common:
  - Added checks to the `install` phase for usage of discouraged classes
    and methods. See:
    https://github.com/policeman-tools/forbidden-apis

3.4.0 - 5/31/2017
-------------------
AdWords:
  - Added support and examples for v201705.

DFP:
  - No changes.

Common:
  - No changes.

3.3.0 - 5/23/2017
-------------------
AdWords:
  - Removed all artifacts for the AdWords Express API, which is no longer
    available.
  - Updated generated Axis objects to include a meaningful `toString`
    implementation. Fixes github issue:
    https://github.com/googleads/googleads-java-lib/issues/98
  - Updated generated Axis Page objects to implement Iterable<T>, where
    T is the type of page entry.
    Fixes github issues:
    https://github.com/googleads/googleads-java-lib/issues/109
    https://github.com/googleads/googleads-java-lib/issues/96

DFP:
  - Added support for v201705.
  - Removed support for v201605.
  - Removed examples for v201608.
  - Updated generated Axis objects to include a meaningful `toString`
    implementation. Fixes github issue:
    https://github.com/googleads/googleads-java-lib/issues/98
  - Updated generated Axis Page objects to implement Iterable<T>, where
    T is the type of page results.
    Fixes github issues:
    https://github.com/googleads/googleads-java-lib/issues/109
    https://github.com/googleads/googleads-java-lib/issues/96

Common:
  - No changes.

3.2.0 - 3/17/2017
-------------------
AdWords:
  - Removed support and examples for v201605. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - Fixed creation of the ReportDownloader object in the v201609
    DownloadCriteriaReport example for Axis.
  - Updated AddSiteLinksUsingFeeds examples to use field and
    constant names that are consistent with the field names
    of SitelinkFeedItem.
  - Moved log4j.properties and ads.properties to the `src` directory in
    non-maven example archive adwords-axis-jars-and-examples.tar.gz so
    log4j will function properly and the ads.properties in the user's
    home directory will take precedence over the sample in the archive.

DFP:
  - Moved log4j.properties and ads.properties to the `src` directory in
    non-maven example archive dfp-axis-jars-and-examples.tar.gz so
    log4j will function properly and the ads.properties in the user's
    home directory will take precedence over the sample in the archive.

Common:
  - Upgraded to version 2.6 of commons-lang in the ads_lib module.
  - Modified configuration loading to only look for
    google-ads-api-java-build.properties in the classpath, since there's no
    need to override this via a local file. In addition, modified the log
    message to something less alarming when an optional configuration file
    cannot be loaded. Fixes github issue:
    https://github.com/googleads/googleads-java-lib/issues/90

3.1.1 - 3/02/2017
-------------------
AdWords:
  - No changes.

DFP:
  - No changes.

Common:
  - To avoid issues introduced by new releases of dependencies, set a specific
    version for all that previously used RELEASE:
    - com.google.guava 20.0
    - com.google.api-client 1.22.0
    - com.google.http-client 1.22.0
    - org.seleniumhq.selenium 2.52.0

3.1.0 - 2/28/2017
-------------------
AdWords:
  - Added support and examples for v201702.
  - Introduced AdWordsServicesInterface to allow for easier proxying of AdWordsServices objects.
  - Added getInstance() to all implementations of AdWordsServicesInterface. This is preferred over
    using each implementation's constructor, as reflected in all of the v201702 examples.
  - Added a getUtility() method to all implementations of AdWordsServicesInterface. This is
    preferred over calling utility constructors. The utilities supported by this method are
    ReportDownloaderInterface and BatchJobHelper in all versions.

DFP:
  - Regenerated DFP service stubs to fix potential unmarshalling error in
  v201702.

Common:
  - No changes.

3.0.0 - 2/14/2017
-------------------
AdWords:
  - Introduced ReportDownloaderInterface for each version of AdWords API
    to allow extensions to more easily wrap ReportDownloader objects.
  - Added HttpHandler for Axis and removed the dependency on
    commons-httpclient 3.1. Fixes github issue #31:
    https://github.com/googleads/googleads-java-lib/issues/31
  - Added a getUtility method to AdWordsServices for improved dependency
    management. This also makes it easier for extension frameworks to
    proxy utility objects.

DFP:
  - Added support for v201702.
  - Removed support for v201602 (sunset).
  - Removed examples for v201605 (deprecated).

Common:
  - Introduced AdsServicesInterface and sub interfaces
    AdWordsServicesInterface and DfpServicesInterface to allow extensions
    to provide customized implementations.
  - Changed minimum JRE version to 1.7.

2.22.0 - 12/07/2016
-------------------
AdWords:
  - Refactored the HandlePolicyViolationError examples to make them easier
    to read and understand.

DFP:
  - Added support for v201611.
  - Removed support for v201508 and v201511.
  - Removed examples for v201602.

Common:
  - No changes.

2.21.0 - 10/20/2016
-------------------
AdWords:
  - Removed support and examples for v201603. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - Added example for accepting a service link between a Google Merchant
    Center account and an AdWords account.
  - Updated examples that create campaigns to set the campaign's status
    to PAUSED to prevent ads from immediately serving.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.20.0 - 10/03/2016
-------------------
AdWords:
  - Added support and examples for v201609.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.19.0 - 08/26/2016
-------------------
AdWords:
  - Removed support and examples for v201601. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - User agent is now optional. If no user agent is specified for an
    AdWordsSession or the default value is specified, 'unknown' will
    be passed instead.
  - If user agent is specified, it must contain only ASCII characters.
    Otherwise, a ValidationException will be thrown.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.18.0 - 08/23/2016
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201608.
  - Removed support for v201505.
  - Removed v201508 and v201511 examples.

Common:
  - No changes.

2.17.0 - 07/28/2016
-------------------
AdWords:
  - Added support and examples for v201607.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.16.0 - 06/17/2016
-------------------
AdWords:
  - Removed support and examples for v201509. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - Fixed 'No deserializer for ...' issue during batch job downloads:
    https://github.com/googleads/googleads-java-lib/issues/89

DFA:
  - No changes.

DFP:
  - Added tests for StatementBuilder and ReportDownloader utilities.
  - Fixed https://github.com/googleads/googleads-java-lib/issues/88.

Common:
  - No changes.

2.15.0 - 05/27/2016
-------------------
AdWords:
  - Added support and examples for v201605.
  - Added new ParallelReportDownload example to demonstrate how to download an
    Ad Hoc report for all accounts directly under a manager account in multiple
    parallel threads.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.14.0 - 05/17/2016
-------------------
AdWords:
  - Removed AdWords Axis Utility Extension (beta). As mentioned in github issue #63
    (https://github.com/googleads/googleads-java-lib/issues/63), this utility has
    been deprecated.

DFA:
  - No changes.

DFP:
  - Added support for v201605.
  - Added examples for v201605.
  - Removed examples for v201505.
  - Removed support for v201502.

Common:
  - No changes.

2.13.2 - 05/12/2016
-------------------
AdWords:
  - Modified AxisDeserializer to create a new TransformerFactory and
  Transformer on each deserialization operation, since these objects
  are *not* thread safe. Fixes github issue #85:
  https://github.com/googleads/googleads-java-lib/issues/85

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Added support for loading service account JSON key files from
  ads.properties.

2.13.1 - 05/02/2016
-------------------
AdWords:
  - Modified logging of SOAP requests to replace the developer token with
  `REDACTED`.
  - Refactored ReportDownloader and AdHocReportDownloader to reduce duplicated code.
  - Removed unused exceptions: ReportFailureException, SoapInvocationTargetException.
  - Fixed Axis BatchJobHelper implementation to avoid concurrency issues with Apache
    Axis TypeMapping objects. Fixes github issue #80:
    https://github.com/googleads/googleads-java-lib/issues/80

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Added logging of request IDs for SOAP requests. Fixes github issue #4:
    https://github.com/googleads/googleads-java-lib/issues/4
  - Removed unused com.google.api.ads.common.lib.utils.Choices utility.

2.13.0 - 04/11/2016
-------------------
AdWords:
  - Removed support and examples for v201506. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Added framework for including utility usage in the user agent header.

2.12.0 - 03/24/2016
-------------------
AdWords:
  - Added support and examples for v201603.
  - Migrated AdWords Axis Utility Extension (beta) to v201603. Fixes github issue #63
    (https://github.com/googleads/googleads-java-lib/issues/63).

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.11.0 - 03/11/2016
-------------------
AdWords:
  - Fixed github issue #53 (https://github.com/googleads/googleads-java-lib/issues/53):
    throw/get methods on the utility extension's UtilityLibraryException class should not
    throw a ClassCastException when passed an AxisFault.
  - Fixed github issue #58 (https://github.com/googleads/googleads-java-lib/issues/58):
    Added ImmutableAdWordsSession to facilitate thread-safe cloning of an AdWordsSession.

DFA:
  - No changes.

DFP:
  - Added ImmutableDfpSession to facilitate thread-safe cloning of a DfpSession.

Common:
  - Upgraded commons-configuration:commons-configuration from 1.7 to 1.10 to
    avoid a required dependency on commons-collections:commons-collections:3.2.1,
    which has a high security vulnerability. See:
    https://commons.apache.org/proper/commons-collections/security-reports.html#Fixed_in_Apache_Commons_Collections_3.2.24.1
  - Explicitly added a dependency on commons-collections:commons-collections:3.2.2.
  - Excluded commons-collections:commons-collections:3.2.1 from the
    commons-beanutils:commons-beanutils:1.9.2 dependency.

2.10.0 - 02/23/2016
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201602.
  - Removed support for v201411.
  - Removed deprecated ReportDownloader methods for v201602.
  - Removed v201502 examples.

Common:
  - No changes.

2.9.0 - 02/02/2016
------------------
AdWords:
  - Added support and examples for v201601.
  - Fixed examples extensions/AddSiteLinks and errorhandling/HandlePolicyViolationError
  to properly handle the latest validation rules enforced by the API.
  - Modified the axis.v201506.accountmanagement.GetAccountHierarchy,
  axis.v201509.accountmanagement.GetAccountHierarchy, and
  axis.v201601.accountmanagement.GetAccountHierarchy examples to properly handle
  the case where ManagedCustomerService.get returns multiple pages of results.
  - Made BatchJobUploadStatus serializable for usage with resumable BatchJob
  uploads.
  - Removed all AdX Buyer examples and JAR files.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.8.0 - 11/19/2015
------------------
AdWords
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201511.
  - Removed support for v201408.
  - Removed examples for v201411.

Common:
  - No changes.

2.7.0 - 11/06/2015
------------------
AdWords
  - Fixed [issue 56](https://github.com/googleads/googleads-java-lib/issues/56)
  and added a test to ensure this does not resurface.
  - Removed support and examples for v201502. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates
  - Updated adwords.axis.auth.GetRefreshToken example to support generating a
  refresh token that includes additional scopes.
  - Added adwords.axis.v201509.reporting.StreamCriteriaReportResults example.

DFA:
  - No changes.

DFP:
  - Updated dfp.axis.auth.GetRefreshToken example to support generating a
  refresh token that includes additional scopes.

Common:
  - No changes.

2.6.0 - 10/28/2015
------------------
AdWords:
  - Updated com.google.api.ads.adwords.lib.jaxb.v201509.ReportDefinitionReportType to include
    the new VIDEO_PERFORMANCE_REPORT enum value. Fixes
    [issue 52](https://github.com/googleads/googleads-java-lib/issues/52).
  - Removed all references to ClientLogin from examples.
  - Added missing <p> tags to Javadocs.
  - Introduced a separate logger for BatchJob uploads and downloads. Upload
  contents are logged to this logger using the FINE level since they can be
  considerably larger than other requests.

DFA:
  - Removing support for the legacy DFA API.

DFP:
  - No changes.

Common:
  - Updated maven dependencies to exclude guava-jdk5. Fixes
    [issue 54](https://github.com/googleads/googleads-java-lib/issues/54).

2.5.0 - 10/07/2015
------------------
AdWords:
  - Added support and examples for v201509.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Added support for setting SOAP request read timeouts via ads.properties.
  - Updated Joda Time dependency to 2.8.2.
  - Updated Guice dependency to version 4.0.

2.4.1 - 09/18/2015
------------------
AdWords:
  - Corrected the argument passed to `SelectorBuilder.increaseOffsetBy` in `ProductPartitionTree`
    to fix [github issue #50](https://github.com/googleads/googleads-java-lib/issues/50).

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.4.0 - 08/25/2015
------------------
AdWords:
  - Set AdGroup settings. Fixes github issue
    [49](https://github.com/googleads/googleads-java-lib/issues/49)

DFA:
  - No changes.

DFP:
  - Added support for v201508.
  - Added ReconciliationLineItemReportService.
  - Removed support for v201405.
  - Removed examples for v201408.

Common:
  - No changes.

2.3.0 - 07/27/2015
-------------------
AdWords:
  - Migrated AdWords Axis Utility Extension (beta) to v201506.
  - Removed support and examples for v201409. See deprecation schedule at:
    https://developers.google.com/adwords/api/docs/sunset-dates

DFA:
  - Removed support for v1.19.

DFP:
  - Removed support for v201403.

Common:
  - No changes.

2.2.0 - 06/26/2015
-------------------
AdWords:
  - Added support and examples for v201506.
  - Fix to avoid ArrayStoreException in ProductPartitionTree.createAdGroupTree.
  - Added support for the new includeZeroImpressions HTTP header for reporting.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.1.0 - 06/10/2015
-------------------
AdWords:
  - Migrated AdWords Axis Utility Extension (beta) to v201502.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

2.0.0 - 05/19/2015
-------------------
AdWords:
  - Changed minimum JRE version to 1.6.

DFA:
  - Changed minimum JRE version to 1.6.

DFP:
  - Added support for v201505.
  - Removed examples for v201405.
  - Updated report utility with new getReportJobStatus method.
  - Removed MERGED_* metrics from the ReportService.
  - Added advanced ProposalLineItem actions.
  - Changed minimum JRE version to 1.6.

Common:
  - Changed minimum JRE version to 1.6.

1.39.0 - 04/24/2015
-------------------
AdWords:
  - Removed support and examples for v201406.
  - Added support for the [skipColumnHeader option](https://developers.google.com/adwords/api/docs/guides/reporting#optional-headers)
    introduced in v201502.
  - Removed reference to `MarginalCpc` selector field in
    [GetKeywordBidSimulations](https://github.com/googleads/googleads-java-lib/blob/master/examples/adwords_axis/src/main/java/adwords/axis/v201502/optimization/GetKeywordBidSimulations.java).
    This field was removed from `DataService` in [v201502](https://developers.google.com/adwords/api/docs/guides/migration/v201502).
  - Added Java enums that represent all the fields for all the entity services available on each API
    version.
  - Added support for the Java enums in the SelectorBuilder utility class.
  - Updated junit dependency to version 4.11.
  - Updated hamcrest-all dependency to version 1.3.

DFA:
  - Updated junit dependency to version 4.11.

DFP:
  - Updated junit dependency to version 4.11.

Common:
  - Updated junit dependency to version 4.11.
  - Updated hamcrest-all dependency to version 1.3.

1.38.0 - 03/12/2015
-------------------
AdWords:
  - Added support and examples for v201502.
  - Renamed AddSiteLinks to AddSiteLinksUsingFeeds, and added new AddSiteLinks and
    MigrateToExtensionSettings examples for the new extension setting services.
  - Fixed [github issue 36](https://github.com/googleads/googleads-java-lib/issues/36):
    getBid() of root ProductPartition returns NULL.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Updated joda-time dependency to version 2.1.

1.37.0 - 02/19/2015
-------------------
AdWords:
  - Added new methods to ReportDownloadResponse to facilitate saving a report's contents to a file,
    retrieving a report's contents as a string, and retrieving a report's contents as an
    InputStream.
  - Fixed AccountManagementTest to account for the fact that clientCustomerId is required on
    ManagedCustomerService calls in v201409.
  - Removed AdWords for Video services from v201406.
  - Added ProductPartitionTree utility to simplify management of ProductPartition ad
    group criteria in Shopping campaigns.
  - Improved targetAll settings and comments in AddAdGroups examples.
  - Updated multiple examples to use
    [upgraded URLs](https://developers.google.com/adwords/api/docs/guides/upgraded-urls).
  - Added UpgradeAdUrl example.

DFA:
  - No changes.

DFP:
  - Added support for v201502.
  - Removed support for v201311, v201308, and v201306.
  - Removed examples for v201403.
  - Updated ForecastService examples.
  - Added PackageService, ProductPackageService and ProductPackageItemService.
  - Removed support for ClientLogin with the removal of v201311 and earlier.

Common:
  - Fixed [issue #33](https://github.com/googleads/googleads-java-lib/issues/33):
    Some generated JAX-WS files contain an invalid wsdlLocation.
  - Modified SOAP integration tests to make them Java 8 compatible. This required a new test
    dependency on XMLUnit.

1.36.0 - 12/04/2014
-------------------
AdWords:
  - Removed support for v201402.
  - Removed support for reportMoneyInMicros from AdWordsSession. This feature is not supported in
    v201406 and higher.
  - Relaxed validation of ReportingConfiguration to allow usage with v201406.
  - Fixed [github issue #23](https://github.com/googleads/googleads-java-lib/issues/23): add
    a negative campaign criterion in the AddCampaignTargetingCriteria examples.
  - Fixed [github issue #29](https://github.com/googleads/googleads-java-lib/issues/29):
    EstimateKeywordTraffic.java example fails if StatsEstimate is missing values

DFA:
  - Removed support for DFA6 report service.

DFP:
  - No changes.

Common:
  - No changes.

1.35.1 - 11/11/2014
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Release to fix maven and github inconsistencies.

Common:
  - No Changes.

1.35.0 - 11/11/2014
-------------------
AdWords:
  - Migrated AdWords Axis Utility Extension (beta) to v201409.
  - Added Label support to AdWords Axis Utility Extension (beta).
  - Modified AdWords Express AddPromotion.java examples to only
    create one Creative per Promotion.

DFA:
  - No changes.

DFP:
  - Added support for v201411.
  - Added SharedAdUnitService and AdExclusionRuleService.
  - Removed examples for v201311.

Common:
  - No Changes.

1.34.0 - 10/10/2014
-------------------
AdWords:
  - Added support and examples for v201409.

DFA:
  - Removed obsolete DFA6 examples. For more information, see the
    [DCM upgrade guide](https://developers.google.com/doubleclick-advertisers/docs/upgrading).

DFP:
  - No changes.

Common:
  - No changes.

1.33.0 - 09/11/2014
-------------------
AdWords:
  - Migrated AdWords Axis Utility Extension (beta) to v201406.

DFA:
  - No changes.

DFP:
  - Added new auth example CreateDfpSessionUsingServiceAccount.java that shows
    how to create a DfpSession using OAuth2 service account credentials.

Common:
  - Added support for optional SOAP compression. Fixes
    [issue #1](https://github.com/googleads/googleads-java-lib/issues/1).

1.32.0 - 08/20/2014
-------------------
AdWords:
  - Removed support for ClientLogin. For more information, see the [ClientLogin to OAuth2
    Migration guide](https://developers.google.com/adwords/api/docs/guides/clientlogin-to-oauth2-migration-guide).
  - Added example for using ad customizers.

DFA:
  - No changes.

DFP:
  - Added support for v201408.
  - Updated default DFP endpoint to https://ads.google.com.
  - Updated OAuth scope to https://www.googleapis.com/auth/dfp.
  - Changed Product ID from String to Long.
  - Updated create line item and get forecast examples in v201408 to show
    how to set Goal.goalType.

Common:
  - No changes.

1.31.0 - 07/21/2014
-------------------
AdWords:
  - Removed support for v201309.
  - Added AdWords for Video v201406 support. This is a beta feature.
  - Added containsAny, containsAll, and containsNone methods to the
    jaxws SelectorBuilder for v201406.
  - Added unit tests for axis and jaxws v201406 SelectorBuilders.
  - Added validation to ensure that returnMoneyInMicros is not set on
    reporting requests for versions higher than v201402. See
    https://developers.google.com/adwords/api/docs/guides/reporting-concepts#money.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.30.0 - 07/09/2014
-------------------
AdWords:
  - Added support for v201406.
  - Updated OAuth scope. See
    https://developers.google.com/adwords/api/docs/guides/authentication#scope for details.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Upgraded slf4j to 1.7.7.

1.29.1 - 07/02/2014
-------------------
AdWords:
  - Added whitelist-only shared set services to v201402.

DFA:
  - No changes.

DFP:
  - Added new LineItem error reason.
  - Added TokenError to UserService.

Common:
  - No changes.

1.29.0 - 06/12/2014
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added v201405 support.

Common:
  - No changes.

1.28.0 - 05/21/2014
-------------------
AdWords:
  - Added AdWords for Video v201309 support. This is a beta feature.
  - Added report request and response logging. Fixes issue #12.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.27.0 - 04/11/2014
-------------------
AdWords:
  - Removed support for v201306.
  - Migrated AdWords Axis Utility Extension (beta) to v201402.
  - Improved limit documentation in EstimateKeywordTraffic and
    GetKeywordIdeas. Fixes issue #13.
  - Added support for new AdWords Express ProductServiceService.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.26.0 - 03/06/2014
-------------------
AdWords:
  - Added support for v201402.
  - Disabled ClientLogin beginning with v201402.
  - Only include returnMoneyInMicros in the request header if it is
    explicitly specified in ads.properties or set on the session or session
    builder. See the note on returnMoneyInMicros at
    https://developers.google.com/adwords/api/docs/guides/migration/v201402
    for more details.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.25.0 - 03/05/2014
-------------------
AdWords:
  - Added examples to get refresh token and create AdWordsSession without
    using ads.properties file.

DFA:
  - Added examples to get refresh token and create DfaSession without
    using ads.properties file.

DFP:
  - Added examples to get refresh token and create DfpSession without
    using ads.properties file.
  - Added support for v201403.
  - Added LiveStreamEventService and RateCardCustomizationGroupService.
  - Removed all non-bulk methods beginning with v201403.
  - Disabled ClientLogin beginning with v201403.

Common:
  - No changes.

1.24.1 - 02/06/2014
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Replaced java.nio.charset.StandardCharsets.UTF_8 with
    com.google.common.base.Charsets.UTF_8 for Java 1.5 compatibility. Fixes
    issue #10.
  - com.google.http-client and org.seleniumhq.selenium artifacts are no longer
    RELEASE.

1.24.0 - 01/29/2014
-------------------
AdWords:
  - Updated GetKeywords examples to use the proper match type field in the Selector.
  - SelectorBuilder: changed the method signature "by" to "equals".
  - Migrated AdWords Axis Utility Extension (beta) to v201309.
  - Improved comments in the UpdateSiteLinks example.

DFA:
  - No changes.

DFP:
  - Fixes issue #8: NumberValue with empty string should return null for
    Pql.getApiValue

Common:
  - No changes.

1.23.0 - 01/16/2014
-------------------
AdWords:
  - Added support for AdWords Express for v201309 (invite-only feature).

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.22.1 - 12/05/2013
-------------------
AdWords:
  - Added AdWords Axis Utility Extension (beta).

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.22.0 - 11/25/2013
-------------------
AdWords:
  - Added SelectorBuilder to simplify building Selectors.
  - A valid user agent is now required and must not be the default. Set
    it via AdWordsSession.Builder.withUserAgent or the api.adwords.userAgent
    ads.properties key.

DFA:
  - A valid application name is now required and must not be the default. Set
    it via DfaSession.Builder.withApplicationName or the api.dfa.applicationName
    ads.properties key.

DFP:
  - Added support for v201311.
  - Starting in v201311, StatementBuilder.SUGGESTED_PAGE_LIMIT will be set to
    500.
  - A valid application name is now required and must not be the default. Set
    it via DfpSession.Builder.withApplicationName or the api.dfp.applicationName
    ads.properties key.

Common:
  - No changes.

1.21.0 - 11/18/2013
-------------------
AdWords:
  - Removed the support for v201302.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.20.1 - 11/14/2013
-------------------
AdWords:
  - Moved UseSharedBiddingStrategy example to advancedoperations from campaignmanagement.
  - Added UpdateSiteLinks example to illustrate how to use new line 1 and 2 descriptions.
  - Updated AddSiteLinks example to include new line 1 and 2 description fields.

DFA:
  - No changes.

DFP:
  - Fixed issue 69: NPE for null Value objects in PQL utilities.
  - Added getNativeValue an getApiValue to PQL utility to ease work with Value
    objects.

Common:
  - No changes.

1.20.0 - 10/04/2013
-------------------
AdWords:
  - Added support for v201309.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.19.0 - 9/18/2013
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added v201308.
  - Removed deprecated versions v201203, v201204, and v201206.
  - Renamed DateTimes.toStringForZone to DateTimes.toStringForTimeZone.
  - Added DateTimes.toStringWithTimeZone to include time zones.
  - Pql utilities will now convert DateTime and Date time values to into machine
    readable strings. DateTimes will be in ISO-8061 format while Dates will be
    in yyyy-MM-dd format.
  - Added Pql.combineResultSets to easily combine result sets from paged
    statements.

Common:
  - No changes.

1.18.1 - 8/02/2013
------------------
AdWords:
  - Removed support for v201209.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.18.0 - 7/09/2013
------------------
AdWords:
  - Added support for v201306.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.17.0 - 6/28/2013
------------------
AdWords:
  - Added AdWords for Video support for v201302 (beta feature).
  - Added GetRefreshToken example to be used with OfflineCredentials.
  - The ads.properties file can now accept a refreshToken and client secrets.
  - Removed deprecated environment methods and properties in
    AdWordsSession.Builder.
  - Removed OAuth1 support. OAuth2 should be used instead.
  - ClientLogin is now deprecated. OAuth2 should be used instead.
  - Updated all examples to use OfflineCredentials instead of ClientLogin.

DFA:
  - Added GetRefreshToken example to be used with OfflineCredentials.
  - The ads.properties file can now accept a refreshToken and client secrets.
  - Username/password is now deprecated. OAuth2 should be used instead.
  - Updated all examples to use OfflineCredentials.

DFP:
  - Added GetRefreshToken example to be used with OfflineCredentials.
  - The ads.properties file can now accept a refreshToken and client secrets.
  - Removed deprecated environment methods and properties in
    DfpSession.Builder.
  - Removed OAuth1 support. OAuth2 should be used instead.
  - ClientLogin is now deprecated. OAuth2 should be used instead.
  - Updated all examples to use OfflineCredentials.

Common:
  - Added OfflineCredentials utility to generate an OAuth2 Credential from
    information stored in your ads.properties file. If you have not moved
    off of ClientLogin yet, using this utility will ease the process.
  - Removed deprecated modules (common_*, adwords_lib, dfp_lib, and dfa_lib)
    from source control.

1.16.0 - 6/24/2013
------------------
AdWords:
  - No changes.

DFA:
  - Removed the match table application from our example set. From now on, it
    will be treated as its own sample application.
  - Added automatic refreshing of DDMM tokens. Once your account has been
    upgraded from DFA to DDMM, your login tokens have limited lifespans.

DFP:
  - Added support for v201306.
  - Added all remaining missing examples for v201302.

Common:
  - No changes.

1.15.2 - 5/09/2013
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Updating our parent pom.xml file.

1.15.1 - 5/08/2013
------------------
AdWords:
  - Added support for AdGroupBidModifierService.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.15.0 - 4/25/2013
------------------
AdWords:
  - Minor fixes to examples to address issues 36, 41.
  - AdWords for Video API support and examples (beta feature).
  - Removing support for v201206.

DFA:
  - Removed support for v1.18.
  - Added support for v1.20.

DFP:
  - Fixed DfpInternals to reference DfpModule (issue 55).
  - Included some examples for v201302 that were left out.

Common:
  - No changes.

1.14.1 - 3/25/2013
------------------
AdWords:
  - No changes.

DFA:
  - Updated the sample application which generate match tables to use multiple
    threads for increased performance.

DFP:
  - No changes.

Common:
  - No changes.

1.14.0 - 3/15/2013
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201302.
  - The StatementBuilder classes no longer implement QueryBuilderInterface.

Common:
  - Removing all of the classes aimed at supporting Axis2. We have no plans to
    support Axis2 at this time.

1.13.0 - 3/04/2013
------------------
AdWords:
  - Adding support for v201302.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.12.4 - 2/07/2013
------------------
AdWords:
  - No changes.

DFA:
  - Added an application to the DFA sample set which can generate match tables
    from Data Transfer files. If you'd like to know more (or find out what a
    match table or Data Transfer file is), please see the README in
    dfa/axis/v1_19/matchtables.

DFP:
  - No changes.

Common:
  - No changes.

1.12.3 - 2/06/2013
------------------
AdWords:
  - Adding code examples for enhanced campaign support using the
    forwardCompatibilityMap.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.12.2 - 1/17/2013
------------------
AdWords:
  - Removed deprecated com.google.api.ads.adwords.lib.factory.AdWordsServices
    class. You must use com.google.api.ads.adwords.axis.factory.AdWordsServices
    or com.google.api.ads.adwords.jaxws.factory.AdWordsServices instead.

DFA:
  - Removed deprecated com.google.api.ads.dfa.lib.factory.DfaServices class. You
    must use com.google.api.ads.dfa.axis.factory.DfaServices instead.

DFP:
  - Removed deprecated com.google.api.ads.dfp.lib.factory.DfpServices class. You
    must use com.google.api.ads.dfp.axis.factory.DfpServices or
    com.google.api.ads.dfp.jaxws.factory.DfpServices instead.

Common:
  - Restored library to Java 1.5 compatibility when creating a single jar
    assembly. This was due to newer versions of Guava not being compatible with
    1.5. The artifact guava-jdk5 will now be used instead. Fixes issue 44.
  - Removed our dependency on Reflections. Usage of all classes which relied on
    Reflections has been deprecated since version 1.7.0.
  - Updated the version of our selenium-java testing dependency.

1.12.1 - 12/14/2012
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Changed version of selenium-java dependency to 2.27.0. Version 2.28.0 was
    causing java.lang.NoClassDefFoundError: org/w3c/dom/ElementTraversal errors.

1.12.0 - 12/11/2012
-------------------
AdWords:
  - Removed support for sandbox environment.
  - Added support for configurable report download timeout.  Set property
    api.adwords.reportDownloadTimeout in milliseconds in ads.properties.

DFA:
  - No changes.

DFP:
  - Added support for v201211.
  - Updated generated code for all versions to support UnsupportedCreative and
    new UNKNOWN enum values.
  - Removed support for v201111 and v201201.

Common:
  - Fixed issue where not all properties where being loaded from the
    ads.properties file correctly.

1.11.0 - 11/02/2012
-------------------
AdWords:
  - Removed v201109 and v201109_1 support due to sunset.
  - Fixed issue 33 by adding connect/read timeout to
    ReportRequestFactoryHelper.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.10.2 - 10/23/2012
-------------------
AdWords:
  - Fixing issue 31 by retaining a static reference to the JaxBSerializer,
    which holds onto the JAXBContext reference.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Streams fix for issue 26.
  - Removed synchronization on
    BaseAdsServiceClientFactory.getServiceClientAsInterface() to fix issue 27.

1.10.1 - 10/15/2012
-------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Updated our dependency on Apache commons-configuration from version 1.6 to
    1.7. This fixes issue 30.

1.10.0 - 10/10/2012
-------------------
AdWords:
  - Adding support for v201209.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.9.1 - 09/12/2012
------------------
AdWords:
  - The Axis example project now has the configuration for exec-maven-plugin
    inside a profile. This fixes issue 23.

DFA:
  - The Axis example project now has the configuration for exec-maven-plugin
    inside a profile. This fixes issue 23.

DFP:
  - The Axis example project now has the configuration for exec-maven-plugin
    inside a profile. This fixes issue 23.

Common:
  - ConfigurationHelper now creates a snapshot of the System properties when it
    is instantiated rather than using the Apache SystemConfiguration class.
    This prevents a ConcurrentModificationException from being thrown if a
    property is added or removed from the System while our library is reading
    from our configuration.

1.9.0 - 09/06/2012
------------------
AdWords:
  - Removed OAuth1.0 examples. See release 1.8.1 for more information.
  - Updated OAuth2.0 examples to use Jackson2 instead of Gson.

DFA:
  - Updated OAuth2.0 examples to use Jackson2 instead of Gson.

DFP:
  - Removed OAuth1.0 examples. See release 1.8.1 for more information.
  - Updated OAuth2.0 examples to use Jackson2 instead of Gson.

Common:
  - Parent pom dependencies are now locked to current release version at time
    of this release. Each release will now include the most recent dependencies
    at the time of release, i.e. replacing the RELEASE version.
  - com.google.api-client dependency upgraded to 1.11.0 which removes support
    for com.google.api.client.googleapis.auth.oauth

1.8.1 - 09/05/2012
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added link to header explanations in ads.properties file.

Common:
  - Deprecated use of OAuth1.0a via withOAuthParameters methods. If you are
    using OAuth1.0a, please switch to OAuth2.0. Although we will continue to
    support OAuth1.0a as long as the method is supported by Google, it may
    become more difficult as other Google libraries begin to deprecate support.
    See the following release note for more information.
  - Locked parent dependency versions at the time of the 1.8.0 release due to
    com.google.oauth-client and com.google.api-client dropping support of
    GoogleOAuth OAuth1.0a authorization flows.

1.8.0 - 08/23/2012
------------------
AdWords:
  - No changes.

DFA:
  - Added support for v1.19.
  - Added OAuth2 support, which is only supported in DFA API v1.19 and later.
    OAuth2 tokens will be refreshed when they expire by default. This behavior
    can be disabled by setting the "api.dfa.refreshOAuth2Token" key in your
    ads.properties to "false".

DFP:
  - Added support for v201208.

Common:
  - No changes.

1.7.2 - 08/13/2012
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Updated generated java for all versions.

Common:
  - No changes.

1.7.1 - 08/10/2012
------------------
AdWords:
  - Fixed issue 20.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - No changes.

1.7.0 - 08/09/2012
------------------
AdWords:
  - com.google.api.ads.adwords.lib.factory.AdWordsServices is now deprecated.
    Use com.google.api.ads.adwords.axis.factory.AdWordsServices or
    com.google.api.ads.adwords.jaxws.factory.AdWordsServices instead.
    We plan to remove this deprecated class in the future.

DFA:
  - com.google.api.ads.dfa.lib.factory.DfaServices is now deprecated. Use
    com.google.api.ads.dfa.axis.factory.DfaServices instead.
    We plan to remove this deprecated class in the future.

DFP:
  - com.google.api.ads.dfp.lib.factory.DfpServices class is now deprecated. Use
    com.google.api.ads.dfp.axis.factory.DfpServices or
    com.google.api.ads.dfp.jaxws.factory.DfpServices instead.
    We plan to remove this deprecated class in the future.

Common:
  - Fixes Issue 17 - Usage of the Reflections toolkit can be avoided entirely by
    using the new Services classes mentioned above.

1.6.0 - 07/20/2012
------------------
AdWords:
  - Adding support for v201206.
  - Adding CustomerService and ManagedCustomerService to v201109 and v201109_1.
  - Report downloads now toolkit agnostic.
  - Adding support for AWQL in reports and examples.

DFA:
  - No changes.

DFP:
  - Fixed issue where environment/endpoint was not optional if supplied via
    builder. Environment/endpoint is now optional in properties and builder and
    defaults to https://www.google.com.
  - Deprecated withEnvironment/isEnvironment from DfpSession and
    api.dfp.environment from ads.properties.

Common:
  - No changes.

1.5.0 - 07/03/2012
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201206.
  - Changed suggested page size to 500 for utilities for v201206+.
  - Fix for issue 14 - JaxWs PQL utils row conversion fails.

Common:
  - No changes.

1.4.0 - 06/19/2012
------------------
AdWords:
  - Added ability to have library automatically refresh 'offline' OAuth2 tokens.
    This can be disabled by setting the "api.adwords.refreshOAuth2Token" key
    in your ads.properties to "false".
  - Updated user-agent.
  - The AdWordsAxisHeaderHandler class has been moved from the
    com.google.api.ads.adwords.lib.client package into the
    com.google.api.ads.adwords.axis package. Correspondingly, it has been moved
    from the ads_lib Maven artifact to the adwords_axis artifact.
  - The AdWordsJaxWsHeaderHandler class has been moved from the
    com.google.api.ads.adwords.lib.client package into the
    com.google.api.ads.adwords.jaxws package. Correspondingly, it has been moved
    from the ads_lib Maven artifact to the adwords_appengine artifact.

DFA:
  - Updated user-agent.
  - The DfaAxisHeaderHandler class has been moved from the
    com.google.api.ads.dfa.lib.client package into the
    com.google.api.ads.dfa.axis package. Correspondingly, it has been moved
    from the ads_lib Maven artifact to the dfa_axis artifact.
  - The LoginTokensHelper class is now an interface. A concrete implementation
    is now in the dfa_axis artifact.

DFP:
  - Removed references to sandbox environment. To test the DFP API, use
    test networks which use the production environment. See
    https://developers.google.com/doubleclick-publishers/docs/environments
  - Added ability to have library automatically refresh 'offline' OAuth2 tokens.
    This can be disabled by setting the "api.dfp.refreshOAuth2Token" key
    in your ads.properties to "false".
  - Updated user-agent.
  - The DfpAxisHeaderHandler class has been moved from the
    com.google.api.ads.dfp.lib.client package into the
    com.google.api.ads.dfp.axis package. Correspondingly, it has been moved
    from the ads_lib Maven artifact to the dfp_axis artifact.
  - The DfpJaxWsHeaderHandler class has been moved from the
    com.google.api.ads.dfp.lib.client package into the
    com.google.api.ads.dfp.jaxws package. Correspondingly, it has been moved
    from the ads_lib Maven artifact to the dfp_appengine artifact.

Common:
  - fromFile() methods will now throw a checked ConfigurationLoadException. This
    may require a code change depending on how you called the method.

1.3.0 - 05/18/2012
------------------
AdWords:
  - Added support for OAuth2.
  - Added support for v201109_1.
  - AdHocReportDownloadHelper now encapsulates core download logic.
  - Added AppEngine (JAX-WS) support for report downloads.
  - Added logging to report downloads.

DFA:
  - No changes.

DFP:
  - Added support for OAuth2.

1.2.1 - 05/15/2012
------------------
All:
  - Updates to Maven poms to make building more efficient.
  - Autogenerated code is now committed to git repository.

1.2.0 - 05/14/2012
------------------
AdWords:
  - Added experimental OAuth2 support and example.
  - Added setters for authentication mechanisms to AdWordsSession. Setting one
    type will null out other types.

DFA:
  - Support for v1.18 added to the DFA library.
  - Removed support for v1.16.

DFP:
  - No changes.

1.1.0 - 05/08/2012
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Added support for v201204.
  - Added experimental OAuth2 support and example.
  - Added setters for authentication mechanisms to DfpSession. Setting one type
    will null out other types.
  - Modified DateTime utilities to have a cleaner API and work with Calendar
    instead of Date. The internals have been refactored to use joda.

Common:
  - Added logic to increase default timeout for App Engine requests to 10
    minutes in the JAX-WS message context instead of 10 second default.
    Issue # 9, 10.
  - Added methods in the Media utility class to save media data to the file
    system.

1.0.1 - 04/20/2012
------------------
AdWords:
  - Added support for v201109 BudgetOrderService.

DFA:
  - No changes.

DFP:
  - Added examples for InventoryService.
  - Added StatementBuilder.removeLimitAndOffset().

Common:
  - Refactored ClientLoginTokens to use a Builder.
    - Deprecated older way of creating tokens.
  - Fixed issue 6.

1.0.0 - 03/30/2012
------------------
AdWords:
  - Environments specified in a properties file pulled in by
    AdWordsSession.Builder's fromFile method can now be overridden by subsequent
    calls to setEndpoint and/or setEnvironment.

DFA:
  - Removed support for v1.15.
  - Environments specified in a properties file pulled in by
    DfaSession.Builder's fromFile method can now be overridden by subsequent
    calls to setEndpoint and/or setEnvironment.

DFP:
  - Added utilities such as Dates, DateTimes, Pql, ReportDownloader, and
    StatementBuilder.
  - Added support for v201203.
  - Removed SANDBOX environment from DfpSession. Test networks are now the
    preferred way of testing:
    https://developers.google.com/doubleclick-publishers/docs/signup
  - Fixed OAuth issues (request URL not set correctly).
  - Environments specified in a properties file pulled in by
    DfpSession.Builder's fromFile method can now be overridden by subsequent
    calls to setEndpoint and/or setEnvironment.

Common:
  - Choices, CsvFiles, Maps, Media, and Streams made static.

0.5.1 - 03/02/2012
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - No changes.

Common:
  - Updated ClientLoginTokens to work on AppEngine.  See Issue #2.

0.5.0 - 02/18/2012
------------------
AdWords:
  - The packages containing autogenerated classes from Apache Axis have changed.
    Ex. com.google.api.ads.adwords.{version} is now
    com.google.api.ads.adwords.axis.{version}
  - Added support for using the JAX-WS toolkit, which allows the AdWords library
    to be used on Google's App Engine.
  - Image, Map and Choice utilities have now been moved to common and made
    non static
DFA:
  - The packages containing autogenerated classes from Apache Axis have changed.
    Ex. com.google.api.ads.dfa.{version} is now
    com.google.api.ads.dfa.axis.{version}
  - Support for v1.17 added to the DFA library.
  - dfa-api.properties file and DfaSession.Environment class both changed to use
    HTTPS addresses.
  - Fixed a bug which was preventing calls to the strategy service from
    succeeding.

DFP:
  - Added v201201 support.
  - The packages containing autogenerated classes from Apache Axis have changed.
    Ex. com.google.api.ads.dfp.{version} is now
    com.google.api.ads.dfp.axis.{version}
  - Added support for using the JAX-WS toolkit, which allows the DFP library
    to be used on Google's App Engine.
  - Image, Map and Choice utilities have now been moved to common and made
    non static

0.4.0 - 12/29/2011
------------------
AdWords:
  - No changes.

DFA:
  - No changes.

DFP:
  - Initial library release.

0.3.0 - 12/28/2011
------------------
DFA:
  - Support for DFA API v1.16 added to the DFA library.
  - Improvements to the AdWords library were applied to the DFA library:
    - DfaUser and DfaServiceSession were collapsed into one class, DfaSession.
    - DfaServices can no longer be used statically and must be instantiated.
    - Credentials and settings for the library were moved from the
      dfa.properties file to the ads.properties file. Additionally, this file
      may now be located in the user's home directory, in the current directory,
      or in the classpath.
    - The endpoint server can no longer be passed to DfaServices. It must now be
      set on the DfaSession.
  - The DFA library can now generate tokens against the test environment if this
    environment is set on the DfaSession.
  - dfa-build.properties file removed.

AdWords:
  - adwords-build.properties file removed.

0.2.0 - 12/22/2011
------------------
DFA:
  - No changes.

AdWords:
  - Initial library release.

0.1.0 - 9/26/2011
-----------------
DFA:
  - Initial library release.
