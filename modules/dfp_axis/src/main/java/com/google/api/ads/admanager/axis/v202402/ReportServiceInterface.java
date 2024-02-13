// Copyright 2024 Google LLC
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

package com.google.api.ads.admanager.axis.v202402;

public interface ReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the URL at which the report file can be downloaded.
     * 
     *         <p>The report will be generated as a gzip archive, containing
     * the report file itself.
     */
    public java.lang.String getReportDownloadURL(java.lang.Long reportJobId, com.google.api.ads.admanager.axis.v202402.ExportFormat exportFormat) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Returns the URL at which the report file can be downloaded,
     * and allows for customization of the
     *         downloaded report.
     *         
     *         <p>By default, the report will be generated as a gzip archive,
     * containing the report file
     *         itself. This can be changed by setting {@link ReportDownloadOptions#useGzipCompression}
     * to
     *         false.
     */
    public java.lang.String getReportDownloadUrlWithOptions(java.lang.Long reportJobId, com.google.api.ads.admanager.axis.v202402.ReportDownloadOptions reportDownloadOptions) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Returns the {@link ReportJobStatus} of the report job with
     * the specified ID.
     */
    public com.google.api.ads.admanager.axis.v202402.ReportJobStatus getReportJobStatus(java.lang.Long reportJobId) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Retrieves a page of the saved queries either created by or
     * shared with the current user. Each
     *         {@link SavedQuery} in the page, if it is compatible with the
     * current API version, will contain
     *         a {@link ReportQuery} object which can be optionally modified
     * and used to create a {@link
     *         ReportJob}. This can then be passed to {@link ReportService#runReportJob}.
     * The following fields
     *         are supported for filtering:
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
     */
    public com.google.api.ads.admanager.axis.v202402.SavedQueryPage getSavedQueriesByStatement(com.google.api.ads.admanager.axis.v202402.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;

    /**
     * Initiates the execution of a {@link ReportQuery} on the server.
     * 
     *         <p>The following fields are required:
     *         
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}
     *         </ul>
     */
    public com.google.api.ads.admanager.axis.v202402.ReportJob runReportJob(com.google.api.ads.admanager.axis.v202402.ReportJob reportJob) throws java.rmi.RemoteException, com.google.api.ads.admanager.axis.v202402.ApiException;
}
