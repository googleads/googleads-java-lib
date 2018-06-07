// Copyright 2018 Google LLC
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
 * Asset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201806.cm;


/**
 * Represents an asset.
 */
public class Asset  implements java.io.Serializable {
    /* Id of this asset.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long assetId;

    /* Optional name of the asset which can act as a unique identifier.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AssetName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Asset names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span> */
    private java.lang.String assetName;

    /* Asset type. Used for returning asset type and filtering by
     * asset type in GET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetSubtype".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201806.cm.AssetType assetSubtype;

    /* Asset status. This status does NOT affect serving, and is only
     * meant to be a "library status."
     *                 To stop an asset from serving, you need to remove
     * the asset from the entity that is using it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201806.cm.AssetStatus assetStatus;

    /* Indicates that this instance is a subtype of Asset.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String assetType;

    public Asset() {
    }

    public Asset(
           java.lang.Long assetId,
           java.lang.String assetName,
           com.google.api.ads.adwords.axis.v201806.cm.AssetType assetSubtype,
           com.google.api.ads.adwords.axis.v201806.cm.AssetStatus assetStatus,
           java.lang.String assetType) {
           this.assetId = assetId;
           this.assetName = assetName;
           this.assetSubtype = assetSubtype;
           this.assetStatus = assetStatus;
           this.assetType = assetType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("assetId", getAssetId())
            .add("assetName", getAssetName())
            .add("assetStatus", getAssetStatus())
            .add("assetSubtype", getAssetSubtype())
            .add("assetType", getAssetType())
            .toString();
    }

    /**
     * Gets the assetId value for this Asset.
     * 
     * @return assetId   * Id of this asset.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getAssetId() {
        return assetId;
    }


    /**
     * Sets the assetId value for this Asset.
     * 
     * @param assetId   * Id of this asset.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAssetId(java.lang.Long assetId) {
        this.assetId = assetId;
    }


    /**
     * Gets the assetName value for this Asset.
     * 
     * @return assetName   * Optional name of the asset which can act as a unique identifier.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AssetName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Asset names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     */
    public java.lang.String getAssetName() {
        return assetName;
    }


    /**
     * Sets the assetName value for this Asset.
     * 
     * @param assetName   * Optional name of the asset which can act as a unique identifier.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AssetName".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint MatchesRegex">Asset names
     * must not contain any null (code point 0x0), NL line feed (code point
     * 0xA) or carriage return (code point 0xD) characters. This is checked
     * by the regular expression '[^\x00\x0A\x0D]*'.</span>
     */
    public void setAssetName(java.lang.String assetName) {
        this.assetName = assetName;
    }


    /**
     * Gets the assetSubtype value for this Asset.
     * 
     * @return assetSubtype   * Asset type. Used for returning asset type and filtering by
     * asset type in GET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetSubtype".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetType getAssetSubtype() {
        return assetSubtype;
    }


    /**
     * Sets the assetSubtype value for this Asset.
     * 
     * @param assetSubtype   * Asset type. Used for returning asset type and filtering by
     * asset type in GET.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetSubtype".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAssetSubtype(com.google.api.ads.adwords.axis.v201806.cm.AssetType assetSubtype) {
        this.assetSubtype = assetSubtype;
    }


    /**
     * Gets the assetStatus value for this Asset.
     * 
     * @return assetStatus   * Asset status. This status does NOT affect serving, and is only
     * meant to be a "library status."
     *                 To stop an asset from serving, you need to remove
     * the asset from the entity that is using it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201806.cm.AssetStatus getAssetStatus() {
        return assetStatus;
    }


    /**
     * Sets the assetStatus value for this Asset.
     * 
     * @param assetStatus   * Asset status. This status does NOT affect serving, and is only
     * meant to be a "library status."
     *                 To stop an asset from serving, you need to remove
     * the asset from the entity that is using it.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AssetStatus".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setAssetStatus(com.google.api.ads.adwords.axis.v201806.cm.AssetStatus assetStatus) {
        this.assetStatus = assetStatus;
    }


    /**
     * Gets the assetType value for this Asset.
     * 
     * @return assetType   * Indicates that this instance is a subtype of Asset.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getAssetType() {
        return assetType;
    }


    /**
     * Sets the assetType value for this Asset.
     * 
     * @param assetType   * Indicates that this instance is a subtype of Asset.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setAssetType(java.lang.String assetType) {
        this.assetType = assetType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asset)) return false;
        Asset other = (Asset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetId==null && other.getAssetId()==null) || 
             (this.assetId!=null &&
              this.assetId.equals(other.getAssetId()))) &&
            ((this.assetName==null && other.getAssetName()==null) || 
             (this.assetName!=null &&
              this.assetName.equals(other.getAssetName()))) &&
            ((this.assetSubtype==null && other.getAssetSubtype()==null) || 
             (this.assetSubtype!=null &&
              this.assetSubtype.equals(other.getAssetSubtype()))) &&
            ((this.assetStatus==null && other.getAssetStatus()==null) || 
             (this.assetStatus!=null &&
              this.assetStatus.equals(other.getAssetStatus()))) &&
            ((this.assetType==null && other.getAssetType()==null) || 
             (this.assetType!=null &&
              this.assetType.equals(other.getAssetType())));
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
        if (getAssetId() != null) {
            _hashCode += getAssetId().hashCode();
        }
        if (getAssetName() != null) {
            _hashCode += getAssetName().hashCode();
        }
        if (getAssetSubtype() != null) {
            _hashCode += getAssetSubtype().hashCode();
        }
        if (getAssetStatus() != null) {
            _hashCode += getAssetStatus().hashCode();
        }
        if (getAssetType() != null) {
            _hashCode += getAssetType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Asset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "Asset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "assetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "assetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetSubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "assetSubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "Asset.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "assetStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "AssetStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201806", "Asset.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
