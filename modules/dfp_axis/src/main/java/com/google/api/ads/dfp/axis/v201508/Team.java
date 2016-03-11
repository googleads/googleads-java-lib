/**
 * Team.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * A {@code Team} defines a grouping of users and what entities they
 * have access
 *             to. Users are added to teams with {@link UserTeamAssociation}
 * objects.
 */
public class Team  implements java.io.Serializable {
    /* The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google. Teams that are created by Google will have
     * negative IDs. */
    private java.lang.Long id;

    /* The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters. */
    private java.lang.String name;

    /* The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters. */
    private java.lang.String description;

    /* Whether or not users on this team have access to all companies.
     * If this
     *                 value is true, then {@link #companyIds} must be empty. */
    private java.lang.Boolean hasAllCompanies;

    /* Whether or not users on this team have access to all inventory.
     * If this
     *                 value is true, then {@link #adUnitIds} must be empty. */
    private java.lang.Boolean hasAllInventory;

    /* The default access to orders, for users on this team. */
    private com.google.api.ads.dfp.axis.v201508.TeamAccessType teamAccessType;

    /* The IDs of all companies on the team. If {@link hasAllCompanies}
     * is set to
     *                 true, then this field must be empty. */
    private long[] companyIds;

    /* The IDs of all applied ad units on the team. If {@link hasAllInventory}
     * is set to true, then this field must be empty. */
    private java.lang.String[] adUnitIds;

    /* The IDs of all orders on the team. This attribute is optional. */
    private long[] orderIds;

    public Team() {
    }

    public Team(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           java.lang.Boolean hasAllCompanies,
           java.lang.Boolean hasAllInventory,
           com.google.api.ads.dfp.axis.v201508.TeamAccessType teamAccessType,
           long[] companyIds,
           java.lang.String[] adUnitIds,
           long[] orderIds) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.hasAllCompanies = hasAllCompanies;
           this.hasAllInventory = hasAllInventory;
           this.teamAccessType = teamAccessType;
           this.companyIds = companyIds;
           this.adUnitIds = adUnitIds;
           this.orderIds = orderIds;
    }


    /**
     * Gets the id value for this Team.
     * 
     * @return id   * The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google. Teams that are created by Google will have
     * negative IDs.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Team.
     * 
     * @param id   * The unique ID of the {@code Team}. This value is readonly and
     * is assigned
     *                 by Google. Teams that are created by Google will have
     * negative IDs.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Team.
     * 
     * @return name   * The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Team.
     * 
     * @param name   * The name of the {@code Team}. This value is required to create
     * a team and
     *                 has a maximum length of 106 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this Team.
     * 
     * @return description   * The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Team.
     * 
     * @param description   * The description of the {@code Team}. This value is optional
     * and has a
     *                 maximum length of 255 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the hasAllCompanies value for this Team.
     * 
     * @return hasAllCompanies   * Whether or not users on this team have access to all companies.
     * If this
     *                 value is true, then {@link #companyIds} must be empty.
     */
    public java.lang.Boolean getHasAllCompanies() {
        return hasAllCompanies;
    }


    /**
     * Sets the hasAllCompanies value for this Team.
     * 
     * @param hasAllCompanies   * Whether or not users on this team have access to all companies.
     * If this
     *                 value is true, then {@link #companyIds} must be empty.
     */
    public void setHasAllCompanies(java.lang.Boolean hasAllCompanies) {
        this.hasAllCompanies = hasAllCompanies;
    }


    /**
     * Gets the hasAllInventory value for this Team.
     * 
     * @return hasAllInventory   * Whether or not users on this team have access to all inventory.
     * If this
     *                 value is true, then {@link #adUnitIds} must be empty.
     */
    public java.lang.Boolean getHasAllInventory() {
        return hasAllInventory;
    }


    /**
     * Sets the hasAllInventory value for this Team.
     * 
     * @param hasAllInventory   * Whether or not users on this team have access to all inventory.
     * If this
     *                 value is true, then {@link #adUnitIds} must be empty.
     */
    public void setHasAllInventory(java.lang.Boolean hasAllInventory) {
        this.hasAllInventory = hasAllInventory;
    }


    /**
     * Gets the teamAccessType value for this Team.
     * 
     * @return teamAccessType   * The default access to orders, for users on this team.
     */
    public com.google.api.ads.dfp.axis.v201508.TeamAccessType getTeamAccessType() {
        return teamAccessType;
    }


    /**
     * Sets the teamAccessType value for this Team.
     * 
     * @param teamAccessType   * The default access to orders, for users on this team.
     */
    public void setTeamAccessType(com.google.api.ads.dfp.axis.v201508.TeamAccessType teamAccessType) {
        this.teamAccessType = teamAccessType;
    }


    /**
     * Gets the companyIds value for this Team.
     * 
     * @return companyIds   * The IDs of all companies on the team. If {@link hasAllCompanies}
     * is set to
     *                 true, then this field must be empty.
     */
    public long[] getCompanyIds() {
        return companyIds;
    }


    /**
     * Sets the companyIds value for this Team.
     * 
     * @param companyIds   * The IDs of all companies on the team. If {@link hasAllCompanies}
     * is set to
     *                 true, then this field must be empty.
     */
    public void setCompanyIds(long[] companyIds) {
        this.companyIds = companyIds;
    }

    public long getCompanyIds(int i) {
        return this.companyIds[i];
    }

    public void setCompanyIds(int i, long _value) {
        this.companyIds[i] = _value;
    }


    /**
     * Gets the adUnitIds value for this Team.
     * 
     * @return adUnitIds   * The IDs of all applied ad units on the team. If {@link hasAllInventory}
     * is set to true, then this field must be empty.
     */
    public java.lang.String[] getAdUnitIds() {
        return adUnitIds;
    }


    /**
     * Sets the adUnitIds value for this Team.
     * 
     * @param adUnitIds   * The IDs of all applied ad units on the team. If {@link hasAllInventory}
     * is set to true, then this field must be empty.
     */
    public void setAdUnitIds(java.lang.String[] adUnitIds) {
        this.adUnitIds = adUnitIds;
    }

    public java.lang.String getAdUnitIds(int i) {
        return this.adUnitIds[i];
    }

    public void setAdUnitIds(int i, java.lang.String _value) {
        this.adUnitIds[i] = _value;
    }


    /**
     * Gets the orderIds value for this Team.
     * 
     * @return orderIds   * The IDs of all orders on the team. This attribute is optional.
     */
    public long[] getOrderIds() {
        return orderIds;
    }


    /**
     * Sets the orderIds value for this Team.
     * 
     * @param orderIds   * The IDs of all orders on the team. This attribute is optional.
     */
    public void setOrderIds(long[] orderIds) {
        this.orderIds = orderIds;
    }

    public long getOrderIds(int i) {
        return this.orderIds[i];
    }

    public void setOrderIds(int i, long _value) {
        this.orderIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Team)) return false;
        Team other = (Team) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.hasAllCompanies==null && other.getHasAllCompanies()==null) || 
             (this.hasAllCompanies!=null &&
              this.hasAllCompanies.equals(other.getHasAllCompanies()))) &&
            ((this.hasAllInventory==null && other.getHasAllInventory()==null) || 
             (this.hasAllInventory!=null &&
              this.hasAllInventory.equals(other.getHasAllInventory()))) &&
            ((this.teamAccessType==null && other.getTeamAccessType()==null) || 
             (this.teamAccessType!=null &&
              this.teamAccessType.equals(other.getTeamAccessType()))) &&
            ((this.companyIds==null && other.getCompanyIds()==null) || 
             (this.companyIds!=null &&
              java.util.Arrays.equals(this.companyIds, other.getCompanyIds()))) &&
            ((this.adUnitIds==null && other.getAdUnitIds()==null) || 
             (this.adUnitIds!=null &&
              java.util.Arrays.equals(this.adUnitIds, other.getAdUnitIds()))) &&
            ((this.orderIds==null && other.getOrderIds()==null) || 
             (this.orderIds!=null &&
              java.util.Arrays.equals(this.orderIds, other.getOrderIds())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getHasAllCompanies() != null) {
            _hashCode += getHasAllCompanies().hashCode();
        }
        if (getHasAllInventory() != null) {
            _hashCode += getHasAllInventory().hashCode();
        }
        if (getTeamAccessType() != null) {
            _hashCode += getTeamAccessType().hashCode();
        }
        if (getCompanyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdUnitIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdUnitIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdUnitIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderIds(), i);
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
        new org.apache.axis.description.TypeDesc(Team.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "Team"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAllCompanies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "hasAllCompanies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAllInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "hasAllInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "teamAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "TeamAccessType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "companyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "adUnitIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "orderIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
