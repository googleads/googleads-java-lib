/**
 * GeoLocationServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;

public interface GeoLocationServiceInterface extends java.rmi.Remote {

    /**
     * Retrieves the geographic location information for the address
     * specified.
     *         
     *         
     * @param selector specifies the addresses.
     *         
     * @return list of {@link GeoLocation} objects. Returns {@link InvalidGeoLocation}
     * object if
     *         the address cannot be geocoded.
     *         
     * @throws ApiException if problems occurred while retrieving the location
     * information
     */
    public com.google.api.ads.adwords.axis.v201402.cm.GeoLocation[] get(com.google.api.ads.adwords.axis.v201402.cm.GeoLocationSelector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201402.cm.ApiException;
}
