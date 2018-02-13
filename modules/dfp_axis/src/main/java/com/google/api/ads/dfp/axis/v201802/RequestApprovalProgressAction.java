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
 * RequestApprovalProgressAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Action requiring approval before the workflow can continue.
 */
public class RequestApprovalProgressAction  extends com.google.api.ads.dfp.axis.v201802.ProgressAction  implements java.io.Serializable {
    /* The {@link User#ID} of the user who performed this action. */
    private java.lang.Long approverId;

    /* The {@link User#id IDs} of users who are eligible to approve
     * this action. */
    private long[] eligibleApproverUserIds;

    /* The {@link Team#id IDs} of teams who are eligible to approve
     * this action. */
    private long[] eligibleApproverTeamIds;

    /* A comment left by the {@link #approverId approver}. */
    private java.lang.String comment;

    /* The approval status of this action. */
    private com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus approvalStatus;

    public RequestApprovalProgressAction() {
    }

    public RequestApprovalProgressAction(
           com.google.api.ads.dfp.axis.v201802.DateTime evaluationTime,
           com.google.api.ads.dfp.axis.v201802.EvaluationStatus evaluationStatus,
           java.lang.Long approverId,
           long[] eligibleApproverUserIds,
           long[] eligibleApproverTeamIds,
           java.lang.String comment,
           com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus approvalStatus) {
        super(
            evaluationTime,
            evaluationStatus);
        this.approverId = approverId;
        this.eligibleApproverUserIds = eligibleApproverUserIds;
        this.eligibleApproverTeamIds = eligibleApproverTeamIds;
        this.comment = comment;
        this.approvalStatus = approvalStatus;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("approvalStatus", getApprovalStatus())
            .add("approverId", getApproverId())
            .add("comment", getComment())
            .add("eligibleApproverTeamIds", getEligibleApproverTeamIds())
            .add("eligibleApproverUserIds", getEligibleApproverUserIds())
            .add("evaluationStatus", getEvaluationStatus())
            .add("evaluationTime", getEvaluationTime())
            .toString();
    }

    /**
     * Gets the approverId value for this RequestApprovalProgressAction.
     * 
     * @return approverId   * The {@link User#ID} of the user who performed this action.
     */
    public java.lang.Long getApproverId() {
        return approverId;
    }


    /**
     * Sets the approverId value for this RequestApprovalProgressAction.
     * 
     * @param approverId   * The {@link User#ID} of the user who performed this action.
     */
    public void setApproverId(java.lang.Long approverId) {
        this.approverId = approverId;
    }


    /**
     * Gets the eligibleApproverUserIds value for this RequestApprovalProgressAction.
     * 
     * @return eligibleApproverUserIds   * The {@link User#id IDs} of users who are eligible to approve
     * this action.
     */
    public long[] getEligibleApproverUserIds() {
        return eligibleApproverUserIds;
    }


    /**
     * Sets the eligibleApproverUserIds value for this RequestApprovalProgressAction.
     * 
     * @param eligibleApproverUserIds   * The {@link User#id IDs} of users who are eligible to approve
     * this action.
     */
    public void setEligibleApproverUserIds(long[] eligibleApproverUserIds) {
        this.eligibleApproverUserIds = eligibleApproverUserIds;
    }

    public long getEligibleApproverUserIds(int i) {
        return this.eligibleApproverUserIds[i];
    }

    public void setEligibleApproverUserIds(int i, long _value) {
        this.eligibleApproverUserIds[i] = _value;
    }


    /**
     * Gets the eligibleApproverTeamIds value for this RequestApprovalProgressAction.
     * 
     * @return eligibleApproverTeamIds   * The {@link Team#id IDs} of teams who are eligible to approve
     * this action.
     */
    public long[] getEligibleApproverTeamIds() {
        return eligibleApproverTeamIds;
    }


    /**
     * Sets the eligibleApproverTeamIds value for this RequestApprovalProgressAction.
     * 
     * @param eligibleApproverTeamIds   * The {@link Team#id IDs} of teams who are eligible to approve
     * this action.
     */
    public void setEligibleApproverTeamIds(long[] eligibleApproverTeamIds) {
        this.eligibleApproverTeamIds = eligibleApproverTeamIds;
    }

    public long getEligibleApproverTeamIds(int i) {
        return this.eligibleApproverTeamIds[i];
    }

    public void setEligibleApproverTeamIds(int i, long _value) {
        this.eligibleApproverTeamIds[i] = _value;
    }


    /**
     * Gets the comment value for this RequestApprovalProgressAction.
     * 
     * @return comment   * A comment left by the {@link #approverId approver}.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RequestApprovalProgressAction.
     * 
     * @param comment   * A comment left by the {@link #approverId approver}.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the approvalStatus value for this RequestApprovalProgressAction.
     * 
     * @return approvalStatus   * The approval status of this action.
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this RequestApprovalProgressAction.
     * 
     * @param approvalStatus   * The approval status of this action.
     */
    public void setApprovalStatus(com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestApprovalProgressAction)) return false;
        RequestApprovalProgressAction other = (RequestApprovalProgressAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approverId==null && other.getApproverId()==null) || 
             (this.approverId!=null &&
              this.approverId.equals(other.getApproverId()))) &&
            ((this.eligibleApproverUserIds==null && other.getEligibleApproverUserIds()==null) || 
             (this.eligibleApproverUserIds!=null &&
              java.util.Arrays.equals(this.eligibleApproverUserIds, other.getEligibleApproverUserIds()))) &&
            ((this.eligibleApproverTeamIds==null && other.getEligibleApproverTeamIds()==null) || 
             (this.eligibleApproverTeamIds!=null &&
              java.util.Arrays.equals(this.eligibleApproverTeamIds, other.getEligibleApproverTeamIds()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus())));
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
        if (getApproverId() != null) {
            _hashCode += getApproverId().hashCode();
        }
        if (getEligibleApproverUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEligibleApproverUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEligibleApproverUserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEligibleApproverTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEligibleApproverTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEligibleApproverTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestApprovalProgressAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RequestApprovalProgressAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approverId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "approverId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleApproverUserIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "eligibleApproverUserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleApproverTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "eligibleApproverTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowApprovalRequestStatus"));
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
