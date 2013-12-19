/**
 * MediaServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;

public interface MediaServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of media that meet the criteria specified by
     * the selector.
     *         <p class="note"><b>Note:</b> {@code MediaService} will not
     * return any
     *         {@link ImageAd} image files.</p>
     *         
     *         
     * @param serviceSelector Selects which media objects to return.
     *         
     * @return A list of {@code Media} objects.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.MediaPage get(com.google.api.ads.adwords.axis.v201309.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;

    /**
     * Uploads new media. Currently, you can only upload {@link Image}
     * files.
     *         
     *         
     * @param media A list of {@code Media} objects, each containing the
     * data to
     *         be uploaded.
     *         
     * @return A list of uploaded media in the same order as the argument
     * list.
     */
    public com.google.api.ads.adwords.axis.v201309.cm.Media[] upload(com.google.api.ads.adwords.axis.v201309.cm.Media[] media) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201309.cm.ApiException;
}
