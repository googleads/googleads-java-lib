/**
 * ProposalErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201511;

public class ProposalErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_SERVER_UNKNOWN_ERROR = "AD_SERVER_UNKNOWN_ERROR";
    public static final java.lang.String _AD_SERVER_API_ERROR = "AD_SERVER_API_ERROR";
    public static final java.lang.String _UPDATE_ADVERTISER_NOT_ALLOWED = "UPDATE_ADVERTISER_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_PROPOSAL_NOT_ALLOWED = "UPDATE_PROPOSAL_NOT_ALLOWED";
    public static final java.lang.String _INVALID_CONTACT = "INVALID_CONTACT";
    public static final java.lang.String _DUPLICATED_CONTACT = "DUPLICATED_CONTACT";
    public static final java.lang.String _UNACCEPTABLE_COMPANY_CREDIT_STATUS = "UNACCEPTABLE_COMPANY_CREDIT_STATUS";
    public static final java.lang.String _PRIMARY_AGENCY_REQUIRED = "PRIMARY_AGENCY_REQUIRED";
    public static final java.lang.String _PRIMARY_AGENCY_NOT_UNIQUE = "PRIMARY_AGENCY_NOT_UNIQUE";
    public static final java.lang.String _DUPLICATED_COMPANY_ASSOCIATION = "DUPLICATED_COMPANY_ASSOCIATION";
    public static final java.lang.String _DUPLICATED_SALESPERSON = "DUPLICATED_SALESPERSON";
    public static final java.lang.String _DUPLICATED_SALES_PLANNER = "DUPLICATED_SALES_PLANNER";
    public static final java.lang.String _DUPLICATED_TRAFFICKER = "DUPLICATED_TRAFFICKER";
    public static final java.lang.String _HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS = "HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS";
    public static final java.lang.String _UNSUPPORTED_PROPOSAL_CURRENCY_CODE = "UNSUPPORTED_PROPOSAL_CURRENCY_CODE";
    public static final java.lang.String _INVALID_POC = "INVALID_POC";
    public static final java.lang.String _UPDATE_CURRENCY_NOT_ALLOWED = "UPDATE_CURRENCY_NOT_ALLOWED";
    public static final java.lang.String _UPDATE_TIME_ZONE_NOT_ALLOWED = "UPDATE_TIME_ZONE_NOT_ALLOWED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ProposalErrorReason AD_SERVER_UNKNOWN_ERROR = new ProposalErrorReason(_AD_SERVER_UNKNOWN_ERROR);
    public static final ProposalErrorReason AD_SERVER_API_ERROR = new ProposalErrorReason(_AD_SERVER_API_ERROR);
    public static final ProposalErrorReason UPDATE_ADVERTISER_NOT_ALLOWED = new ProposalErrorReason(_UPDATE_ADVERTISER_NOT_ALLOWED);
    public static final ProposalErrorReason UPDATE_PROPOSAL_NOT_ALLOWED = new ProposalErrorReason(_UPDATE_PROPOSAL_NOT_ALLOWED);
    public static final ProposalErrorReason INVALID_CONTACT = new ProposalErrorReason(_INVALID_CONTACT);
    public static final ProposalErrorReason DUPLICATED_CONTACT = new ProposalErrorReason(_DUPLICATED_CONTACT);
    public static final ProposalErrorReason UNACCEPTABLE_COMPANY_CREDIT_STATUS = new ProposalErrorReason(_UNACCEPTABLE_COMPANY_CREDIT_STATUS);
    public static final ProposalErrorReason PRIMARY_AGENCY_REQUIRED = new ProposalErrorReason(_PRIMARY_AGENCY_REQUIRED);
    public static final ProposalErrorReason PRIMARY_AGENCY_NOT_UNIQUE = new ProposalErrorReason(_PRIMARY_AGENCY_NOT_UNIQUE);
    public static final ProposalErrorReason DUPLICATED_COMPANY_ASSOCIATION = new ProposalErrorReason(_DUPLICATED_COMPANY_ASSOCIATION);
    public static final ProposalErrorReason DUPLICATED_SALESPERSON = new ProposalErrorReason(_DUPLICATED_SALESPERSON);
    public static final ProposalErrorReason DUPLICATED_SALES_PLANNER = new ProposalErrorReason(_DUPLICATED_SALES_PLANNER);
    public static final ProposalErrorReason DUPLICATED_TRAFFICKER = new ProposalErrorReason(_DUPLICATED_TRAFFICKER);
    public static final ProposalErrorReason HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS = new ProposalErrorReason(_HAS_NO_UNARCHIVED_PROPOSAL_LINEITEMS);
    public static final ProposalErrorReason UNSUPPORTED_PROPOSAL_CURRENCY_CODE = new ProposalErrorReason(_UNSUPPORTED_PROPOSAL_CURRENCY_CODE);
    public static final ProposalErrorReason INVALID_POC = new ProposalErrorReason(_INVALID_POC);
    public static final ProposalErrorReason UPDATE_CURRENCY_NOT_ALLOWED = new ProposalErrorReason(_UPDATE_CURRENCY_NOT_ALLOWED);
    public static final ProposalErrorReason UPDATE_TIME_ZONE_NOT_ALLOWED = new ProposalErrorReason(_UPDATE_TIME_ZONE_NOT_ALLOWED);
    public static final ProposalErrorReason UNKNOWN = new ProposalErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ProposalErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalErrorReason enumeration = (ProposalErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201511", "ProposalError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
