// Copyright 2020 Google LLC
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
 * TrafficForecastSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202011;


/**
 * An entity that defines a segment of traffic that will be adjusted
 * or explored.
 */
public class TrafficForecastSegment  implements java.io.Serializable {
    /* The unique ID of the TrafficForecastSegment. This field is
     * read-only and set by Google.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* Name of the TrafficForecastSegment. This field must be unique
     * among all segments for this
     *                 network.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.String name;

    /* The targeting that defines a segment of traffic. Targeting
     * cannot be changed after segment
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202011.Targeting targeting;

    /* The number of active forecast adjustments associated with the
     * TrafficForecastSegment.
     *                 This attribute is read-only. */
    private java.lang.Integer activeForecastAdjustmentCount;

    /* The date and time that the TrafficForecastSegment was created.
     * This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202011.DateTime creationDateTime;

    public TrafficForecastSegment() {
    }

    public TrafficForecastSegment(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202011.Targeting targeting,
           java.lang.Integer activeForecastAdjustmentCount,
           com.google.api.ads.admanager.axis.v202011.DateTime creationDateTime) {
           this.id = id;
           this.name = name;
           this.targeting = targeting;
           this.activeForecastAdjustmentCount = activeForecastAdjustmentCount;
           this.creationDateTime = creationDateTime;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("activeForecastAdjustmentCount", getActiveForecastAdjustmentCount())
            .add("creationDateTime", getCreationDateTime())
            .add("id", getId())
            .add("name", getName())
            .add("targeting", getTargeting())
            .toString();
    }

    /**
     * Gets the id value for this TrafficForecastSegment.
     * 
     * @return id   * The unique ID of the TrafficForecastSegment. This field is
     * read-only and set by Google.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this TrafficForecastSegment.
     * 
     * @param id   * The unique ID of the TrafficForecastSegment. This field is
     * read-only and set by Google.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this TrafficForecastSegment.
     * 
     * @return name   * Name of the TrafficForecastSegment. This field must be unique
     * among all segments for this
     *                 network.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TrafficForecastSegment.
     * 
     * @param name   * Name of the TrafficForecastSegment. This field must be unique
     * among all segments for this
     *                 network.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the targeting value for this TrafficForecastSegment.
     * 
     * @return targeting   * The targeting that defines a segment of traffic. Targeting
     * cannot be changed after segment
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202011.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this TrafficForecastSegment.
     * 
     * @param targeting   * The targeting that defines a segment of traffic. Targeting
     * cannot be changed after segment
     *                 creation.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202011.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the activeForecastAdjustmentCount value for this TrafficForecastSegment.
     * 
     * @return activeForecastAdjustmentCount   * The number of active forecast adjustments associated with the
     * TrafficForecastSegment.
     *                 This attribute is read-only.
     */
    public java.lang.Integer getActiveForecastAdjustmentCount() {
        return activeForecastAdjustmentCount;
    }


    /**
     * Sets the activeForecastAdjustmentCount value for this TrafficForecastSegment.
     * 
     * @param activeForecastAdjustmentCount   * The number of active forecast adjustments associated with the
     * TrafficForecastSegment.
     *                 This attribute is read-only.
     */
    public void setActiveForecastAdjustmentCount(java.lang.Integer activeForecastAdjustmentCount) {
        this.activeForecastAdjustmentCount = activeForecastAdjustmentCount;
    }


    /**
     * Gets the creationDateTime value for this TrafficForecastSegment.
     * 
     * @return creationDateTime   * The date and time that the TrafficForecastSegment was created.
     * This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202011.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this TrafficForecastSegment.
     * 
     * @param creationDateTime   * The date and time that the TrafficForecastSegment was created.
     * This attribute is read-only.
     */
    public void setCreationDateTime(com.google.api.ads.admanager.axis.v202011.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficForecastSegment)) return false;
        TrafficForecastSegment other = (TrafficForecastSegment) obj;
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
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.activeForecastAdjustmentCount==null && other.getActiveForecastAdjustmentCount()==null) || 
             (this.activeForecastAdjustmentCount!=null &&
              this.activeForecastAdjustmentCount.equals(other.getActiveForecastAdjustmentCount()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime())));
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
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getActiveForecastAdjustmentCount() != null) {
            _hashCode += getActiveForecastAdjustmentCount().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficForecastSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "TrafficForecastSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeForecastAdjustmentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "activeForecastAdjustmentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202011", "DateTime"));
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
