/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CustomFormDataDocumentResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getFormData
 **/
@ApiModel(description = "Payload for GET /1/object/ezsigndocument/{pkiEzsigndocument}/getFormData")
public class EzsigndocumentGetFormDataV1ResponseMPayload {
  
  @SerializedName("objFormDataDocument")
  private CustomFormDataDocumentResponse objFormDataDocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CustomFormDataDocumentResponse getObjFormDataDocument() {
    return objFormDataDocument;
  }
  public void setObjFormDataDocument(CustomFormDataDocumentResponse objFormDataDocument) {
    this.objFormDataDocument = objFormDataDocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentGetFormDataV1ResponseMPayload ezsigndocumentGetFormDataV1ResponseMPayload = (EzsigndocumentGetFormDataV1ResponseMPayload) o;
    return (this.objFormDataDocument == null ? ezsigndocumentGetFormDataV1ResponseMPayload.objFormDataDocument == null : this.objFormDataDocument.equals(ezsigndocumentGetFormDataV1ResponseMPayload.objFormDataDocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objFormDataDocument == null ? 0: this.objFormDataDocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentGetFormDataV1ResponseMPayload {\n");
    
    sb.append("  objFormDataDocument: ").append(objFormDataDocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
