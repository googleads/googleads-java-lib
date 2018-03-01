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
 * Rule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * A client defined rule based on custom parameters sent by web sites.
 */
public class Rule  implements java.io.Serializable {
    /* List of rule item groups that defines this rule.
     *                 Rule item groups are ORed together for evaluation
     * before version V201705.
     *                 Starting from version V201705, rule item groups are
     * grouped together based on
     *                 {@link #getRuleType()} for evaluation.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup[] groups;

    /* Rule type is used to determine how to group rule item groups
     * and rule items inside rule item
     *                 group. Currently, conjunctive normal form (AND of
     * ORs) is only supported for
     *                 ExpressionRuleUserList. If no ruleType is specified,
     * it will be treated as disjunctive normal
     *                 form (OR of ANDs), namely rule item groups are ORed
     * together and inside each rule item group,
     *                 rule items are ANDed together. */
    private com.google.api.ads.adwords.axis.v201802.rm.UserListRuleTypeEnumsEnum ruleType;

    public Rule() {
    }

    public Rule(
           com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup[] groups,
           com.google.api.ads.adwords.axis.v201802.rm.UserListRuleTypeEnumsEnum ruleType) {
           this.groups = groups;
           this.ruleType = ruleType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("groups", getGroups())
            .add("ruleType", getRuleType())
            .toString();
    }

    /**
     * Gets the groups value for this Rule.
     * 
     * @return groups   * List of rule item groups that defines this rule.
     *                 Rule item groups are ORed together for evaluation
     * before version V201705.
     *                 Starting from version V201705, rule item groups are
     * grouped together based on
     *                 {@link #getRuleType()} for evaluation.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this Rule.
     * 
     * @param groups   * List of rule item groups that defines this rule.
     *                 Rule item groups are ORed together for evaluation
     * before version V201705.
     *                 Starting from version V201705, rule item groups are
     * grouped together based on
     *                 {@link #getRuleType()} for evaluation.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setGroups(com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup[] groups) {
        this.groups = groups;
    }

    public com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup getGroups(int i) {
        return this.groups[i];
    }

    public void setGroups(int i, com.google.api.ads.adwords.axis.v201802.rm.RuleItemGroup _value) {
        this.groups[i] = _value;
    }


    /**
     * Gets the ruleType value for this Rule.
     * 
     * @return ruleType   * Rule type is used to determine how to group rule item groups
     * and rule items inside rule item
     *                 group. Currently, conjunctive normal form (AND of
     * ORs) is only supported for
     *                 ExpressionRuleUserList. If no ruleType is specified,
     * it will be treated as disjunctive normal
     *                 form (OR of ANDs), namely rule item groups are ORed
     * together and inside each rule item group,
     *                 rule items are ANDed together.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListRuleTypeEnumsEnum getRuleType() {
        return ruleType;
    }


    /**
     * Sets the ruleType value for this Rule.
     * 
     * @param ruleType   * Rule type is used to determine how to group rule item groups
     * and rule items inside rule item
     *                 group. Currently, conjunctive normal form (AND of
     * ORs) is only supported for
     *                 ExpressionRuleUserList. If no ruleType is specified,
     * it will be treated as disjunctive normal
     *                 form (OR of ANDs), namely rule item groups are ORed
     * together and inside each rule item group,
     *                 rule items are ANDed together.
     */
    public void setRuleType(com.google.api.ads.adwords.axis.v201802.rm.UserListRuleTypeEnumsEnum ruleType) {
        this.ruleType = ruleType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rule)) return false;
        Rule other = (Rule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            ((this.ruleType==null && other.getRuleType()==null) || 
             (this.ruleType!=null &&
              this.ruleType.equals(other.getRuleType())));
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
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRuleType() != null) {
            _hashCode += getRuleType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "Rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "RuleItemGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "ruleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "UserListRuleTypeEnums.Enum"));
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
