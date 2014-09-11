// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utility.extension.delegates;

import com.google.api.ads.adwords.axis.utility.extension.util.SelectorFields;
import com.google.api.ads.adwords.axis.v201406.cm.Media;
import com.google.api.ads.adwords.axis.v201406.cm.MediaServiceInterface;
import com.google.api.ads.adwords.lib.client.AdWordsSession;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

/**
 * Specific AbstractGetDelegate for {@link Media}.
 *
 * <p>
 * Implementation is not thread-safe,
 * because AdWordsSession and Apache Axis service objects are not thread-safe.
 * </p>
 *
 * @author Julian Toledo
 */
public final class MediaDelegate extends AbstractGetDelegate<Media, MediaServiceInterface> {

  /**
   * Default Constructor.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   */
  public MediaDelegate(AdWordsSession adWordsSession) {
    super(adWordsSession, Media.class, MediaServiceInterface.class, SelectorFields.Media.all());
  }

  /**
   * Constructor with custom service.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param service the custom service class for the SOAP service
   */
  public MediaDelegate(AdWordsSession adWordsSession, MediaServiceInterface service) {
    super(adWordsSession, Media.class, service, SelectorFields.Media.all());
  }

  /**
   * Constructor with custom fields.
   *
   * @param adWordsSession the {@code adWordsSession} to use with the delegate/service
   * @param selectorFields for the Generic Selectors using the SelectorField class
   */
  public MediaDelegate(AdWordsSession adWordsSession, List<SelectorFields.Media> selectorFields) {
    super(adWordsSession, Media.class, MediaServiceInterface.class, selectorFields);
  }

  /**
   * Upload a list of Medias.
   *
   * @param medias a list {@code Media} to upload
   * @return a list of Medias upladed
   * @throws RemoteException for communication-related exceptions
   */
  public List<Media> upload(List<Media> medias) throws RemoteException {
    return Arrays.asList(getService().upload(medias.toArray(new Media[] {})));
  }

  /**
   * Retrieves Medias by mediaId.
   *
   * @param mediaId
   * @return a list of Medias matching the mediaId
   * @throws RemoteException for communication-related exceptions
   */
  public List<Media> getByMediaId(long mediaId) throws RemoteException {
    return getByField(SelectorFields.Media.MEDIA_ID, mediaId);
  }
}
