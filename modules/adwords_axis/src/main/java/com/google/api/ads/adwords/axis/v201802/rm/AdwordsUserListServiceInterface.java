// Copyright 2018 Google Inc. All Rights Reserved.
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
 * AdwordsUserListServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;

public interface AdwordsUserListServiceInterface extends java.rmi.Remote {

    /**
     * Returns the list of user lists that meet the selector criteria.
     * 
     *         
     * @param serviceSelector the selector specifying the {@link UserList}s
     * to return.
     *         
     * @return a list of UserList entities which meet the selector criteria.
     * 
     * @throws ApiException if problems occurred while fetching UserList
     * information.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListPage get(com.google.api.ads.adwords.axis.v201802.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Applies a list of mutate operations (i.e. add, set):
     *         
     *         Add - creates a set of user lists
     *         Set - updates a set of user lists
     *         Remove - not supported
     *         
     *         
     * @param operations the operations to apply
     *         
     * @return a list of UserList objects
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListReturnValue mutate(com.google.api.ads.adwords.axis.v201802.rm.UserListOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Mutate members of user lists by either adding or removing their
     * lists of members.
     *         The following {@link Operator}s are supported: ADD and REMOVE.
     * The SET operator
     *         is not supported.
     *         
     *         <p>Note that operations cannot have same user list id but
     * different operators.
     *         
     *         
     * @param operations the mutate members operations to apply
     *         
     * @return a list of UserList objects
     *         
     * @throws ApiException when there are one or more errors with the request
     */
    public com.google.api.ads.adwords.axis.v201802.rm.MutateMembersReturnValue mutateMembers(com.google.api.ads.adwords.axis.v201802.rm.MutateMembersOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;

    /**
     * Returns the list of user lists that match the query.
     *         
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @return A list of UserList
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.UserListPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201802.cm.ApiException;
}
