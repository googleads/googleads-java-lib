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
 * ReportDefinitionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public interface ReportDefinitionServiceInterface extends java.rmi.Remote {

    /**
     * Returns the available report fields for a given report type.
     * When using this method the {@code clientCustomerId} header field is
     * optional. Callers are discouraged from setting the clientCustomerId
     * header field in calls to this method as its presence will trigger
     * an
     *         authorization error if the caller does not have access to
     * the customer
     *         with the included ID.
     *         
     *         
     * @param reportType The type of report.
     *         
     * @return The list of available report fields. Each
     *         {@link ReportDefinitionField} encapsulates the field name,
     * the
     *         field data type, and the enum values (if the field's type
     * is
     *         {@code enum}).
     *         
     * @throws ApiException if a problem occurred while fetching the
     *         ReportDefinitionField information.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ReportDefinitionField[] getReportFields(com.google.api.ads.adwords.axis.v201802.cm.ReportDefinitionReportType reportType) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
