/**
 * ReportDefinitionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public interface ReportDefinitionServiceInterface extends java.rmi.Remote {

    /**
     * Returns the available report fields for a given report type.
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
    public com.google.api.ads.adwords.axis.v201409.cm.ReportDefinitionField[] getReportFields(com.google.api.ads.adwords.axis.v201409.cm.ReportDefinitionReportType reportType) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201409.cm.ApiException;
}
