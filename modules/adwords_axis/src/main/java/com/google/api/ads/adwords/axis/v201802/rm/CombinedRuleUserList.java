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
 * CombinedRuleUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * Users defined by combining two rules, left operand and right operand.
 * There are two operators:
 *             AND where left operand and right operand have to be true;
 * AND_NOT where left operand is true but
 *             right operand is false.
 */
public class CombinedRuleUserList  extends com.google.api.ads.adwords.axis.v201802.rm.RuleBasedUserList  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.Rule leftOperand;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.Rule rightOperand;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.CombinedRuleUserListRuleOperator ruleOperator;

    public CombinedRuleUserList() {
    }

    public CombinedRuleUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201802.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201802.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRange,
           java.lang.Long sizeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.SizeRange sizeRangeForSearch,
           com.google.api.ads.adwords.axis.v201802.rm.UserListType listType,
           java.lang.Boolean isEligibleForSearch,
           java.lang.Boolean isEligibleForDisplay,
           com.google.api.ads.adwords.axis.v201802.rm.UserListClosingReason closingReason,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201802.rm.RuleBasedUserListPrepopulationStatus prepopulationStatus,
           com.google.api.ads.adwords.axis.v201802.rm.Rule leftOperand,
           com.google.api.ads.adwords.axis.v201802.rm.Rule rightOperand,
           com.google.api.ads.adwords.axis.v201802.rm.CombinedRuleUserListRuleOperator ruleOperator) {
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
            isEligibleForDisplay,
            closingReason,
            userListType,
            prepopulationStatus);
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.ruleOperator = ruleOperator;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accessReason", getAccessReason())
            .add("accountUserListStatus", getAccountUserListStatus())
            .add("closingReason", getClosingReason())
            .add("description", getDescription())
            .add("id", getId())
            .add("integrationCode", getIntegrationCode())
            .add("isEligibleForDisplay", getIsEligibleForDisplay())
            .add("isEligibleForSearch", getIsEligibleForSearch())
            .add("isReadOnly", getIsReadOnly())
            .add("leftOperand", getLeftOperand())
            .add("listType", getListType())
            .add("membershipLifeSpan", getMembershipLifeSpan())
            .add("name", getName())
            .add("prepopulationStatus", getPrepopulationStatus())
            .add("rightOperand", getRightOperand())
            .add("ruleOperator", getRuleOperator())
            .add("size", getSize())
            .add("sizeForSearch", getSizeForSearch())
            .add("sizeRange", getSizeRange())
            .add("sizeRangeForSearch", getSizeRangeForSearch())
            .add("status", getStatus())
            .add("userListType", getUserListType())
            .toString();
    }

    /**
     * Gets the leftOperand value for this CombinedRuleUserList.
     * 
     * @return leftOperand   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.Rule getLeftOperand() {
        return leftOperand;
    }


    /**
     * Sets the leftOperand value for this CombinedRuleUserList.
     * 
     * @param leftOperand   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setLeftOperand(com.google.api.ads.adwords.axis.v201802.rm.Rule leftOperand) {
        this.leftOperand = leftOperand;
    }


    /**
     * Gets the rightOperand value for this CombinedRuleUserList.
     * 
     * @return rightOperand   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.Rule getRightOperand() {
        return rightOperand;
    }


    /**
     * Sets the rightOperand value for this CombinedRuleUserList.
     * 
     * @param rightOperand   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setRightOperand(com.google.api.ads.adwords.axis.v201802.rm.Rule rightOperand) {
        this.rightOperand = rightOperand;
    }


    /**
     * Gets the ruleOperator value for this CombinedRuleUserList.
     * 
     * @return ruleOperator   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.CombinedRuleUserListRuleOperator getRuleOperator() {
        return ruleOperator;
    }


    /**
     * Sets the ruleOperator value for this CombinedRuleUserList.
     * 
     * @param ruleOperator   * <span class="constraint Required">This field is required and
     * should not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setRuleOperator(com.google.api.ads.adwords.axis.v201802.rm.CombinedRuleUserListRuleOperator ruleOperator) {
        this.ruleOperator = ruleOperator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CombinedRuleUserList)) return false;
        CombinedRuleUserList other = (CombinedRuleUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.leftOperand==null && other.getLeftOperand()==null) || 
             (this.leftOperand!=null &&
              this.leftOperand.equals(other.getLeftOperand()))) &&
            ((this.rightOperand==null && other.getRightOperand()==null) || 
             (this.rightOperand!=null &&
              this.rightOperand.equals(other.getRightOperand()))) &&
            ((this.ruleOperator==null && other.getRuleOperator()==null) || 
             (this.ruleOperator!=null &&
              this.ruleOperator.equals(other.getRuleOperator())));
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
        if (getLeftOperand() != null) {
            _hashCode += getLeftOperand().hashCode();
        }
        if (getRightOperand() != null) {
            _hashCode += getRightOperand().hashCode();
        }
        if (getRuleOperator() != null) {
            _hashCode += getRuleOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CombinedRuleUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "CombinedRuleUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftOperand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "leftOperand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "Rule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rightOperand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "rightOperand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "Rule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "ruleOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "CombinedRuleUserList.RuleOperator"));
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
