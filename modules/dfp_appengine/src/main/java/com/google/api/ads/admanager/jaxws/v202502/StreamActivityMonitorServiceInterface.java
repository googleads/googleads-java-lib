// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.1
 * 
 */
@WebService(name = "StreamActivityMonitorServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StreamActivityMonitorServiceInterface {


    /**
     * 
     *         Returns the logging information for a DAI session. A DAI session can be identified by it's
     *         session id or debug key. The session ID must be registered via the {@code
     *         registerSessionsForMonitoring} method before it can be accessed. There may be some delay before
     *         the session is available.
     *         
     *         <p>The number of sessions requested is limited to 25. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tbody>
     *         <tr>
     *         <th>Entity property</th>
     *         <th>PQL filter</th>
     *         </tr>
     *         <tr>
     *         <td>
     *         Session id
     *         </td>
     *         <td>
     *         'sessionId'
     *         </td>
     *         </tr>
     *         <tr>
     *         <td>
     *         Debug key
     *         </td>
     *         <td>
     *         'debugKey"
     *         </td>
     *         </tr>
     *         </tbody>
     *         </table>
     *       
     * 
     * @param statement
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202502.SamSession>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "getSamSessionsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.StreamActivityMonitorServiceInterfacegetSamSessionsByStatement")
    @ResponseWrapper(localName = "getSamSessionsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.StreamActivityMonitorServiceInterfacegetSamSessionsByStatementResponse")
    public List<SamSession> getSamSessionsByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Registers the specified list of {@code sessionIds} for monitoring. Once the session IDs have
     *         been registered, all logged information about the sessions will be persisted and can be viewed
     *         via the Ad Manager UI.
     *         
     *         <p>A session ID is a unique identifier of a single user watching a live stream event.
     *       
     * 
     * @param sessionIds
     * @return
     *     returns java.util.List<java.lang.String>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
    @RequestWrapper(localName = "registerSessionsForMonitoring", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.StreamActivityMonitorServiceInterfaceregisterSessionsForMonitoring")
    @ResponseWrapper(localName = "registerSessionsForMonitoringResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502", className = "com.google.api.ads.admanager.jaxws.v202502.StreamActivityMonitorServiceInterfaceregisterSessionsForMonitoringResponse")
    public List<String> registerSessionsForMonitoring(
        @WebParam(name = "sessionIds", targetNamespace = "https://www.google.com/apis/ads/publisher/v202502")
        List<String> sessionIds)
        throws ApiException_Exception
    ;

}
