
package com.google.api.ads.adwords.jaxws.v201601.mcm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201601.cm.Selector;


/**
 * 
 *       Customer Manager Service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ManagedCustomerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201601.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201601.mcm.ObjectFactory.class
})
public interface ManagedCustomerServiceInterface {


    /**
     * 
     *         Returns the list of customers that meet the selector criteria.
     *         
     *         @param selector The selector specifying the {@link ManagedCustomer}s to return.
     *         @return List of customers identified by the selector.
     *         @throws ApiException When there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacegetResponse")
    public ManagedCustomerPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        Selector serviceSelector)
        throws ApiException
    ;

    /**
     * 
     *         Returns the pending invitations for the customer IDs in the selector.
     *         @param selector the manager customer ids (inviters) or the client customer ids (invitees)
     *         @throws ApiException when there is at least one error with the request
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201601.mcm.PendingInvitation>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "getPendingInvitations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacegetPendingInvitations")
    @ResponseWrapper(localName = "getPendingInvitationsResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacegetPendingInvitationsResponse")
    public List<PendingInvitation> getPendingInvitations(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        PendingInvitationSelector selector)
        throws ApiException
    ;

    /**
     * 
     *         Modifies or creates new {@link ManagedCustomer}s.
     *         
     *         <p class="note"><b>Note:</b> See {@link ManagedCustomerOperation} for available operators.</p>
     *         
     *         @param operations List of unique operations.
     *         @return The list of updated managed customers, returned in the same order as the
     *         <code>operations</code> array.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateResponse")
    public ManagedCustomerReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        List<ManagedCustomerOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Adds {@linkplain AccountLabel}s to, and removes
     *         {@linkplain AccountLabel}s from, {@linkplain ManagedCustomer}s.
     *         
     *         <p>To add an {@linkplain AccountLabel} to a {@linkplain ManagedCustomer},
     *         use {@link Operator#ADD}.
     *         To remove an {@linkplain AccountLabel} from a {@linkplain ManagedCustomer},
     *         use {@link Operator#REMOVE}.</p>
     *         <p>The label must already exist (see {@link AccountLabelService#mutate} for
     *         how to create them) and be owned by the authenticated user.</p>
     *         <p>The {@linkplain ManagedCustomer} must already exist and be managed by
     *         the customer making the request (either directly or indirectly).</p>
     *         <p>An AccountLabel may be applied to at most 1000 customers.</p>
     *         <p>This method does not support partial failures, and will fail if any
     *         operation is invalid.</p>
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerLabelReturnValue
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateLabelResponse")
    public ManagedCustomerLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        List<ManagedCustomerLabelOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Modifies the ManagedCustomer forest. These actions are possible (categorized by
     *         Operator + Link Status):
     *         
     *         <ul>
     *         <li>ADD + PENDING:   manager extends invitations</li>
     *         <li>SET + CANCELLED: manager rescinds invitations</li>
     *         <li>SET + INACTIVE:  manager/client terminates links</li>
     *         <li>SET + ACTIVE:    client accepts invitations</li>
     *         <li>SET + REFUSED:   client declines invitations</li>
     *         </ul>
     *         
     *         As of v201506 in addition to these, active links can also be marked hidden / unhidden.
     *         <ul>
     *         <li> An ACTIVE link can be marked hidden with SET + ACTIVE along with setting the
     *         isHidden bit to true. </li>
     *         <li> An ACTIVE link can be marked unhidden with SET + ACTIVE along with setting the
     *         isHidden bit to false. </li>
     *         </ul>
     *         
     *         @param operations the list of operations
     *         @return results for the given operations
     *         @throws ApiException with a {@link ManagedCustomerServiceError}
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.mcm.MutateLinkResults
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "mutateLink", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateLink")
    @ResponseWrapper(localName = "mutateLinkResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateLinkResponse")
    public MutateLinkResults mutateLink(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        List<LinkOperation> operations)
        throws ApiException
    ;

    /**
     * 
     *         Moves client customers to new managers (moving links). Only the following action is possible:
     *         
     *         <ul>
     *         <li>SET + ACTIVE: manager moves client customers to new managers within the same manager
     *         account hierarchy</li>
     *         </ul>
     *         
     *         @param operations List of unique operations.
     *         @return results for the given operations
     *         @throws ApiException with a {@link ManagedCustomerServiceError}
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.mcm.MutateManagerResults
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
    @RequestWrapper(localName = "mutateManager", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateManager")
    @ResponseWrapper(localName = "mutateManagerResponse", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.mcm.ManagedCustomerServiceInterfacemutateManagerResponse")
    public MutateManagerResults mutateManager(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/mcm/v201601")
        List<MoveOperation> operations)
        throws ApiException
    ;

}
