# AdWords API Extension: RateLimiter

RateLimiter is an AdWords API Java client library extension that automatically
[handles rate limit errors](https://developers.google.com/adwords/api/docs/guides/rate-limits)
across all threads in a single JVM. It tries to extract the instructions
(namely, `rateScope` and `retryAfterSeconds`) from
[`RateExceededError`](https://developers.google.com/adwords/api/docs/common-errors#RateExceededError.RATE_EXCEEDED),
and employs a simple wait-and-retry strategy.

## Features

*   Distributed via [Maven](https://maven.apache.org/).
*   Uses [SLF4J](https://www.slf4j.org/) logging facade, allowing you to plug in
    a concrete logging framework of your choice.
*   Automatic handling of rate limit errors for single process applications.
*   Client library SOAP toolkit (Axis, JAX-WS) agnostic and version agnostic
    (best to use with v201702 onwards).

## Requirements

*   Java 1.7+
*   Maven 3.0+ not required, but recommended

## Announcements and updates

For API and client library extensions updates and news, please follow our
[Google+ Ads Developers page](https://plus.google.com/+GoogleAdsDevelopers/posts)
and our [Google Ads Developers blog](http://googleadsdeveloper.blogspot.com/).

### Support forum

If you have questions about the client library extensions, you can ask them in
the [issue tracker](https://github.com/googleads/googleads-java-lib/issues).

## Maven artifact

```
    <dependency>
      <groupId>com.google.api-ads</groupId>
      <artifactId>adwords-extension-ratelimiter</artifactId>
      <version>0.1.1</version>
    </dependency>
```

## Getting started

1.  Include this extension as a dependency (see its maven artifact above) in
    your Java project's `pom.xml` file.

1.  Make proper configuration

    *   Check the sample `log4j.properties` file, and copy / modify the
        `log4j.appender.RATELIMITER_LOG` settings into the project's log
        configuration file.

    *   **Optional:** Before invoking this extension, set proper system
        properties if you want to override the default values.

        *   For using AdWords API services (such as CampaignService):

            ```
            // Property for the maximum number of attempts on rate limit error.
            System.setProperty(ApiServicesRetryStrategy.MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY, "5");

            // Property for the maximum wait time (in seconds) before retrying on rate limit error.
            System.setProperty(ApiServicesRetryStrategy.MAX_WAIT_TIME_ON_RATE_EXCEEDED_ERROR_PROPERTY, "86400");
            ```

        *   For using AdWords API reporting (such as ReportDownloader):

            ```
            // Property for the maximum number of attempts on rate limit error.
            System.setProperty(ApiReportingRetryStrategy.MAX_ATTEMPTS_ON_RATE_EXCEEDED_ERROR_PROPERTY, "3");

            // Property for the exponential backoff interval (in milliseconds) before retrying on rate limit error.
            System.setProperty(ApiReportingRetryStrategy.BACKOFF_INTERVAL_ON_RATE_EXCEEDED_ERROR_PROPERTY, "5000");
            ```

1.  You are ready to use this extension now!

## Basic usage

The following example applies for both Axis and JAX-WS SOAP-toolkits.

```java
import com.google.api.ads.adwords.extension.ratelimiter.AdWordsServicesWithRateLimiter;

// AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();
// Just replacce the previous line with this one:
AdWordsServicesInterface adWordsServices = new AdWordsServicesWithRateLimiter(AdWordsServices.getInstance());

// Then use this AdWordsServicesWithRateLimiter object like a normal AdWordsServices object, and it would automatically handle rate limit errors!
CampaignServiceInterface campaignService = adWordsServices.get(session, CampaignServiceInterface.class);
// Invoke API calls with the "campaignService" object.

ReportDownloaderInterface reportDownloader = adWordsServices.getUtility(session, ReportDownloaderInterface.class);
// Invoke API calls with the "reportDownloader" object.
```
