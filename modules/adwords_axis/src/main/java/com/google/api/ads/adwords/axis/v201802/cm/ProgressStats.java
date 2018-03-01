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
 * ProgressStats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Statistics on the progress of a {@code BatchJob}.
 */
public class ProgressStats  implements java.io.Serializable {
    /* The number of operations executed. */
    private java.lang.Long numOperationsExecuted;

    /* The number of operations succeeded. */
    private java.lang.Long numOperationsSucceeded;

    /* An estimate of the percent of this job that has been executed. */
    private java.lang.Integer estimatedPercentExecuted;

    /* The number of results written. */
    private java.lang.Long numResultsWritten;

    public ProgressStats() {
    }

    public ProgressStats(
           java.lang.Long numOperationsExecuted,
           java.lang.Long numOperationsSucceeded,
           java.lang.Integer estimatedPercentExecuted,
           java.lang.Long numResultsWritten) {
           this.numOperationsExecuted = numOperationsExecuted;
           this.numOperationsSucceeded = numOperationsSucceeded;
           this.estimatedPercentExecuted = estimatedPercentExecuted;
           this.numResultsWritten = numResultsWritten;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("estimatedPercentExecuted", getEstimatedPercentExecuted())
            .add("numOperationsExecuted", getNumOperationsExecuted())
            .add("numOperationsSucceeded", getNumOperationsSucceeded())
            .add("numResultsWritten", getNumResultsWritten())
            .toString();
    }

    /**
     * Gets the numOperationsExecuted value for this ProgressStats.
     * 
     * @return numOperationsExecuted   * The number of operations executed.
     */
    public java.lang.Long getNumOperationsExecuted() {
        return numOperationsExecuted;
    }


    /**
     * Sets the numOperationsExecuted value for this ProgressStats.
     * 
     * @param numOperationsExecuted   * The number of operations executed.
     */
    public void setNumOperationsExecuted(java.lang.Long numOperationsExecuted) {
        this.numOperationsExecuted = numOperationsExecuted;
    }


    /**
     * Gets the numOperationsSucceeded value for this ProgressStats.
     * 
     * @return numOperationsSucceeded   * The number of operations succeeded.
     */
    public java.lang.Long getNumOperationsSucceeded() {
        return numOperationsSucceeded;
    }


    /**
     * Sets the numOperationsSucceeded value for this ProgressStats.
     * 
     * @param numOperationsSucceeded   * The number of operations succeeded.
     */
    public void setNumOperationsSucceeded(java.lang.Long numOperationsSucceeded) {
        this.numOperationsSucceeded = numOperationsSucceeded;
    }


    /**
     * Gets the estimatedPercentExecuted value for this ProgressStats.
     * 
     * @return estimatedPercentExecuted   * An estimate of the percent of this job that has been executed.
     */
    public java.lang.Integer getEstimatedPercentExecuted() {
        return estimatedPercentExecuted;
    }


    /**
     * Sets the estimatedPercentExecuted value for this ProgressStats.
     * 
     * @param estimatedPercentExecuted   * An estimate of the percent of this job that has been executed.
     */
    public void setEstimatedPercentExecuted(java.lang.Integer estimatedPercentExecuted) {
        this.estimatedPercentExecuted = estimatedPercentExecuted;
    }


    /**
     * Gets the numResultsWritten value for this ProgressStats.
     * 
     * @return numResultsWritten   * The number of results written.
     */
    public java.lang.Long getNumResultsWritten() {
        return numResultsWritten;
    }


    /**
     * Sets the numResultsWritten value for this ProgressStats.
     * 
     * @param numResultsWritten   * The number of results written.
     */
    public void setNumResultsWritten(java.lang.Long numResultsWritten) {
        this.numResultsWritten = numResultsWritten;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgressStats)) return false;
        ProgressStats other = (ProgressStats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numOperationsExecuted==null && other.getNumOperationsExecuted()==null) || 
             (this.numOperationsExecuted!=null &&
              this.numOperationsExecuted.equals(other.getNumOperationsExecuted()))) &&
            ((this.numOperationsSucceeded==null && other.getNumOperationsSucceeded()==null) || 
             (this.numOperationsSucceeded!=null &&
              this.numOperationsSucceeded.equals(other.getNumOperationsSucceeded()))) &&
            ((this.estimatedPercentExecuted==null && other.getEstimatedPercentExecuted()==null) || 
             (this.estimatedPercentExecuted!=null &&
              this.estimatedPercentExecuted.equals(other.getEstimatedPercentExecuted()))) &&
            ((this.numResultsWritten==null && other.getNumResultsWritten()==null) || 
             (this.numResultsWritten!=null &&
              this.numResultsWritten.equals(other.getNumResultsWritten())));
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
        if (getNumOperationsExecuted() != null) {
            _hashCode += getNumOperationsExecuted().hashCode();
        }
        if (getNumOperationsSucceeded() != null) {
            _hashCode += getNumOperationsSucceeded().hashCode();
        }
        if (getEstimatedPercentExecuted() != null) {
            _hashCode += getEstimatedPercentExecuted().hashCode();
        }
        if (getNumResultsWritten() != null) {
            _hashCode += getNumResultsWritten().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgressStats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProgressStats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOperationsExecuted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "numOperationsExecuted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numOperationsSucceeded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "numOperationsSucceeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedPercentExecuted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "estimatedPercentExecuted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numResultsWritten");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "numResultsWritten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
