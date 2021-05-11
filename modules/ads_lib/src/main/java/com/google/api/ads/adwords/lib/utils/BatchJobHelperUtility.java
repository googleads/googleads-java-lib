// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.io.ByteSource;
import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/** The utility class to be used in {@code BatchJobHelperInterface} */
public class BatchJobHelperUtility {

  private static final String TAG_MUTATE_RESPONSE = "mutateResponse";
  private static final String TAG_RVAL = "rval";

  private final Supplier<Transformer> transformerSupplier;
  private final XMLInputFactory xmlInputFactory;
  private final XMLOutputFactory xmlOutputFactory;
  private final XMLEventFactory xmlEventFactory;

  @Inject
  BatchJobHelperUtility(
      Supplier<Transformer> transformerSupplier,
      XMLInputFactory xmlInputFactory,
      XMLOutputFactory xmlOutputFactory,
      XMLEventFactory xmlEventFactory) {
    this.transformerSupplier = transformerSupplier;
    this.xmlInputFactory = xmlInputFactory;
    this.xmlOutputFactory = xmlOutputFactory;
    this.xmlEventFactory = xmlEventFactory;
  }

  /**
   * Returns a {@code ByteSource} object that wraps the batch job response into chunks with
   * pagination, which will be parsed by Axis/JAX-WS.
   */
  public ByteSource buildWrappedByteSource(URL url, int startIndex, int numberResults)
      throws IOException, XMLStreamException, TransformerException {
    Preconditions.checkArgument(startIndex >= 0, "startIndex must not be negative");
    Preconditions.checkArgument(numberResults > 0, "numberResults must be positive");

    StringWriter stringWriter = new StringWriter();

    XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(url.openStream());
    XMLEventWriter xmlEventWriter = xmlOutputFactory.createXMLEventWriter(stringWriter);

    int index = 0;
    boolean included = false;

    while (xmlEventReader.hasNext()) {
      XMLEvent event = xmlEventReader.nextEvent();

      if (event.isStartElement()) {
        String name = ((StartElement) event).getName().getLocalPart();
        if (name.equals(TAG_MUTATE_RESPONSE)) {
          // Write the <mutateResponse> tag.
          xmlEventWriter.add(event);
          continue;
        } else if (name.equals(TAG_RVAL) && ++index > startIndex) {
          // Included the eligible <rval> tags and sub tags by setting the 'included' flag.
          included = true;
        }
      } else if (event.isEndElement()) {
        String name = ((EndElement) event).getName().getLocalPart();
        if (name.equals(TAG_MUTATE_RESPONSE)) {
          // Write the </mutateResponse> tag.
          xmlEventWriter.add(event);
          break;
        } else if (included && name.equals(TAG_RVAL) && index == startIndex + numberResults) {
          // Write the last </rval> tag and append a </mutateResponse> tag, if this has written
          // the specified number of results.
          xmlEventWriter.add(event);
          xmlEventWriter.add(xmlEventFactory.createEndElement("", "", TAG_MUTATE_RESPONSE));
          break;
        }
      }

      if (included) {
        // Write the included tags and events.
        xmlEventWriter.add(event);
      }
    }
    xmlEventReader.close();
    xmlEventWriter.close();

    InputStream truncatedInputStream =
        ByteSource.wrap(stringWriter.toString().getBytes(UTF_8)).openStream();

    // Pass the input stream through a Transformer that removes the XML
    // declaration.
    Transformer transformer = transformerSupplier.get();
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    StreamResult streamResult = new StreamResult(outputStream);
    Source xmlSource = new StreamSource(truncatedInputStream);
    transformer.transform(xmlSource, streamResult);

    return ByteSource.wrap(outputStream.toByteArray());
  }
}
