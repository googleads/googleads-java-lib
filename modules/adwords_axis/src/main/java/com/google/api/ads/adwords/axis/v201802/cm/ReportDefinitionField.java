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
 * ReportDefinitionField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents the fields that can be used to create a ReportDefinition.
 * This class allows the user to query the list of fields applicable
 * to a
 *             given report type. Consumers of reports will be able use
 * the retrieved
 *             fields through the {@link ReportDefinitionService#getReportFields}
 * api and run the corresponding reports.
 */
public class ReportDefinitionField  implements java.io.Serializable {
    /* The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String fieldName;

    /* The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String displayFieldName;

    /* The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String xmlAttributeName;

    /* The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String fieldType;

    /* The behavior of this field. Possible values are: "ATTRIBUTE",
     * "METRIC"
     *                 and "SEGMENT".
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String fieldBehavior;

    /* List of enum values for the corresponding field if and only
     * if the
     *                 field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String[] enumValues;

    /* Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean canSelect;

    /* Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean canFilter;

    /* Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isEnumType;

    /* Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Boolean isBeta;

    /* Indicates if the field can be selected in queries that explicitly
     * request zero rows.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Boolean isZeroRowCompatible;

    /* List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair[] enumValuePairs;

    /* List of mutually exclusive fields of this field. This field
     * cannot be selected or used in
     *                 a predicate together with any of the mutually exclusive
     * fields in this list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String[] exclusiveFields;

    public ReportDefinitionField() {
    }

    public ReportDefinitionField(
           java.lang.String fieldName,
           java.lang.String displayFieldName,
           java.lang.String xmlAttributeName,
           java.lang.String fieldType,
           java.lang.String fieldBehavior,
           java.lang.String[] enumValues,
           java.lang.Boolean canSelect,
           java.lang.Boolean canFilter,
           java.lang.Boolean isEnumType,
           java.lang.Boolean isBeta,
           java.lang.Boolean isZeroRowCompatible,
           com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair[] enumValuePairs,
           java.lang.String[] exclusiveFields) {
           this.fieldName = fieldName;
           this.displayFieldName = displayFieldName;
           this.xmlAttributeName = xmlAttributeName;
           this.fieldType = fieldType;
           this.fieldBehavior = fieldBehavior;
           this.enumValues = enumValues;
           this.canSelect = canSelect;
           this.canFilter = canFilter;
           this.isEnumType = isEnumType;
           this.isBeta = isBeta;
           this.isZeroRowCompatible = isZeroRowCompatible;
           this.enumValuePairs = enumValuePairs;
           this.exclusiveFields = exclusiveFields;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("canFilter", getCanFilter())
            .add("canSelect", getCanSelect())
            .add("displayFieldName", getDisplayFieldName())
            .add("enumValuePairs", getEnumValuePairs())
            .add("enumValues", getEnumValues())
            .add("exclusiveFields", getExclusiveFields())
            .add("fieldBehavior", getFieldBehavior())
            .add("fieldName", getFieldName())
            .add("fieldType", getFieldType())
            .add("isBeta", getIsBeta())
            .add("isEnumType", getIsEnumType())
            .add("isZeroRowCompatible", getIsZeroRowCompatible())
            .add("xmlAttributeName", getXmlAttributeName())
            .toString();
    }

    /**
     * Gets the fieldName value for this ReportDefinitionField.
     * 
     * @return fieldName   * The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this ReportDefinitionField.
     * 
     * @param fieldName   * The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the displayFieldName value for this ReportDefinitionField.
     * 
     * @return displayFieldName   * The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDisplayFieldName() {
        return displayFieldName;
    }


    /**
     * Sets the displayFieldName value for this ReportDefinitionField.
     * 
     * @param displayFieldName   * The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDisplayFieldName(java.lang.String displayFieldName) {
        this.displayFieldName = displayFieldName;
    }


    /**
     * Gets the xmlAttributeName value for this ReportDefinitionField.
     * 
     * @return xmlAttributeName   * The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getXmlAttributeName() {
        return xmlAttributeName;
    }


    /**
     * Sets the xmlAttributeName value for this ReportDefinitionField.
     * 
     * @param xmlAttributeName   * The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setXmlAttributeName(java.lang.String xmlAttributeName) {
        this.xmlAttributeName = xmlAttributeName;
    }


    /**
     * Gets the fieldType value for this ReportDefinitionField.
     * 
     * @return fieldType   * The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this ReportDefinitionField.
     * 
     * @param fieldType   * The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFieldType(java.lang.String fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the fieldBehavior value for this ReportDefinitionField.
     * 
     * @return fieldBehavior   * The behavior of this field. Possible values are: "ATTRIBUTE",
     * "METRIC"
     *                 and "SEGMENT".
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getFieldBehavior() {
        return fieldBehavior;
    }


    /**
     * Sets the fieldBehavior value for this ReportDefinitionField.
     * 
     * @param fieldBehavior   * The behavior of this field. Possible values are: "ATTRIBUTE",
     * "METRIC"
     *                 and "SEGMENT".
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setFieldBehavior(java.lang.String fieldBehavior) {
        this.fieldBehavior = fieldBehavior;
    }


    /**
     * Gets the enumValues value for this ReportDefinitionField.
     * 
     * @return enumValues   * List of enum values for the corresponding field if and only
     * if the
     *                 field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getEnumValues() {
        return enumValues;
    }


    /**
     * Sets the enumValues value for this ReportDefinitionField.
     * 
     * @param enumValues   * List of enum values for the corresponding field if and only
     * if the
     *                 field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setEnumValues(java.lang.String[] enumValues) {
        this.enumValues = enumValues;
    }

    public java.lang.String getEnumValues(int i) {
        return this.enumValues[i];
    }

    public void setEnumValues(int i, java.lang.String _value) {
        this.enumValues[i] = _value;
    }


    /**
     * Gets the canSelect value for this ReportDefinitionField.
     * 
     * @return canSelect   * Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getCanSelect() {
        return canSelect;
    }


    /**
     * Sets the canSelect value for this ReportDefinitionField.
     * 
     * @param canSelect   * Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCanSelect(java.lang.Boolean canSelect) {
        this.canSelect = canSelect;
    }


    /**
     * Gets the canFilter value for this ReportDefinitionField.
     * 
     * @return canFilter   * Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getCanFilter() {
        return canFilter;
    }


    /**
     * Sets the canFilter value for this ReportDefinitionField.
     * 
     * @param canFilter   * Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCanFilter(java.lang.Boolean canFilter) {
        this.canFilter = canFilter;
    }


    /**
     * Gets the isEnumType value for this ReportDefinitionField.
     * 
     * @return isEnumType   * Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsEnumType() {
        return isEnumType;
    }


    /**
     * Sets the isEnumType value for this ReportDefinitionField.
     * 
     * @param isEnumType   * Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setIsEnumType(java.lang.Boolean isEnumType) {
        this.isEnumType = isEnumType;
    }


    /**
     * Gets the isBeta value for this ReportDefinitionField.
     * 
     * @return isBeta   * Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsBeta() {
        return isBeta;
    }


    /**
     * Sets the isBeta value for this ReportDefinitionField.
     * 
     * @param isBeta   * Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setIsBeta(java.lang.Boolean isBeta) {
        this.isBeta = isBeta;
    }


    /**
     * Gets the isZeroRowCompatible value for this ReportDefinitionField.
     * 
     * @return isZeroRowCompatible   * Indicates if the field can be selected in queries that explicitly
     * request zero rows.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Boolean getIsZeroRowCompatible() {
        return isZeroRowCompatible;
    }


    /**
     * Sets the isZeroRowCompatible value for this ReportDefinitionField.
     * 
     * @param isZeroRowCompatible   * Indicates if the field can be selected in queries that explicitly
     * request zero rows.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setIsZeroRowCompatible(java.lang.Boolean isZeroRowCompatible) {
        this.isZeroRowCompatible = isZeroRowCompatible;
    }


    /**
     * Gets the enumValuePairs value for this ReportDefinitionField.
     * 
     * @return enumValuePairs   * List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair[] getEnumValuePairs() {
        return enumValuePairs;
    }


    /**
     * Sets the enumValuePairs value for this ReportDefinitionField.
     * 
     * @param enumValuePairs   * List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setEnumValuePairs(com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair[] enumValuePairs) {
        this.enumValuePairs = enumValuePairs;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair getEnumValuePairs(int i) {
        return this.enumValuePairs[i];
    }

    public void setEnumValuePairs(int i, com.google.api.ads.adwords.axis.v201802.cm.EnumValuePair _value) {
        this.enumValuePairs[i] = _value;
    }


    /**
     * Gets the exclusiveFields value for this ReportDefinitionField.
     * 
     * @return exclusiveFields   * List of mutually exclusive fields of this field. This field
     * cannot be selected or used in
     *                 a predicate together with any of the mutually exclusive
     * fields in this list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String[] getExclusiveFields() {
        return exclusiveFields;
    }


    /**
     * Sets the exclusiveFields value for this ReportDefinitionField.
     * 
     * @param exclusiveFields   * List of mutually exclusive fields of this field. This field
     * cannot be selected or used in
     *                 a predicate together with any of the mutually exclusive
     * fields in this list.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setExclusiveFields(java.lang.String[] exclusiveFields) {
        this.exclusiveFields = exclusiveFields;
    }

    public java.lang.String getExclusiveFields(int i) {
        return this.exclusiveFields[i];
    }

    public void setExclusiveFields(int i, java.lang.String _value) {
        this.exclusiveFields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionField)) return false;
        ReportDefinitionField other = (ReportDefinitionField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.displayFieldName==null && other.getDisplayFieldName()==null) || 
             (this.displayFieldName!=null &&
              this.displayFieldName.equals(other.getDisplayFieldName()))) &&
            ((this.xmlAttributeName==null && other.getXmlAttributeName()==null) || 
             (this.xmlAttributeName!=null &&
              this.xmlAttributeName.equals(other.getXmlAttributeName()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.fieldBehavior==null && other.getFieldBehavior()==null) || 
             (this.fieldBehavior!=null &&
              this.fieldBehavior.equals(other.getFieldBehavior()))) &&
            ((this.enumValues==null && other.getEnumValues()==null) || 
             (this.enumValues!=null &&
              java.util.Arrays.equals(this.enumValues, other.getEnumValues()))) &&
            ((this.canSelect==null && other.getCanSelect()==null) || 
             (this.canSelect!=null &&
              this.canSelect.equals(other.getCanSelect()))) &&
            ((this.canFilter==null && other.getCanFilter()==null) || 
             (this.canFilter!=null &&
              this.canFilter.equals(other.getCanFilter()))) &&
            ((this.isEnumType==null && other.getIsEnumType()==null) || 
             (this.isEnumType!=null &&
              this.isEnumType.equals(other.getIsEnumType()))) &&
            ((this.isBeta==null && other.getIsBeta()==null) || 
             (this.isBeta!=null &&
              this.isBeta.equals(other.getIsBeta()))) &&
            ((this.isZeroRowCompatible==null && other.getIsZeroRowCompatible()==null) || 
             (this.isZeroRowCompatible!=null &&
              this.isZeroRowCompatible.equals(other.getIsZeroRowCompatible()))) &&
            ((this.enumValuePairs==null && other.getEnumValuePairs()==null) || 
             (this.enumValuePairs!=null &&
              java.util.Arrays.equals(this.enumValuePairs, other.getEnumValuePairs()))) &&
            ((this.exclusiveFields==null && other.getExclusiveFields()==null) || 
             (this.exclusiveFields!=null &&
              java.util.Arrays.equals(this.exclusiveFields, other.getExclusiveFields())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getDisplayFieldName() != null) {
            _hashCode += getDisplayFieldName().hashCode();
        }
        if (getXmlAttributeName() != null) {
            _hashCode += getXmlAttributeName().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getFieldBehavior() != null) {
            _hashCode += getFieldBehavior().hashCode();
        }
        if (getEnumValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanSelect() != null) {
            _hashCode += getCanSelect().hashCode();
        }
        if (getCanFilter() != null) {
            _hashCode += getCanFilter().hashCode();
        }
        if (getIsEnumType() != null) {
            _hashCode += getIsEnumType().hashCode();
        }
        if (getIsBeta() != null) {
            _hashCode += getIsBeta().hashCode();
        }
        if (getIsZeroRowCompatible() != null) {
            _hashCode += getIsZeroRowCompatible().hashCode();
        }
        if (getEnumValuePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumValuePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumValuePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExclusiveFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExclusiveFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExclusiveFields(), i);
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
        new org.apache.axis.description.TypeDesc(ReportDefinitionField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ReportDefinitionField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlAttributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "xmlAttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "enumValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSelect");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "canSelect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "canFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnumType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isEnumType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBeta");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isBeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isZeroRowCompatible");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "isZeroRowCompatible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "enumValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "EnumValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusiveFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "exclusiveFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
