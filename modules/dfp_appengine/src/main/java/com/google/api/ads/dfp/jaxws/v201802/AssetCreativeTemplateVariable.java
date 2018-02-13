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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a file asset variable defined in a creative template.
 *             <p>
 *             Use {@link AssetCreativeTemplateVariableValue} to specify the value
 *             for this variable when creating {@link TemplateCreative} from the {@link TemplateCreative}.
 *           
 * 
 * <p>Java class for AssetCreativeTemplateVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetCreativeTemplateVariable">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}CreativeTemplateVariable">
 *       &lt;sequence>
 *         &lt;element name="mimeTypes" type="{https://www.google.com/apis/ads/publisher/v201802}AssetCreativeTemplateVariable.MimeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetCreativeTemplateVariable", propOrder = {
    "mimeTypes"
})
public class AssetCreativeTemplateVariable
    extends CreativeTemplateVariable
{

    @XmlSchemaType(name = "string")
    protected List<AssetCreativeTemplateVariableMimeType> mimeTypes;

    /**
     * Gets the value of the mimeTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetCreativeTemplateVariableMimeType }
     * 
     * 
     */
    public List<AssetCreativeTemplateVariableMimeType> getMimeTypes() {
        if (mimeTypes == null) {
            mimeTypes = new ArrayList<AssetCreativeTemplateVariableMimeType>();
        }
        return this.mimeTypes;
    }

}
