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
 * ReportDownloadOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents the options for an API report download request.
 *             See {@link ReportService#getReportDownloadUrlWithOptions}.
 */
public class ReportDownloadOptions  implements java.io.Serializable {
    /* The {@link ExportFormat} used to generate the report.
     *                 Default value is {@link ExportFormat#CSV_DUMP}. */
    private com.google.api.ads.dfp.axis.v201802.ExportFormat exportFormat;

    /* Whether or not to include the report properties (e.g. network,
     * user, date generated...)
     *                 in the generated report.
     *                 Default is false. */
    private java.lang.Boolean includeReportProperties;

    /* Whether or not to include the totals row.
     *                 Default is true for all formats except {@link ExportFormat#CSV_DUMP}. */
    private java.lang.Boolean includeTotalsRow;

    /* Whether or not to compress the report file to a gzip file.
     *                 Default is true.
     *                 <p>
     *                 Regardless of value, gzip http compression is available
     * from the URL by normal means. */
    private java.lang.Boolean useGzipCompression;

    public ReportDownloadOptions() {
    }

    public ReportDownloadOptions(
           com.google.api.ads.dfp.axis.v201802.ExportFormat exportFormat,
           java.lang.Boolean includeReportProperties,
           java.lang.Boolean includeTotalsRow,
           java.lang.Boolean useGzipCompression) {
           this.exportFormat = exportFormat;
           this.includeReportProperties = includeReportProperties;
           this.includeTotalsRow = includeTotalsRow;
           this.useGzipCompression = useGzipCompression;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("exportFormat", getExportFormat())
            .add("includeReportProperties", getIncludeReportProperties())
            .add("includeTotalsRow", getIncludeTotalsRow())
            .add("useGzipCompression", getUseGzipCompression())
            .toString();
    }

    /**
     * Gets the exportFormat value for this ReportDownloadOptions.
     * 
     * @return exportFormat   * The {@link ExportFormat} used to generate the report.
     *                 Default value is {@link ExportFormat#CSV_DUMP}.
     */
    public com.google.api.ads.dfp.axis.v201802.ExportFormat getExportFormat() {
        return exportFormat;
    }


    /**
     * Sets the exportFormat value for this ReportDownloadOptions.
     * 
     * @param exportFormat   * The {@link ExportFormat} used to generate the report.
     *                 Default value is {@link ExportFormat#CSV_DUMP}.
     */
    public void setExportFormat(com.google.api.ads.dfp.axis.v201802.ExportFormat exportFormat) {
        this.exportFormat = exportFormat;
    }


    /**
     * Gets the includeReportProperties value for this ReportDownloadOptions.
     * 
     * @return includeReportProperties   * Whether or not to include the report properties (e.g. network,
     * user, date generated...)
     *                 in the generated report.
     *                 Default is false.
     */
    public java.lang.Boolean getIncludeReportProperties() {
        return includeReportProperties;
    }


    /**
     * Sets the includeReportProperties value for this ReportDownloadOptions.
     * 
     * @param includeReportProperties   * Whether or not to include the report properties (e.g. network,
     * user, date generated...)
     *                 in the generated report.
     *                 Default is false.
     */
    public void setIncludeReportProperties(java.lang.Boolean includeReportProperties) {
        this.includeReportProperties = includeReportProperties;
    }


    /**
     * Gets the includeTotalsRow value for this ReportDownloadOptions.
     * 
     * @return includeTotalsRow   * Whether or not to include the totals row.
     *                 Default is true for all formats except {@link ExportFormat#CSV_DUMP}.
     */
    public java.lang.Boolean getIncludeTotalsRow() {
        return includeTotalsRow;
    }


    /**
     * Sets the includeTotalsRow value for this ReportDownloadOptions.
     * 
     * @param includeTotalsRow   * Whether or not to include the totals row.
     *                 Default is true for all formats except {@link ExportFormat#CSV_DUMP}.
     */
    public void setIncludeTotalsRow(java.lang.Boolean includeTotalsRow) {
        this.includeTotalsRow = includeTotalsRow;
    }


    /**
     * Gets the useGzipCompression value for this ReportDownloadOptions.
     * 
     * @return useGzipCompression   * Whether or not to compress the report file to a gzip file.
     *                 Default is true.
     *                 <p>
     *                 Regardless of value, gzip http compression is available
     * from the URL by normal means.
     */
    public java.lang.Boolean getUseGzipCompression() {
        return useGzipCompression;
    }


    /**
     * Sets the useGzipCompression value for this ReportDownloadOptions.
     * 
     * @param useGzipCompression   * Whether or not to compress the report file to a gzip file.
     *                 Default is true.
     *                 <p>
     *                 Regardless of value, gzip http compression is available
     * from the URL by normal means.
     */
    public void setUseGzipCompression(java.lang.Boolean useGzipCompression) {
        this.useGzipCompression = useGzipCompression;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDownloadOptions)) return false;
        ReportDownloadOptions other = (ReportDownloadOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exportFormat==null && other.getExportFormat()==null) || 
             (this.exportFormat!=null &&
              this.exportFormat.equals(other.getExportFormat()))) &&
            ((this.includeReportProperties==null && other.getIncludeReportProperties()==null) || 
             (this.includeReportProperties!=null &&
              this.includeReportProperties.equals(other.getIncludeReportProperties()))) &&
            ((this.includeTotalsRow==null && other.getIncludeTotalsRow()==null) || 
             (this.includeTotalsRow!=null &&
              this.includeTotalsRow.equals(other.getIncludeTotalsRow()))) &&
            ((this.useGzipCompression==null && other.getUseGzipCompression()==null) || 
             (this.useGzipCompression!=null &&
              this.useGzipCompression.equals(other.getUseGzipCompression())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExportFormat() != null) {
            _hashCode += getExportFormat().hashCode();
        }
        if (getIncludeReportProperties() != null) {
            _hashCode += getIncludeReportProperties().hashCode();
        }
        if (getIncludeTotalsRow() != null) {
            _hashCode += getIncludeTotalsRow().hashCode();
        }
        if (getUseGzipCompression() != null) {
            _hashCode += getUseGzipCompression().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDownloadOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReportDownloadOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "exportFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ExportFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeReportProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "includeReportProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTotalsRow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "includeTotalsRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useGzipCompression");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "useGzipCompression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
