// Copyright 2018 Google Inc. All Rights Reserved.
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
 * Team.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


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

    /* The status of the {@link Team}. This value can be {@link TeamStatus#ACTIVE}
     * (default) or
     *                 {@link TeamStatus#INACTIVE} and determines the visibility
     * of the team in the UI. */
    private com.google.api.ads.dfp.axis.v201802.TeamStatus status;

    /* Whether or not users on this team have access to all companies.
     * If this
     *                 value is true, then {@link #companyIds} must be empty. */
    private java.lang.Boolean hasAllCompanies;

    /* Whether or not users on this team have access to all inventory.
     * If this
     *                 value is true, then {@link #adUnitIds} must be empty. */
    private java.lang.Boolean hasAllInventory;

    /* The default access to orders, for users on this team. */
    private com.google.api.ads.dfp.axis.v201802.TeamAccessType teamAccessType;

    public Team() {
    }

    public Team(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201802.TeamStatus status,
           java.lang.Boolean hasAllCompanies,
           java.lang.Boolean hasAllInventory,
           com.google.api.ads.dfp.axis.v201802.TeamAccessType teamAccessType) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.status = status;
           this.hasAllCompanies = hasAllCompanies;
           this.hasAllInventory = hasAllInventory;
           this.teamAccessType = teamAccessType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("hasAllCompanies", getHasAllCompanies())
            .add("hasAllInventory", getHasAllInventory())
            .add("id", getId())
            .add("name", getName())
            .add("status", getStatus())
            .add("teamAccessType", getTeamAccessType())
            .toString();
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
     * Gets the status value for this Team.
     * 
     * @return status   * The status of the {@link Team}. This value can be {@link TeamStatus#ACTIVE}
     * (default) or
     *                 {@link TeamStatus#INACTIVE} and determines the visibility
     * of the team in the UI.
     */
    public com.google.api.ads.dfp.axis.v201802.TeamStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Team.
     * 
     * @param status   * The status of the {@link Team}. This value can be {@link TeamStatus#ACTIVE}
     * (default) or
     *                 {@link TeamStatus#INACTIVE} and determines the visibility
     * of the team in the UI.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.TeamStatus status) {
        this.status = status;
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
    public com.google.api.ads.dfp.axis.v201802.TeamAccessType getTeamAccessType() {
        return teamAccessType;
    }


    /**
     * Sets the teamAccessType value for this Team.
     * 
     * @param teamAccessType   * The default access to orders, for users on this team.
     */
    public void setTeamAccessType(com.google.api.ads.dfp.axis.v201802.TeamAccessType teamAccessType) {
        this.teamAccessType = teamAccessType;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.hasAllCompanies==null && other.getHasAllCompanies()==null) || 
             (this.hasAllCompanies!=null &&
              this.hasAllCompanies.equals(other.getHasAllCompanies()))) &&
            ((this.hasAllInventory==null && other.getHasAllInventory()==null) || 
             (this.hasAllInventory!=null &&
              this.hasAllInventory.equals(other.getHasAllInventory()))) &&
            ((this.teamAccessType==null && other.getTeamAccessType()==null) || 
             (this.teamAccessType!=null &&
              this.teamAccessType.equals(other.getTeamAccessType())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Team.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Team"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TeamStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAllCompanies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "hasAllCompanies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAllInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "hasAllInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "teamAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TeamAccessType"));
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
