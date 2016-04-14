/**
 * Selector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * A generic selector to specify the type of information to return.
 */
public class Selector  implements java.io.Serializable {
    /* List of fields to select.
     *                                 <a href="/adwords/api/docs/appendix/selectorfields">Possible
     * values</a>
     *                                 are marked {@code Selectable} on the
     * entity's reference page.
     *                                 For example, for the {@code CampaignService}
     * selector, refer to the
     *                                 selectable fields from the {@link
     * Campaign} reference page.
     *                                 <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span> */
    private java.lang.String[] fields;

    /* Specifies how an entity (eg. adgroup, campaign, criterion,
     * ad) should be filtered.
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span> */
    private com.google.api.ads.ddp.axis.v201603.dmp.Predicate[] predicates;

    /* Range of dates for which you want to include data. If this
     * value is omitted,
     *                                 results for all dates are returned.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span> */
    private com.google.api.ads.ddp.axis.v201603.dmp.DateRange dateRange;

    /* The fields on which you want to sort, and the sort order. The
     * order in the list is
     *                                 significant: The first element in
     * the list indicates the primary sort order, the next
     *                                 specifies the secondary sort order
     * and so on. */
    private com.google.api.ads.ddp.axis.v201603.dmp.OrderBy[] ordering;

    /* Pagination information. */
    private com.google.api.ads.ddp.axis.v201603.dmp.Paging paging;

    public Selector() {
    }

    public Selector(
           java.lang.String[] fields,
           com.google.api.ads.ddp.axis.v201603.dmp.Predicate[] predicates,
           com.google.api.ads.ddp.axis.v201603.dmp.DateRange dateRange,
           com.google.api.ads.ddp.axis.v201603.dmp.OrderBy[] ordering,
           com.google.api.ads.ddp.axis.v201603.dmp.Paging paging) {
           this.fields = fields;
           this.predicates = predicates;
           this.dateRange = dateRange;
           this.ordering = ordering;
           this.paging = paging;
    }


    /**
     * Gets the fields value for this Selector.
     * 
     * @return fields   * List of fields to select.
     *                                 <a href="/adwords/api/docs/appendix/selectorfields">Possible
     * values</a>
     *                                 are marked {@code Selectable} on the
     * entity's reference page.
     *                                 For example, for the {@code CampaignService}
     * selector, refer to the
     *                                 selectable fields from the {@link
     * Campaign} reference page.
     *                                 <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public java.lang.String[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this Selector.
     * 
     * @param fields   * List of fields to select.
     *                                 <a href="/adwords/api/docs/appendix/selectorfields">Possible
     * values</a>
     *                                 are marked {@code Selectable} on the
     * entity's reference page.
     *                                 For example, for the {@code CampaignService}
     * selector, refer to the
     *                                 selectable fields from the {@link
     * Campaign} reference page.
     *                                 <span class="constraint ContentsDistinct">This
     * field must contain distinct elements.</span>
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     *                                 <span class="constraint Required">This
     * field is required and should not be {@code null}.</span>
     */
    public void setFields(java.lang.String[] fields) {
        this.fields = fields;
    }

    public java.lang.String getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, java.lang.String _value) {
        this.fields[i] = _value;
    }


    /**
     * Gets the predicates value for this Selector.
     * 
     * @return predicates   * Specifies how an entity (eg. adgroup, campaign, criterion,
     * ad) should be filtered.
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.Predicate[] getPredicates() {
        return predicates;
    }


    /**
     * Sets the predicates value for this Selector.
     * 
     * @param predicates   * Specifies how an entity (eg. adgroup, campaign, criterion,
     * ad) should be filtered.
     *                                 <span class="constraint ContentsNotNull">This
     * field must not contain {@code null} elements.</span>
     */
    public void setPredicates(com.google.api.ads.ddp.axis.v201603.dmp.Predicate[] predicates) {
        this.predicates = predicates;
    }

    public com.google.api.ads.ddp.axis.v201603.dmp.Predicate getPredicates(int i) {
        return this.predicates[i];
    }

    public void setPredicates(int i, com.google.api.ads.ddp.axis.v201603.dmp.Predicate _value) {
        this.predicates[i] = _value;
    }


    /**
     * Gets the dateRange value for this Selector.
     * 
     * @return dateRange   * Range of dates for which you want to include data. If this
     * value is omitted,
     *                                 results for all dates are returned.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span>
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.DateRange getDateRange() {
        return dateRange;
    }


    /**
     * Sets the dateRange value for this Selector.
     * 
     * @param dateRange   * Range of dates for which you want to include data. If this
     * value is omitted,
     *                                 results for all dates are returned.
     * <span class="constraint DateRangeWithinRange">This range must be contained
     * within the range [19700101, 20380101].</span>
     */
    public void setDateRange(com.google.api.ads.ddp.axis.v201603.dmp.DateRange dateRange) {
        this.dateRange = dateRange;
    }


    /**
     * Gets the ordering value for this Selector.
     * 
     * @return ordering   * The fields on which you want to sort, and the sort order. The
     * order in the list is
     *                                 significant: The first element in
     * the list indicates the primary sort order, the next
     *                                 specifies the secondary sort order
     * and so on.
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.OrderBy[] getOrdering() {
        return ordering;
    }


    /**
     * Sets the ordering value for this Selector.
     * 
     * @param ordering   * The fields on which you want to sort, and the sort order. The
     * order in the list is
     *                                 significant: The first element in
     * the list indicates the primary sort order, the next
     *                                 specifies the secondary sort order
     * and so on.
     */
    public void setOrdering(com.google.api.ads.ddp.axis.v201603.dmp.OrderBy[] ordering) {
        this.ordering = ordering;
    }

    public com.google.api.ads.ddp.axis.v201603.dmp.OrderBy getOrdering(int i) {
        return this.ordering[i];
    }

    public void setOrdering(int i, com.google.api.ads.ddp.axis.v201603.dmp.OrderBy _value) {
        this.ordering[i] = _value;
    }


    /**
     * Gets the paging value for this Selector.
     * 
     * @return paging   * Pagination information.
     */
    public com.google.api.ads.ddp.axis.v201603.dmp.Paging getPaging() {
        return paging;
    }


    /**
     * Sets the paging value for this Selector.
     * 
     * @param paging   * Pagination information.
     */
    public void setPaging(com.google.api.ads.ddp.axis.v201603.dmp.Paging paging) {
        this.paging = paging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Selector)) return false;
        Selector other = (Selector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.predicates==null && other.getPredicates()==null) || 
             (this.predicates!=null &&
              java.util.Arrays.equals(this.predicates, other.getPredicates()))) &&
            ((this.dateRange==null && other.getDateRange()==null) || 
             (this.dateRange!=null &&
              this.dateRange.equals(other.getDateRange()))) &&
            ((this.ordering==null && other.getOrdering()==null) || 
             (this.ordering!=null &&
              java.util.Arrays.equals(this.ordering, other.getOrdering()))) &&
            ((this.paging==null && other.getPaging()==null) || 
             (this.paging!=null &&
              this.paging.equals(other.getPaging())));
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
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredicates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateRange() != null) {
            _hashCode += getDateRange().hashCode();
        }
        if (getOrdering() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrdering());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrdering(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaging() != null) {
            _hashCode += getPaging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Selector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Selector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predicates");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "predicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Predicate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "dateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordering");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "ordering"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "OrderBy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paging");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "paging"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "Paging"));
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
