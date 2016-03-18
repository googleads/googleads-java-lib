/**
 * AccountLabelServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.mcm;

public interface AccountLabelServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of labels specified by the selector for the
     * authenticated user.
     *         
     *         
     * @param selector filters the list of labels to return
     *         
     * @return response containing lists of labels that meet all the criteria
     * of the selector
     *         
     * @throws ApiException if a problem occurs fetching the information
     * requested
     */
    public com.google.api.ads.adwords.axis.v201509.mcm.AccountLabelPage get(com.google.api.ads.adwords.axis.v201509.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Possible actions:
     *         <ul>
     *         <li> Create a new label - create a new {@link Label} and call
     * mutate with ADD operator
     *         <li> Edit the label name - set the appropriate fields in your
     * {@linkplain Label} and call
     *         mutate with the SET operator. Null fields will be interpreted
     * to mean "no change"
     *         <li> Delete the label - call mutate with REMOVE operator
     *         </ul>
     *         
     *         
     * @param operations list of unique operations to be executed in a single
     * transaction, in the
     *         order specified.
     *         
     * @return the mutated labels, in the same order that they were in as
     * the parameter
     *         
     * @throws ApiException if problems occurs while modifying label information
     */
    public com.google.api.ads.adwords.axis.v201509.mcm.AccountLabelReturnValue mutate(com.google.api.ads.adwords.axis.v201509.mcm.AccountLabelOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
