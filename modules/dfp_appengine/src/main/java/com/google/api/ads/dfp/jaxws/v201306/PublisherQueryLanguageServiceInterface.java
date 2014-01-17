
package com.google.api.ads.dfp.jaxws.v201306;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for executing a PQL {@link Statement} to retrieve
 *       information from the system. In order to support the selection of columns of
 *       interest from various tables, {@link Statement} objects support a "select"
 *       clause.
 *       <p>
 *       An example query text might be {@code "select CountryCode, Name from
 *       Geo_Target"}, where {@code CountryCode} and {@code Name} are
 *       columns of interest and {@code Geo_Target} is the table.
 *       </p>
 *       <p>
 *       The following tables are supported:
 *       </p>
 *       
 *       <h4>Geo_Target</h4>
 *       <p>Use this table instead of the other Geo tables below (Country, Region, Metro, City,
 *       Postal_Code) which will eventually be removed.</p>
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
 *       <h4>Country</h4>
 *       Deprecated. Use <strong>Geo_Target</strong> instead.
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the country</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>CountryName</td>
 *       <td>The name of the country</td>
 *       </tr>
 *       <tr>
 *       <td>CurrencyCode</td>
 *       <td>Currency code as defined by ISO 4217</td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h4>Region</h4>
 *       Deprecated. Use <strong>Geo_Target</strong> instead.
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the region</td>
 *       </tr>
 *       <tr>
 *       <td>RegionCode</td>
 *       <td>Region code as defined by ISO 3166-2</td>
 *       </tr>
 *       <tr>
 *       <td>RegionName</td>
 *       <td>The name of the region</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>CountryName</td>
 *       <td>The name of the country</td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h4>Metro</h4>
 *       Deprecated. Use <strong>Geo_Target</strong> instead.
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the metro</td>
 *       </tr>
 *       <tr>
 *       <td>MetroCode</td>
 *       <td>3 digit metro code required for metro targeting</td>
 *       </tr>
 *       <tr>
 *       <td>MetroName</td>
 *       <td>The name of the metro</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>CountryName</td>
 *       <td>The name of the country</td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h4>City</h4>
 *       Deprecated. Use <strong>Geo_Target</strong> instead.
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the city</td>
 *       </tr>
 *       <tr>
 *       <td>CityName</td>
 *       <td>The city name</td>
 *       </tr>
 *       <tr>
 *       <td>MetroCode</td>
 *       <td>3 digit metro code that the city belongs to</td>
 *       </tr>
 *       <tr>
 *       <td>MetroName</td>
 *       <td>The name of the metro</td>
 *       </tr>
 *       <tr>
 *       <td>RegionCode</td>
 *       <td>Region code as defined by ISO 3166-2</td>
 *       </tr>
 *       <tr>
 *       <td>RegionName</td>
 *       <td>The name of the region</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>CountryName</td>
 *       <td>The name of the country</td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h4>Postal_Code</h4>
 *       Deprecated. Use <strong>Geo_Target</strong> instead.
 *       <table>
 *       <tr>
 *       <th scope = "col">Column Name</th>
 *       <th scope = "col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the postal code</td>
 *       </tr>
 *       <tr>
 *       <td>PostalCode</td>
 *       <td>Postal code</td>
 *       </tr>
 *       <tr>
 *       <td>CountryCode</td>
 *       <td>Country code as defined by ISO 3166-1 alpha-2</td>
 *       </tr>
 *       <tr>
 *       <td>Targetable</td>
 *       <td>Indicates whether geographical targeting is allowed</td>
 *       </tr>
 *       </table>
 *       
 *       <h4>Bandwidth_Group</h4>
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
 *       <h4>Browser</h4>
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
 *       <h4>Browser_Language</h4>
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
 *       <h4>Device_Capability</h4>
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
 *       <h4>Device_Category</h4>
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
 *       <h4>Device_Manufacturer</h4>
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
 *       <h4>Mobile_Carrier</h4>
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
 *       <h4>Mobile_Device</h4>
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
 *       <h4>Mobile_Device_Submodel</h4>
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
 *       <h4>Operating_System</h4>
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
 *       <h4>Operating_System_Version</h4>
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
 *       <h4>Third_Party_Company</h4>
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
 *       
 *       <h4>Time_Zone</h4>
 *       <table>
 *       <tr>
 *       <th scope="col">Column Name</th>
 *       <th scope="col">Description</th>
 *       </tr>
 *       <tr>
 *       <td>Id</td>
 *       <td>Unique identifier for the time zone in the form of {@code America/New_York}</td>
 *       </tr>
 *       <tr>
 *       <td>StandardGmtOffset</td>
 *       <td>The standard GMT offset of the time zone in the form of {@code GMT-05:00} for
 *       {@code America/New_York}</td>
 *       </tr>
 *       <tr>
 *       <td>SupportedInReports</td>
 *       <td>Indicates whether the time zone is supported in reports. Only time zones that are full hour
 *       offsets from {@link Network#timeZone} are supported in reports.</td>
 *       </tr>
 *       </table>
 *       <h4 id="Line_Item">Line_Item</h4>
 * <table>
 * <tr><th scope="col">Column name</th><th scope="col">Type</th><th scope="col">Description</th></tr>
 * <tr><td>CostType</td><td><code>Text</code></td><td>The method used for billing this {@code LineItem}.</td></tr>
 * <tr><td>CreationDateTime</td><td><code>Datetime</code></td><td>The date and time this {@code LineItem} was last created. This attribute may be null for  {@code LineItem}s created before this feature was introduced.</td></tr>
 * <tr><td>DeliveryRateType</td><td><code>Text</code></td><td>The strategy for delivering ads over the course of the {@code LineItem}'s duration. This attribute is optional and defaults to {@link DeliveryRateType#EVENLY}. Starting in v201306, it may default to {@link DeliveryRateType#FRONTLOADED} if specifically configured to on the network.</td></tr>
 * <tr><td>EndDateTime</td><td><code>Datetime</code></td><td>The date and time on which the {@code LineItem} stops serving.</td></tr>
 * <tr><td>Id</td><td><code>Number</code></td><td>Uniquely identifies the {@code LineItem}. This attribute is read-only and is assigned by Google when a line item is created.</td></tr>
 * <tr><td>IsMissingCreatives</td><td><code>Boolean</code></td><td>Indicates if a {@code LineItem} is missing any {@link Creative creatives} for the {@code creativePlaceholders} specified.</td></tr>
 * <tr><td>LastModifiedDateTime</td><td><code>Datetime</code></td><td>The date and time this {@code LineItem} was last modified.</td></tr>
 * <tr><td>LineItemType</td><td><code>Text</code></td><td>Indicates the line item type of a {@code LineItem}.</td></tr>
 * <tr><td>Name</td><td><code>Text</code></td><td>The name of the {@code LineItem}.</td></tr>
 * <tr><td>OrderId</td><td><code>Number</code></td><td>The ID of the {@link Order} to which the {@code LineItem} belongs.</td></tr>
 * <tr><td>StartDateTime</td><td><code>Datetime</code></td><td>The date and time on which the {@code LineItem} is enabled to begin serving.</td></tr>
 * <tr><td>Status</td><td><code>Text</code></td><td>The status of the {@code LineItem}.</td></tr>
 * <tr><td>UnitsBought</td><td><code>Number</code></td><td>The total number of impressions or clicks that will be reserved for the {@code LineItem}. If the line item is of type {@link LineItemType#SPONSORSHIP}, then it represents the percentage of available impressions reserved.</td></tr>
 * </table>
 * <h4 id="Ad_Unit">Ad_Unit</h4>
 * <table>
 * <tr><th scope="col">Column name</th><th scope="col">Type</th><th scope="col">Description</th></tr>
 * <tr><td>AdUnitCode</td><td><code>Text</code></td><td>A string used to uniquely identify the ad unit for the purposes of serving the ad. This attribute is read-only and is assigned by Google when an ad unit is created.</td></tr>
 * <tr><td>Id</td><td><code>Number</code></td><td>Uniquely identifies the ad unit. This value is read-only and is assigned by Google when an ad unit is created.</td></tr>
 * <tr><td>LastModifiedDateTime</td><td><code>Datetime</code></td><td>The date and time this ad unit was last modified.</td></tr>
 * <tr><td>Name</td><td><code>Text</code></td><td>The name of the ad unit.</td></tr>
 * <tr><td>ParentId</td><td><code>Number</code></td><td>The ID of the ad unit's parent. Every ad unit has a parent except for the root ad unit, which is created by Google.</td></tr>
 * <tr><td>PartnerId</td><td><code>Number</code></td><td>The unique ID of the {@link Company}, which is of type {@link Company.Type#AFFILIATE_DISTRIBUTION_PARTNER}, to which this ad unit belongs.</td></tr>
 * </table>
 * <h4 id="User">User</h4>
 * <table>
 * <tr><th scope="col">Column name</th><th scope="col">Type</th><th scope="col">Description</th></tr>
 * <tr><td>Email</td><td><code>Text</code></td><td>The email or login of the user.</td></tr>
 * <tr><td>ExternalId</td><td><code>Text</code></td><td>An identifier for the user that is meaningful to the publisher.</td></tr>
 * <tr><td>Id</td><td><code>Number</code></td><td>The unique ID of the user.</td></tr>
 * <tr><td>Name</td><td><code>Text</code></td><td>The name of the user.</td></tr>
 * <tr><td>RoleId</td><td><code>Number</code></td><td>The unique role ID of the user. {@link Role} objects that are created by Google will have negative IDs.</td></tr>
 * <tr><td>RoleName</td><td><code>Text</code></td><td>The name of the {@link Role} assigned to the user.</td></tr>
 * </table>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PublisherQueryLanguageServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306")
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
     *     returns com.google.api.ads.dfp.jaxws.v201306.ResultSet
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306")
    @RequestWrapper(localName = "select", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306", className = "com.google.api.ads.dfp.jaxws.v201306.PublisherQueryLanguageServiceInterfaceselect")
    @ResponseWrapper(localName = "selectResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306", className = "com.google.api.ads.dfp.jaxws.v201306.PublisherQueryLanguageServiceInterfaceselectResponse")
    public ResultSet select(
        @WebParam(name = "selectStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201306")
        Statement selectStatement)
        throws ApiException_Exception
    ;

}
