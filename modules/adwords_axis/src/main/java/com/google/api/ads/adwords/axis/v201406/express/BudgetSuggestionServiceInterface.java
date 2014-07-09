/**
 * BudgetSuggestionServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.express;

public interface BudgetSuggestionServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the budget suggestion for the specified criteria
     * in the given selector based on
     *         co-trigger data.
     *         
     * @param selector the selector specifying the budget suggestion to return
     * 
     * @return budget suggestion identified by the selector
     */
    public com.google.api.ads.adwords.axis.v201406.express.BudgetSuggestion get(com.google.api.ads.adwords.axis.v201406.express.BudgetSuggestionSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201406.cm.ApiException;
}
