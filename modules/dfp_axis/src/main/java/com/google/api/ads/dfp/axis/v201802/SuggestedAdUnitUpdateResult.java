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
 * SuggestedAdUnitUpdateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents the result of performing an action on {@link SuggestedAdUnit}
 * objects.
 */
public class SuggestedAdUnitUpdateResult  implements java.io.Serializable {
    /* The ids of the {@link AdUnit} objects that were created in
     * response to a
     *                 performSuggestedAdUnitAction call. */
    private java.lang.String[] newAdUnitIds;

    /* The number of objects that were changed as a result of performing
     * the
     *                 action. */
    private java.lang.Integer numChanges;

    public SuggestedAdUnitUpdateResult() {
    }

    public SuggestedAdUnitUpdateResult(
           java.lang.String[] newAdUnitIds,
           java.lang.Integer numChanges) {
           this.newAdUnitIds = newAdUnitIds;
           this.numChanges = numChanges;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("newAdUnitIds", getNewAdUnitIds())
            .add("numChanges", getNumChanges())
            .toString();
    }

    /**
     * Gets the newAdUnitIds value for this SuggestedAdUnitUpdateResult.
     * 
     * @return newAdUnitIds   * The ids of the {@link AdUnit} objects that were created in
     * response to a
     *                 performSuggestedAdUnitAction call.
     */
    public java.lang.String[] getNewAdUnitIds() {
        return newAdUnitIds;
    }


    /**
     * Sets the newAdUnitIds value for this SuggestedAdUnitUpdateResult.
     * 
     * @param newAdUnitIds   * The ids of the {@link AdUnit} objects that were created in
     * response to a
     *                 performSuggestedAdUnitAction call.
     */
    public void setNewAdUnitIds(java.lang.String[] newAdUnitIds) {
        this.newAdUnitIds = newAdUnitIds;
    }

    public java.lang.String getNewAdUnitIds(int i) {
        return this.newAdUnitIds[i];
    }

    public void setNewAdUnitIds(int i, java.lang.String _value) {
        this.newAdUnitIds[i] = _value;
    }


    /**
     * Gets the numChanges value for this SuggestedAdUnitUpdateResult.
     * 
     * @return numChanges   * The number of objects that were changed as a result of performing
     * the
     *                 action.
     */
    public java.lang.Integer getNumChanges() {
        return numChanges;
    }


    /**
     * Sets the numChanges value for this SuggestedAdUnitUpdateResult.
     * 
     * @param numChanges   * The number of objects that were changed as a result of performing
     * the
     *                 action.
     */
    public void setNumChanges(java.lang.Integer numChanges) {
        this.numChanges = numChanges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuggestedAdUnitUpdateResult)) return false;
        SuggestedAdUnitUpdateResult other = (SuggestedAdUnitUpdateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newAdUnitIds==null && other.getNewAdUnitIds()==null) || 
             (this.newAdUnitIds!=null &&
              java.util.Arrays.equals(this.newAdUnitIds, other.getNewAdUnitIds()))) &&
            ((this.numChanges==null && other.getNumChanges()==null) || 
             (this.numChanges!=null &&
              this.numChanges.equals(other.getNumChanges())));
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
        if (getNewAdUnitIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewAdUnitIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewAdUnitIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumChanges() != null) {
            _hashCode += getNumChanges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SuggestedAdUnitUpdateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SuggestedAdUnitUpdateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAdUnitIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "newAdUnitIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "numChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
