/**
 * Promotion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.express;


/**
 * A promotion for a business. It contains all the user specified
 * data as needed by AdWords Express
 *             to generate AdWords campaigns.
 */
public class Promotion  implements java.io.Serializable {
    /* ID of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.Long id;

    /* Name of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span> */
    private java.lang.String name;

    /* Status of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201309.express.PromotionStatus status;

    /* Creatives of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Creatives".</span> */
    private com.google.api.ads.adwords.axis.v201309.express.Creative[] creatives;

    /* Destination URL to be used for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DestinationUrl".</span> */
    private java.lang.String destinationUrl;

    /* Whether the street address of the business should be visible.
     * Default is 'True'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StreetAddressVisible".</span> */
    private java.lang.Boolean streetAddressVisible;

    /* Whether call tracking should be enabled. Default is 'False'.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CallTrackingEnabled".</span> */
    private java.lang.Boolean callTrackingEnabled;

    /* Monthly budget for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Budget".</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Money budget;

    /* Targeting criteria of this promotion.  The following criteria
     * are supported:
     *                 <ul>
     *                 <li>{@link com.google.ads.api.services.express.common.criterion.ProductService}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Language}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Location}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Proximity}</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionCriteria".</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Criterion[] criteria;

    /* IDs of the campaigns associated with this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignIds".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private long[] campaignIds;

    /* Remaining budget for the current month.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "RemainingBudget".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.Money remainingBudget;

    public Promotion() {
    }

    public Promotion(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201309.express.PromotionStatus status,
           com.google.api.ads.adwords.axis.v201309.express.Creative[] creatives,
           java.lang.String destinationUrl,
           java.lang.Boolean streetAddressVisible,
           java.lang.Boolean callTrackingEnabled,
           com.google.api.ads.adwords.axis.v201309.cm.Money budget,
           com.google.api.ads.adwords.axis.v201309.cm.Criterion[] criteria,
           long[] campaignIds,
           com.google.api.ads.adwords.axis.v201309.cm.Money remainingBudget) {
           this.id = id;
           this.name = name;
           this.status = status;
           this.creatives = creatives;
           this.destinationUrl = destinationUrl;
           this.streetAddressVisible = streetAddressVisible;
           this.callTrackingEnabled = callTrackingEnabled;
           this.budget = budget;
           this.criteria = criteria;
           this.campaignIds = campaignIds;
           this.remainingBudget = remainingBudget;
    }


    /**
     * Gets the id value for this Promotion.
     * 
     * @return id   * ID of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Promotion.
     * 
     * @param id   * ID of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Promotion.
     * 
     * @return name   * Name of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Promotion.
     * 
     * @param name   * Name of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Name".</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 80, inclusive.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this Promotion.
     * 
     * @return status   * Status of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.express.PromotionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Promotion.
     * 
     * @param status   * Status of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Status".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201309.express.PromotionStatus status) {
        this.status = status;
    }


    /**
     * Gets the creatives value for this Promotion.
     * 
     * @return creatives   * Creatives of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Creatives".</span>
     */
    public com.google.api.ads.adwords.axis.v201309.express.Creative[] getCreatives() {
        return creatives;
    }


    /**
     * Sets the creatives value for this Promotion.
     * 
     * @param creatives   * Creatives of this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Creatives".</span>
     */
    public void setCreatives(com.google.api.ads.adwords.axis.v201309.express.Creative[] creatives) {
        this.creatives = creatives;
    }

    public com.google.api.ads.adwords.axis.v201309.express.Creative getCreatives(int i) {
        return this.creatives[i];
    }

    public void setCreatives(int i, com.google.api.ads.adwords.axis.v201309.express.Creative _value) {
        this.creatives[i] = _value;
    }


    /**
     * Gets the destinationUrl value for this Promotion.
     * 
     * @return destinationUrl   * Destination URL to be used for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DestinationUrl".</span>
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this Promotion.
     * 
     * @param destinationUrl   * Destination URL to be used for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "DestinationUrl".</span>
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the streetAddressVisible value for this Promotion.
     * 
     * @return streetAddressVisible   * Whether the street address of the business should be visible.
     * Default is 'True'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StreetAddressVisible".</span>
     */
    public java.lang.Boolean getStreetAddressVisible() {
        return streetAddressVisible;
    }


    /**
     * Sets the streetAddressVisible value for this Promotion.
     * 
     * @param streetAddressVisible   * Whether the street address of the business should be visible.
     * Default is 'True'.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "StreetAddressVisible".</span>
     */
    public void setStreetAddressVisible(java.lang.Boolean streetAddressVisible) {
        this.streetAddressVisible = streetAddressVisible;
    }


    /**
     * Gets the callTrackingEnabled value for this Promotion.
     * 
     * @return callTrackingEnabled   * Whether call tracking should be enabled. Default is 'False'.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CallTrackingEnabled".</span>
     */
    public java.lang.Boolean getCallTrackingEnabled() {
        return callTrackingEnabled;
    }


    /**
     * Sets the callTrackingEnabled value for this Promotion.
     * 
     * @param callTrackingEnabled   * Whether call tracking should be enabled. Default is 'False'.
     * <span class="constraint Selectable">This field can be selected using
     * the value "CallTrackingEnabled".</span>
     */
    public void setCallTrackingEnabled(java.lang.Boolean callTrackingEnabled) {
        this.callTrackingEnabled = callTrackingEnabled;
    }


    /**
     * Gets the budget value for this Promotion.
     * 
     * @return budget   * Monthly budget for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Budget".</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Promotion.
     * 
     * @param budget   * Monthly budget for this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Budget".</span>
     *                 <span class="constraint InRange">This field must be
     * greater than or equal to 1.</span>
     */
    public void setBudget(com.google.api.ads.adwords.axis.v201309.cm.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the criteria value for this Promotion.
     * 
     * @return criteria   * Targeting criteria of this promotion.  The following criteria
     * are supported:
     *                 <ul>
     *                 <li>{@link com.google.ads.api.services.express.common.criterion.ProductService}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Language}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Location}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Proximity}</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionCriteria".</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Criterion[] getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this Promotion.
     * 
     * @param criteria   * Targeting criteria of this promotion.  The following criteria
     * are supported:
     *                 <ul>
     *                 <li>{@link com.google.ads.api.services.express.common.criterion.ProductService}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Language}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Location}</li>
     * <li>{@link com.google.ads.api.services.campaignmgmt.common.criterion.Proximity}</li>
     * </ul>
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "PromotionCriteria".</span>
     *                 <span class="constraint ContentsDistinct">This field
     * must contain distinct elements.</span>
     *                 <span class="constraint ContentsNotNull">This field
     * must not contain {@code null} elements.</span>
     */
    public void setCriteria(com.google.api.ads.adwords.axis.v201309.cm.Criterion[] criteria) {
        this.criteria = criteria;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.Criterion getCriteria(int i) {
        return this.criteria[i];
    }

    public void setCriteria(int i, com.google.api.ads.adwords.axis.v201309.cm.Criterion _value) {
        this.criteria[i] = _value;
    }


    /**
     * Gets the campaignIds value for this Promotion.
     * 
     * @return campaignIds   * IDs of the campaigns associated with this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignIds".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public long[] getCampaignIds() {
        return campaignIds;
    }


    /**
     * Sets the campaignIds value for this Promotion.
     * 
     * @param campaignIds   * IDs of the campaigns associated with this promotion.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "CampaignIds".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignIds(long[] campaignIds) {
        this.campaignIds = campaignIds;
    }

    public long getCampaignIds(int i) {
        return this.campaignIds[i];
    }

    public void setCampaignIds(int i, long _value) {
        this.campaignIds[i] = _value;
    }


    /**
     * Gets the remainingBudget value for this Promotion.
     * 
     * @return remainingBudget   * Remaining budget for the current month.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "RemainingBudget".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Money getRemainingBudget() {
        return remainingBudget;
    }


    /**
     * Sets the remainingBudget value for this Promotion.
     * 
     * @param remainingBudget   * Remaining budget for the current month.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "RemainingBudget".</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setRemainingBudget(com.google.api.ads.adwords.axis.v201309.cm.Money remainingBudget) {
        this.remainingBudget = remainingBudget;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Promotion)) return false;
        Promotion other = (Promotion) obj;
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
            ((this.creatives==null && other.getCreatives()==null) || 
             (this.creatives!=null &&
              java.util.Arrays.equals(this.creatives, other.getCreatives()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.streetAddressVisible==null && other.getStreetAddressVisible()==null) || 
             (this.streetAddressVisible!=null &&
              this.streetAddressVisible.equals(other.getStreetAddressVisible()))) &&
            ((this.callTrackingEnabled==null && other.getCallTrackingEnabled()==null) || 
             (this.callTrackingEnabled!=null &&
              this.callTrackingEnabled.equals(other.getCallTrackingEnabled()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              java.util.Arrays.equals(this.criteria, other.getCriteria()))) &&
            ((this.campaignIds==null && other.getCampaignIds()==null) || 
             (this.campaignIds!=null &&
              java.util.Arrays.equals(this.campaignIds, other.getCampaignIds()))) &&
            ((this.remainingBudget==null && other.getRemainingBudget()==null) || 
             (this.remainingBudget!=null &&
              this.remainingBudget.equals(other.getRemainingBudget())));
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
        if (getCreatives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getStreetAddressVisible() != null) {
            _hashCode += getStreetAddressVisible().hashCode();
        }
        if (getCallTrackingEnabled() != null) {
            _hashCode += getCallTrackingEnabled().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCampaignIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemainingBudget() != null) {
            _hashCode += getRemainingBudget().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Promotion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "Promotion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "Promotion.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "creatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "Creative"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetAddressVisible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "streetAddressVisible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTrackingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "callTrackingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Criterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "campaignIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/express/v201309", "remainingBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Money"));
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
