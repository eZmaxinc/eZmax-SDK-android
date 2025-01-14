/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Response for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/ExtractText
 **/
@ApiModel(description = "Response for POST /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/ExtractText")
public class EzsigntemplatedocumentExtractTextV1ResponseMPayload {
  
  @SerializedName("sText")
  private String sText = null;

  /**
   * The text extract from document
   **/
  @ApiModelProperty(required = true, value = "The text extract from document")
  public String getSText() {
    return sText;
  }
  public void setSText(String sText) {
    this.sText = sText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentExtractTextV1ResponseMPayload ezsigntemplatedocumentExtractTextV1ResponseMPayload = (EzsigntemplatedocumentExtractTextV1ResponseMPayload) o;
    return (this.sText == null ? ezsigntemplatedocumentExtractTextV1ResponseMPayload.sText == null : this.sText.equals(ezsigntemplatedocumentExtractTextV1ResponseMPayload.sText));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sText == null ? 0: this.sText.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentExtractTextV1ResponseMPayload {\n");
    
    sb.append("  sText: ").append(sText).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
