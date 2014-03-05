/**
 * Function.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents a function where its operator is applied to its argument
 * operands
 *             resulting in a return value. It has the form
 *             (Operand... Operator Operand...). The type of the return
 * value depends on
 *             the operator being applied and the type of the operands.
 * 
 *             <p class="special">Operands per function is limited to
 * <b>20</b>.</p>
 *             
 *             <p>Here is a code example:</p>
 *             
 *             <pre><code>
 *             
 *             // For example "feed_attribute == 30" can be represented
 * as:
 *             FeedId feedId = (FeedId of Feed associated with feed_attribute)
 * FeedAttributeId feedAttributeId = (FeedAttributeId of feed_attribute)
 * Function function = new Function();
 *             function.setLhsOperand(
 *             Arrays.asList((Operand) new FeedAttributeOperand(feedId,
 * feedAttributeId)));
 *             function.setOperator(Operator.IN);
 *             function.setRhsOperand(
 *             Arrays.asList((Operand) new ConstantOperand(30L)));
 *             
 *             // Another example matching on multiple values:
 *             "feed_item_id IN (10, 20, 30)" can be represented as:
 *             
 *             Function function = new Function();
 *             function.setLhsOperand(
 *             Arrays.asList((Operand) new RequestContextOperand(ContextType.FEED_ITEM_ID)));
 * function.setOperator(Operator.IN);
 *             function.setRhsOperand(Arrays.asList(
 *             (Operand) new ConstantOperand(10L), new ConstantOperand(20L),
 * new ConstantOperand(30L)));
 *             </code></pre>
 */
public class Function  implements java.io.Serializable {
    /* Operator for a function.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator operator;

    /* Operand on the LHS in the equation. This is also the operand
     * to be used for
     *                 single operand expressions such as NOT.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] lhsOperand;

    /* Operand on the RHS of the equation. */
    private com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] rhsOperand;

    public Function() {
    }

    public Function(
           com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator operator,
           com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] lhsOperand,
           com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] rhsOperand) {
           this.operator = operator;
           this.lhsOperand = lhsOperand;
           this.rhsOperand = rhsOperand;
    }


    /**
     * Gets the operator value for this Function.
     * 
     * @return operator   * Operator for a function.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this Function.
     * 
     * @param operator   * Operator for a function.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setOperator(com.google.api.ads.adwords.axis.v201306.cm.FunctionOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the lhsOperand value for this Function.
     * 
     * @return lhsOperand   * Operand on the LHS in the equation. This is also the operand
     * to be used for
     *                 single operand expressions such as NOT.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] getLhsOperand() {
        return lhsOperand;
    }


    /**
     * Sets the lhsOperand value for this Function.
     * 
     * @param lhsOperand   * Operand on the LHS in the equation. This is also the operand
     * to be used for
     *                 single operand expressions such as NOT.
     *                 <span class="constraint CollectionSize">The minimum
     * size of this collection is 1.</span>
     */
    public void setLhsOperand(com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] lhsOperand) {
        this.lhsOperand = lhsOperand;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand getLhsOperand(int i) {
        return this.lhsOperand[i];
    }

    public void setLhsOperand(int i, com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand _value) {
        this.lhsOperand[i] = _value;
    }


    /**
     * Gets the rhsOperand value for this Function.
     * 
     * @return rhsOperand   * Operand on the RHS of the equation.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] getRhsOperand() {
        return rhsOperand;
    }


    /**
     * Sets the rhsOperand value for this Function.
     * 
     * @param rhsOperand   * Operand on the RHS of the equation.
     */
    public void setRhsOperand(com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand[] rhsOperand) {
        this.rhsOperand = rhsOperand;
    }

    public com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand getRhsOperand(int i) {
        return this.rhsOperand[i];
    }

    public void setRhsOperand(int i, com.google.api.ads.adwords.axis.v201306.cm.FunctionArgumentOperand _value) {
        this.rhsOperand[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Function)) return false;
        Function other = (Function) obj;
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
            ((this.lhsOperand==null && other.getLhsOperand()==null) || 
             (this.lhsOperand!=null &&
              java.util.Arrays.equals(this.lhsOperand, other.getLhsOperand()))) &&
            ((this.rhsOperand==null && other.getRhsOperand()==null) || 
             (this.rhsOperand!=null &&
              java.util.Arrays.equals(this.rhsOperand, other.getRhsOperand())));
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
        if (getLhsOperand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLhsOperand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLhsOperand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRhsOperand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRhsOperand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRhsOperand(), i);
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
        new org.apache.axis.description.TypeDesc(Function.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Function"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Function.Operator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lhsOperand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "lhsOperand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FunctionArgumentOperand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rhsOperand");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "rhsOperand"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "FunctionArgumentOperand"));
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
