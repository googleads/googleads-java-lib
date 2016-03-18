/**
 * CrmBasedUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.rm;


/**
 * UserList of CRM users provided by the advertiser.
 */
public class CrmBasedUserList  extends com.google.api.ads.adwords.axis.v201509.rm.UserList  implements java.io.Serializable {
    /* <span class="constraint Selectable">This field can be selected
     * using the value "OptOutLink".</span> */
    private java.lang.String optOutLink;

    public CrmBasedUserList() {
    }

    public CrmBasedUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201509.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201509.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201509.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201509.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201509.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201509.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.String userListType,
           java.lang.String optOutLink) {
        super(
            id,
            isReadOnly,
            name,
            description,
            status,
            integrationCode,
            accessReason,
            accountUserListStatus,
            membershipLifeSpan,
            size,
            sizeRange,
            sizeForSearch,
            sizeRangeForSearch,
            listType,
            isEligibleForSearch,
            userListType);
        this.optOutLink = optOutLink;
    }


    /**
     * Gets the optOutLink value for this CrmBasedUserList.
     * 
     * @return optOutLink   * <span class="constraint Selectable">This field can be selected
     * using the value "OptOutLink".</span>
     */
    public java.lang.String getOptOutLink() {
        return optOutLink;
    }


    /**
     * Sets the optOutLink value for this CrmBasedUserList.
     * 
     * @param optOutLink   * <span class="constraint Selectable">This field can be selected
     * using the value "OptOutLink".</span>
     */
    public void setOptOutLink(java.lang.String optOutLink) {
        this.optOutLink = optOutLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrmBasedUserList)) return false;
        CrmBasedUserList other = (CrmBasedUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.optOutLink==null && other.getOptOutLink()==null) || 
             (this.optOutLink!=null &&
              this.optOutLink.equals(other.getOptOutLink())));
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
        if (getOptOutLink() != null) {
            _hashCode += getOptOutLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrmBasedUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201509", "CrmBasedUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optOutLink");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201509", "optOutLink"));
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
