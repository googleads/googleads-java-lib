/**
 * UserListLogicalRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.provider;


/**
 * A user list logical rule. A rule has a logical operator (and/or/not)
 * and a
 *             list of operands that can be user lists or user interests.
 */
public class UserListLogicalRule  implements java.io.Serializable {
    /* The logical operator of the rule.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.ddp.axis.v201603.provider.UserListLogicalRuleOperator operator;

    /* The list of operands of the rule.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand[] ruleOperands;

    public UserListLogicalRule() {
    }

    public UserListLogicalRule(
           com.google.api.ads.ddp.axis.v201603.provider.UserListLogicalRuleOperator operator,
           com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand[] ruleOperands) {
           this.operator = operator;
           this.ruleOperands = ruleOperands;
    }


    /**
     * Gets the operator value for this UserListLogicalRule.
     * 
     * @return operator   * The logical operator of the rule.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.provider.UserListLogicalRuleOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this UserListLogicalRule.
     * 
     * @param operator   * The logical operator of the rule.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperator(com.google.api.ads.ddp.axis.v201603.provider.UserListLogicalRuleOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the ruleOperands value for this UserListLogicalRule.
     * 
     * @return ruleOperands   * The list of operands of the rule.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand[] getRuleOperands() {
        return ruleOperands;
    }


    /**
     * Sets the ruleOperands value for this UserListLogicalRule.
     * 
     * @param ruleOperands   * The list of operands of the rule.
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     *                 <span class="constraint NotEmpty">This field must
     * contain at least one element.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setRuleOperands(com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand[] ruleOperands) {
        this.ruleOperands = ruleOperands;
    }

    public com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand getRuleOperands(int i) {
        return this.ruleOperands[i];
    }

    public void setRuleOperands(int i, com.google.api.ads.ddp.axis.v201603.provider.LogicalUserListOperand _value) {
        this.ruleOperands[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserListLogicalRule)) return false;
        UserListLogicalRule other = (UserListLogicalRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.ruleOperands==null && other.getRuleOperands()==null) || 
             (this.ruleOperands!=null &&
              java.util.Arrays.equals(this.ruleOperands, other.getRuleOperands())));
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
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getRuleOperands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRuleOperands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRuleOperands(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserListLogicalRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListLogicalRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "UserListLogicalRule.Operator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleOperands");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "ruleOperands"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/provider/v201603", "LogicalUserListOperand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
