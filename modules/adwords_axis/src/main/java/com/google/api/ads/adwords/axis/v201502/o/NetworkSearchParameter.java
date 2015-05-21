/**
 * NetworkSearchParameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201502.o;


/**
 * <p>A {@link SearchParameter} for setting the search network. Currently
 * we
 *             support two network setting options:
 *             <ul>
 *             <li>Google search network</li>
 *             <li>Google search network and AFS</li>
 *             </ul>
 *             <p>This element is supported by following {@link IdeaType}s:
 * KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s:
 * IDEAS, STATS.
 */
public class NetworkSearchParameter  extends com.google.api.ads.adwords.axis.v201502.o.SearchParameter  implements java.io.Serializable {
    /* The network targeted for this search.
     *                     
     *                     <p>Currently we can support two options:
     *                     <ul>
     *                     <li>number of google search impressions</li>
     *                     <li>number of search impressions on the google
     * search network(AFS)</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201502.cm.NetworkSetting networkSetting;

    public NetworkSearchParameter() {
    }

    public NetworkSearchParameter(
           java.lang.String searchParameterType,
           com.google.api.ads.adwords.axis.v201502.cm.NetworkSetting networkSetting) {
        super(
            searchParameterType);
        this.networkSetting = networkSetting;
    }


    /**
     * Gets the networkSetting value for this NetworkSearchParameter.
     * 
     * @return networkSetting   * The network targeted for this search.
     *                     
     *                     <p>Currently we can support two options:
     *                     <ul>
     *                     <li>number of google search impressions</li>
     *                     <li>number of search impressions on the google
     * search network(AFS)</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201502.cm.NetworkSetting getNetworkSetting() {
        return networkSetting;
    }


    /**
     * Sets the networkSetting value for this NetworkSearchParameter.
     * 
     * @param networkSetting   * The network targeted for this search.
     *                     
     *                     <p>Currently we can support two options:
     *                     <ul>
     *                     <li>number of google search impressions</li>
     *                     <li>number of search impressions on the google
     * search network(AFS)</li>
     *                     </ul>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setNetworkSetting(com.google.api.ads.adwords.axis.v201502.cm.NetworkSetting networkSetting) {
        this.networkSetting = networkSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkSearchParameter)) return false;
        NetworkSearchParameter other = (NetworkSearchParameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.networkSetting==null && other.getNetworkSetting()==null) || 
             (this.networkSetting!=null &&
              this.networkSetting.equals(other.getNetworkSetting())));
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
        if (getNetworkSetting() != null) {
            _hashCode += getNetworkSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkSearchParameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201502", "NetworkSearchParameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201502", "networkSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201502", "NetworkSetting"));
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
