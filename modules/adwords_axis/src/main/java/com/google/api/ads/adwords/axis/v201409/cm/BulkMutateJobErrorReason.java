/**
 * BulkMutateJobErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;

public class BulkMutateJobErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BulkMutateJobErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS = "CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS";
    public static final java.lang.String _CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB = "CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB";
    public static final java.lang.String _CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED = "CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED";
    public static final java.lang.String _INVALID_SCOPING_ENTITY_TYPE = "INVALID_SCOPING_ENTITY_TYPE";
    public static final java.lang.String _MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM = "MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM";
    public static final java.lang.String _MORE_THAN_ONE_SCOPING_ENTITY_TYPE = "MORE_THAN_ONE_SCOPING_ENTITY_TYPE";
    public static final java.lang.String _PAYLOAD_STORE_UNAVAILABLE = "PAYLOAD_STORE_UNAVAILABLE";
    public static final java.lang.String _REQUEST_PART_IS_OUT_OF_ORDER = "REQUEST_PART_IS_OUT_OF_ORDER";
    public static final java.lang.String _TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART = "TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART";
    public static final java.lang.String _TOO_MANY_OPERATIONS_IN_JOB = "TOO_MANY_OPERATIONS_IN_JOB";
    public static final java.lang.String _TOO_MANY_OPERATIONS_IN_REQUEST_PART = "TOO_MANY_OPERATIONS_IN_REQUEST_PART";
    public static final java.lang.String _TOO_MANY_RESULTS_TO_STORE = "TOO_MANY_RESULTS_TO_STORE";
    public static final java.lang.String _TOO_MANY_SCOPING_ENTITIES = "TOO_MANY_SCOPING_ENTITIES";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _LOST_RESULT = "LOST_RESULT";
    public static final java.lang.String _UNPROCESSED_RESULT = "UNPROCESSED_RESULT";
    public static final java.lang.String _BATCH_FAILURE = "BATCH_FAILURE";
    public static final java.lang.String _SERVICE_PROVIDED_NO_RESULT = "SERVICE_PROVIDED_NO_RESULT";
    public static final BulkMutateJobErrorReason CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS = new BulkMutateJobErrorReason(_CAN_RETURN_RESULT_FOR_ONLY_COMPLETED_JOBS);
    public static final BulkMutateJobErrorReason CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB = new BulkMutateJobErrorReason(_CAN_RETURN_RESULT_FOR_ONLY_ONE_JOB);
    public static final BulkMutateJobErrorReason CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED = new BulkMutateJobErrorReason(_CANNOT_UPDATE_JOB_ONCE_ALL_REQUEST_PARTS_ARE_RECEIVED);
    public static final BulkMutateJobErrorReason INVALID_SCOPING_ENTITY_TYPE = new BulkMutateJobErrorReason(_INVALID_SCOPING_ENTITY_TYPE);
    public static final BulkMutateJobErrorReason MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM = new BulkMutateJobErrorReason(_MISSING_SCOPING_ENTITY_FOR_OPERATION_STREAM);
    public static final BulkMutateJobErrorReason MORE_THAN_ONE_SCOPING_ENTITY_TYPE = new BulkMutateJobErrorReason(_MORE_THAN_ONE_SCOPING_ENTITY_TYPE);
    public static final BulkMutateJobErrorReason PAYLOAD_STORE_UNAVAILABLE = new BulkMutateJobErrorReason(_PAYLOAD_STORE_UNAVAILABLE);
    public static final BulkMutateJobErrorReason REQUEST_PART_IS_OUT_OF_ORDER = new BulkMutateJobErrorReason(_REQUEST_PART_IS_OUT_OF_ORDER);
    public static final BulkMutateJobErrorReason TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART = new BulkMutateJobErrorReason(_TOO_MANY_OPERATION_STREAMS_IN_REQUEST_PART);
    public static final BulkMutateJobErrorReason TOO_MANY_OPERATIONS_IN_JOB = new BulkMutateJobErrorReason(_TOO_MANY_OPERATIONS_IN_JOB);
    public static final BulkMutateJobErrorReason TOO_MANY_OPERATIONS_IN_REQUEST_PART = new BulkMutateJobErrorReason(_TOO_MANY_OPERATIONS_IN_REQUEST_PART);
    public static final BulkMutateJobErrorReason TOO_MANY_RESULTS_TO_STORE = new BulkMutateJobErrorReason(_TOO_MANY_RESULTS_TO_STORE);
    public static final BulkMutateJobErrorReason TOO_MANY_SCOPING_ENTITIES = new BulkMutateJobErrorReason(_TOO_MANY_SCOPING_ENTITIES);
    public static final BulkMutateJobErrorReason UNKNOWN = new BulkMutateJobErrorReason(_UNKNOWN);
    public static final BulkMutateJobErrorReason LOST_RESULT = new BulkMutateJobErrorReason(_LOST_RESULT);
    public static final BulkMutateJobErrorReason UNPROCESSED_RESULT = new BulkMutateJobErrorReason(_UNPROCESSED_RESULT);
    public static final BulkMutateJobErrorReason BATCH_FAILURE = new BulkMutateJobErrorReason(_BATCH_FAILURE);
    public static final BulkMutateJobErrorReason SERVICE_PROVIDED_NO_RESULT = new BulkMutateJobErrorReason(_SERVICE_PROVIDED_NO_RESULT);
    public java.lang.String getValue() { return _value_;}
    public static BulkMutateJobErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BulkMutateJobErrorReason enumeration = (BulkMutateJobErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BulkMutateJobErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BulkMutateJobErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "BulkMutateJobError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
