/**
 * ConversionTracker.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * An abstract Conversion base class.
 */
public abstract class ConversionTracker  implements java.io.Serializable {
    /* ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span> */
    private java.lang.Long id;

    /* Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String name;

    /* Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStatus status;

    /* The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerCategory category;

    /* Statistics for this conversion tracker.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStats stats;

    /* Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span> */
    private java.lang.Integer viewthroughLookbackWindow;

    /* Indicates whether to turn on charging for product ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsProductAdsChargeable".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean isProductAdsChargeable;

    /* Lookback window, in days, for whether product ads can be charged
     * or not.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProductAdsChargeableConversionWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Integer productAdsChargeableConversionWindow;

    /* The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 Conversion events that occur more than this many days
     * after the click are ignored.
     *                 
     *                 This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 7-90 days is the currently-allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Integer ctcLookbackWindow;

    /* Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String conversionTrackerType;

    public ConversionTracker() {
    }

    public ConversionTracker(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerCategory category,
           com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStats stats,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Boolean isProductAdsChargeable,
           java.lang.Integer productAdsChargeableConversionWindow,
           java.lang.Integer ctcLookbackWindow,
           java.lang.String conversionTrackerType) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.category = category;
           this.stats = stats;
           this.viewthroughLookbackWindow = viewthroughLookbackWindow;
           this.isProductAdsChargeable = isProductAdsChargeable;
           this.productAdsChargeableConversionWindow = productAdsChargeableConversionWindow;
           this.ctcLookbackWindow = ctcLookbackWindow;
           this.conversionTrackerType = conversionTrackerType;
    }


    /**
     * Gets the id value for this ConversionTracker.
     * 
     * @return id   * ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ConversionTracker.
     * 
     * @param id   * ID of this conversion tracker, {@code null} when creating a
     * new one.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Id".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ConversionTracker.
     * 
     * @return name   * Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ConversionTracker.
     * 
     * @param name   * Name of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this ConversionTracker.
     * 
     * @return status   * Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConversionTracker.
     * 
     * @param status   * Status of this conversion tracker.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStatus status) {
        this.status = status;
    }


    /**
     * Gets the category value for this ConversionTracker.
     * 
     * @return category   * The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerCategory getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ConversionTracker.
     * 
     * @param category   * The category of conversion that is being tracked.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Category".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCategory(com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerCategory category) {
        this.category = category;
    }


    /**
     * Gets the stats value for this ConversionTracker.
     * 
     * @return stats   * Statistics for this conversion tracker.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this ConversionTracker.
     * 
     * @param stats   * Statistics for this conversion tracker.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201309.cm.ConversionTrackerStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the viewthroughLookbackWindow value for this ConversionTracker.
     * 
     * @return viewthroughLookbackWindow   * Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span>
     */
    public java.lang.Integer getViewthroughLookbackWindow() {
        return viewthroughLookbackWindow;
    }


    /**
     * Sets the viewthroughLookbackWindow value for this ConversionTracker.
     * 
     * @param viewthroughLookbackWindow   * Lookback window for view-through conversions in days. This
     * is the length of
     *                 time in which a conversion without a click can be
     * attributed to an
     *                 impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewthroughLookbackWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint InRange">This field must be between 1 and
     * 30, inclusive.</span>
     */
    public void setViewthroughLookbackWindow(java.lang.Integer viewthroughLookbackWindow) {
        this.viewthroughLookbackWindow = viewthroughLookbackWindow;
    }


    /**
     * Gets the isProductAdsChargeable value for this ConversionTracker.
     * 
     * @return isProductAdsChargeable   * Indicates whether to turn on charging for product ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsProductAdsChargeable".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getIsProductAdsChargeable() {
        return isProductAdsChargeable;
    }


    /**
     * Sets the isProductAdsChargeable value for this ConversionTracker.
     * 
     * @param isProductAdsChargeable   * Indicates whether to turn on charging for product ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "IsProductAdsChargeable".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setIsProductAdsChargeable(java.lang.Boolean isProductAdsChargeable) {
        this.isProductAdsChargeable = isProductAdsChargeable;
    }


    /**
     * Gets the productAdsChargeableConversionWindow value for this ConversionTracker.
     * 
     * @return productAdsChargeableConversionWindow   * Lookback window, in days, for whether product ads can be charged
     * or not.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProductAdsChargeableConversionWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Integer getProductAdsChargeableConversionWindow() {
        return productAdsChargeableConversionWindow;
    }


    /**
     * Sets the productAdsChargeableConversionWindow value for this ConversionTracker.
     * 
     * @param productAdsChargeableConversionWindow   * Lookback window, in days, for whether product ads can be charged
     * or not.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ProductAdsChargeableConversionWindow".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setProductAdsChargeableConversionWindow(java.lang.Integer productAdsChargeableConversionWindow) {
        this.productAdsChargeableConversionWindow = productAdsChargeableConversionWindow;
    }


    /**
     * Gets the ctcLookbackWindow value for this ConversionTracker.
     * 
     * @return ctcLookbackWindow   * The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 Conversion events that occur more than this many days
     * after the click are ignored.
     *                 
     *                 This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 7-90 days is the currently-allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Integer getCtcLookbackWindow() {
        return ctcLookbackWindow;
    }


    /**
     * Sets the ctcLookbackWindow value for this ConversionTracker.
     * 
     * @param ctcLookbackWindow   * The click-through conversion (ctc) lookback window is the maximum
     * number of days between
     *                 the time a conversion event happens and the previous
     * corresponding ad click.
     *                 
     *                 Conversion events that occur more than this many days
     * after the click are ignored.
     *                 
     *                 This field is only editable for Adwords Conversions
     * and Upload Conversions, but has a system
     *                 defined default for other types of conversions. The
     * allowed range of values for this window
     *                 depends on the type of conversion and may expand,
     * but 7-90 days is the currently-allowed
     *                 range.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CtcLookbackWindow".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCtcLookbackWindow(java.lang.Integer ctcLookbackWindow) {
        this.ctcLookbackWindow = ctcLookbackWindow;
    }


    /**
     * Gets the conversionTrackerType value for this ConversionTracker.
     * 
     * @return conversionTrackerType   * Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getConversionTrackerType() {
        return conversionTrackerType;
    }


    /**
     * Sets the conversionTrackerType value for this ConversionTracker.
     * 
     * @param conversionTrackerType   * Indicates that this instance is a subtype of ConversionTracker.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setConversionTrackerType(java.lang.String conversionTrackerType) {
        this.conversionTrackerType = conversionTrackerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConversionTracker)) return false;
        ConversionTracker other = (ConversionTracker) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.viewthroughLookbackWindow==null && other.getViewthroughLookbackWindow()==null) || 
             (this.viewthroughLookbackWindow!=null &&
              this.viewthroughLookbackWindow.equals(other.getViewthroughLookbackWindow()))) &&
            ((this.isProductAdsChargeable==null && other.getIsProductAdsChargeable()==null) || 
             (this.isProductAdsChargeable!=null &&
              this.isProductAdsChargeable.equals(other.getIsProductAdsChargeable()))) &&
            ((this.productAdsChargeableConversionWindow==null && other.getProductAdsChargeableConversionWindow()==null) || 
             (this.productAdsChargeableConversionWindow!=null &&
              this.productAdsChargeableConversionWindow.equals(other.getProductAdsChargeableConversionWindow()))) &&
            ((this.ctcLookbackWindow==null && other.getCtcLookbackWindow()==null) || 
             (this.ctcLookbackWindow!=null &&
              this.ctcLookbackWindow.equals(other.getCtcLookbackWindow()))) &&
            ((this.conversionTrackerType==null && other.getConversionTrackerType()==null) || 
             (this.conversionTrackerType!=null &&
              this.conversionTrackerType.equals(other.getConversionTrackerType())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getViewthroughLookbackWindow() != null) {
            _hashCode += getViewthroughLookbackWindow().hashCode();
        }
        if (getIsProductAdsChargeable() != null) {
            _hashCode += getIsProductAdsChargeable().hashCode();
        }
        if (getProductAdsChargeableConversionWindow() != null) {
            _hashCode += getProductAdsChargeableConversionWindow().hashCode();
        }
        if (getCtcLookbackWindow() != null) {
            _hashCode += getCtcLookbackWindow().hashCode();
        }
        if (getConversionTrackerType() != null) {
            _hashCode += getConversionTrackerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConversionTracker.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTracker"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTracker.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTracker.Category"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTrackerStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewthroughLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "viewthroughLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductAdsChargeable");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isProductAdsChargeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAdsChargeableConversionWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "productAdsChargeableConversionWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctcLookbackWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ctcLookbackWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionTrackerType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ConversionTracker.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
