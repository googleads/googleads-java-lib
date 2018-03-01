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
 * ManagedCustomerPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.mcm;


/**
 * Return result of {@link ManagedCustomerService}
 */
public class ManagedCustomerPage  extends com.google.api.ads.adwords.axis.v201802.cm.Page  implements java.io.Serializable , Iterable<com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer>{
    /* Subset of the managed customers' information that are being
     * retrieved. */
    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer[] entries;

    /* Links between manager and client customers. */
    private com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink[] links;

    public ManagedCustomerPage() {
    }

    public ManagedCustomerPage(
           java.lang.Integer totalNumEntries,
           java.lang.String pageType,
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer[] entries,
           com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink[] links) {
        super(
            totalNumEntries,
            pageType);
        this.entries = entries;
        this.links = links;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            // Only include length of entries to avoid overly verbose output
            .add("entries.length", getEntries() == null ? 0 : getEntries().length)
            .add("links", getLinks())
            .add("pageType", getPageType())
            .add("totalNumEntries", getTotalNumEntries())
            .toString();
    }

    /**
     * Gets the entries value for this ManagedCustomerPage.
     * 
     * @return entries   * Subset of the managed customers' information that are being
     * retrieved.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer[] getEntries() {
        return entries;
    }


    /**
     * Sets the entries value for this ManagedCustomerPage.
     * 
     * @param entries   * Subset of the managed customers' information that are being
     * retrieved.
     */
    public void setEntries(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer[] entries) {
        this.entries = entries;
    }

    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer getEntries(int i) {
        return this.entries[i];
    }

    public void setEntries(int i, com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer _value) {
        this.entries[i] = _value;
    }


    /**
     * Gets the links value for this ManagedCustomerPage.
     * 
     * @return links   * Links between manager and client customers.
     */
    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink[] getLinks() {
        return links;
    }


    /**
     * Sets the links value for this ManagedCustomerPage.
     * 
     * @param links   * Links between manager and client customers.
     */
    public void setLinks(com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink[] links) {
        this.links = links;
    }

    public com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink getLinks(int i) {
        return this.links[i];
    }

    public void setLinks(int i, com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomerLink _value) {
        this.links[i] = _value;
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
    public java.util.Iterator<com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer> iterator() {
        if (entries == null) {
            return java.util.Collections.<com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer>emptyIterator();
        }
        return java.util.Arrays.<com.google.api.ads.adwords.axis.v201802.mcm.ManagedCustomer>asList(entries).iterator();
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedCustomerPage)) return false;
        ManagedCustomerPage other = (ManagedCustomerPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.entries==null && other.getEntries()==null) || 
             (this.entries!=null &&
              java.util.Arrays.equals(this.entries, other.getEntries()))) &&
            ((this.links==null && other.getLinks()==null) || 
             (this.links!=null &&
              java.util.Arrays.equals(this.links, other.getLinks())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
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
        if (getLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinks(), i);
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
        new org.apache.axis.description.TypeDesc(ManagedCustomerPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "entries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("links");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "links"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201802", "ManagedCustomerLink"));
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
