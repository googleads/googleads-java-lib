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
 * MobileApplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents the mobile application to be targeted.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class MobileApplication  extends com.google.api.ads.adwords.axis.v201802.cm.Criterion  implements java.io.Serializable {
    /* A string that uniquely identifies a mobile application to AdWords
     * API. The format of this
     *                     string is "<code>{platform}-{platform_native_id}</code>",
     * where <code>platform</code> is "1"
     *                     for iOS apps and "2" for Android apps, and where
     * <code>platform_native_id</code> is the mobile
     *                     application identifier native to the corresponding
     * platform.
     *                     For iOS, this native identifier is the 9 digit
     * string that appears at the end of an App Store
     *                     URL (e.g., "476943146" for "Flood-It! 2" whose
     * App Store link is
     *                     http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, this native identifier is the application's package name
     * (e.g.,
     *                     "com.labpixies.colordrips" for "Color Drips" given
     * Google Play link
     *                     https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * A well formed app id for AdWords API would thus be "1-476943146" for
     * iOS and
     *                     "2-com.labpixies.colordrips" for Android.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String appId;

    /* Title of this mobile application.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DisplayName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String displayName;

    public MobileApplication() {
    }

    public MobileApplication(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201802.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String appId,
           java.lang.String displayName) {
        super(
            id,
            type,
            criterionType);
        this.appId = appId;
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("appId", getAppId())
            .add("criterionType", getCriterionType())
            .add("displayName", getDisplayName())
            .add("id", getId())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the appId value for this MobileApplication.
     * 
     * @return appId   * A string that uniquely identifies a mobile application to AdWords
     * API. The format of this
     *                     string is "<code>{platform}-{platform_native_id}</code>",
     * where <code>platform</code> is "1"
     *                     for iOS apps and "2" for Android apps, and where
     * <code>platform_native_id</code> is the mobile
     *                     application identifier native to the corresponding
     * platform.
     *                     For iOS, this native identifier is the 9 digit
     * string that appears at the end of an App Store
     *                     URL (e.g., "476943146" for "Flood-It! 2" whose
     * App Store link is
     *                     http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, this native identifier is the application's package name
     * (e.g.,
     *                     "com.labpixies.colordrips" for "Color Drips" given
     * Google Play link
     *                     https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * A well formed app id for AdWords API would thus be "1-476943146" for
     * iOS and
     *                     "2-com.labpixies.colordrips" for Android.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this MobileApplication.
     * 
     * @param appId   * A string that uniquely identifies a mobile application to AdWords
     * API. The format of this
     *                     string is "<code>{platform}-{platform_native_id}</code>",
     * where <code>platform</code> is "1"
     *                     for iOS apps and "2" for Android apps, and where
     * <code>platform_native_id</code> is the mobile
     *                     application identifier native to the corresponding
     * platform.
     *                     For iOS, this native identifier is the 9 digit
     * string that appears at the end of an App Store
     *                     URL (e.g., "476943146" for "Flood-It! 2" whose
     * App Store link is
     *                     http://itunes.apple.com/us/app/flood-it!-2/id476943146).
     * For Android, this native identifier is the application's package name
     * (e.g.,
     *                     "com.labpixies.colordrips" for "Color Drips" given
     * Google Play link
     *                     https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
     * A well formed app id for AdWords API would thus be "1-476943146" for
     * iOS and
     *                     "2-com.labpixies.colordrips" for Android.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the displayName value for this MobileApplication.
     * 
     * @return displayName   * Title of this mobile application.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DisplayName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this MobileApplication.
     * 
     * @param displayName   * Title of this mobile application.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DisplayName".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileApplication)) return false;
        MobileApplication other = (MobileApplication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName())));
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
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileApplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MobileApplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayName"));
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
