/**
 * CallToAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * YouTube video call-to-action overlay.
 *             
 *             <p>A call-to-action is composed of creative data (headline,
 * description lines, etc) that is
 *             displayed as an overlay on a YouTube video. Each YouTube
 * video can have at most one
 *             call-to-action that is always displayed when a user views
 * the video on the YouTube site.
 *             
 *             <p>The call-to-action also contains url data: a display
 * url that is displayed as a part of the
 *             overlay and a destination url that determines where the
 * user is redirected if they click on the
 *             call-to-action.
 */
public class CallToAction  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.CallToActionCreative creative;

    /* A flag to indicate if this CallToAction should be shown on
     * mobile devices.
     *                 If not specified, it defaults to {@code true}. */
    private java.lang.Boolean isEnabledOnMobile;

    /* The main status of the call-to-action indicates whether the
     * call-to-action will be displayed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.CallToActionStatus status;

    /* List of policy violations triggered by the call-to-action's
     * creative. They do not block
     *                 creation but may block display.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation[] policyViolations;

    public CallToAction() {
    }

    public CallToAction(
           com.google.api.ads.adwords.axis.v201406.video.CallToActionCreative creative,
           java.lang.Boolean isEnabledOnMobile,
           com.google.api.ads.adwords.axis.v201406.video.CallToActionStatus status,
           com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation[] policyViolations) {
           this.creative = creative;
           this.isEnabledOnMobile = isEnabledOnMobile;
           this.status = status;
           this.policyViolations = policyViolations;
    }


    /**
     * Gets the creative value for this CallToAction.
     * 
     * @return creative   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.CallToActionCreative getCreative() {
        return creative;
    }


    /**
     * Sets the creative value for this CallToAction.
     * 
     * @param creative   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setCreative(com.google.api.ads.adwords.axis.v201406.video.CallToActionCreative creative) {
        this.creative = creative;
    }


    /**
     * Gets the isEnabledOnMobile value for this CallToAction.
     * 
     * @return isEnabledOnMobile   * A flag to indicate if this CallToAction should be shown on
     * mobile devices.
     *                 If not specified, it defaults to {@code true}.
     */
    public java.lang.Boolean getIsEnabledOnMobile() {
        return isEnabledOnMobile;
    }


    /**
     * Sets the isEnabledOnMobile value for this CallToAction.
     * 
     * @param isEnabledOnMobile   * A flag to indicate if this CallToAction should be shown on
     * mobile devices.
     *                 If not specified, it defaults to {@code true}.
     */
    public void setIsEnabledOnMobile(java.lang.Boolean isEnabledOnMobile) {
        this.isEnabledOnMobile = isEnabledOnMobile;
    }


    /**
     * Gets the status value for this CallToAction.
     * 
     * @return status   * The main status of the call-to-action indicates whether the
     * call-to-action will be displayed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.CallToActionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CallToAction.
     * 
     * @param status   * The main status of the call-to-action indicates whether the
     * call-to-action will be displayed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201406.video.CallToActionStatus status) {
        this.status = status;
    }


    /**
     * Gets the policyViolations value for this CallToAction.
     * 
     * @return policyViolations   * List of policy violations triggered by the call-to-action's
     * creative. They do not block
     *                 creation but may block display.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation[] getPolicyViolations() {
        return policyViolations;
    }


    /**
     * Sets the policyViolations value for this CallToAction.
     * 
     * @param policyViolations   * List of policy violations triggered by the call-to-action's
     * creative. They do not block
     *                 creation but may block display.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setPolicyViolations(com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation[] policyViolations) {
        this.policyViolations = policyViolations;
    }

    public com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation getPolicyViolations(int i) {
        return this.policyViolations[i];
    }

    public void setPolicyViolations(int i, com.google.api.ads.adwords.axis.v201406.video.CallToActionPolicyViolation _value) {
        this.policyViolations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallToAction)) return false;
        CallToAction other = (CallToAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creative==null && other.getCreative()==null) || 
             (this.creative!=null &&
              this.creative.equals(other.getCreative()))) &&
            ((this.isEnabledOnMobile==null && other.getIsEnabledOnMobile()==null) || 
             (this.isEnabledOnMobile!=null &&
              this.isEnabledOnMobile.equals(other.getIsEnabledOnMobile()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.policyViolations==null && other.getPolicyViolations()==null) || 
             (this.policyViolations!=null &&
              java.util.Arrays.equals(this.policyViolations, other.getPolicyViolations())));
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
        if (getCreative() != null) {
            _hashCode += getCreative().hashCode();
        }
        if (getIsEnabledOnMobile() != null) {
            _hashCode += getIsEnabledOnMobile().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPolicyViolations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyViolations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyViolations(), i);
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
        new org.apache.axis.description.TypeDesc(CallToAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CallToAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "creative"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CallToAction.Creative"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnabledOnMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "isEnabledOnMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CallToAction.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyViolations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "policyViolations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "CallToAction.PolicyViolation"));
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
