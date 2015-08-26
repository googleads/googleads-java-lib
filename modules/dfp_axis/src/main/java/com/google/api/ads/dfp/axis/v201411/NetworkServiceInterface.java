/**
 * NetworkServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201411;

public interface NetworkServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of {@link Network} objects to which the current
     * login has
     *         access.
     *         <p>
     *         Intended to be used without a network code in the SOAP header
     * when the
     *         login may have more than one network associated with it.
     *         </p>
     *         
     *         
     * @return the networks to which the current login has access
     */
    public com.google.api.ads.dfp.axis.v201411.Network[] getAllNetworks() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Returns the current network for which requests are being made.
     * 
     *         
     * @return the network for which the user is currently making the request
     */
    public com.google.api.ads.dfp.axis.v201411.Network getCurrentNetwork() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Creates a new blank network for testing purposes using the
     * current login.
     *         <p>
     *         Each login(i.e. email address) can only have one test network.
     * Data from
     *         any of your existing networks will not be transferred to the
     * new test network.
     *         Once the test network is created, the test network can be
     * used in the API
     *         by supplying the {@link Network#networkCode} in the SOAP header
     * or by
     *         logging into the DFP UI.
     *         <p>
     *         Test networks are limited in the following ways:
     *         <ul>
     *         <li>Test networks cannot serve ads.</li>
     *         <li>Because test networks cannot serve ads, reports will always
     * come
     *         back without data.</li>
     *         <li>Since forecasting requires serving history, forecast service
     * results
     *         will be faked. See {@link ForecastService} for more info.</li>
     * <li>Test networks are, by default, small business networks and do
     * not have any
     *         premium features. To have additional features turned on, please
     * contact your
     *         account manager. </li>
     *         <li>Test networks are limited to 10,000 objects per entity
     * type.</li>
     *         </ul>
     *         </p>
     */
    public com.google.api.ads.dfp.axis.v201411.Network makeTestNetwork() throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;

    /**
     * Updates the specified network. Currently, only the network
     * display name can
     *         be updated.
     *         
     *         
     * @param network the network that needs to be updated
     *         
     * @return the updated network
     */
    public com.google.api.ads.dfp.axis.v201411.Network updateNetwork(com.google.api.ads.dfp.axis.v201411.Network network) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201411.ApiException;
}
