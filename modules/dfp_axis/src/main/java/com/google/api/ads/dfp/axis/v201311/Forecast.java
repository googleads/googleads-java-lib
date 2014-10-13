/**
 * Forecast.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * Describes predicted inventory availability for a line item with
 * the specified
 *             properties.
 *             
 *             <p>Inventory has three threshold values along a line of
 * possible inventory.
 *             From least to most, these are:
 *             
 *             <dl>
 *             <dt>Available units
 *             <dd>How many units can be booked without affecting any
 * other line items. Booking more than this
 *             number can cause lower- and same-priority line items to
 * underdeliver.
 *             <dt>Possible units
 *             <dd>How many units can be booked without affecting any
 * higher priority line items. Booking more
 *             than this number can cause the line item to underdeliver.
 * <dt>Matched (forecast) units
 *             <dd>How many units satisfy all specified criteria.
 *             </dl>
 *             
 *             <p>Underdelivery is caused by overbooking. However, if
 * more impressions are served than are
 *             predicted, the extra available inventory might enable
 * all inventory guarantees to be met without
 *             overbooking.
 */
public class Forecast  implements java.io.Serializable {
    /* Uniquely identifies the {@code Forecast}. This value is read-only
     * and is assigned by Google when the forecast is created. The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a
     *                 prospective line item. */
    private java.lang.Long id;

    /* The unique ID for the {@link Order} object that counts this
     * reservation as
     *                 a member, or {@code null} if the forecast represents
     * a
     *                 prospective line item without an {@link LineItem#orderId}
     * set. */
    private java.lang.Long orderId;

    /* The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link LineItem#unitType}
     * for both a set line
     *                 item or a prospective one. */
    private com.google.api.ads.dfp.axis.v201311.UnitType unitType;

    /* The number of units, defined by {@link Forecast#unitType},
     * that can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run. */
    private java.lang.Long availableUnits;

    /* The number of units, defined by {@link Forecast#unitType},
     * that
     *                 have already been served if the reservation is already
     * running. */
    private java.lang.Long deliveredUnits;

    /* The number of units, defined by {@link Forecast#unitType},
     * that match the
     *                 specified targeting and delivery settings. */
    private java.lang.Long matchedUnits;

    /* The maximum number of units, defined by {@link Forecast#unitType},
     * that could be booked by
     *                 taking inventory away from lower-priority line items
     * and some same-priority line items.
     *                 Please note: booking this number may cause lower-priority
     * line items and some same-priority
     *                 line items to underdeliver. */
    private java.lang.Long possibleUnits;

    /* The number of reserved units, defined by
     *                 {@link Forecast#unitType}, requested. This can be
     * an absolute or
     *                 percentage value. */
    private java.lang.Long reservedUnits;

    /* List of {@link ContendingLineItem contending line items} for
     * this forecast. */
    private com.google.api.ads.dfp.axis.v201311.ContendingLineItem[] contendingLineItems;

    public Forecast() {
    }

    public Forecast(
           java.lang.Long id,
           java.lang.Long orderId,
           com.google.api.ads.dfp.axis.v201311.UnitType unitType,
           java.lang.Long availableUnits,
           java.lang.Long deliveredUnits,
           java.lang.Long matchedUnits,
           java.lang.Long possibleUnits,
           java.lang.Long reservedUnits,
           com.google.api.ads.dfp.axis.v201311.ContendingLineItem[] contendingLineItems) {
           this.id = id;
           this.orderId = orderId;
           this.unitType = unitType;
           this.availableUnits = availableUnits;
           this.deliveredUnits = deliveredUnits;
           this.matchedUnits = matchedUnits;
           this.possibleUnits = possibleUnits;
           this.reservedUnits = reservedUnits;
           this.contendingLineItems = contendingLineItems;
    }


    /**
     * Gets the id value for this Forecast.
     * 
     * @return id   * Uniquely identifies the {@code Forecast}. This value is read-only
     * and is assigned by Google when the forecast is created. The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a
     *                 prospective line item.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Forecast.
     * 
     * @param id   * Uniquely identifies the {@code Forecast}. This value is read-only
     * and is assigned by Google when the forecast is created. The
     *                 attribute will be either the ID of the {@link LineItem}
     * object it
     *                 represents, or {@code null} if the forecast represents
     * a
     *                 prospective line item.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the orderId value for this Forecast.
     * 
     * @return orderId   * The unique ID for the {@link Order} object that counts this
     * reservation as
     *                 a member, or {@code null} if the forecast represents
     * a
     *                 prospective line item without an {@link LineItem#orderId}
     * set.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this Forecast.
     * 
     * @param orderId   * The unique ID for the {@link Order} object that counts this
     * reservation as
     *                 a member, or {@code null} if the forecast represents
     * a
     *                 prospective line item without an {@link LineItem#orderId}
     * set.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the unitType value for this Forecast.
     * 
     * @return unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link LineItem#unitType}
     * for both a set line
     *                 item or a prospective one.
     */
    public com.google.api.ads.dfp.axis.v201311.UnitType getUnitType() {
        return unitType;
    }


    /**
     * Sets the unitType value for this Forecast.
     * 
     * @param unitType   * The unit with which the goal or cap of the {@link LineItem}
     * is defined.
     *                 Will be the same value as {@link LineItem#unitType}
     * for both a set line
     *                 item or a prospective one.
     */
    public void setUnitType(com.google.api.ads.dfp.axis.v201311.UnitType unitType) {
        this.unitType = unitType;
    }


    /**
     * Gets the availableUnits value for this Forecast.
     * 
     * @return availableUnits   * The number of units, defined by {@link Forecast#unitType},
     * that can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run.
     */
    public java.lang.Long getAvailableUnits() {
        return availableUnits;
    }


    /**
     * Sets the availableUnits value for this Forecast.
     * 
     * @param availableUnits   * The number of units, defined by {@link Forecast#unitType},
     * that can be
     *                 booked without affecting the delivery of any reserved
     * line items. Exceeding
     *                 this value will not cause an overbook, but lower-priority
     * line items may
     *                 not run.
     */
    public void setAvailableUnits(java.lang.Long availableUnits) {
        this.availableUnits = availableUnits;
    }


    /**
     * Gets the deliveredUnits value for this Forecast.
     * 
     * @return deliveredUnits   * The number of units, defined by {@link Forecast#unitType},
     * that
     *                 have already been served if the reservation is already
     * running.
     */
    public java.lang.Long getDeliveredUnits() {
        return deliveredUnits;
    }


    /**
     * Sets the deliveredUnits value for this Forecast.
     * 
     * @param deliveredUnits   * The number of units, defined by {@link Forecast#unitType},
     * that
     *                 have already been served if the reservation is already
     * running.
     */
    public void setDeliveredUnits(java.lang.Long deliveredUnits) {
        this.deliveredUnits = deliveredUnits;
    }


    /**
     * Gets the matchedUnits value for this Forecast.
     * 
     * @return matchedUnits   * The number of units, defined by {@link Forecast#unitType},
     * that match the
     *                 specified targeting and delivery settings.
     */
    public java.lang.Long getMatchedUnits() {
        return matchedUnits;
    }


    /**
     * Sets the matchedUnits value for this Forecast.
     * 
     * @param matchedUnits   * The number of units, defined by {@link Forecast#unitType},
     * that match the
     *                 specified targeting and delivery settings.
     */
    public void setMatchedUnits(java.lang.Long matchedUnits) {
        this.matchedUnits = matchedUnits;
    }


    /**
     * Gets the possibleUnits value for this Forecast.
     * 
     * @return possibleUnits   * The maximum number of units, defined by {@link Forecast#unitType},
     * that could be booked by
     *                 taking inventory away from lower-priority line items
     * and some same-priority line items.
     *                 Please note: booking this number may cause lower-priority
     * line items and some same-priority
     *                 line items to underdeliver.
     */
    public java.lang.Long getPossibleUnits() {
        return possibleUnits;
    }


    /**
     * Sets the possibleUnits value for this Forecast.
     * 
     * @param possibleUnits   * The maximum number of units, defined by {@link Forecast#unitType},
     * that could be booked by
     *                 taking inventory away from lower-priority line items
     * and some same-priority line items.
     *                 Please note: booking this number may cause lower-priority
     * line items and some same-priority
     *                 line items to underdeliver.
     */
    public void setPossibleUnits(java.lang.Long possibleUnits) {
        this.possibleUnits = possibleUnits;
    }


    /**
     * Gets the reservedUnits value for this Forecast.
     * 
     * @return reservedUnits   * The number of reserved units, defined by
     *                 {@link Forecast#unitType}, requested. This can be
     * an absolute or
     *                 percentage value.
     */
    public java.lang.Long getReservedUnits() {
        return reservedUnits;
    }


    /**
     * Sets the reservedUnits value for this Forecast.
     * 
     * @param reservedUnits   * The number of reserved units, defined by
     *                 {@link Forecast#unitType}, requested. This can be
     * an absolute or
     *                 percentage value.
     */
    public void setReservedUnits(java.lang.Long reservedUnits) {
        this.reservedUnits = reservedUnits;
    }


    /**
     * Gets the contendingLineItems value for this Forecast.
     * 
     * @return contendingLineItems   * List of {@link ContendingLineItem contending line items} for
     * this forecast.
     */
    public com.google.api.ads.dfp.axis.v201311.ContendingLineItem[] getContendingLineItems() {
        return contendingLineItems;
    }


    /**
     * Sets the contendingLineItems value for this Forecast.
     * 
     * @param contendingLineItems   * List of {@link ContendingLineItem contending line items} for
     * this forecast.
     */
    public void setContendingLineItems(com.google.api.ads.dfp.axis.v201311.ContendingLineItem[] contendingLineItems) {
        this.contendingLineItems = contendingLineItems;
    }

    public com.google.api.ads.dfp.axis.v201311.ContendingLineItem getContendingLineItems(int i) {
        return this.contendingLineItems[i];
    }

    public void setContendingLineItems(int i, com.google.api.ads.dfp.axis.v201311.ContendingLineItem _value) {
        this.contendingLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Forecast)) return false;
        Forecast other = (Forecast) obj;
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
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.unitType==null && other.getUnitType()==null) || 
             (this.unitType!=null &&
              this.unitType.equals(other.getUnitType()))) &&
            ((this.availableUnits==null && other.getAvailableUnits()==null) || 
             (this.availableUnits!=null &&
              this.availableUnits.equals(other.getAvailableUnits()))) &&
            ((this.deliveredUnits==null && other.getDeliveredUnits()==null) || 
             (this.deliveredUnits!=null &&
              this.deliveredUnits.equals(other.getDeliveredUnits()))) &&
            ((this.matchedUnits==null && other.getMatchedUnits()==null) || 
             (this.matchedUnits!=null &&
              this.matchedUnits.equals(other.getMatchedUnits()))) &&
            ((this.possibleUnits==null && other.getPossibleUnits()==null) || 
             (this.possibleUnits!=null &&
              this.possibleUnits.equals(other.getPossibleUnits()))) &&
            ((this.reservedUnits==null && other.getReservedUnits()==null) || 
             (this.reservedUnits!=null &&
              this.reservedUnits.equals(other.getReservedUnits()))) &&
            ((this.contendingLineItems==null && other.getContendingLineItems()==null) || 
             (this.contendingLineItems!=null &&
              java.util.Arrays.equals(this.contendingLineItems, other.getContendingLineItems())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getUnitType() != null) {
            _hashCode += getUnitType().hashCode();
        }
        if (getAvailableUnits() != null) {
            _hashCode += getAvailableUnits().hashCode();
        }
        if (getDeliveredUnits() != null) {
            _hashCode += getDeliveredUnits().hashCode();
        }
        if (getMatchedUnits() != null) {
            _hashCode += getMatchedUnits().hashCode();
        }
        if (getPossibleUnits() != null) {
            _hashCode += getPossibleUnits().hashCode();
        }
        if (getReservedUnits() != null) {
            _hashCode += getReservedUnits().hashCode();
        }
        if (getContendingLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContendingLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContendingLineItems(), i);
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
        new org.apache.axis.description.TypeDesc(Forecast.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "Forecast"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "unitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "UnitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "availableUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveredUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "deliveredUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "matchedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possibleUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "possibleUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservedUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "reservedUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contendingLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "contendingLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ContendingLineItem"));
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
