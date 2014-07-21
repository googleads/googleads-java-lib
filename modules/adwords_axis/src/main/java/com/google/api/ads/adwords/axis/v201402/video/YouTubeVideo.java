/**
 * YouTubeVideo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.video;


/**
 * Represents a video asset.
 */
public class YouTubeVideo  implements java.io.Serializable {
    /* Id of this video. This is the YouTube video id.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private java.lang.String id;

    /* Title of this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String title;

    /* Description for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String description;

    /* Date the video was uploaded.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String dateUploaded;

    /* Duration of this video in seconds.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.Long durationSec;

    /* Display name of the channel this video belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String userPublicName;

    /* Channel Id for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String userId;

    /* Full view count of this video, including paid and organic views.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private java.lang.Long viewCount;

    /* List of video campaigns (ie. campaign ids and names) referencing
     * this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo[] campaignInfos;

    /* Call-to-action overlay data for this video.
     *                 This is the only mutable field for this object and
     * it should be updated using the
     *                 VideoService.mutateCallToAction method.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.CallToAction callToAction;

    /* Statistics for this video, if requested.
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See StatsSelector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats;

    /* Statistics about this video, segmented by the dimensions indicated
     * in the
     *                 StatsSelector, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats;

    /* Access level to this video in the context of the current request.
     * 
     *                 This field will not be set if stats are not requested.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201402.video.YouTubeVideoAccessLevel accessLevel;

    public YouTubeVideo() {
    }

    public YouTubeVideo(
           java.lang.String id,
           java.lang.String title,
           java.lang.String description,
           java.lang.String dateUploaded,
           java.lang.Long durationSec,
           java.lang.String userPublicName,
           java.lang.String userId,
           java.lang.Long viewCount,
           com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo[] campaignInfos,
           com.google.api.ads.adwords.axis.v201402.video.CallToAction callToAction,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats,
           com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats,
           com.google.api.ads.adwords.axis.v201402.video.YouTubeVideoAccessLevel accessLevel) {
           this.id = id;
           this.title = title;
           this.description = description;
           this.dateUploaded = dateUploaded;
           this.durationSec = durationSec;
           this.userPublicName = userPublicName;
           this.userId = userId;
           this.viewCount = viewCount;
           this.campaignInfos = campaignInfos;
           this.callToAction = callToAction;
           this.stats = stats;
           this.segmentedStats = segmentedStats;
           this.accessLevel = accessLevel;
    }


    /**
     * Gets the id value for this YouTubeVideo.
     * 
     * @return id   * Id of this video. This is the YouTube video id.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this YouTubeVideo.
     * 
     * @param id   * Id of this video. This is the YouTube video id.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the title value for this YouTubeVideo.
     * 
     * @return title   * Title of this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this YouTubeVideo.
     * 
     * @param title   * Title of this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this YouTubeVideo.
     * 
     * @return description   * Description for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this YouTubeVideo.
     * 
     * @param description   * Description for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dateUploaded value for this YouTubeVideo.
     * 
     * @return dateUploaded   * Date the video was uploaded.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getDateUploaded() {
        return dateUploaded;
    }


    /**
     * Sets the dateUploaded value for this YouTubeVideo.
     * 
     * @param dateUploaded   * Date the video was uploaded.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDateUploaded(java.lang.String dateUploaded) {
        this.dateUploaded = dateUploaded;
    }


    /**
     * Gets the durationSec value for this YouTubeVideo.
     * 
     * @return durationSec   * Duration of this video in seconds.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.Long getDurationSec() {
        return durationSec;
    }


    /**
     * Sets the durationSec value for this YouTubeVideo.
     * 
     * @param durationSec   * Duration of this video in seconds.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setDurationSec(java.lang.Long durationSec) {
        this.durationSec = durationSec;
    }


    /**
     * Gets the userPublicName value for this YouTubeVideo.
     * 
     * @return userPublicName   * Display name of the channel this video belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getUserPublicName() {
        return userPublicName;
    }


    /**
     * Sets the userPublicName value for this YouTubeVideo.
     * 
     * @param userPublicName   * Display name of the channel this video belongs to.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setUserPublicName(java.lang.String userPublicName) {
        this.userPublicName = userPublicName;
    }


    /**
     * Gets the userId value for this YouTubeVideo.
     * 
     * @return userId   * Channel Id for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this YouTubeVideo.
     * 
     * @param userId   * Channel Id for this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the viewCount value for this YouTubeVideo.
     * 
     * @return viewCount   * Full view count of this video, including paid and organic views.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public java.lang.Long getViewCount() {
        return viewCount;
    }


    /**
     * Sets the viewCount value for this YouTubeVideo.
     * 
     * @param viewCount   * Full view count of this video, including paid and organic views.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setViewCount(java.lang.Long viewCount) {
        this.viewCount = viewCount;
    }


    /**
     * Gets the campaignInfos value for this YouTubeVideo.
     * 
     * @return campaignInfos   * List of video campaigns (ie. campaign ids and names) referencing
     * this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo[] getCampaignInfos() {
        return campaignInfos;
    }


    /**
     * Sets the campaignInfos value for this YouTubeVideo.
     * 
     * @param campaignInfos   * List of video campaigns (ie. campaign ids and names) referencing
     * this video.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setCampaignInfos(com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo[] campaignInfos) {
        this.campaignInfos = campaignInfos;
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo getCampaignInfos(int i) {
        return this.campaignInfos[i];
    }

    public void setCampaignInfos(int i, com.google.api.ads.adwords.axis.v201402.video.VideoCampaignInfo _value) {
        this.campaignInfos[i] = _value;
    }


    /**
     * Gets the callToAction value for this YouTubeVideo.
     * 
     * @return callToAction   * Call-to-action overlay data for this video.
     *                 This is the only mutable field for this object and
     * it should be updated using the
     *                 VideoService.mutateCallToAction method.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.CallToAction getCallToAction() {
        return callToAction;
    }


    /**
     * Sets the callToAction value for this YouTubeVideo.
     * 
     * @param callToAction   * Call-to-action overlay data for this video.
     *                 This is the only mutable field for this object and
     * it should be updated using the
     *                 VideoService.mutateCallToAction method.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET.</span>
     */
    public void setCallToAction(com.google.api.ads.adwords.axis.v201402.video.CallToAction callToAction) {
        this.callToAction = callToAction;
    }


    /**
     * Gets the stats value for this YouTubeVideo.
     * 
     * @return stats   * Statistics for this video, if requested.
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See StatsSelector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this YouTubeVideo.
     * 
     * @param stats   * Statistics for this video, if requested.
     *                 Always returned if statsSelector is specified, regardless
     * of segmentation.
     *                 See StatsSelector.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats stats) {
        this.stats = stats;
    }


    /**
     * Gets the segmentedStats value for this YouTubeVideo.
     * 
     * @return segmentedStats   * Statistics about this video, segmented by the dimensions indicated
     * in the
     *                 StatsSelector, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] getSegmentedStats() {
        return segmentedStats;
    }


    /**
     * Sets the segmentedStats value for this YouTubeVideo.
     * 
     * @param segmentedStats   * Statistics about this video, segmented by the dimensions indicated
     * in the
     *                 StatsSelector, if any.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setSegmentedStats(com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats[] segmentedStats) {
        this.segmentedStats = segmentedStats;
    }

    public com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats getSegmentedStats(int i) {
        return this.segmentedStats[i];
    }

    public void setSegmentedStats(int i, com.google.api.ads.adwords.axis.v201402.video.VideoEntityStats _value) {
        this.segmentedStats[i] = _value;
    }


    /**
     * Gets the accessLevel value for this YouTubeVideo.
     * 
     * @return accessLevel   * Access level to this video in the context of the current request.
     * 
     *                 This field will not be set if stats are not requested.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.video.YouTubeVideoAccessLevel getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this YouTubeVideo.
     * 
     * @param accessLevel   * Access level to this video in the context of the current request.
     * 
     *                 This field will not be set if stats are not requested.
     * <span class="constraint ReadOnly">This field is read only and will
     * be ignored when sent to the API.</span>
     */
    public void setAccessLevel(com.google.api.ads.adwords.axis.v201402.video.YouTubeVideoAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YouTubeVideo)) return false;
        YouTubeVideo other = (YouTubeVideo) obj;
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dateUploaded==null && other.getDateUploaded()==null) || 
             (this.dateUploaded!=null &&
              this.dateUploaded.equals(other.getDateUploaded()))) &&
            ((this.durationSec==null && other.getDurationSec()==null) || 
             (this.durationSec!=null &&
              this.durationSec.equals(other.getDurationSec()))) &&
            ((this.userPublicName==null && other.getUserPublicName()==null) || 
             (this.userPublicName!=null &&
              this.userPublicName.equals(other.getUserPublicName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.viewCount==null && other.getViewCount()==null) || 
             (this.viewCount!=null &&
              this.viewCount.equals(other.getViewCount()))) &&
            ((this.campaignInfos==null && other.getCampaignInfos()==null) || 
             (this.campaignInfos!=null &&
              java.util.Arrays.equals(this.campaignInfos, other.getCampaignInfos()))) &&
            ((this.callToAction==null && other.getCallToAction()==null) || 
             (this.callToAction!=null &&
              this.callToAction.equals(other.getCallToAction()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.segmentedStats==null && other.getSegmentedStats()==null) || 
             (this.segmentedStats!=null &&
              java.util.Arrays.equals(this.segmentedStats, other.getSegmentedStats()))) &&
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              this.accessLevel.equals(other.getAccessLevel())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDateUploaded() != null) {
            _hashCode += getDateUploaded().hashCode();
        }
        if (getDurationSec() != null) {
            _hashCode += getDurationSec().hashCode();
        }
        if (getUserPublicName() != null) {
            _hashCode += getUserPublicName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getViewCount() != null) {
            _hashCode += getViewCount().hashCode();
        }
        if (getCampaignInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCampaignInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCampaignInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallToAction() != null) {
            _hashCode += getCallToAction().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getSegmentedStats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentedStats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentedStats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessLevel() != null) {
            _hashCode += getAccessLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YouTubeVideo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "YouTubeVideo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateUploaded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "dateUploaded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationSec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "durationSec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPublicName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "userPublicName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "viewCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "campaignInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoCampaignInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callToAction");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "callToAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "CallToAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentedStats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "segmentedStats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "VideoEntityStats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201402", "YouTubeVideo.AccessLevel"));
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
