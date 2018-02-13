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
 * WorkflowActionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class WorkflowActionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WorkflowActionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_APPLICABLE = "NOT_APPLICABLE";
    public static final java.lang.String _WORKFLOW_DEFINITION_NOT_FOUND = "WORKFLOW_DEFINITION_NOT_FOUND";
    public static final java.lang.String _EMPTY_ACTION_LIST = "EMPTY_ACTION_LIST";
    public static final java.lang.String _NOT_ACTION_APPROVER = "NOT_ACTION_APPROVER";
    public static final java.lang.String _WORKFLOW_ALREADY_COMPLETED = "WORKFLOW_ALREADY_COMPLETED";
    public static final java.lang.String _WORKFLOW_ALREADY_FAILED = "WORKFLOW_ALREADY_FAILED";
    public static final java.lang.String _WORKFLOW_ALREADY_CANCELED = "WORKFLOW_ALREADY_CANCELED";
    public static final java.lang.String _ACTION_COMPLETED = "ACTION_COMPLETED";
    public static final java.lang.String _ACTION_FAILED = "ACTION_FAILED";
    public static final java.lang.String _ACTION_CANCELED = "ACTION_CANCELED";
    public static final java.lang.String _ACTION_NOT_ACTIVE = "ACTION_NOT_ACTIVE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final WorkflowActionErrorReason NOT_APPLICABLE = new WorkflowActionErrorReason(_NOT_APPLICABLE);
    public static final WorkflowActionErrorReason WORKFLOW_DEFINITION_NOT_FOUND = new WorkflowActionErrorReason(_WORKFLOW_DEFINITION_NOT_FOUND);
    public static final WorkflowActionErrorReason EMPTY_ACTION_LIST = new WorkflowActionErrorReason(_EMPTY_ACTION_LIST);
    public static final WorkflowActionErrorReason NOT_ACTION_APPROVER = new WorkflowActionErrorReason(_NOT_ACTION_APPROVER);
    public static final WorkflowActionErrorReason WORKFLOW_ALREADY_COMPLETED = new WorkflowActionErrorReason(_WORKFLOW_ALREADY_COMPLETED);
    public static final WorkflowActionErrorReason WORKFLOW_ALREADY_FAILED = new WorkflowActionErrorReason(_WORKFLOW_ALREADY_FAILED);
    public static final WorkflowActionErrorReason WORKFLOW_ALREADY_CANCELED = new WorkflowActionErrorReason(_WORKFLOW_ALREADY_CANCELED);
    public static final WorkflowActionErrorReason ACTION_COMPLETED = new WorkflowActionErrorReason(_ACTION_COMPLETED);
    public static final WorkflowActionErrorReason ACTION_FAILED = new WorkflowActionErrorReason(_ACTION_FAILED);
    public static final WorkflowActionErrorReason ACTION_CANCELED = new WorkflowActionErrorReason(_ACTION_CANCELED);
    public static final WorkflowActionErrorReason ACTION_NOT_ACTIVE = new WorkflowActionErrorReason(_ACTION_NOT_ACTIVE);
    public static final WorkflowActionErrorReason UNKNOWN = new WorkflowActionErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static WorkflowActionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WorkflowActionErrorReason enumeration = (WorkflowActionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WorkflowActionErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WorkflowActionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowActionError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
