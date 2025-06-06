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


package com.google.api.ads.admanager.jaxws.v202411;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides operations for creating, updating and retrieving {@link Company} objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CompanyServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CompanyServiceInterface {


    /**
     * 
     *         Creates new {@link Company} objects.
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "createCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfacecreateCompanies")
    @ResponseWrapper(localName = "createCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfacecreateCompaniesResponse")
    public List<Company> createCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<Company> companies)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link CompanyPage} of {@link Company} objects that satisfy the given {@link
     *         Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Company#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Company#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code type}</td>
     *         <td>{@link Company#type}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Company#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.CompanyPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "getCompaniesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfacegetCompaniesByStatement")
    @ResponseWrapper(localName = "getCompaniesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfacegetCompaniesByStatementResponse")
    public CompanyPage getCompaniesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link Company} objects that match the given {@code Statement}.
     *       
     * 
     * @param statement
     * @param companyAction
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202411.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "performCompanyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfaceperformCompanyAction")
    @ResponseWrapper(localName = "performCompanyActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfaceperformCompanyActionResponse")
    public UpdateResult performCompanyAction(
        @WebParam(name = "companyAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        CompanyAction companyAction,
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link Company} objects.
     *       
     * 
     * @param companies
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202411.Company>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
    @RequestWrapper(localName = "updateCompanies", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfaceupdateCompanies")
    @ResponseWrapper(localName = "updateCompaniesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411", className = "com.google.api.ads.admanager.jaxws.v202411.CompanyServiceInterfaceupdateCompaniesResponse")
    public List<Company> updateCompanies(
        @WebParam(name = "companies", targetNamespace = "https://www.google.com/apis/ads/publisher/v202411")
        List<Company> companies)
        throws ApiException_Exception
    ;

}
