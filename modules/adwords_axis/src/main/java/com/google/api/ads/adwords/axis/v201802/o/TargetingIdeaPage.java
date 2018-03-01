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
 * TargetingIdeaPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Contains a subset of {@link TargetingIdea}s from the search criteria
 * specified by a {@link TargetingIdeaSelector}.
 */
public class TargetingIdeaPage  implements java.io.Serializable , Iterable<com.google.api.ads.adwords.axis.v201802.o.TargetingIdea>{
    /* Total number of entries that can be retrieved using the get
     * method. */
    private java.lang.Integer totalNumEntries;

    /* The result entries in this page, as list of {@link TargetingIdea}s. */
    private com.google.api.ads.adwords.axis.v201802.o.TargetingIdea[] entries;

    public TargetingIdeaPage() {
    }

    public TargetingIdeaPage(
           java.lang.Integer totalNumEntries,
           com.google.api.ads.adwords.axis.v201802.o.TargetingIdea[] entries) {
           this.totalNumEntries = totalNumEntries;
           this.entries = entries;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            // Only include length of entries to avoid overly verbose output
            .add("entries.length", getEntries() == null ? 0 : getEntries().length)
            .add("totalNumEntries", getTotalNumEntries())
            .toString();
    }

    /**
     * Gets the totalNumEntries value for this TargetingIdeaPage.
     * 
     * @return totalNumEntries   * Total number of entries that can be retrieved using the get
     * method.
     */
    public java.lang.Integer getTotalNumEntries() {
        return totalNumEntries;
    }


    /**
     * Sets the totalNumEntries value for this TargetingIdeaPage.
     * 
     * @param totalNumEntries   * Total number of entries that can be retrieved using the get
     * method.
     */
    public void setTotalNumEntries(java.lang.Integer totalNumEntries) {
        this.totalNumEntries = totalNumEntries;
    }


    /**
     * Gets the entries value for this TargetingIdeaPage.
     * 
     * @return entries   * The result entries in this page, as list of {@link TargetingIdea}s.
     */
    public com.google.api.ads.adwords.axis.v201802.o.TargetingIdea[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this TargetingIdeaPage.
     * 
     * @param entries   * The result entries in this page, as list of {@link TargetingIdea}s.
     */
    public void setEntries(com.google.api.ads.adwords.axis.v201802.o.TargetingIdea[] entries) {
        this.entries = entries;
    }

    public com.google.api.ads.adwords.axis.v201802.o.TargetingIdea getEntries(int i) {
        return this.entries[i];
    }

    public void setEntries(int i, com.google.api.ads.adwords.axis.v201802.o.TargetingIdea _value) {
        this.entries[i] = _value;
    }

    /**
     * Returns an iterator over this page's {@code entries} that:
     * <ul>
     * <li>Will not be {@code null}.</li>
     * <li>Will not support {@link java.util.Iterator#remove()}.</li>
     * </ul>
     *
     * @return a non-null iterator.
     */
    @Override
    public java.util.Iterator<com.google.api.ads.adwords.axis.v201802.o.TargetingIdea> iterator() {
        if (entries == null) {
            return java.util.Collections.<com.google.api.ads.adwords.axis.v201802.o.TargetingIdea>emptyIterator();
        }
        return java.util.Arrays.<com.google.api.ads.adwords.axis.v201802.o.TargetingIdea>asList(entries).iterator();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TargetingIdeaPage)) return false;
        TargetingIdeaPage other = (TargetingIdeaPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalNumEntries==null && other.getTotalNumEntries()==null) || 
             (this.totalNumEntries!=null &&
              this.totalNumEntries.equals(other.getTotalNumEntries()))) &&
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries())));
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
        if (getTotalNumEntries() != null) {
            _hashCode += getTotalNumEntries().hashCode();
        }
        if (getEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TargetingIdeaPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TargetingIdeaPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalNumEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "totalNumEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "TargetingIdea"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
