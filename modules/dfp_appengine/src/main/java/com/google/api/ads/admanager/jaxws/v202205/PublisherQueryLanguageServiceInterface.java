// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202205;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for executing a PQL {@link Statement} to retrieve information from the system.
 *       In order to support the selection of columns of interest from various tables, {@link Statement}
 *       objects support a "select" clause.
 *       
 *       <p>An example query text might be {@code "select CountryCode, Name from Geo_Target"}, where
 *       {@code CountryCode} and {@code Name} are columns of interest and {@code Geo_Target} is the table.
 *       </p>
 *       
 *       <p>The following tables are supported: </p>
 *       
 *       
 *       <h2>Geo_Target</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the Geo target</td>
 *       </tr>
 *       <tr>
 *       <td>Name</td>
 *       <td>The name of the Geo target</td>
 *       </tr>
 *       <tr>
 *       <td>CanonicalParentId</td>
 *       <td>The criteria ID of the direct parent that defines the canonical name of the geo target.
 *       For example, if the current geo target is "San Francisco", its canonical name would be
 *       "San Francisco, California, United States" thus the canonicalParentId would be the criteria ID
 *       of California and the canonicalParentId of California would be the criteria ID of United states
 *       </td>
 *       </tr>
 *       <tr>
 *       <td>ParentIds</td>
 *       <td>A comma separated list of criteria IDs of all parents of the geo target ordered by ascending
 *       size</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>Type</td>
 *       <td>Allowable values:
 *       <ul>
 *       <li>Airport</li>
 *       <li>Autonomous_Community</li>
 *       <li>Canton</li>
 *       <li>City</li>
 *       <li>Congressional_District</li>
 *       <li>Country</li>
 *       <li>County</li>
 *       <li>Department</li>
 *       <li>DMA_Region</li>
 *       <li>Governorate</li>
 *       <li>Municipality</li>
 *       <li>Neighborhood</li>
 *       <li>Postal_Code</li>
 *       <li>Prefecture</li>
 *       <li>Province</li>
 *       <li>Region</li>
 *       <li>State</li>
 *       <li>Territory</li>
 *       <li>Tv_Region</li>
 *       <li>Union_Territory</li>
 *       </ul>
 *       </td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Bandwidth_Group</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the bandwidth group</td>
 *       </tr>
 *       <tr>
 *       <td>BandwidthName</td>
 *       <td>Name of the bandwidth group</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Browser</h2>
 *       
 *       <p>Note: this table only contains browsers that are available in the Ad Manager UI targeting
 *       picker.</p>
 *       
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the browser</td>
 *       </tr>
 *       <tr>
 *       <td>BrowserName</td>
 *       <td>Name of the browser</td>
 *       </tr>
 *       <tr>
 *       <td>MajorVersion</td>
 *       <td>Major version of the browser</td>
 *       </tr>
 *       <tr>
 *       <td>MinorVersion</td>
 *       <td>Minor version of the browser</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Browser_Language</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the browser language</td>
 *       </tr>
 *       <tr>
 *       <td>BrowserLanguageName</td>
 *       <td>Browser's language</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Device_Capability</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the device capability</td>
 *       </tr>
 *       <tr>
 *       <td>DeviceCapabilityName</td>
 *       <td>Name of the device capability</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Device_Category</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the device category</td>
 *       </tr>
 *       <tr>
 *       <td>DeviceCategoryName</td>
 *       <td>Name of the device category</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Device_Manufacturer</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the device manufacturer</td>
 *       </tr>
 *       <tr>
 *       <td>MobileDeviceManufacturerName</td>
 *       <td>Name of the device manufacturer</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Mobile_Carrier</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the mobile carrier</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>The country code of the mobile carrier</td>
 *       </tr>
 *       <tr>
 *       <td>MobileCarrierName</td>
 *       <td>Name of the mobile carrier</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Mobile_Device</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the mobile device</td>
 *       </tr>
 *       <tr>
 *       <td>MobileDeviceManufacturerId</td>
 *       <td>Id of the device manufacturer</td>
 *       </tr>
 *       <tr>
 *       <td>MobileDeviceName</td>
 *       <td>Name of the mobile device</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Mobile_Device_Submodel</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the mobile device submodel</td>
 *       </tr>
 *       <tr>
 *       <td>MobileDeviceId</td>
 *       <td>Id of the mobile device</td>
 *       </tr>
 *       <tr>
 *       <td>MobileDeviceSubmodelName</td>
 *       <td>Name of the mobile device submodel</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Operating_System</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the operating system</td>
 *       </tr>
 *       <tr>
 *       <td>OperatingSystemName</td>
 *       <td>Name of the operating system</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Operating_System_Version</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the operating system version</td>
 *       </tr>
 *       <tr>
 *       <td>OperatingSystemId</td>
 *       <td>Id of the operating system</td>
 *       </tr>
 *       <tr>
 *       <td>MajorVersion</td>
 *       <td>The operating system major version</td>
 *       </tr>
 *       <tr>
 *       <td>MinorVersion</td>
 *       <td>The operating system minor version</td>
 *       </tr>
 *       <tr>
 *       <td>MicroVersion</td>
 *       <td>The operating system micro version</td>
 *       </tr>
 *       </table>
 *       
 *       <h2>Third_Party_Company</h2>
 *       
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the third party company</td>
 *       </tr>
 *       <tr>
 *       <td>Name</td>
 *       <td>The third party company name</td>
 *       </tr>
 *       <tr>
 *       <td>Type</td>
 *       <td>The third party company type</td>
 *       </tr>
 *       <tr>
 *       <td>Status</td>
 *       <td>The status of the third party company</td>
 *       </tr>
 *       </table>
 *       <h2 id="Line_Item">Line_Item</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>CostType</td><td><code>Text</code></td><td>The method used for billing this {@code LineItem}.</td></tr><tr><td>CreationDateTime</td><td><code>Datetime</code></td><td>The date and time this {@code LineItem} was last created. This attribute may be null for  {@code LineItem}s created before this feature was introduced.</td></tr><tr><td>DeliveryRateType</td><td><code>Text</code></td><td>The strategy for delivering ads over the course of the {@code LineItem}&#39;s duration. This attribute is optional and defaults to {@link DeliveryRateType#EVENLY}. Starting in v201306, it may default to {@link DeliveryRateType#FRONTLOADED} if specifically configured to on the network.</td></tr><tr><td>EndDateTime</td><td><code>Datetime</code></td><td>The date and time on which the {@code LineItem} stops serving.</td></tr><tr><td>ExternalId</td><td><code>Text</code></td><td>An identifier for the {@code LineItem} that is meaningful to the publisher.</td></tr><tr><td>Id</td><td><code>Number</code></td><td>Uniquely identifies the {@code LineItem}. This attribute is read-only and is assigned by Google when a line item is created.</td></tr><tr><td>IsMissingCreatives</td><td><code>Boolean</code></td><td>Indicates if a {@code LineItem} is missing any {@link Creative creatives} for the {@code creativePlaceholders} specified.</td></tr><tr><td>IsSetTopBoxEnabled</td><td><code>Boolean</code></td><td>Whether or not this line item is set-top box enabled.</td></tr><tr><td>LastModifiedDateTime</td><td><code>Datetime</code></td><td>The date and time this {@code LineItem} was last modified.</td></tr><tr><td>LatestNielsenInTargetRatioMilliPercent</td><td><code>Number</code></td><td>The most recently computed in-target ratio measured from Nielsen reporting data and the {@code LineItem}&#39;s settings. It&#39;s provided in milli percent, or null if not applicable.</td></tr><tr><td>LineItemType</td><td><code>Text</code></td><td>Indicates the line item type of a {@code LineItem}.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the {@code LineItem}.</td></tr><tr><td>OrderId</td><td><code>Number</code></td><td>The ID of the {@link Order} to which the {@code LineItem} belongs.</td></tr><tr><td>StartDateTime</td><td><code>Datetime</code></td><td>The date and time on which the {@code LineItem} is enabled to begin serving.</td></tr><tr><td>Status</td><td><code>Text</code></td><td>The status of the {@code LineItem}.</td></tr><tr><td>Targeting</td><td><code>Targeting</code></td><td>The targeting criteria for the ad campaign.</td></tr><tr><td>UnitsBought</td><td><code>Number</code></td><td>The total number of impressions or clicks that will be reserved for the {@code LineItem}. If the line item is of type {@link LineItemType#SPONSORSHIP}, then it represents the percentage of available impressions reserved.</td></tr></table><h2 id="Ad_Unit">Ad_Unit</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>AdUnitCode</td><td><code>Text</code></td><td>A string used to uniquely identify the ad unit for the purposes of serving the ad. This attribute is read-only and is assigned by Google when an ad unit is created.</td></tr><tr><td>ExternalSetTopBoxChannelId</td><td><code>Text</code></td><td>The channel ID for set-top box enabled {@link AdUnit ad units}.</td></tr><tr><td>Id</td><td><code>Number</code></td><td>Uniquely identifies the ad unit. This value is read-only and is assigned by Google when an ad unit is created.</td></tr><tr><td>LastModifiedDateTime</td><td><code>Datetime</code></td><td>The date and time this ad unit was last modified.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the ad unit.</td></tr><tr><td>ParentId</td><td><code>Number</code></td><td>The ID of the ad unit&#39;s parent. Every ad unit has a parent except for the root ad unit, which is created by Google.</td></tr></table><h2 id="User">User</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>Email</td><td><code>Text</code></td><td>The email or login of the user.</td></tr><tr><td>ExternalId</td><td><code>Text</code></td><td>An identifier for the user that is meaningful to the publisher.</td></tr><tr><td>Id</td><td><code>Number</code></td><td>The unique ID of the user.</td></tr><tr><td>IsServiceAccount</td><td><code>Boolean</code></td><td>True if this user is an OAuth2 service account user, false otherwise.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the user.</td></tr><tr><td>RoleId</td><td><code>Number</code></td><td>The unique role ID of the user. {@link Role} objects that are created by Google will have negative IDs.</td></tr><tr><td>RoleName</td><td><code>Text</code></td><td>The name of the {@link Role} assigned to the user.</td></tr></table><h2 id="Programmatic_Buyer">Programmatic_Buyer</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>BuyerAccountId</td><td><code>Number</code></td><td>The ID used by Authorized Buyers to bill the appropriate buyer network for a programmatic order.</td></tr><tr><td>EnabledForPreferredDeals</td><td><code>Boolean</code></td><td>Whether the buyer is allowed to negotiate Preferred Deals.</td></tr><tr><td>EnabledForProgrammaticGuaranteed</td><td><code>Boolean</code></td><td>Whether the buyer is enabled for Programmatic Guaranteed deals.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>Display name that references the buyer.</td></tr><tr><td>ParentId</td><td><code>Number</code></td><td>The ID of the programmatic buyer&#39;s sponsor. If the programmatic buyer has no sponsor, this field will be -1.</td></tr><tr><td>PartnerClientId</td><td><code>Text</code></td><td>ID used to represent Display &amp; Video 360 client buyer partner ID (if Display &amp; Video 360) or Authorized Buyers client buyer account ID.</td></tr></table><h2 id="Audience_Segment_Category">Audience_Segment_Category</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>Id</td><td><code>Number</code></td><td>The unique identifier for the audience segment category.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the audience segment category.</td></tr><tr><td>ParentId</td><td><code>Number</code></td><td>The unique identifier of the audience segment category&#39;s parent.</td></tr></table><h2 id="Audience_Segment">Audience_Segment</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>AdIdSize</td><td><code>Number</code></td><td>The number of AdID users in the segment.</td></tr><tr><td>CategoryIds</td><td><code>Set of number</code></td><td>The ids of the categories that this audience segment belongs to.</td></tr><tr><td>Id</td><td><code>Number</code></td><td>The unique identifier for the audience segment.</td></tr><tr><td>IdfaSize</td><td><code>Number</code></td><td>The number of IDFA users in the segment.</td></tr><tr><td>MobileWebSize</td><td><code>Number</code></td><td>The number of mobile web users in the segment.</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the audience segment.</td></tr><tr><td>OwnerAccountId</td><td><code>Number</code></td><td>The owner account id of the audience segment.</td></tr><tr><td>OwnerName</td><td><code>Text</code></td><td>The owner name of the audience segment.</td></tr><tr><td>PpidSize</td><td><code>Number</code></td><td>The number of PPID users in the segment.</td></tr><tr><td>SegmentType</td><td><code>Text</code></td><td>The type of the audience segment.</td></tr></table><h2 id="Time_Zone">Time_Zone</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>Id</td><td><code>Text</code></td><td>The id of time zone in the form of {@code America/New_York}.</td></tr><tr><td>StandardGmtOffset</td><td><code>Text</code></td><td>The standard GMT offset in current time in the form of {@code GMT-05:00} for {@code America/New_York}, excluding the Daylight Saving Time.</td></tr></table><h2 id="Proposal_Terms_And_Conditions">Proposal_Terms_And_Conditions</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr></table><h2 id="Change_History">Change_History</h2>Restrictions: Only ordering by {@code ChangeDateTime} descending is supported. The {@code IN} operator is only supported on the {@code entityType} column. {@code OFFSET} is not supported. To page through results, filter on the earliest change {@code Id} as a continuation token. For example {@code &quot;WHERE Id &lt; :id&quot;}. On each query, both an upper bound and a lower bound for the {@code ChangeDateTime} are required.<table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>ChangeDateTime</td><td><code>Datetime</code></td><td>The date and time this change happened.</td></tr><tr><td>EntityId</td><td><code>Number</code></td><td>The ID of the entity that was changed.</td></tr><tr><td>EntityType</td><td><code>Text</code></td><td>The {@link ChangeHistoryEntityType type} of the entity that was changed.</td></tr><tr><td>Id</td><td><code>Text</code></td><td>The ID of this change. IDs may only be used with {@code &quot;&lt;&quot;} operator for paging and are subject to change. Do not store IDs. Note that the {@code &quot;&lt;&quot;} here does not compare the value of the ID but the row in the change history table it represents.</td></tr><tr><td>Operation</td><td><code>Text</code></td><td>The {@link ChangeHistoryOperation operation} that was performed on this entity.</td></tr><tr><td>UserId</td><td><code>Number</code></td><td>The {@link User#id ID} of the user that made this change.</td></tr></table><h2 id="ad_category">ad_category</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>ChildIds</td><td><code>Set of number</code></td><td>Child IDs of an Ad category. Only general categories have children</td></tr><tr><td>Id</td><td><code>Number</code></td><td>ID of an Ad category</td></tr><tr><td>Name</td><td><code>Text</code></td><td>Localized name of an Ad category</td></tr><tr><td>ParentId</td><td><code>Number</code></td><td>Parent ID of an Ad category. Only general categories have parents</td></tr><tr><td>Type</td><td><code>Text</code></td><td>Type of an Ad category. Only general categories have children</td></tr></table><h2 id="rich_media_ad_company">rich_media_ad_company</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>CompanyGvlId</td><td><code>Number</code></td><td>IAB Global Vendor List ID of a Rich Media Ad Company</td></tr><tr><td>GdprStatus</td><td><code>Text</code></td><td>GDPR compliance status of a Rich Media Ad Company.  Indicates whether the company has been registered with Google as a compliant company for GDPR.</td></tr><tr><td>Id</td><td><code>Number</code></td><td>ID of a Rich Media Ad Company</td></tr><tr><td>Name</td><td><code>Text</code></td><td>Name of a Rich Media Ad Company</td></tr><tr><td>PolicyUrl</td><td><code>Text</code></td><td>Policy URL of a Rich Media Ad Company</td></tr></table><h2 id="mcm_earnings">mcm_earnings</h2>Restriction: On each query, an expression scoping the MCM earnings to a single month is required (e.x. &quot;WHERE month = &#39;2020-01&#39;&quot; or &quot;WHERE month IN (&#39;2020-01&#39;)&quot;).<table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>ChildName</td><td><code>Text</code></td><td>The name of the child publisher.</td></tr><tr><td>ChildNetworkCode</td><td><code>Text</code></td><td>The network code of the child publisher.</td></tr><tr><td>ChildPaymentCurrencyCode</td><td><code>Text</code></td><td>The child payment currency code as defined by ISO 4217.</td></tr><tr><td>ChildPaymentMicros</td><td><code>Number</code></td><td>The portion of the total earnings paid to the child publisher in micro units of the {@link ChildPaymentCurrencyCode}</td></tr><tr><td>DeductionsCurrencyCode</td><td><code>Text</code></td><td>The deductions currency code as defined by ISO 4217. Null for earnings prior to August 2020.</td></tr><tr><td>DeductionsMicros</td><td><code>Number</code></td><td>The deductions for the month due to spam in micro units of the {@code DeductionsCurrencyCode}. Null for earnings prior to August 2020.</td></tr><tr><td>DelegationType</td><td><code>Text</code></td><td>The current type of MCM delegation between the parent and child publisher.</td></tr><tr><td>Month</td><td><code>Date</code></td><td>The year and month that the MCM earnings data applies to. The date will be specified as the first of the month.</td></tr><tr><td>ParentName</td><td><code>Text</code></td><td>The name of the parent publisher.</td></tr><tr><td>ParentNetworkCode</td><td><code>Text</code></td><td>The network code of the parent publisher.</td></tr><tr><td>ParentPaymentCurrencyCode</td><td><code>Text</code></td><td>The parent payment currency code as defined by ISO 4217.</td></tr><tr><td>ParentPaymentMicros</td><td><code>Number</code></td><td>The portion of the total earnings paid to the parent publisher in micro units of the {@link code ParentPaymentCurrencyCode}.</td></tr><tr><td>TotalEarningsCurrencyCode</td><td><code>Text</code></td><td>The total earnings currency code as defined by ISO 4217.</td></tr><tr><td>TotalEarningsMicros</td><td><code>Number</code></td><td>The total earnings for the month in micro units of the {@code TotalEarningsCurrencyCode}.</td></tr></table><h2 id="Linked_Device">Linked_Device</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>Id</td><td><code>Number</code></td><td>The ID of the LinkedDevice</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the LinkedDevice</td></tr><tr><td>UserId</td><td><code>Number</code></td><td>The ID of the user that this device belongs to.</td></tr><tr><td>Visibility</td><td><code>Text</code></td><td>The visibility of the LinkedDevice.</td></tr></table><h2 id="child_publisher">child_publisher</h2><table><tr><th>Column name</th><th>Type</th><th>Description</th></tr><tr><td>AccountStatus</td><td><code>Text</code></td><td>The account status of the MCM child publisher&#39;s Ad Manager network</td></tr><tr><td>AgreementStatus</td><td><code>Text</code></td><td>Status of the delegation relationship between parent and child.</td></tr><tr><td>ApprovedManageAccountRevshareMillipercent</td><td><code>Number</code></td><td>The approved revshare with the MCM child publisher</td></tr><tr><td>ChildNetworkAdExchangeEnabled</td><td><code>Boolean</code></td><td>Whether the child publisher&#39;s Ad Manager network has Ad Exchange enabled</td></tr><tr><td>ChildNetworkCode</td><td><code>Text</code></td><td>The network code of the MCM child publisher</td></tr><tr><td>DelegationType</td><td><code>Text</code></td><td>The delegation type of the MCM child publisher.  This will be the approved type if the child has accepted the relationship, and the proposed type otherwise.</td></tr><tr><td>Email</td><td><code>Text</code></td><td>The email of the MCM child publisher</td></tr><tr><td>Id</td><td><code>Number</code></td><td>The ID of the MCM child publisher</td></tr><tr><td>Name</td><td><code>Text</code></td><td>The name of the MCM child publisher</td></tr><tr><td>OnboardingTasks</td><td><code>Set of text</code></td><td>The child publisher&#39;s pending onboarding tasks. This will only be populated if the child publisher&#39;s {@code AccountStatus} is {@code PENDING_GOOGLE_APPROVAL}.</td></tr><tr><td>SellerId</td><td><code>Text</code></td><td>The child publisher&#39;s seller ID, as specified in the parent publisher&#39;s sellers.json file. This field is only relevant for Manage Inventory child publishers.</td></tr></table>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PublisherQueryLanguageServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublisherQueryLanguageServiceInterface {


    /**
     * 
     *         Retrieves rows of data that satisfy the given {@link Statement#query} from
     *         the system.
     *         
     *         @param selectStatement a Publisher Query Language statement used to
     *         specify what data needs to returned
     *         
     *         @return a result set of data that matches the given filter
     *       
     * 
     * @param selectStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202205.ResultSet
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
    @RequestWrapper(localName = "select", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.PublisherQueryLanguageServiceInterfaceselect")
    @ResponseWrapper(localName = "selectResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205", className = "com.google.api.ads.admanager.jaxws.v202205.PublisherQueryLanguageServiceInterfaceselectResponse")
    public ResultSet select(
        @WebParam(name = "selectStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202205")
        Statement selectStatement)
        throws ApiException_Exception
    ;

}
