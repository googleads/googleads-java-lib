// Copyright 2017 Google Inc. All Rights Reserved.
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
 * MutateMembersOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201702.rm;


/**
 * Operand containing user list id and members to be added or removed.
 */
public class MutateMembersOperand  implements java.io.Serializable {
    /* The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long userListId;

    /* The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}. */
    private com.google.api.ads.adwords.axis.v201702.rm.MutateMembersOperandDataType dataType;

    /* Set to indicate a remove-all operation which will remove all
     * members from the user list.
     *                 Can only be set with {@code Operator#REMOVE} and
     *                 when set to true {@link #members} must be null or
     * empty. */
    private java.lang.Boolean removeAll;

    /* A list of members to be added or removed.
     *                 
     *                 <p>If {@link #removeAll} is {@code true}, this list
     * must be {@code null} or empty. Otherwise,
     *                 this field is required and there must be at least
     * one member.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1000000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private java.lang.String[] members;

    public MutateMembersOperand() {
    }

    public MutateMembersOperand(
           java.lang.Long userListId,
           com.google.api.ads.adwords.axis.v201702.rm.MutateMembersOperandDataType dataType,
           java.lang.Boolean removeAll,
           java.lang.String[] members) {
           this.userListId = userListId;
           this.dataType = dataType;
           this.removeAll = removeAll;
           this.members = members;
    }


    /**
     * Gets the userListId value for this MutateMembersOperand.
     * 
     * @return userListId   * The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getUserListId() {
        return userListId;
    }


    /**
     * Sets the userListId value for this MutateMembersOperand.
     * 
     * @param userListId   * The id of the user list.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setUserListId(java.lang.Long userListId) {
        this.userListId = userListId;
    }


    /**
     * Gets the dataType value for this MutateMembersOperand.
     * 
     * @return dataType   * The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}.
     */
    public com.google.api.ads.adwords.axis.v201702.rm.MutateMembersOperandDataType getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this MutateMembersOperand.
     * 
     * @param dataType   * The data type indicating the type of member data entity in
     *                 {@code members} list. If it's not specified, it'll
     * default to
     *                 {@link DataType#EMAIL_SHA256}.
     */
    public void setDataType(com.google.api.ads.adwords.axis.v201702.rm.MutateMembersOperandDataType dataType) {
        this.dataType = dataType;
    }


    /**
     * Gets the removeAll value for this MutateMembersOperand.
     * 
     * @return removeAll   * Set to indicate a remove-all operation which will remove all
     * members from the user list.
     *                 Can only be set with {@code Operator#REMOVE} and
     *                 when set to true {@link #members} must be null or
     * empty.
     */
    public java.lang.Boolean getRemoveAll() {
        return removeAll;
    }


    /**
     * Sets the removeAll value for this MutateMembersOperand.
     * 
     * @param removeAll   * Set to indicate a remove-all operation which will remove all
     * members from the user list.
     *                 Can only be set with {@code Operator#REMOVE} and
     *                 when set to true {@link #members} must be null or
     * empty.
     */
    public void setRemoveAll(java.lang.Boolean removeAll) {
        this.removeAll = removeAll;
    }


    /**
     * Gets the members value for this MutateMembersOperand.
     * 
     * @return members   * A list of members to be added or removed.
     *                 
     *                 <p>If {@link #removeAll} is {@code true}, this list
     * must be {@code null} or empty. Otherwise,
     *                 this field is required and there must be at least
     * one member.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1000000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public java.lang.String[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this MutateMembersOperand.
     * 
     * @param members   * A list of members to be added or removed.
     *                 
     *                 <p>If {@link #removeAll} is {@code true}, this list
     * must be {@code null} or empty. Otherwise,
     *                 this field is required and there must be at least
     * one member.
     *                 
     *                 <p>Each element in members list should be in format
     * according to the specified
     *                 {@code dataType}.
     *                 <span class="constraint CollectionSize">The maximum
     * size of this collection is 1000000.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setMembers(java.lang.String[] members) {
        this.members = members;
    }

    public java.lang.String getMembers(int i) {
        return this.members[i];
    }

    public void setMembers(int i, java.lang.String _value) {
        this.members[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MutateMembersOperand)) return false;
        MutateMembersOperand other = (MutateMembersOperand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userListId==null && other.getUserListId()==null) || 
             (this.userListId!=null &&
              this.userListId.equals(other.getUserListId()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType()))) &&
            ((this.removeAll==null && other.getRemoveAll()==null) || 
             (this.removeAll!=null &&
              this.removeAll.equals(other.getRemoveAll()))) &&
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers())));
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
        if (getUserListId() != null) {
            _hashCode += getUserListId().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        if (getRemoveAll() != null) {
            _hashCode += getRemoveAll().hashCode();
        }
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
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
        new org.apache.axis.description.TypeDesc(MutateMembersOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "MutateMembersOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "userListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "MutateMembersOperand.DataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removeAll");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "removeAll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201702", "members"));
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
