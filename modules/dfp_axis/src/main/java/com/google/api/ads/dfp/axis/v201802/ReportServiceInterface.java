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

/**
 * ReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public interface ReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the URL at which the report file can be downloaded.
     * <p>
     *         The report will be generated as a gzip archive, containing
     * the report file itself.
     *         
     *         
     * @param reportJobId the ID of the {@link ReportJob}
     *         
     * @param exportFormat the {@link ExportFormat} for the report file
     *         
     * @return the URL for report file download
     */
    public java.lang.String getReportDownloadURL(java.lang.Long reportJobId, com.google.api.ads.dfp.axis.v201802.ExportFormat exportFormat) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Returns the URL at which the report file can be downloaded,
     * and allows for customization
     *         of the downloaded report.
     *         <p>
     *         By default, the report will be generated as a gzip archive,
     * containing the report file itself.
     *         This can be changed by setting {@link ReportDownloadOptions#useGzipCompression}
     * to false.
     *         
     *         
     * @param reportJobId the ID of the {@link ReportJob}
     *         
     * @param reportDownloadOptions the {@link ReportDownloadOptions} for
     * the request
     *         
     * @return the URL for report file download
     */
    public java.lang.String getReportDownloadUrlWithOptions(java.lang.Long reportJobId, com.google.api.ads.dfp.axis.v201802.ReportDownloadOptions reportDownloadOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Returns the {@link ReportJobStatus} of the report job with
     * the specified ID.
     */
    public com.google.api.ads.dfp.axis.v201802.ReportJobStatus getReportJobStatus(java.lang.Long reportJobId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Retrieves a page of the saved queries either created by or
     * shared with the current user. Each
     *         {@link SavedQuery} in the page, if it is compatible with the
     * current API version, will
     *         contain a {@link ReportQuery} object which can be optionally
     * modified and used to create a
     *         {@link ReportJob}. This can then be passed to {@link ReportService#runReportJob}.
     * The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
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
     * @param filterStatement a Publisher Query Language statement used to
     * filter which saved queries
     *         should be returned.
     *         
     * @return a {@link SavedQueryPage} that contains all {@link SavedQuery}
     * instances which satisfy
     *         the given statement.
     */
    public com.google.api.ads.dfp.axis.v201802.SavedQueryPage getSavedQueriesByStatement(com.google.api.ads.dfp.axis.v201802.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;

    /**
     * Initiates the execution of a {@link ReportQuery} on the server.
     * 
     *         <p>The following fields are required:
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}</li>
     *         </ul>
     *         
     *         
     * @param reportJob the report job to run
     *         
     * @return the report job with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201802.ReportJob runReportJob(com.google.api.ads.dfp.axis.v201802.ReportJob reportJob) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201802.ApiException;
}
