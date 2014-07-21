/**
 * Channel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents a youtube channel to be targeted. A youtube channel
 *             will match any playback of a video of that youtube channel.
 * 
 *             To target a channel, you create a channel with
 *             - either the userId (which is the ugly id in the standard
 * channel url
 *             youtube.com/channel/[userId]
 *             - or the userName (which is the
 *             part of the url you see in a vanity url like youtube.com/user/[userName]
 * 
 *             To display to an end user, publicName should be used.
 */
public class Channel  extends com.google.api.ads.adwords.axis.v201406.video.BaseCriterion  implements java.io.Serializable {
    /* This is the name that you see in the
     *                     channel vanity url, i.e., youtube.com/user/[userName].
     * It is unique for a channel but may change over time. */
    private java.lang.String userName;

    /* Id of this the user owning this channel as you see in
     *                     youtube.com/user/id=[userId]. */
    private java.lang.String userId;

    /* This is the publicly visible display name of the user
     *                     channel. This will always be set and should should
     * be used to
     *                     render the channel to the end-user.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String publicName;

    public Channel() {
    }

    public Channel(
           java.lang.Long id,
           java.lang.String baseCriterionType,
           java.lang.String userName,
           java.lang.String userId,
           java.lang.String publicName) {
        super(
            id,
            baseCriterionType);
        this.userName = userName;
        this.userId = userId;
        this.publicName = publicName;
    }


    /**
     * Gets the userName value for this Channel.
     * 
     * @return userName   * This is the name that you see in the
     *                     channel vanity url, i.e., youtube.com/user/[userName].
     * It is unique for a channel but may change over time.
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Channel.
     * 
     * @param userName   * This is the name that you see in the
     *                     channel vanity url, i.e., youtube.com/user/[userName].
     * It is unique for a channel but may change over time.
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userId value for this Channel.
     * 
     * @return userId   * Id of this the user owning this channel as you see in
     *                     youtube.com/user/id=[userId].
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Channel.
     * 
     * @param userId   * Id of this the user owning this channel as you see in
     *                     youtube.com/user/id=[userId].
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the publicName value for this Channel.
     * 
     * @return publicName   * This is the publicly visible display name of the user
     *                     channel. This will always be set and should should
     * be used to
     *                     render the channel to the end-user.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getPublicName() {
        return publicName;
    }


    /**
     * Sets the publicName value for this Channel.
     * 
     * @param publicName   * This is the publicly visible display name of the user
     *                     channel. This will always be set and should should
     * be used to
     *                     render the channel to the end-user.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setPublicName(java.lang.String publicName) {
        this.publicName = publicName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Channel)) return false;
        Channel other = (Channel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.publicName==null && other.getPublicName()==null) || 
             (this.publicName!=null &&
              this.publicName.equals(other.getPublicName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPublicName() != null) {
            _hashCode += getPublicName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Channel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "Channel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "publicName"));
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
