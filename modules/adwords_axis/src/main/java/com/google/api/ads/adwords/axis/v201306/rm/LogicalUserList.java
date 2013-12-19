/**
 * LogicalUserList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.rm;


/**
 * Represents a user list that is a custom combination of user lists
 * and user
 *             interests.
 */
public class LogicalUserList  extends com.google.api.ads.adwords.axis.v201306.rm.UserList  implements java.io.Serializable {
    /* Logical list rules that define this user list.  The rules are
     * defined as
     *                     logical operator (ALL/ANY/NONE) and a list of
     * user lists. All the rules are
     *                     anded for the evaluation.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Rules".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule[] rules;

    public LogicalUserList() {
    }

    public LogicalUserList(
           java.lang.Long id,
           java.lang.Boolean isReadOnly,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201306.rm.UserListMembershipStatus status,
           java.lang.String integrationCode,
           com.google.api.ads.adwords.axis.v201306.rm.AccessReason accessReason,
           com.google.api.ads.adwords.axis.v201306.rm.AccountUserListStatus accountUserListStatus,
           java.lang.Long membershipLifeSpan,
           java.lang.Long size,
           com.google.api.ads.adwords.axis.v201306.rm.SizeRange sizeRange,
           java.lang.String userListType,
           com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule[] rules) {
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
            userListType);
        this.rules = rules;
    }


    /**
     * Gets the rules value for this LogicalUserList.
     * 
     * @return rules   * Logical list rules that define this user list.  The rules are
     * defined as
     *                     logical operator (ALL/ANY/NONE) and a list of
     * user lists. All the rules are
     *                     anded for the evaluation.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Rules".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule[] getRules() {
        return rules;
    }


    /**
     * Sets the rules value for this LogicalUserList.
     * 
     * @param rules   * Logical list rules that define this user list.  The rules are
     * defined as
     *                     logical operator (ALL/ANY/NONE) and a list of
     * user lists. All the rules are
     *                     anded for the evaluation.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Rules".</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setRules(com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule[] rules) {
        this.rules = rules;
    }

    public com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule getRules(int i) {
        return this.rules[i];
    }

    public void setRules(int i, com.google.api.ads.adwords.axis.v201306.rm.UserListLogicalRule _value) {
        this.rules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LogicalUserList)) return false;
        LogicalUserList other = (LogicalUserList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rules==null && other.getRules()==null) || 
             (this.rules!=null &&
              java.util.Arrays.equals(this.rules, other.getRules())));
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
        if (getRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRules(), i);
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
        new org.apache.axis.description.TypeDesc(LogicalUserList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "LogicalUserList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rules");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201306", "UserListLogicalRule"));
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
