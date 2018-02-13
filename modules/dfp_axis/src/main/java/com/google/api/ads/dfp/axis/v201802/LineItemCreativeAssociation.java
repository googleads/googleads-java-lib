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
 * LineItemCreativeAssociation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code LineItemCreativeAssociation} associates a {@link Creative}
 * or {@link CreativeSet} with a
 *             {@link LineItem} so that the creative can be served in
 * ad units targeted by the line item.
 */
public class LineItemCreativeAssociation  implements java.io.Serializable {
    /* The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required. */
    private java.lang.Long lineItemId;

    /* The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 <p>
     *                 This attribute is required if this is an association
     * between a line item and a creative.
     *                 <br>
     *                 This attribute is ignored if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 If this is an association between a line item and
     * a creative, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the creative's ID.
     *                 <br>
     *                 If this is an association between a line item and
     * a creative set, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the ID of the
     *                 {@link CreativeSet#masterCreativeId master creative}. */
    private java.lang.Long creativeId;

    /* The ID of the {@link CreativeSet} being associated with a {@link
     * LineItem}.
     *                 This attribute is required if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 This field will be {@code null} when retrieving associations
     * between line items and
     *                 creatives not belonging to a set. */
    private java.lang.Long creativeSetId;

    /* The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10. */
    private java.lang.Double manualCreativeRotationWeight;

    /* The sequential rotation index of the {@link Creative}.
     *                 This value is used only if
     *                 the associated line item's {@link LineItem#creativeRotationType}
     * is set to
     *                 {@link CreativeRotationType#SEQUENTIAL}. This attribute
     * is optional and
     *                 defaults to 1. */
    private java.lang.Integer sequentialCreativeRotationIndex;

    /* Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks. */
    private com.google.api.ads.dfp.axis.v201802.DateTime startDateTime;

    /* Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType;

    /* Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endDateTime;

    /* Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks. */
    private java.lang.String destinationUrl;

    /* Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional. */
    private com.google.api.ads.dfp.axis.v201802.Size[] sizes;

    /* The status of the association. This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStatus status;

    /* Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet. */
    private com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStats stats;

    /* The date and time this association was last modified. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    /* Specifies {@link CreativeTargeting} for this line item creative
     * association.
     *                 
     *                 <p>This attribute is optional. It should match the
     * creative targeting specified on the
     *                 corresponding {@link CreativePlaceholder} in the {@link
     * LineItem} that is being associated
     *                 with the {@link Creative}. */
    private java.lang.String targetingName;

    public LineItemCreativeAssociation() {
    }

    public LineItemCreativeAssociation(
           java.lang.Long lineItemId,
           java.lang.Long creativeId,
           java.lang.Long creativeSetId,
           java.lang.Double manualCreativeRotationWeight,
           java.lang.Integer sequentialCreativeRotationIndex,
           com.google.api.ads.dfp.axis.v201802.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.axis.v201802.DateTime endDateTime,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.Size[] sizes,
           com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStatus status,
           com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStats stats,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           java.lang.String targetingName) {
           this.lineItemId = lineItemId;
           this.creativeId = creativeId;
           this.creativeSetId = creativeSetId;
           this.manualCreativeRotationWeight = manualCreativeRotationWeight;
           this.sequentialCreativeRotationIndex = sequentialCreativeRotationIndex;
           this.startDateTime = startDateTime;
           this.startDateTimeType = startDateTimeType;
           this.endDateTime = endDateTime;
           this.destinationUrl = destinationUrl;
           this.sizes = sizes;
           this.status = status;
           this.stats = stats;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.targetingName = targetingName;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creativeId", getCreativeId())
            .add("creativeSetId", getCreativeSetId())
            .add("destinationUrl", getDestinationUrl())
            .add("endDateTime", getEndDateTime())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lineItemId", getLineItemId())
            .add("manualCreativeRotationWeight", getManualCreativeRotationWeight())
            .add("sequentialCreativeRotationIndex", getSequentialCreativeRotationIndex())
            .add("sizes", getSizes())
            .add("startDateTime", getStartDateTime())
            .add("startDateTimeType", getStartDateTimeType())
            .add("stats", getStats())
            .add("status", getStatus())
            .add("targetingName", getTargetingName())
            .toString();
    }

    /**
     * Gets the lineItemId value for this LineItemCreativeAssociation.
     * 
     * @return lineItemId   * The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this LineItemCreativeAssociation.
     * 
     * @param lineItemId   * The ID of the {@link LineItem} to which the {@link Creative}
     * should be
     *                 associated. This attribute is required.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the creativeId value for this LineItemCreativeAssociation.
     * 
     * @return creativeId   * The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 <p>
     *                 This attribute is required if this is an association
     * between a line item and a creative.
     *                 <br>
     *                 This attribute is ignored if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 If this is an association between a line item and
     * a creative, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the creative's ID.
     *                 <br>
     *                 If this is an association between a line item and
     * a creative set, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the ID of the
     *                 {@link CreativeSet#masterCreativeId master creative}.
     */
    public java.lang.Long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this LineItemCreativeAssociation.
     * 
     * @param creativeId   * The ID of the {@link Creative} being associated with a {@link
     * LineItem}.
     *                 <p>
     *                 This attribute is required if this is an association
     * between a line item and a creative.
     *                 <br>
     *                 This attribute is ignored if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 If this is an association between a line item and
     * a creative, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the creative's ID.
     *                 <br>
     *                 If this is an association between a line item and
     * a creative set, when retrieving the
     *                 line item creative association, the {@link #creativeId}
     * will be the ID of the
     *                 {@link CreativeSet#masterCreativeId master creative}.
     */
    public void setCreativeId(java.lang.Long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the creativeSetId value for this LineItemCreativeAssociation.
     * 
     * @return creativeSetId   * The ID of the {@link CreativeSet} being associated with a {@link
     * LineItem}.
     *                 This attribute is required if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 This field will be {@code null} when retrieving associations
     * between line items and
     *                 creatives not belonging to a set.
     */
    public java.lang.Long getCreativeSetId() {
        return creativeSetId;
    }


    /**
     * Sets the creativeSetId value for this LineItemCreativeAssociation.
     * 
     * @param creativeSetId   * The ID of the {@link CreativeSet} being associated with a {@link
     * LineItem}.
     *                 This attribute is required if this is an association
     * between a line item and a creative set.
     *                 <p>
     *                 This field will be {@code null} when retrieving associations
     * between line items and
     *                 creatives not belonging to a set.
     */
    public void setCreativeSetId(java.lang.Long creativeSetId) {
        this.creativeSetId = creativeSetId;
    }


    /**
     * Gets the manualCreativeRotationWeight value for this LineItemCreativeAssociation.
     * 
     * @return manualCreativeRotationWeight   * The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10.
     */
    public java.lang.Double getManualCreativeRotationWeight() {
        return manualCreativeRotationWeight;
    }


    /**
     * Sets the manualCreativeRotationWeight value for this LineItemCreativeAssociation.
     * 
     * @param manualCreativeRotationWeight   * The weight of the {@link Creative}. This value is only used
     * if the line
     *                 item's {@code creativeRotationType} is set to
     *                 {@link CreativeRotationType#MANUAL}. This attribute
     * is optional and
     *                 defaults to 10.
     */
    public void setManualCreativeRotationWeight(java.lang.Double manualCreativeRotationWeight) {
        this.manualCreativeRotationWeight = manualCreativeRotationWeight;
    }


    /**
     * Gets the sequentialCreativeRotationIndex value for this LineItemCreativeAssociation.
     * 
     * @return sequentialCreativeRotationIndex   * The sequential rotation index of the {@link Creative}.
     *                 This value is used only if
     *                 the associated line item's {@link LineItem#creativeRotationType}
     * is set to
     *                 {@link CreativeRotationType#SEQUENTIAL}. This attribute
     * is optional and
     *                 defaults to 1.
     */
    public java.lang.Integer getSequentialCreativeRotationIndex() {
        return sequentialCreativeRotationIndex;
    }


    /**
     * Sets the sequentialCreativeRotationIndex value for this LineItemCreativeAssociation.
     * 
     * @param sequentialCreativeRotationIndex   * The sequential rotation index of the {@link Creative}.
     *                 This value is used only if
     *                 the associated line item's {@link LineItem#creativeRotationType}
     * is set to
     *                 {@link CreativeRotationType#SEQUENTIAL}. This attribute
     * is optional and
     *                 defaults to 1.
     */
    public void setSequentialCreativeRotationIndex(java.lang.Integer sequentialCreativeRotationIndex) {
        this.sequentialCreativeRotationIndex = sequentialCreativeRotationIndex;
    }


    /**
     * Gets the startDateTime value for this LineItemCreativeAssociation.
     * 
     * @return startDateTime   * Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemCreativeAssociation.
     * 
     * @param startDateTime   * Overrides the value set for {@link LineItem#startDateTime}.
     * This value is
     *                 optional and is only valid for DFP premium networks.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this LineItemCreativeAssociation.
     * 
     * @return startDateTimeType   * Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.axis.v201802.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this LineItemCreativeAssociation.
     * 
     * @param startDateTimeType   * Specifies whether to start serving to the
     *                 {@code LineItemCreativeAssociation} right away, in
     * an hour, etc. This
     *                 attribute is optional and defaults to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this LineItemCreativeAssociation.
     * 
     * @return endDateTime   * Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemCreativeAssociation.
     * 
     * @param endDateTime   * Overrides {@link LineItem#endDateTime}. This value is optional
     * and is only
     *                 valid for DFP premium networks.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the destinationUrl value for this LineItemCreativeAssociation.
     * 
     * @return destinationUrl   * Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks.
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this LineItemCreativeAssociation.
     * 
     * @param destinationUrl   * Overrides the value set for
     *                 {@link HasDestinationUrlCreative#destinationUrl}.
     * This value is optional
     *                 and is only valid for DFP premium networks.
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the sizes value for this LineItemCreativeAssociation.
     * 
     * @return sizes   * Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.Size[] getSizes() {
        return sizes;
    }


    /**
     * Sets the sizes value for this LineItemCreativeAssociation.
     * 
     * @param sizes   * Overrides the value set for {@link Creative#size}, which allows
     * the
     *                 creative to be served to ad units that would otherwise
     * not be compatible
     *                 for its actual size. This value is optional.
     */
    public void setSizes(com.google.api.ads.dfp.axis.v201802.Size[] sizes) {
        this.sizes = sizes;
    }

    public com.google.api.ads.dfp.axis.v201802.Size getSizes(int i) {
        return this.sizes[i];
    }

    public void setSizes(int i, com.google.api.ads.dfp.axis.v201802.Size _value) {
        this.sizes[i] = _value;
    }


    /**
     * Gets the status value for this LineItemCreativeAssociation.
     * 
     * @return status   * The status of the association. This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemCreativeAssociation.
     * 
     * @param status   * The status of the association. This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStatus status) {
        this.status = status;
    }


    /**
     * Gets the stats value for this LineItemCreativeAssociation.
     * 
     * @return stats   * Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemCreativeAssociation.
     * 
     * @param stats   * Contains trafficking statistics for the association. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for the association yet.
     */
    public void setStats(com.google.api.ads.dfp.axis.v201802.LineItemCreativeAssociationStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the lastModifiedDateTime value for this LineItemCreativeAssociation.
     * 
     * @return lastModifiedDateTime   * The date and time this association was last modified.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this LineItemCreativeAssociation.
     * 
     * @param lastModifiedDateTime   * The date and time this association was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the targetingName value for this LineItemCreativeAssociation.
     * 
     * @return targetingName   * Specifies {@link CreativeTargeting} for this line item creative
     * association.
     *                 
     *                 <p>This attribute is optional. It should match the
     * creative targeting specified on the
     *                 corresponding {@link CreativePlaceholder} in the {@link
     * LineItem} that is being associated
     *                 with the {@link Creative}.
     */
    public java.lang.String getTargetingName() {
        return targetingName;
    }


    /**
     * Sets the targetingName value for this LineItemCreativeAssociation.
     * 
     * @param targetingName   * Specifies {@link CreativeTargeting} for this line item creative
     * association.
     *                 
     *                 <p>This attribute is optional. It should match the
     * creative targeting specified on the
     *                 corresponding {@link CreativePlaceholder} in the {@link
     * LineItem} that is being associated
     *                 with the {@link Creative}.
     */
    public void setTargetingName(java.lang.String targetingName) {
        this.targetingName = targetingName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemCreativeAssociation)) return false;
        LineItemCreativeAssociation other = (LineItemCreativeAssociation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.creativeId==null && other.getCreativeId()==null) || 
             (this.creativeId!=null &&
              this.creativeId.equals(other.getCreativeId()))) &&
            ((this.creativeSetId==null && other.getCreativeSetId()==null) || 
             (this.creativeSetId!=null &&
              this.creativeSetId.equals(other.getCreativeSetId()))) &&
            ((this.manualCreativeRotationWeight==null && other.getManualCreativeRotationWeight()==null) || 
             (this.manualCreativeRotationWeight!=null &&
              this.manualCreativeRotationWeight.equals(other.getManualCreativeRotationWeight()))) &&
            ((this.sequentialCreativeRotationIndex==null && other.getSequentialCreativeRotationIndex()==null) || 
             (this.sequentialCreativeRotationIndex!=null &&
              this.sequentialCreativeRotationIndex.equals(other.getSequentialCreativeRotationIndex()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startDateTimeType==null && other.getStartDateTimeType()==null) || 
             (this.startDateTimeType!=null &&
              this.startDateTimeType.equals(other.getStartDateTimeType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl()))) &&
            ((this.sizes==null && other.getSizes()==null) || 
             (this.sizes!=null &&
              java.util.Arrays.equals(this.sizes, other.getSizes()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.targetingName==null && other.getTargetingName()==null) || 
             (this.targetingName!=null &&
              this.targetingName.equals(other.getTargetingName())));
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
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getCreativeId() != null) {
            _hashCode += getCreativeId().hashCode();
        }
        if (getCreativeSetId() != null) {
            _hashCode += getCreativeSetId().hashCode();
        }
        if (getManualCreativeRotationWeight() != null) {
            _hashCode += getManualCreativeRotationWeight().hashCode();
        }
        if (getSequentialCreativeRotationIndex() != null) {
            _hashCode += getSequentialCreativeRotationIndex().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartDateTimeType() != null) {
            _hashCode += getStartDateTimeType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        if (getSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSizes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getTargetingName() != null) {
            _hashCode += getTargetingName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemCreativeAssociation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemCreativeAssociation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreativeRotationWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "manualCreativeRotationWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequentialCreativeRotationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sequentialCreativeRotationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "destinationUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemCreativeAssociation.Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemCreativeAssociationStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetingName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetingName"));
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
