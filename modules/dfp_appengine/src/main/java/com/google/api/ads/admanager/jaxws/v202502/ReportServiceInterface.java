// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for executing a {@link ReportJob} and retrieving performance and statistics
 *       about ad campaigns, networks, inventory and sales.
 *       
 *       <p>Follow the steps outlined below:
 *       
 *       <p>
 *       
 *       <ul>
 *       <li>Create the {@code ReportJob} object by invoking {@link ReportService#runReportJob}.
 *       <li>Poll the report job status using {@link ReportService#getReportJobStatus}.
 *       <li>Continue to poll until the status is equal to {@link ReportJobStatus#COMPLETED} or {@link
 *       ReportJobStatus#FAILED}.
 *       <li>If successful, fetch the URL for downloading the report by invoking {@link
 *       ReportService#getReportDownloadURL}.
 *       </ul>
 *       
 *       <h4>Test network behavior</h4>
 *       
 *       <p>The networks created using {@link NetworkService#makeTestNetwork} are unable to provide
 *       reports that would be comparable to the production environment because reports require traffic
 *       history. In the test networks, reports will consistently return no data for all reports.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReportServiceInterface {


    /**
     * 
     *         Returns the URL at which the report file can be downloaded.
     *         
     *         <p>The report will be generated as a gzip archive, containing the report file itself.
     *       
     * 
     * @param reportJobId
     * @param exportFormat
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getReportDownloadURL", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportDownloadURL")
    @ResponseWrapper(localName = "getReportDownloadURLResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportDownloadURLResponse")
    public String getReportDownloadURL(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Long reportJobId,
        @WebParam(name = "exportFormat", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        ExportFormat exportFormat)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the URL at which the report file can be downloaded, and allows for customization of the
     *         downloaded report.
     *         
     *         <p>By default, the report will be generated as a gzip archive, containing the report file
     *         itself. This can be changed by setting {@link ReportDownloadOptions#useGzipCompression} to
     *         false.
     *       
     * 
     * @param reportDownloadOptions
     * @param reportJobId
     * @return
     *     returns java.lang.String
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getReportDownloadUrlWithOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportDownloadUrlWithOptions")
    @ResponseWrapper(localName = "getReportDownloadUrlWithOptionsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportDownloadUrlWithOptionsResponse")
    public String getReportDownloadUrlWithOptions(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Long reportJobId,
        @WebParam(name = "reportDownloadOptions", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        ReportDownloadOptions reportDownloadOptions)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link ReportJobStatus} of the report job with the specified ID.
     *       
     * 
     * @param reportJobId
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202502.ReportJobStatus
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getReportJobStatus", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportJobStatus")
    @ResponseWrapper(localName = "getReportJobStatusResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetReportJobStatusResponse")
    public ReportJobStatus getReportJobStatus(
        @WebParam(name = "reportJobId", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Long reportJobId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Retrieves a page of the saved queries either created by or shared with the current user. Each
     *         {@link SavedQuery} in the page, if it is compatible with the current API version, will contain
     *         a {@link ReportQuery} object which can be optionally modified and used to create a {@link
     *         ReportJob}. This can then be passed to {@link ReportService#runReportJob}. The following fields
     *         are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link SavedQuery#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link SavedQuery#name}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202502.SavedQueryPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getSavedQueriesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetSavedQueriesByStatement")
    @ResponseWrapper(localName = "getSavedQueriesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacegetSavedQueriesByStatementResponse")
    public SavedQueryPage getSavedQueriesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Initiates the execution of a {@link ReportQuery} on the server.
     *         
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}
     *         </ul>
     *       
     * 
     * @param reportJob
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202502.ReportJob
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "runReportJob", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacerunReportJob")
    @ResponseWrapper(localName = "runReportJobResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.ReportServiceInterfacerunReportJobResponse")
    public ReportJob runReportJob(
        @WebParam(name = "reportJob", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        ReportJob reportJob)
        throws ApiException_Exception
    ;

}
