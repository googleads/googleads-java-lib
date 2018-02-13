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
 * TeamErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class TeamErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TeamErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENTITY_NOT_ON_USERS_TEAMS = "ENTITY_NOT_ON_USERS_TEAMS";
    public static final java.lang.String _AD_UNITS_NOT_ON_ORDER_TEAMS = "AD_UNITS_NOT_ON_ORDER_TEAMS";
    public static final java.lang.String _PLACEMENTS_NOT_ON_ORDER_TEAMS = "PLACEMENTS_NOT_ON_ORDER_TEAMS";
    public static final java.lang.String _MISSING_USERS_TEAM = "MISSING_USERS_TEAM";
    public static final java.lang.String _ALL_TEAM_ASSOCIATION_NOT_ALLOWED = "ALL_TEAM_ASSOCIATION_NOT_ALLOWED";
    public static final java.lang.String _INVALID_TEAM_ASSIGNMENT = "INVALID_TEAM_ASSIGNMENT";
    public static final java.lang.String _ALL_TEAM_ACCESS_OVERRIDE_NOT_ALLOWED = "ALL_TEAM_ACCESS_OVERRIDE_NOT_ALLOWED";
    public static final java.lang.String _CANNOT_UPDATE_INACTIVE_TEAM = "CANNOT_UPDATE_INACTIVE_TEAM";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final TeamErrorReason ENTITY_NOT_ON_USERS_TEAMS = new TeamErrorReason(_ENTITY_NOT_ON_USERS_TEAMS);
    public static final TeamErrorReason AD_UNITS_NOT_ON_ORDER_TEAMS = new TeamErrorReason(_AD_UNITS_NOT_ON_ORDER_TEAMS);
    public static final TeamErrorReason PLACEMENTS_NOT_ON_ORDER_TEAMS = new TeamErrorReason(_PLACEMENTS_NOT_ON_ORDER_TEAMS);
    public static final TeamErrorReason MISSING_USERS_TEAM = new TeamErrorReason(_MISSING_USERS_TEAM);
    public static final TeamErrorReason ALL_TEAM_ASSOCIATION_NOT_ALLOWED = new TeamErrorReason(_ALL_TEAM_ASSOCIATION_NOT_ALLOWED);
    public static final TeamErrorReason INVALID_TEAM_ASSIGNMENT = new TeamErrorReason(_INVALID_TEAM_ASSIGNMENT);
    public static final TeamErrorReason ALL_TEAM_ACCESS_OVERRIDE_NOT_ALLOWED = new TeamErrorReason(_ALL_TEAM_ACCESS_OVERRIDE_NOT_ALLOWED);
    public static final TeamErrorReason CANNOT_UPDATE_INACTIVE_TEAM = new TeamErrorReason(_CANNOT_UPDATE_INACTIVE_TEAM);
    public static final TeamErrorReason UNKNOWN = new TeamErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static TeamErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TeamErrorReason enumeration = (TeamErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TeamErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TeamErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TeamError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
