/**
 * SharedAdUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;


/**
 * An ad unit that is shared from a distributor network.
 */
public class SharedAdUnit  implements java.io.Serializable {
    /* The ID of the shared ad unit. */
    private java.lang.Long id;

    /* The name of the shared ad unit. */
    private java.lang.String name;

    /* The name of the distribution partner's network name. */
    private java.lang.String distributorName;

    /* The ID of the {@link AdUnit}, in the content provider network,
     * that this shared ad unit
     *                 is linked to. If the shared ad unit was never approved,
     * this value will be {@code null}, as
     *                 there will be no corresponding ad unit within the
     * content provider network. */
    private java.lang.Long contentProviderAdUnitId;

    /* The status of the shared ad unit. */
    private com.google.api.ads.dfp.axis.v201411.SharedAdUnitStatus status;

    /* The target platform of the ad unit being shared. */
    private com.google.api.ads.dfp.axis.v201411.TargetPlatform targetPlatform;

    /* The target window of the ad unit being shared. */
    private com.google.api.ads.dfp.axis.v201411.AdUnitTargetWindow targetWindow;

    /* The sizes of the ad unit being shared. */
    private com.google.api.ads.dfp.axis.v201411.AdUnitSize[] adUnitSizes;

    public SharedAdUnit() {
    }

    public SharedAdUnit(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String distributorName,
           java.lang.Long contentProviderAdUnitId,
           com.google.api.ads.dfp.axis.v201411.SharedAdUnitStatus status,
           com.google.api.ads.dfp.axis.v201411.TargetPlatform targetPlatform,
           com.google.api.ads.dfp.axis.v201411.AdUnitTargetWindow targetWindow,
           com.google.api.ads.dfp.axis.v201411.AdUnitSize[] adUnitSizes) {
           this.id = id;
           this.name = name;
           this.distributorName = distributorName;
           this.contentProviderAdUnitId = contentProviderAdUnitId;
           this.status = status;
           this.targetPlatform = targetPlatform;
           this.targetWindow = targetWindow;
           this.adUnitSizes = adUnitSizes;
    }


    /**
     * Gets the id value for this SharedAdUnit.
     * 
     * @return id   * The ID of the shared ad unit.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SharedAdUnit.
     * 
     * @param id   * The ID of the shared ad unit.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this SharedAdUnit.
     * 
     * @return name   * The name of the shared ad unit.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SharedAdUnit.
     * 
     * @param name   * The name of the shared ad unit.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the distributorName value for this SharedAdUnit.
     * 
     * @return distributorName   * The name of the distribution partner's network name.
     */
    public java.lang.String getDistributorName() {
        return distributorName;
    }


    /**
     * Sets the distributorName value for this SharedAdUnit.
     * 
     * @param distributorName   * The name of the distribution partner's network name.
     */
    public void setDistributorName(java.lang.String distributorName) {
        this.distributorName = distributorName;
    }


    /**
     * Gets the contentProviderAdUnitId value for this SharedAdUnit.
     * 
     * @return contentProviderAdUnitId   * The ID of the {@link AdUnit}, in the content provider network,
     * that this shared ad unit
     *                 is linked to. If the shared ad unit was never approved,
     * this value will be {@code null}, as
     *                 there will be no corresponding ad unit within the
     * content provider network.
     */
    public java.lang.Long getContentProviderAdUnitId() {
        return contentProviderAdUnitId;
    }


    /**
     * Sets the contentProviderAdUnitId value for this SharedAdUnit.
     * 
     * @param contentProviderAdUnitId   * The ID of the {@link AdUnit}, in the content provider network,
     * that this shared ad unit
     *                 is linked to. If the shared ad unit was never approved,
     * this value will be {@code null}, as
     *                 there will be no corresponding ad unit within the
     * content provider network.
     */
    public void setContentProviderAdUnitId(java.lang.Long contentProviderAdUnitId) {
        this.contentProviderAdUnitId = contentProviderAdUnitId;
    }


    /**
     * Gets the status value for this SharedAdUnit.
     * 
     * @return status   * The status of the shared ad unit.
     */
    public com.google.api.ads.dfp.axis.v201411.SharedAdUnitStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SharedAdUnit.
     * 
     * @param status   * The status of the shared ad unit.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201411.SharedAdUnitStatus status) {
        this.status = status;
    }


    /**
     * Gets the targetPlatform value for this SharedAdUnit.
     * 
     * @return targetPlatform   * The target platform of the ad unit being shared.
     */
    public com.google.api.ads.dfp.axis.v201411.TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }


    /**
     * Sets the targetPlatform value for this SharedAdUnit.
     * 
     * @param targetPlatform   * The target platform of the ad unit being shared.
     */
    public void setTargetPlatform(com.google.api.ads.dfp.axis.v201411.TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }


    /**
     * Gets the targetWindow value for this SharedAdUnit.
     * 
     * @return targetWindow   * The target window of the ad unit being shared.
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }


    /**
     * Sets the targetWindow value for this SharedAdUnit.
     * 
     * @param targetWindow   * The target window of the ad unit being shared.
     */
    public void setTargetWindow(com.google.api.ads.dfp.axis.v201411.AdUnitTargetWindow targetWindow) {
        this.targetWindow = targetWindow;
    }


    /**
     * Gets the adUnitSizes value for this SharedAdUnit.
     * 
     * @return adUnitSizes   * The sizes of the ad unit being shared.
     */
    public com.google.api.ads.dfp.axis.v201411.AdUnitSize[] getAdUnitSizes() {
        return adUnitSizes;
    }


    /**
     * Sets the adUnitSizes value for this SharedAdUnit.
     * 
     * @param adUnitSizes   * The sizes of the ad unit being shared.
     */
    public void setAdUnitSizes(com.google.api.ads.dfp.axis.v201411.AdUnitSize[] adUnitSizes) {
        this.adUnitSizes = adUnitSizes;
    }

    public com.google.api.ads.dfp.axis.v201411.AdUnitSize getAdUnitSizes(int i) {
        return this.adUnitSizes[i];
    }

    public void setAdUnitSizes(int i, com.google.api.ads.dfp.axis.v201411.AdUnitSize _value) {
        this.adUnitSizes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedAdUnit)) return false;
        SharedAdUnit other = (SharedAdUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.distributorName==null && other.getDistributorName()==null) || 
             (this.distributorName!=null &&
              this.distributorName.equals(other.getDistributorName()))) &&
            ((this.contentProviderAdUnitId==null && other.getContentProviderAdUnitId()==null) || 
             (this.contentProviderAdUnitId!=null &&
              this.contentProviderAdUnitId.equals(other.getContentProviderAdUnitId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.targetPlatform==null && other.getTargetPlatform()==null) || 
             (this.targetPlatform!=null &&
              this.targetPlatform.equals(other.getTargetPlatform()))) &&
            ((this.targetWindow==null && other.getTargetWindow()==null) || 
             (this.targetWindow!=null &&
              this.targetWindow.equals(other.getTargetWindow()))) &&
            ((this.adUnitSizes==null && other.getAdUnitSizes()==null) || 
             (this.adUnitSizes!=null &&
              java.util.Arrays.equals(this.adUnitSizes, other.getAdUnitSizes())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDistributorName() != null) {
            _hashCode += getDistributorName().hashCode();
        }
        if (getContentProviderAdUnitId() != null) {
            _hashCode += getContentProviderAdUnitId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTargetPlatform() != null) {
            _hashCode += getTargetPlatform().hashCode();
        }
        if (getTargetWindow() != null) {
            _hashCode += getTargetWindow().hashCode();
        }
        if (getAdUnitSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitSizes(), i);
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
        new org.apache.axis.description.TypeDesc(SharedAdUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "SharedAdUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributorName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "distributorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentProviderAdUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "contentProviderAdUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "SharedAdUnitStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "targetPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "TargetPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "targetWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AdUnit.TargetWindow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "adUnitSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201411", "AdUnitSize"));
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
