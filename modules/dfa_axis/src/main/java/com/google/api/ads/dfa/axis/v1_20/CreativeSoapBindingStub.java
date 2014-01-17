/**
 * CreativeSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeSoapBindingStub extends org.apache.axis.client.Stub implements com.google.api.ads.dfa.axis.v1_20.CreativeRemote {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[25];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreativeAssets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSearchCriteria"), com.google.api.ads.dfa.axis.v1_20.CreativeAssetSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeAssetsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreatives");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSearchCriteria"), com.google.api.ads.dfa.axis.v1_20.CreativeSearchCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRecordSet"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveCreative");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeBase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeBase"), com.google.api.ads.dfa.axis.v1_20.CreativeBase.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveCreativeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreativeRenderings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRenderingRequest"), com.google.api.ads.dfa.axis.v1_20.CreativeRenderingRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeRenderingResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeRenderingsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("saveCreativeAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeAsset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAsset"), com.google.api.ads.dfa.axis.v1_20.CreativeAsset.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSaveResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "saveCreativeAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("associateCreativesToCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOf_xsd_long"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCampaignAssociationResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "associateCreativesToCampaignReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyCreative");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "copyRequests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCopyRequest"), com.google.api.ads.dfa.axis.v1_20.CreativeCopyRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCopyResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "copyCreativeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadRichMediaAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAssetUploadRequest"), com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "uploadRichMediaAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("replaceRichMediaAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oldAssetFileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replaceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAssetUploadRequest"), com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "replaceRichMediaAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRichMediaAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetFileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteRichMediaAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadRichMediaCreativePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "advertiserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadAsFlashInFlashCreative"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "uploadRichMediaCreativePackageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("replaceRichMediaCreativePackage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fileData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "replaceRichMediaCreativePackageReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRichMediaPreviewURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRichMediaPreviewURLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadInStreamAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetUploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamAssetUploadRequest"), com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamVideoCreative"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "uploadInStreamAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteInStreamAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamVideoCreative"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteInStreamAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("replaceInStreamAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "assetReplaceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamAssetUploadRequest"), com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamVideoCreative"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "replaceInStreamAssetReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRichMediaStandardEvents");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaStandardEvent"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRichMediaStandardEventsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("generateCreativeUploadSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeUploadSessionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSessionRequest"), com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generateCreativeUploadSessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadCreativeFiles");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadRequest"), com.google.api.ads.dfa.axis.v1_20.CreativeUploadRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "uploadCreativeFilesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCompleteCreativeUploadSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadSession"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSessionSummary"), com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCompleteCreativeUploadSessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCreativesFromCreativeUploadSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadSession"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession"), com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createCreativesFromCreativeUploadSessionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCreative");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignCreativesToPlacements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativePlacementAssignments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativePlacementAssignment"), com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativePlacementAssignmentResult"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "assignCreativesToPlacementsReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreativeTypes");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeType"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeTypesReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCreative");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "creativeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeBase"));
        oper.setReturnClass(com.google.api.ads.dfa.axis.v1_20.CreativeBase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCreativeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "fault"),
                      "com.google.api.ads.dfa.axis.v1_20.ApiException",
                      new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException"), 
                      true
                     ));
        _operations[24] = oper;

    }

    public CreativeSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CreativeSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CreativeSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ActiveFilter");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ActiveFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ApiException");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOf_soapenc_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeAssetBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAssetBase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetBase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeBase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeBase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCampaignAssociationResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCampaignAssociationResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCopyRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCopyRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCopyRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeCopyResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCopyResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeFieldAssignment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeFieldAssignment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativePlacementAssignment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativePlacementAssignment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativePlacementAssignmentResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativePlacementAssignmentResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeRenderingResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRenderingResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeSaveRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeSaveRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSaveRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeUploadFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFile");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfCreativeUploadFileSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFileSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFileSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfFlashClickTag");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.FlashClickTag[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashClickTag");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfHTMLCreativeAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeAsset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfHTMLCreativeFlashAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeFlashAsset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfInStreamCompanionAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamCompanionAd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamCompanionAd");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfInStreamMediaFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamMediaFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamMediaFile");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfInStreamNonLinearAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamNonLinearAd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamNonLinearAd");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRawFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RawFile[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RawFile");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaAsset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAsset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaCounterEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaCounterEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCounterEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaExitEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaMultiFloatingAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaMultiFloatingAsset[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaMultiFloatingAsset");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaStandardEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaStandardEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ArrayOfRichMediaTimerEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaTimerEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaTimerEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Base");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Base.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAssetBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeAssetSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCampaignAssociationResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCopyRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCopyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCopyResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeFieldAssignment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeFieldAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativePlacementAssignment");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativePlacementAssignmentResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRenderingRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeRenderingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeRenderingResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSaveRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeSaveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeType");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFileBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFileBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFileCount");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFileCount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFileSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadFileSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSession");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSessionRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadSessionSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DateInterval");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.DateInterval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Dimensions");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashClickTag");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.FlashClickTag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.FlashFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FlashInpageCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.FlashInpageCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "FSCommand");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.FSCommand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreativeAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreativeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLCreativeFlashAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLCreativeFlashAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "HTMLInterstitialCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.HTMLInterstitialCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ImageCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ImageCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ImageCreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ImageCreativeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ImageFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.ImageFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamAssetUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamCompanionAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamCompanionAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamMediaFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamMediaFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamNonLinearAd");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamNonLinearAd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamThirdPartyTrackingEvents");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamThirdPartyTrackingEvents.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InStreamVideoCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InternalRedirectCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InternalRedirectCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "InterstitialInternalRedirectCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.InterstitialInternalRedirectCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "MobileDisplayCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.MobileDisplayCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "MobileDisplayCreativeAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.MobileDisplayCreativeAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PageableSearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "PagedRecordSet");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.PagedRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RawFile");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RawFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RawFileSummary");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RawFileSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RedirectCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RedirectCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RedirectCreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RedirectCreativeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaAssetUploadRequest");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCounterEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaCounterEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaCreativeBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaEventBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaEventBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitWindowProperties");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExitWindowProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExpandingHtmlAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaExpandingHtmlAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFlashAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFlashAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFlashInFlashCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFlashInFlashCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingHtmlAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingHtmlAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFloatingWithReminderCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaFloatingWithReminderCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaHtmlAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaHtmlAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaImageAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaImageAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaImageWithFloatingCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaImageWithFloatingCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaImageWithOverlayCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaImageWithOverlayCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaInPageAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaInPageCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageHtmlAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaInPageHtmlAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageWithFloatingCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaInPageWithFloatingCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageWithOverlayCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaInPageWithOverlayCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaMobileInAppAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaMobileInAppAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaMobileInAppCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaMobileInAppCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaMultiFloatingAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaMultiFloatingAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaMultiFloatingCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaMultiFloatingCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaOverlayAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaOverlayAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaOverlayCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaOverlayCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaReminderAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaReminderAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaStandardEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaTimerEvent");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaTimerEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaVideoAsset");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.RichMediaVideoAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SearchCriteriaBase");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.SearchCriteriaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Size");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.Size.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TargetWindow");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.TargetWindow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TrackingHTMLCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.TrackingHTMLCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TrackingImageCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.TrackingImageCreative.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TrackingTextCreative");
            cachedSerQNames.add(qName);
            cls = com.google.api.ads.dfa.axis.v1_20.TrackingTextCreative.class;
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

    public com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet getCreativeAssets(com.google.api.ads.dfa.axis.v1_20.CreativeAssetSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCreativeAssets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeAssetRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet getCreatives(com.google.api.ads.dfa.axis.v1_20.CreativeSearchCriteria searchCriteria) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCreatives"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeRecordSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult saveCreative(com.google.api.ads.dfa.axis.v1_20.CreativeBase creativeBase, long campaignId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "saveCreative"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeBase, new java.lang.Long(campaignId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[] getCreativeRenderings(com.google.api.ads.dfa.axis.v1_20.CreativeRenderingRequest request) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCreativeRenderings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeRenderingResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult saveCreativeAsset(com.google.api.ads.dfa.axis.v1_20.CreativeAsset creativeAsset) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "saveCreativeAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeAsset});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeAssetSaveResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[] associateCreativesToCampaign(long campaignId, long[] creativeIds) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "associateCreativesToCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(campaignId), creativeIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeCampaignAssociationResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[] copyCreative(com.google.api.ads.dfa.axis.v1_20.CreativeCopyRequest[] copyRequests) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "copyCreative"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {copyRequests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeCopyResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase uploadRichMediaAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "uploadRichMediaAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uploadRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase replaceRichMediaAsset(java.lang.String oldAssetFileName, com.google.api.ads.dfa.axis.v1_20.RichMediaAssetUploadRequest replaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "replaceRichMediaAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {oldAssetFileName, replaceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase deleteRichMediaAsset(long creativeId, java.lang.String assetFileName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "deleteRichMediaAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId), assetFileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase uploadRichMediaCreativePackage(long advertiserId, byte[] fileData, boolean uploadAsFlashInFlashCreative) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "uploadRichMediaCreativePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(advertiserId), fileData, new java.lang.Boolean(uploadAsFlashInFlashCreative)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase replaceRichMediaCreativePackage(long creativeId, byte[] fileData) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "replaceRichMediaCreativePackage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId), fileData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaCreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getRichMediaPreviewURL(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getRichMediaPreviewURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative uploadInStreamAsset(com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest assetUploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "uploadInStreamAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assetUploadRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative deleteInStreamAsset(long creativeId, java.lang.String assetName) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "deleteInStreamAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId), assetName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative replaceInStreamAsset(java.lang.String assetName, com.google.api.ads.dfa.axis.v1_20.InStreamAssetUploadRequest assetReplaceRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "replaceInStreamAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {assetName, assetReplaceRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.InStreamVideoCreative.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[] getRichMediaStandardEvents() throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getRichMediaStandardEvents"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.RichMediaStandardEvent[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession generateCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionRequest creativeUploadSessionRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "generateCreativeUploadSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativeUploadSessionRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession uploadCreativeFiles(com.google.api.ads.dfa.axis.v1_20.CreativeUploadRequest uploadRequest) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "uploadCreativeFiles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uploadRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession getCompleteCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSessionSummary uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCompleteCreativeUploadSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uploadSession});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession createCreativesFromCreativeUploadSession(com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession uploadSession) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "createCreativesFromCreativeUploadSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {uploadSession});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeUploadSession.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "deleteCreative"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[] assignCreativesToPlacements(com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignment[] creativePlacementAssignments) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "assignCreativesToPlacements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creativePlacementAssignments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativePlacementAssignmentResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeType[] getCreativeTypes() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCreativeTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.google.api.ads.dfa.axis.v1_20.CreativeBase getCreative(long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfa.axis.v1_20.ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "getCreative"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Long(creativeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeBase) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.google.api.ads.dfa.axis.v1_20.CreativeBase) org.apache.axis.utils.JavaUtils.convert(_resp, com.google.api.ads.dfa.axis.v1_20.CreativeBase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.google.api.ads.dfa.axis.v1_20.ApiException) {
              throw (com.google.api.ads.dfa.axis.v1_20.ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
