// Copyright 2024 Google LLC
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
 * AdBreak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;


/**
 * Contains debugging information for a single ad break in a stream.
 */
public class AdBreak  implements java.io.Serializable {
    /* The root ad responses to the {@code adRequest}. If this is
     * a staged request, there may be two
     *                 root ad responses - one for the prefetch stage and
     * another if there is a follow up request at
     *                 the ad break.
     *                 
     *                 <p>A VAST redirect response triggers another ad request
     * (that is not recorded), and thus a
     *                 response for that request, which is why there can
     * be multiple ad responses nested within an ad
     *                 response.
     *                 
     *                 <p>For more information, see https://support.google.com/admanager/answer/7009058 */
    private com.google.api.ads.admanager.axis.v202411.AdResponse[] rootAdResponses;

    /* Contains information about the creatives that were served in
     * the ad break, such as the ad
     *                 system that served them and whether they were transcoded
     * by Truman already. */
    private com.google.api.ads.admanager.axis.v202411.AdDecisionCreative[] adDecisionCreatives;

    /* 1-based index of this pod within the whole stream. */
    private java.lang.Integer podNum;

    /* Pod number of the ad break, for "ad break specific" records
     * like AdRequest, AdResponse,
     *                 AdDecision, etc. This field is only used for Linear
     * streams. */
    private java.lang.Integer linearAbsolutePodNum;

    /* The duration in milliseconds of the entire ad break, from when
     * content stops playing until it
     *                 resumes. */
    private java.lang.Long adBreakDurationMillis;

    /* The sum of the durations in milliseconds of the ads within
     * this ad break.
     *                 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned in an ad response the
     *                 filled time would be 50000 milliseconds. */
    private java.lang.Long filledDurationMillis;

    /* The amount of ad time in milliseconds a user actually sees.
     * 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned but one of these ads wasn't
     *                 transcoded so a slate was used, the served time would
     * be 25 seconds. */
    private java.lang.Long servedDurationMillis;

    /* The date and time this ad break started (the time the ad request
     * was made). */
    private com.google.api.ads.admanager.axis.v202411.DateTime startDateTime;

    /* The offset of the ad break within the content in milliseconds.
     * Used for VOD sessions only. */
    private java.lang.Long startTimeOffsetMillis;

    /* Any error that occurred while attempting to stitch the ad break
     * into the stream. */
    private com.google.api.ads.admanager.axis.v202411.SamError samError;

    /* For break type MIDROLL, the 1-based index of the mid-roll position.
     * Only applies to VOD VMAP ad
     *                 breaks. */
    private java.lang.Integer midrollIndex;

    /* Whether ads were decisioned for this ad break. */
    private java.lang.Boolean decisionedAds;

    /* The list of tracking events associated with this ad break. */
    private com.google.api.ads.admanager.axis.v202411.TrackingEvent[] trackingEvents;

    public AdBreak() {
    }

    public AdBreak(
           com.google.api.ads.admanager.axis.v202411.AdResponse[] rootAdResponses,
           com.google.api.ads.admanager.axis.v202411.AdDecisionCreative[] adDecisionCreatives,
           java.lang.Integer podNum,
           java.lang.Integer linearAbsolutePodNum,
           java.lang.Long adBreakDurationMillis,
           java.lang.Long filledDurationMillis,
           java.lang.Long servedDurationMillis,
           com.google.api.ads.admanager.axis.v202411.DateTime startDateTime,
           java.lang.Long startTimeOffsetMillis,
           com.google.api.ads.admanager.axis.v202411.SamError samError,
           java.lang.Integer midrollIndex,
           java.lang.Boolean decisionedAds,
           com.google.api.ads.admanager.axis.v202411.TrackingEvent[] trackingEvents) {
           this.rootAdResponses = rootAdResponses;
           this.adDecisionCreatives = adDecisionCreatives;
           this.podNum = podNum;
           this.linearAbsolutePodNum = linearAbsolutePodNum;
           this.adBreakDurationMillis = adBreakDurationMillis;
           this.filledDurationMillis = filledDurationMillis;
           this.servedDurationMillis = servedDurationMillis;
           this.startDateTime = startDateTime;
           this.startTimeOffsetMillis = startTimeOffsetMillis;
           this.samError = samError;
           this.midrollIndex = midrollIndex;
           this.decisionedAds = decisionedAds;
           this.trackingEvents = trackingEvents;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBreakDurationMillis", getAdBreakDurationMillis())
            .add("adDecisionCreatives", getAdDecisionCreatives())
            .add("decisionedAds", getDecisionedAds())
            .add("filledDurationMillis", getFilledDurationMillis())
            .add("linearAbsolutePodNum", getLinearAbsolutePodNum())
            .add("midrollIndex", getMidrollIndex())
            .add("podNum", getPodNum())
            .add("rootAdResponses", getRootAdResponses())
            .add("samError", getSamError())
            .add("servedDurationMillis", getServedDurationMillis())
            .add("startDateTime", getStartDateTime())
            .add("startTimeOffsetMillis", getStartTimeOffsetMillis())
            .add("trackingEvents", getTrackingEvents())
            .toString();
    }

    /**
     * Gets the rootAdResponses value for this AdBreak.
     * 
     * @return rootAdResponses   * The root ad responses to the {@code adRequest}. If this is
     * a staged request, there may be two
     *                 root ad responses - one for the prefetch stage and
     * another if there is a follow up request at
     *                 the ad break.
     *                 
     *                 <p>A VAST redirect response triggers another ad request
     * (that is not recorded), and thus a
     *                 response for that request, which is why there can
     * be multiple ad responses nested within an ad
     *                 response.
     *                 
     *                 <p>For more information, see https://support.google.com/admanager/answer/7009058
     */
    public com.google.api.ads.admanager.axis.v202411.AdResponse[] getRootAdResponses() {
        return rootAdResponses;
    }


    /**
     * Sets the rootAdResponses value for this AdBreak.
     * 
     * @param rootAdResponses   * The root ad responses to the {@code adRequest}. If this is
     * a staged request, there may be two
     *                 root ad responses - one for the prefetch stage and
     * another if there is a follow up request at
     *                 the ad break.
     *                 
     *                 <p>A VAST redirect response triggers another ad request
     * (that is not recorded), and thus a
     *                 response for that request, which is why there can
     * be multiple ad responses nested within an ad
     *                 response.
     *                 
     *                 <p>For more information, see https://support.google.com/admanager/answer/7009058
     */
    public void setRootAdResponses(com.google.api.ads.admanager.axis.v202411.AdResponse[] rootAdResponses) {
        this.rootAdResponses = rootAdResponses;
    }

    public com.google.api.ads.admanager.axis.v202411.AdResponse getRootAdResponses(int i) {
        return this.rootAdResponses[i];
    }

    public void setRootAdResponses(int i, com.google.api.ads.admanager.axis.v202411.AdResponse _value) {
        this.rootAdResponses[i] = _value;
    }


    /**
     * Gets the adDecisionCreatives value for this AdBreak.
     * 
     * @return adDecisionCreatives   * Contains information about the creatives that were served in
     * the ad break, such as the ad
     *                 system that served them and whether they were transcoded
     * by Truman already.
     */
    public com.google.api.ads.admanager.axis.v202411.AdDecisionCreative[] getAdDecisionCreatives() {
        return adDecisionCreatives;
    }


    /**
     * Sets the adDecisionCreatives value for this AdBreak.
     * 
     * @param adDecisionCreatives   * Contains information about the creatives that were served in
     * the ad break, such as the ad
     *                 system that served them and whether they were transcoded
     * by Truman already.
     */
    public void setAdDecisionCreatives(com.google.api.ads.admanager.axis.v202411.AdDecisionCreative[] adDecisionCreatives) {
        this.adDecisionCreatives = adDecisionCreatives;
    }

    public com.google.api.ads.admanager.axis.v202411.AdDecisionCreative getAdDecisionCreatives(int i) {
        return this.adDecisionCreatives[i];
    }

    public void setAdDecisionCreatives(int i, com.google.api.ads.admanager.axis.v202411.AdDecisionCreative _value) {
        this.adDecisionCreatives[i] = _value;
    }


    /**
     * Gets the podNum value for this AdBreak.
     * 
     * @return podNum   * 1-based index of this pod within the whole stream.
     */
    public java.lang.Integer getPodNum() {
        return podNum;
    }


    /**
     * Sets the podNum value for this AdBreak.
     * 
     * @param podNum   * 1-based index of this pod within the whole stream.
     */
    public void setPodNum(java.lang.Integer podNum) {
        this.podNum = podNum;
    }


    /**
     * Gets the linearAbsolutePodNum value for this AdBreak.
     * 
     * @return linearAbsolutePodNum   * Pod number of the ad break, for "ad break specific" records
     * like AdRequest, AdResponse,
     *                 AdDecision, etc. This field is only used for Linear
     * streams.
     */
    public java.lang.Integer getLinearAbsolutePodNum() {
        return linearAbsolutePodNum;
    }


    /**
     * Sets the linearAbsolutePodNum value for this AdBreak.
     * 
     * @param linearAbsolutePodNum   * Pod number of the ad break, for "ad break specific" records
     * like AdRequest, AdResponse,
     *                 AdDecision, etc. This field is only used for Linear
     * streams.
     */
    public void setLinearAbsolutePodNum(java.lang.Integer linearAbsolutePodNum) {
        this.linearAbsolutePodNum = linearAbsolutePodNum;
    }


    /**
     * Gets the adBreakDurationMillis value for this AdBreak.
     * 
     * @return adBreakDurationMillis   * The duration in milliseconds of the entire ad break, from when
     * content stops playing until it
     *                 resumes.
     */
    public java.lang.Long getAdBreakDurationMillis() {
        return adBreakDurationMillis;
    }


    /**
     * Sets the adBreakDurationMillis value for this AdBreak.
     * 
     * @param adBreakDurationMillis   * The duration in milliseconds of the entire ad break, from when
     * content stops playing until it
     *                 resumes.
     */
    public void setAdBreakDurationMillis(java.lang.Long adBreakDurationMillis) {
        this.adBreakDurationMillis = adBreakDurationMillis;
    }


    /**
     * Gets the filledDurationMillis value for this AdBreak.
     * 
     * @return filledDurationMillis   * The sum of the durations in milliseconds of the ads within
     * this ad break.
     *                 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned in an ad response the
     *                 filled time would be 50000 milliseconds.
     */
    public java.lang.Long getFilledDurationMillis() {
        return filledDurationMillis;
    }


    /**
     * Sets the filledDurationMillis value for this AdBreak.
     * 
     * @param filledDurationMillis   * The sum of the durations in milliseconds of the ads within
     * this ad break.
     *                 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned in an ad response the
     *                 filled time would be 50000 milliseconds.
     */
    public void setFilledDurationMillis(java.lang.Long filledDurationMillis) {
        this.filledDurationMillis = filledDurationMillis;
    }


    /**
     * Gets the servedDurationMillis value for this AdBreak.
     * 
     * @return servedDurationMillis   * The amount of ad time in milliseconds a user actually sees.
     * 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned but one of these ads wasn't
     *                 transcoded so a slate was used, the served time would
     * be 25 seconds.
     */
    public java.lang.Long getServedDurationMillis() {
        return servedDurationMillis;
    }


    /**
     * Sets the servedDurationMillis value for this AdBreak.
     * 
     * @param servedDurationMillis   * The amount of ad time in milliseconds a user actually sees.
     * 
     *                 <p>If the ad break is 60 seconds and two 25 second
     * ads are returned but one of these ads wasn't
     *                 transcoded so a slate was used, the served time would
     * be 25 seconds.
     */
    public void setServedDurationMillis(java.lang.Long servedDurationMillis) {
        this.servedDurationMillis = servedDurationMillis;
    }


    /**
     * Gets the startDateTime value for this AdBreak.
     * 
     * @return startDateTime   * The date and time this ad break started (the time the ad request
     * was made).
     */
    public com.google.api.ads.admanager.axis.v202411.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this AdBreak.
     * 
     * @param startDateTime   * The date and time this ad break started (the time the ad request
     * was made).
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202411.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startTimeOffsetMillis value for this AdBreak.
     * 
     * @return startTimeOffsetMillis   * The offset of the ad break within the content in milliseconds.
     * Used for VOD sessions only.
     */
    public java.lang.Long getStartTimeOffsetMillis() {
        return startTimeOffsetMillis;
    }


    /**
     * Sets the startTimeOffsetMillis value for this AdBreak.
     * 
     * @param startTimeOffsetMillis   * The offset of the ad break within the content in milliseconds.
     * Used for VOD sessions only.
     */
    public void setStartTimeOffsetMillis(java.lang.Long startTimeOffsetMillis) {
        this.startTimeOffsetMillis = startTimeOffsetMillis;
    }


    /**
     * Gets the samError value for this AdBreak.
     * 
     * @return samError   * Any error that occurred while attempting to stitch the ad break
     * into the stream.
     */
    public com.google.api.ads.admanager.axis.v202411.SamError getSamError() {
        return samError;
    }


    /**
     * Sets the samError value for this AdBreak.
     * 
     * @param samError   * Any error that occurred while attempting to stitch the ad break
     * into the stream.
     */
    public void setSamError(com.google.api.ads.admanager.axis.v202411.SamError samError) {
        this.samError = samError;
    }


    /**
     * Gets the midrollIndex value for this AdBreak.
     * 
     * @return midrollIndex   * For break type MIDROLL, the 1-based index of the mid-roll position.
     * Only applies to VOD VMAP ad
     *                 breaks.
     */
    public java.lang.Integer getMidrollIndex() {
        return midrollIndex;
    }


    /**
     * Sets the midrollIndex value for this AdBreak.
     * 
     * @param midrollIndex   * For break type MIDROLL, the 1-based index of the mid-roll position.
     * Only applies to VOD VMAP ad
     *                 breaks.
     */
    public void setMidrollIndex(java.lang.Integer midrollIndex) {
        this.midrollIndex = midrollIndex;
    }


    /**
     * Gets the decisionedAds value for this AdBreak.
     * 
     * @return decisionedAds   * Whether ads were decisioned for this ad break.
     */
    public java.lang.Boolean getDecisionedAds() {
        return decisionedAds;
    }


    /**
     * Sets the decisionedAds value for this AdBreak.
     * 
     * @param decisionedAds   * Whether ads were decisioned for this ad break.
     */
    public void setDecisionedAds(java.lang.Boolean decisionedAds) {
        this.decisionedAds = decisionedAds;
    }


    /**
     * Gets the trackingEvents value for this AdBreak.
     * 
     * @return trackingEvents   * The list of tracking events associated with this ad break.
     */
    public com.google.api.ads.admanager.axis.v202411.TrackingEvent[] getTrackingEvents() {
        return trackingEvents;
    }


    /**
     * Sets the trackingEvents value for this AdBreak.
     * 
     * @param trackingEvents   * The list of tracking events associated with this ad break.
     */
    public void setTrackingEvents(com.google.api.ads.admanager.axis.v202411.TrackingEvent[] trackingEvents) {
        this.trackingEvents = trackingEvents;
    }

    public com.google.api.ads.admanager.axis.v202411.TrackingEvent getTrackingEvents(int i) {
        return this.trackingEvents[i];
    }

    public void setTrackingEvents(int i, com.google.api.ads.admanager.axis.v202411.TrackingEvent _value) {
        this.trackingEvents[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdBreak)) return false;
        AdBreak other = (AdBreak) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rootAdResponses==null && other.getRootAdResponses()==null) || 
             (this.rootAdResponses!=null &&
              java.util.Arrays.equals(this.rootAdResponses, other.getRootAdResponses()))) &&
            ((this.adDecisionCreatives==null && other.getAdDecisionCreatives()==null) || 
             (this.adDecisionCreatives!=null &&
              java.util.Arrays.equals(this.adDecisionCreatives, other.getAdDecisionCreatives()))) &&
            ((this.podNum==null && other.getPodNum()==null) || 
             (this.podNum!=null &&
              this.podNum.equals(other.getPodNum()))) &&
            ((this.linearAbsolutePodNum==null && other.getLinearAbsolutePodNum()==null) || 
             (this.linearAbsolutePodNum!=null &&
              this.linearAbsolutePodNum.equals(other.getLinearAbsolutePodNum()))) &&
            ((this.adBreakDurationMillis==null && other.getAdBreakDurationMillis()==null) || 
             (this.adBreakDurationMillis!=null &&
              this.adBreakDurationMillis.equals(other.getAdBreakDurationMillis()))) &&
            ((this.filledDurationMillis==null && other.getFilledDurationMillis()==null) || 
             (this.filledDurationMillis!=null &&
              this.filledDurationMillis.equals(other.getFilledDurationMillis()))) &&
            ((this.servedDurationMillis==null && other.getServedDurationMillis()==null) || 
             (this.servedDurationMillis!=null &&
              this.servedDurationMillis.equals(other.getServedDurationMillis()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startTimeOffsetMillis==null && other.getStartTimeOffsetMillis()==null) || 
             (this.startTimeOffsetMillis!=null &&
              this.startTimeOffsetMillis.equals(other.getStartTimeOffsetMillis()))) &&
            ((this.samError==null && other.getSamError()==null) || 
             (this.samError!=null &&
              this.samError.equals(other.getSamError()))) &&
            ((this.midrollIndex==null && other.getMidrollIndex()==null) || 
             (this.midrollIndex!=null &&
              this.midrollIndex.equals(other.getMidrollIndex()))) &&
            ((this.decisionedAds==null && other.getDecisionedAds()==null) || 
             (this.decisionedAds!=null &&
              this.decisionedAds.equals(other.getDecisionedAds()))) &&
            ((this.trackingEvents==null && other.getTrackingEvents()==null) || 
             (this.trackingEvents!=null &&
              java.util.Arrays.equals(this.trackingEvents, other.getTrackingEvents())));
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
        if (getRootAdResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRootAdResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRootAdResponses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdDecisionCreatives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdDecisionCreatives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdDecisionCreatives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPodNum() != null) {
            _hashCode += getPodNum().hashCode();
        }
        if (getLinearAbsolutePodNum() != null) {
            _hashCode += getLinearAbsolutePodNum().hashCode();
        }
        if (getAdBreakDurationMillis() != null) {
            _hashCode += getAdBreakDurationMillis().hashCode();
        }
        if (getFilledDurationMillis() != null) {
            _hashCode += getFilledDurationMillis().hashCode();
        }
        if (getServedDurationMillis() != null) {
            _hashCode += getServedDurationMillis().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartTimeOffsetMillis() != null) {
            _hashCode += getStartTimeOffsetMillis().hashCode();
        }
        if (getSamError() != null) {
            _hashCode += getSamError().hashCode();
        }
        if (getMidrollIndex() != null) {
            _hashCode += getMidrollIndex().hashCode();
        }
        if (getDecisionedAds() != null) {
            _hashCode += getDecisionedAds().hashCode();
        }
        if (getTrackingEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingEvents(), i);
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
        new org.apache.axis.description.TypeDesc(AdBreak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AdBreak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootAdResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "rootAdResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AdResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adDecisionCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "adDecisionCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AdDecisionCreative"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("podNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "podNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linearAbsolutePodNum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "linearAbsolutePodNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adBreakDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "adBreakDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filledDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "filledDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servedDurationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "servedDurationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTimeOffsetMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "startTimeOffsetMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "samError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "SamError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midrollIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "midrollIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionedAds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "decisionedAds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "trackingEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "TrackingEvent"));
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
