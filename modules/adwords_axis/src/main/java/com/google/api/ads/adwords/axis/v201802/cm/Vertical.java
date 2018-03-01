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
 * Vertical.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Use verticals to target or exclude placements in the Google Display
 * Network
 *             based on the category into which the placement falls (for
 * example, "Pets &amp;
 *             Animals/Pets/Dogs").
 *             <a href="/adwords/api/docs/appendix/verticals">View the
 * complete list
 *             of available vertical categories.</a>
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class Vertical  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* Id of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalId".</span> */
    private java.lang.Long verticalId;

    /* Id of the parent of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.Long verticalParentId;

    /* The category to target or exclude. Each subsequent element
     * in the array
     *                     describes a more specific sub-category. For example,
     * <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the
     * "Pets &amp;
     *                     Animals/Pets/Dogs" category. A complete list of
     * available vertical categories
     *                     is available <a href="/adwords/api/docs/appendix/verticals">here</a>
     * This field is required and must not be empty.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Path".</span> */
    private java.lang.String[] path;

    public Vertical() {
    }

    public Vertical(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.Long verticalId,
           java.lang.Long verticalParentId,
           java.lang.String[] path) {
        super(
            id,
            type,
            criterionType);
        this.verticalId = verticalId;
        this.verticalParentId = verticalParentId;
        this.path = path;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("criterionType", getCriterionType())
            .add("id", getId())
            .add("path", getPath())
            .add("type", getType())
            .add("verticalId", getVerticalId())
            .add("verticalParentId", getVerticalParentId())
            .toString();
    }

    /**
     * Gets the verticalId value for this Vertical.
     * 
     * @return verticalId   * Id of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalId".</span>
     */
    public java.lang.Long getVerticalId() {
        return verticalId;
    }


    /**
     * Sets the verticalId value for this Vertical.
     * 
     * @param verticalId   * Id of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalId".</span>
     */
    public void setVerticalId(java.lang.Long verticalId) {
        this.verticalId = verticalId;
    }


    /**
     * Gets the verticalParentId value for this Vertical.
     * 
     * @return verticalParentId   * Id of the parent of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getVerticalParentId() {
        return verticalParentId;
    }


    /**
     * Sets the verticalParentId value for this Vertical.
     * 
     * @param verticalParentId   * Id of the parent of this vertical.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "VerticalParentId".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setVerticalParentId(java.lang.Long verticalParentId) {
        this.verticalParentId = verticalParentId;
    }


    /**
     * Gets the path value for this Vertical.
     * 
     * @return path   * The category to target or exclude. Each subsequent element
     * in the array
     *                     describes a more specific sub-category. For example,
     * <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the
     * "Pets &amp;
     *                     Animals/Pets/Dogs" category. A complete list of
     * available vertical categories
     *                     is available <a href="/adwords/api/docs/appendix/verticals">here</a>
     * This field is required and must not be empty.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Path".</span>
     */
    public java.lang.String[] getPath() {
        return path;
    }


    /**
     * Sets the path value for this Vertical.
     * 
     * @param path   * The category to target or exclude. Each subsequent element
     * in the array
     *                     describes a more specific sub-category. For example,
     * <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the
     * "Pets &amp;
     *                     Animals/Pets/Dogs" category. A complete list of
     * available vertical categories
     *                     is available <a href="/adwords/api/docs/appendix/verticals">here</a>
     * This field is required and must not be empty.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Path".</span>
     */
    public void setPath(java.lang.String[] path) {
        this.path = path;
    }

    public java.lang.String getPath(int i) {
        return this.path[i];
    }

    public void setPath(int i, java.lang.String _value) {
        this.path[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vertical)) return false;
        Vertical other = (Vertical) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.verticalId==null && other.getVerticalId()==null) || 
             (this.verticalId!=null &&
              this.verticalId.equals(other.getVerticalId()))) &&
            ((this.verticalParentId==null && other.getVerticalParentId()==null) || 
             (this.verticalParentId!=null &&
              this.verticalParentId.equals(other.getVerticalParentId()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              java.util.Arrays.equals(this.path, other.getPath())));
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
        if (getVerticalId() != null) {
            _hashCode += getVerticalId().hashCode();
        }
        if (getVerticalParentId() != null) {
            _hashCode += getVerticalParentId().hashCode();
        }
        if (getPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPath(), i);
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
        new org.apache.axis.description.TypeDesc(Vertical.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Vertical"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "verticalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verticalParentId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "verticalParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
