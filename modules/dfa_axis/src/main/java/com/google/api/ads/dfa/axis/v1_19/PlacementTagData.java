/**
 * PlacementTagData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class PlacementTagData  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.Advertiser advertiser;

    private com.google.api.ads.dfa.axis.v1_19.CampaignBase campaign;

    private com.google.api.ads.dfa.axis.v1_19.ClickCommandInfo[] clickCommandInfos;

    private com.google.api.ads.dfa.axis.v1_19.PlacementTagInfo[] placementTagInfos;

    public PlacementTagData() {
    }

    public PlacementTagData(
           com.google.api.ads.dfa.axis.v1_19.Advertiser advertiser,
           com.google.api.ads.dfa.axis.v1_19.CampaignBase campaign,
           com.google.api.ads.dfa.axis.v1_19.ClickCommandInfo[] clickCommandInfos,
           com.google.api.ads.dfa.axis.v1_19.PlacementTagInfo[] placementTagInfos) {
           this.advertiser = advertiser;
           this.campaign = campaign;
           this.clickCommandInfos = clickCommandInfos;
           this.placementTagInfos = placementTagInfos;
    }


    /**
     * Gets the advertiser value for this PlacementTagData.
     * 
     * @return advertiser
     */
    public com.google.api.ads.dfa.axis.v1_19.Advertiser getAdvertiser() {
        return advertiser;
    }


    /**
     * Sets the advertiser value for this PlacementTagData.
     * 
     * @param advertiser
     */
    public void setAdvertiser(com.google.api.ads.dfa.axis.v1_19.Advertiser advertiser) {
        this.advertiser = advertiser;
    }


    /**
     * Gets the campaign value for this PlacementTagData.
     * 
     * @return campaign
     */
    public com.google.api.ads.dfa.axis.v1_19.CampaignBase getCampaign() {
        return campaign;
    }


    /**
     * Sets the campaign value for this PlacementTagData.
     * 
     * @param campaign
     */
    public void setCampaign(com.google.api.ads.dfa.axis.v1_19.CampaignBase campaign) {
        this.campaign = campaign;
    }


    /**
     * Gets the clickCommandInfos value for this PlacementTagData.
     * 
     * @return clickCommandInfos
     */
    public com.google.api.ads.dfa.axis.v1_19.ClickCommandInfo[] getClickCommandInfos() {
        return clickCommandInfos;
    }


    /**
     * Sets the clickCommandInfos value for this PlacementTagData.
     * 
     * @param clickCommandInfos
     */
    public void setClickCommandInfos(com.google.api.ads.dfa.axis.v1_19.ClickCommandInfo[] clickCommandInfos) {
        this.clickCommandInfos = clickCommandInfos;
    }


    /**
     * Gets the placementTagInfos value for this PlacementTagData.
     * 
     * @return placementTagInfos
     */
    public com.google.api.ads.dfa.axis.v1_19.PlacementTagInfo[] getPlacementTagInfos() {
        return placementTagInfos;
    }


    /**
     * Sets the placementTagInfos value for this PlacementTagData.
     * 
     * @param placementTagInfos
     */
    public void setPlacementTagInfos(com.google.api.ads.dfa.axis.v1_19.PlacementTagInfo[] placementTagInfos) {
        this.placementTagInfos = placementTagInfos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlacementTagData)) return false;
        PlacementTagData other = (PlacementTagData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.advertiser==null && other.getAdvertiser()==null) || 
             (this.advertiser!=null &&
              this.advertiser.equals(other.getAdvertiser()))) &&
            ((this.campaign==null && other.getCampaign()==null) || 
             (this.campaign!=null &&
              this.campaign.equals(other.getCampaign()))) &&
            ((this.clickCommandInfos==null && other.getClickCommandInfos()==null) || 
             (this.clickCommandInfos!=null &&
              java.util.Arrays.equals(this.clickCommandInfos, other.getClickCommandInfos()))) &&
            ((this.placementTagInfos==null && other.getPlacementTagInfos()==null) || 
             (this.placementTagInfos!=null &&
              java.util.Arrays.equals(this.placementTagInfos, other.getPlacementTagInfos())));
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
        if (getAdvertiser() != null) {
            _hashCode += getAdvertiser().hashCode();
        }
        if (getCampaign() != null) {
            _hashCode += getCampaign().hashCode();
        }
        if (getClickCommandInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClickCommandInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClickCommandInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlacementTagInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlacementTagInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlacementTagInfos(), i);
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
        new org.apache.axis.description.TypeDesc(PlacementTagData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementTagData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Advertiser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignBase"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickCommandInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clickCommandInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickCommandInfo"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placementTagInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "placementTagInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PlacementTagInfo"));
        elemField.setNillable(true);
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
