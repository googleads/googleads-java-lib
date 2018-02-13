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
 * Statement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Captures the {@code WHERE}, {@code ORDER BY} and {@code LIMIT}
 * clauses of a
 *             PQL query. Statements are typically used to retrieve objects
 * of a predefined
 *             domain type, which makes SELECT clause unnecessary.
 *             <p>
 *             An example query text might be {@code "WHERE status =
 * 'ACTIVE' ORDER BY id
 *             LIMIT 30"}.
 *             </p>
 *             <p>
 *             Statements support bind variables. These are substitutes
 * for literals
 *             and can be thought of as input parameters to a PQL query.
 * </p>
 *             <p>
 *             An example of such a query might be {@code "WHERE id =
 * :idValue"}.
 *             </p>
 *             <p>
 *             Statements also support use of the LIKE keyword. This
 * provides partial and
 *             wildcard string matching.
 *             </p>
 *             <p>
 *             An example of such a query might be {@code "WHERE name
 * LIKE 'startswith%'"}.
 *             </p>
 *             The value for the variable idValue must then be set with
 * an object of type
 *             {@link Value}, e.g., {@link NumberValue}, {@link TextValue}
 * or
 *             {@link BooleanValue}.
 */
public class Statement  implements java.io.Serializable {
    /* Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><condition> := <property> LIKE <wildcard%match></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </p> */
    private java.lang.String query;

    /* Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p> */
    private com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry[] values;

    public Statement() {
    }

    public Statement(
           java.lang.String query,
           com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry[] values) {
           this.query = query;
           this.values = values;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("query", getQuery())
            .add("values", getValues())
            .toString();
    }

    /**
     * Gets the query value for this Statement.
     * 
     * @return query   * Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><condition> := <property> LIKE <wildcard%match></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </p>
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this Statement.
     * 
     * @param query   * Holds the query in PQL syntax. The syntax is:<br>
     *                 <code>[WHERE <condition> {[AND | OR] <condition> ...}]</code><br>
     * <code>[ORDER BY <property> [ASC | DESC]]</code><br>
     *                 <code>[LIMIT {[<offset>,] <count>} | {<count> OFFSET
     * <offset>}]</code><br>
     *                 <p>
     *                 <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <value></code><br>
     * <code><condition></code><br>
     *                 &nbsp;&nbsp;&nbsp;&nbsp;
     *                 <code>:= <property> {< | <= | > | >= | = | != } <bind
     * variable></code><br>
     *                 <code><condition> := <property> IN <list></code><br>
     * <code><condition> := <property> IS NULL</code><br>
     *                 <code><condition> := <property> LIKE <wildcard%match></code><br>
     * <code><bind variable> := :<name></code><br>
     *                 </p>
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the values value for this Statement.
     * 
     * @return values   * Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p>
     */
    public com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this Statement.
     * 
     * @param values   * Holds keys and values for bind variables and their values.
     * The key is the
     *                 name of the bind variable. The value is the literal
     * value of the variable.
     *                 <p>
     *                 In the example {@code "WHERE status = :bindStatus
     * ORDER BY id LIMIT 30"},
     *                 the bind variable, represented by {@code :bindStatus}
     * is named {@code
     *                 bindStatus}, which would also be the parameter map
     * key. The bind variable's
     *                 value would be represented by a parameter map value
     * of type
     *                 {@link TextValue}. The final result, for example,
     * would be an entry of
     *                 {@code "bindStatus" => StringParam("ACTIVE")}.
     *                 </p>
     */
    public void setValues(com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry[] values) {
        this.values = values;
    }

    public com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.google.api.ads.dfp.axis.v201802.String_ValueMapEntry _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Statement)) return false;
        Statement other = (Statement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(Statement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Statement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "String_ValueMapEntry"));
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
