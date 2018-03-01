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
 * AppUrlList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Wrapper object for a list of AppUrls. The list can be cleared if
 * a request contains
 *             an AppUrlList with an empty urls list.
 */
public class AppUrlList  implements java.io.Serializable {
    /* List of URLs. On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] appUrls;

    public AppUrlList() {
    }

    public AppUrlList(
           com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] appUrls) {
           this.appUrls = appUrls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appUrls", getAppUrls())
            .toString();
    }

    /**
     * Gets the appUrls value for this AppUrlList.
     * 
     * @return appUrls   * List of URLs. On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] getAppUrls() {
        return appUrls;
    }


    /**
     * Sets the appUrls value for this AppUrlList.
     * 
     * @param appUrls   * List of URLs. On SET operation, empty list indicates to clear
     * the list.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 10.</span>
     */
    public void setAppUrls(com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] appUrls) {
        this.appUrls = appUrls;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.AppUrl getAppUrls(int i) {
        return this.appUrls[i];
    }

    public void setAppUrls(int i, com.google.api.ads.adwords.axis.v201802.cm.AppUrl _value) {
        this.appUrls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppUrlList)) return false;
        AppUrlList other = (AppUrlList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appUrls==null && other.getAppUrls()==null) || 
             (this.appUrls!=null &&
              java.util.Arrays.equals(this.appUrls, other.getAppUrls())));
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
        if (getAppUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppUrls(), i);
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
        new org.apache.axis.description.TypeDesc(AppUrlList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrlList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "AppUrl"));
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
