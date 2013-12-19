/**
 * CampaignSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CampaignSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfa.axis.v1_19.CampaignRemote {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLandingPagesForCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nCampaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPageRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLandingPagesForCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addLandingPageToCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nCampaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "landingPages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfLandingPage"), com.google.api.ads.dfa.axis.v1_19.LandingPage[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addLandingPageToCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignsByCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignSearchCriteria"), com.google.api.ads.dfa.axis.v1_19.CampaignSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCampaignsByCriteriaReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("migrateCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignMigrationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignMigrationRequest"), com.google.api.ads.dfa.axis.v1_19.CampaignMigrationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignMigrationResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "migrateCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignCopyRequests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCampaignCopyRequest"), com.google.api.ads.dfa.axis.v1_19.CampaignCopyRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCampaignCopyResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "copyCampaignsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Campaign"), com.google.api.ads.dfa.axis.v1_19.Campaign.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Campaign"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.Campaign.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveLandingPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "landingPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPage"), com.google.api.ads.dfa.axis.v1_19.LandingPage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPageSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveLandingPageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "fault"),
                      "com.google.api.ads.dfa.axis.v1_19.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException"), 
                      true
                     ));
        _operations[8] = oper;

    }

    public CampaignSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CampaignSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CampaignSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ActiveFilter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ActiveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfAudienceSegment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AudienceSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfAudienceSegmentGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegmentGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCampaign");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Campaign[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Campaign");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCampaignCopyRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignCopyRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignCopyRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfCampaignCopyResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignCopyResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfLandingPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LandingPage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ArrayOfSpotlightActivityWeight");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SpotlightActivityWeight[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SpotlightActivityWeight");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AudienceSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AudienceSegmentGroup");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.AudienceSegmentGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Base");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignCopyRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignCopyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignCopyResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignMigrationRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignMigrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignMigrationResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CampaignSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CampaignSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeOptimizationConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.CreativeOptimizationConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPage");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LandingPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPageBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LandingPageBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPageRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LandingPageSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "LookbackWindow");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.LookbackWindow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PageableSearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PageableSearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "PagedRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.PagedRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ReachReportConfiguration");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.ReachReportConfiguration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SortOrder");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "SpotlightActivityWeight");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_19.SpotlightActivityWeight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void deleteCampaign(long campaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "deleteCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(campaignId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet getLandingPagesForCampaign(long nCampaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getLandingPagesForCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(nCampaignId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.LandingPageRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addLandingPageToCampaign(long nCampaignId, com.google.api.ads.dfa.axis.v1_19.LandingPage[] landingPages) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "addLandingPageToCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(nCampaignId), landingPages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet getCampaignsByCriteria(com.google.api.ads.dfa.axis.v1_19.CampaignSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCampaignsByCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CampaignRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult migrateCampaign(com.google.api.ads.dfa.axis.v1_19.CampaignMigrationRequest campaignMigrationRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "migrateCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {campaignMigrationRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CampaignMigrationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[] copyCampaigns(com.google.api.ads.dfa.axis.v1_19.CampaignCopyRequest[] campaignCopyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "copyCampaigns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {campaignCopyRequests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CampaignCopyResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult saveCampaign(com.google.api.ads.dfa.axis.v1_19.Campaign campaign) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "saveCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {campaign});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.CampaignSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.Campaign getCampaign(long id) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "getCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.Campaign) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.Campaign) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.Campaign.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult saveLandingPage(com.google.api.ads.dfa.axis.v1_19.LandingPage landingPage) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_19.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "saveLandingPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {landingPage});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_19.LandingPageSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_19.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_19.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
