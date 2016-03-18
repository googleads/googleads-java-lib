/**
 * JobErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public class JobErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected JobErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DUPLICATE_JOB_KEY_FOR_CUSTOMER = "DUPLICATE_JOB_KEY_FOR_CUSTOMER";
    public static final java.lang.String _JOB_TYPE_NOT_SUPPORTED = "JOB_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _PREREQUISITE_JOB_FAILED = "PREREQUISITE_JOB_FAILED";
    public static final java.lang.String _SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS = "SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS";
    public static final java.lang.String _TOO_LATE_TO_CANCEL_JOB = "TOO_LATE_TO_CANCEL_JOB";
    public static final java.lang.String _TOO_MANY_PREREQUISITE_JOBS = "TOO_MANY_PREREQUISITE_JOBS";
    public static final java.lang.String _TOO_MANY_JOBS_IN_QUEUE = "TOO_MANY_JOBS_IN_QUEUE";
    public static final java.lang.String _USER_CANCELED_JOB = "USER_CANCELED_JOB";
    public static final java.lang.String _WORKFLOW_FAILURE = "WORKFLOW_FAILURE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final JobErrorReason DUPLICATE_JOB_KEY_FOR_CUSTOMER = new JobErrorReason(_DUPLICATE_JOB_KEY_FOR_CUSTOMER);
    public static final JobErrorReason JOB_TYPE_NOT_SUPPORTED = new JobErrorReason(_JOB_TYPE_NOT_SUPPORTED);
    public static final JobErrorReason PREREQUISITE_JOB_FAILED = new JobErrorReason(_PREREQUISITE_JOB_FAILED);
    public static final JobErrorReason SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS = new JobErrorReason(_SELECTOR_CANNOT_USE_BOTH_JOB_IDS_AND_JOB_KEYS);
    public static final JobErrorReason TOO_LATE_TO_CANCEL_JOB = new JobErrorReason(_TOO_LATE_TO_CANCEL_JOB);
    public static final JobErrorReason TOO_MANY_PREREQUISITE_JOBS = new JobErrorReason(_TOO_MANY_PREREQUISITE_JOBS);
    public static final JobErrorReason TOO_MANY_JOBS_IN_QUEUE = new JobErrorReason(_TOO_MANY_JOBS_IN_QUEUE);
    public static final JobErrorReason USER_CANCELED_JOB = new JobErrorReason(_USER_CANCELED_JOB);
    public static final JobErrorReason WORKFLOW_FAILURE = new JobErrorReason(_WORKFLOW_FAILURE);
    public static final JobErrorReason UNKNOWN = new JobErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static JobErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        JobErrorReason enumeration = (JobErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static JobErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(JobErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201601", "JobError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
