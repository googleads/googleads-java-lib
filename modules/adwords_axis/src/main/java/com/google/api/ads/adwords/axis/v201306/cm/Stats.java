/**
 * Stats.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Statistics about an ad or criterion within an ad group or campaign.
 */
public class Stats  implements java.io.Serializable {
    /* Starting date (inclusive) of the statistics. Format is YYYYMMDD. */
    private java.lang.String startDate;

    /* Ending date (inclusive) of the statistics. Format is YYYYMMDD. */
    private java.lang.String endDate;

    /* The ad network which the stats are for. */
    private com.google.api.ads.adwords.axis.v201306.cm.StatsNetwork network;

    /* Number of clicks.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Clicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long clicks;

    /* Number of impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Impressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long impressions;

    /* Cost.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Cost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Money cost;

    /* Average position of ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AveragePosition".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Double averagePosition;

    /* Average cost per click.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpc".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Money averageCpc;

    /* Average Cost Per Impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpm".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Money averageCpm;

    /* Click Through Rate.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Ctr".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.Double ctr;

    /* Number of clicks that lead to a conversion.
     *                 If a user clicks one ad, then converts three times,
     * this value will stay at 1.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Conversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long conversions;

    /* Number of conversions (view-through).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewThroughConversions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Long viewThroughConversions;

    /* The total amount of budget allocated for these campaigns.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalBudget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.Money totalBudget;

    /* Indicates that this instance is a subtype of Stats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String statsType;

    public Stats() {
    }

    public Stats(
           java.lang.String startDate,
           java.lang.String endDate,
           com.google.api.ads.adwords.axis.v201306.cm.StatsNetwork network,
           java.lang.Long clicks,
           java.lang.Long impressions,
           com.google.api.ads.adwords.axis.v201306.cm.Money cost,
           java.lang.Double averagePosition,
           com.google.api.ads.adwords.axis.v201306.cm.Money averageCpc,
           com.google.api.ads.adwords.axis.v201306.cm.Money averageCpm,
           java.lang.Double ctr,
           java.lang.Long conversions,
           java.lang.Long viewThroughConversions,
           com.google.api.ads.adwords.axis.v201306.cm.Money totalBudget,
           java.lang.String statsType) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.network = network;
           this.clicks = clicks;
           this.impressions = impressions;
           this.cost = cost;
           this.averagePosition = averagePosition;
           this.averageCpc = averageCpc;
           this.averageCpm = averageCpm;
           this.ctr = ctr;
           this.conversions = conversions;
           this.viewThroughConversions = viewThroughConversions;
           this.totalBudget = totalBudget;
           this.statsType = statsType;
    }


    /**
     * Gets the startDate value for this Stats.
     * 
     * @return startDate   * Starting date (inclusive) of the statistics. Format is YYYYMMDD.
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Stats.
     * 
     * @param startDate   * Starting date (inclusive) of the statistics. Format is YYYYMMDD.
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Stats.
     * 
     * @return endDate   * Ending date (inclusive) of the statistics. Format is YYYYMMDD.
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Stats.
     * 
     * @param endDate   * Ending date (inclusive) of the statistics. Format is YYYYMMDD.
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the network value for this Stats.
     * 
     * @return network   * The ad network which the stats are for.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.StatsNetwork getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Stats.
     * 
     * @param network   * The ad network which the stats are for.
     */
    public void setNetwork(com.google.api.ads.adwords.axis.v201306.cm.StatsNetwork network) {
        this.network = network;
    }


    /**
     * Gets the clicks value for this Stats.
     * 
     * @return clicks   * Number of clicks.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Clicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this Stats.
     * 
     * @param clicks   * Number of clicks.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Clicks".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setClicks(java.lang.Long clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the impressions value for this Stats.
     * 
     * @return impressions   * Number of impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Impressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getImpressions() {
        return impressions;
    }


    /**
     * Sets the impressions value for this Stats.
     * 
     * @param impressions   * Number of impressions.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Impressions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setImpressions(java.lang.Long impressions) {
        this.impressions = impressions;
    }


    /**
     * Gets the cost value for this Stats.
     * 
     * @return cost   * Cost.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Cost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Stats.
     * 
     * @param cost   * Cost.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Cost".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCost(com.google.api.ads.adwords.axis.v201306.cm.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the averagePosition value for this Stats.
     * 
     * @return averagePosition   * Average position of ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AveragePosition".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Double getAveragePosition() {
        return averagePosition;
    }


    /**
     * Sets the averagePosition value for this Stats.
     * 
     * @param averagePosition   * Average position of ads.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AveragePosition".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAveragePosition(java.lang.Double averagePosition) {
        this.averagePosition = averagePosition;
    }


    /**
     * Gets the averageCpc value for this Stats.
     * 
     * @return averageCpc   * Average cost per click.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpc".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Money getAverageCpc() {
        return averageCpc;
    }


    /**
     * Sets the averageCpc value for this Stats.
     * 
     * @param averageCpc   * Average cost per click.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpc".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAverageCpc(com.google.api.ads.adwords.axis.v201306.cm.Money averageCpc) {
        this.averageCpc = averageCpc;
    }


    /**
     * Gets the averageCpm value for this Stats.
     * 
     * @return averageCpm   * Average Cost Per Impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpm".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Money getAverageCpm() {
        return averageCpm;
    }


    /**
     * Sets the averageCpm value for this Stats.
     * 
     * @param averageCpm   * Average Cost Per Impression.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "AverageCpm".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAverageCpm(com.google.api.ads.adwords.axis.v201306.cm.Money averageCpm) {
        this.averageCpm = averageCpm;
    }


    /**
     * Gets the ctr value for this Stats.
     * 
     * @return ctr   * Click Through Rate.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Ctr".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.Double getCtr() {
        return ctr;
    }


    /**
     * Sets the ctr value for this Stats.
     * 
     * @param ctr   * Click Through Rate.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Ctr".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setCtr(java.lang.Double ctr) {
        this.ctr = ctr;
    }


    /**
     * Gets the conversions value for this Stats.
     * 
     * @return conversions   * Number of clicks that lead to a conversion.
     *                 If a user clicks one ad, then converts three times,
     * this value will stay at 1.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Conversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getConversions() {
        return conversions;
    }


    /**
     * Sets the conversions value for this Stats.
     * 
     * @param conversions   * Number of clicks that lead to a conversion.
     *                 If a user clicks one ad, then converts three times,
     * this value will stay at 1.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "Conversions".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setConversions(java.lang.Long conversions) {
        this.conversions = conversions;
    }


    /**
     * Gets the viewThroughConversions value for this Stats.
     * 
     * @return viewThroughConversions   * Number of conversions (view-through).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewThroughConversions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getViewThroughConversions() {
        return viewThroughConversions;
    }


    /**
     * Sets the viewThroughConversions value for this Stats.
     * 
     * @param viewThroughConversions   * Number of conversions (view-through).
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ViewThroughConversions".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setViewThroughConversions(java.lang.Long viewThroughConversions) {
        this.viewThroughConversions = viewThroughConversions;
    }


    /**
     * Gets the totalBudget value for this Stats.
     * 
     * @return totalBudget   * The total amount of budget allocated for these campaigns.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalBudget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.Money getTotalBudget() {
        return totalBudget;
    }


    /**
     * Sets the totalBudget value for this Stats.
     * 
     * @param totalBudget   * The total amount of budget allocated for these campaigns.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "TotalBudget".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setTotalBudget(com.google.api.ads.adwords.axis.v201306.cm.Money totalBudget) {
        this.totalBudget = totalBudget;
    }


    /**
     * Gets the statsType value for this Stats.
     * 
     * @return statsType   * Indicates that this instance is a subtype of Stats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getStatsType() {
        return statsType;
    }


    /**
     * Sets the statsType value for this Stats.
     * 
     * @param statsType   * Indicates that this instance is a subtype of Stats.
     *                 Although this field is returned in the response, it
     * is ignored on input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setStatsType(java.lang.String statsType) {
        this.statsType = statsType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stats)) return false;
        Stats other = (Stats) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              this.clicks.equals(other.getClicks()))) &&
            ((this.impressions==null && other.getImpressions()==null) || 
             (this.impressions!=null &&
              this.impressions.equals(other.getImpressions()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.averagePosition==null && other.getAveragePosition()==null) || 
             (this.averagePosition!=null &&
              this.averagePosition.equals(other.getAveragePosition()))) &&
            ((this.averageCpc==null && other.getAverageCpc()==null) || 
             (this.averageCpc!=null &&
              this.averageCpc.equals(other.getAverageCpc()))) &&
            ((this.averageCpm==null && other.getAverageCpm()==null) || 
             (this.averageCpm!=null &&
              this.averageCpm.equals(other.getAverageCpm()))) &&
            ((this.ctr==null && other.getCtr()==null) || 
             (this.ctr!=null &&
              this.ctr.equals(other.getCtr()))) &&
            ((this.conversions==null && other.getConversions()==null) || 
             (this.conversions!=null &&
              this.conversions.equals(other.getConversions()))) &&
            ((this.viewThroughConversions==null && other.getViewThroughConversions()==null) || 
             (this.viewThroughConversions!=null &&
              this.viewThroughConversions.equals(other.getViewThroughConversions()))) &&
            ((this.totalBudget==null && other.getTotalBudget()==null) || 
             (this.totalBudget!=null &&
              this.totalBudget.equals(other.getTotalBudget()))) &&
            ((this.statsType==null && other.getStatsType()==null) || 
             (this.statsType!=null &&
              this.statsType.equals(other.getStatsType())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getClicks() != null) {
            _hashCode += getClicks().hashCode();
        }
        if (getImpressions() != null) {
            _hashCode += getImpressions().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getAveragePosition() != null) {
            _hashCode += getAveragePosition().hashCode();
        }
        if (getAverageCpc() != null) {
            _hashCode += getAverageCpc().hashCode();
        }
        if (getAverageCpm() != null) {
            _hashCode += getAverageCpm().hashCode();
        }
        if (getCtr() != null) {
            _hashCode += getCtr().hashCode();
        }
        if (getConversions() != null) {
            _hashCode += getConversions().hashCode();
        }
        if (getViewThroughConversions() != null) {
            _hashCode += getViewThroughConversions().hashCode();
        }
        if (getTotalBudget() != null) {
            _hashCode += getTotalBudget().hashCode();
        }
        if (getStatsType() != null) {
            _hashCode += getStatsType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stats.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Stats"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Stats.Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "impressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averagePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "averagePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpc");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "averageCpc"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCpm");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "averageCpm"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "ctr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "conversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewThroughConversions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "viewThroughConversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "totalBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statsType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "Stats.Type"));
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
