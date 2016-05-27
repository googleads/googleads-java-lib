/**
 * ReportDefinitionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

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
    public com.google.api.ads.adwords.axis.v201601.cm.ReportDefinitionField[] getReportFields(com.google.api.ads.adwords.axis.v201601.cm.ReportDefinitionReportType reportType) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;
}
