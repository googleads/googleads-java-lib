/**
 * AdScheduleTargetList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201409.cm;


/**
 * List of ad schedule targets.
 */
public class AdScheduleTargetList  extends com.google.api.ads.adwords.axis.v201409.cm.TargetList  implements java.io.Serializable {
    /* List of ad schedule targets. An empty list means all time is
     * targeted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget[] targets;

    public AdScheduleTargetList() {
    }

    public AdScheduleTargetList(
           java.lang.Long campaignId,
           java.lang.String targetListType,
           com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget[] targets) {
        super(
            campaignId,
            targetListType);
        this.targets = targets;
    }


    /**
     * Gets the targets value for this AdScheduleTargetList.
     * 
     * @return targets   * List of ad schedule targets. An empty list means all time is
     * targeted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget[] getTargets() {
        return targets;
    }


    /**
     * Sets the targets value for this AdScheduleTargetList.
     * 
     * @param targets   * List of ad schedule targets. An empty list means all time is
     * targeted.
     *                     <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                     <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public void setTargets(com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget[] targets) {
        this.targets = targets;
    }

    public com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget getTargets(int i) {
        return this.targets[i];
    }

    public void setTargets(int i, com.google.api.ads.adwords.axis.v201409.cm.AdScheduleTarget _value) {
        this.targets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdScheduleTargetList)) return false;
        AdScheduleTargetList other = (AdScheduleTargetList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.targets==null && other.getTargets()==null) || 
             (this.targets!=null &&
              java.util.Arrays.equals(this.targets, other.getTargets())));
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
        if (getTargets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargets(), i);
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
        new org.apache.axis.description.TypeDesc(AdScheduleTargetList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdScheduleTargetList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "targets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201409", "AdScheduleTarget"));
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
