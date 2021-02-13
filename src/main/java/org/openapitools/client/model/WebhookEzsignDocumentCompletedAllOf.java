/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.
 *
 * The version of the OpenAPI document: 1.0.30
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsigndocumentResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WebhookEzsignDocumentCompletedAllOf {
  
  @SerializedName("objEzsigndocument")
  private EzsigndocumentResponse objEzsigndocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsigndocumentResponse getObjEzsigndocument() {
    return objEzsigndocument;
  }
  public void setObjEzsigndocument(EzsigndocumentResponse objEzsigndocument) {
    this.objEzsigndocument = objEzsigndocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignDocumentCompletedAllOf webhookEzsignDocumentCompletedAllOf = (WebhookEzsignDocumentCompletedAllOf) o;
    return (this.objEzsigndocument == null ? webhookEzsignDocumentCompletedAllOf.objEzsigndocument == null : this.objEzsigndocument.equals(webhookEzsignDocumentCompletedAllOf.objEzsigndocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsigndocument == null ? 0: this.objEzsigndocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignDocumentCompletedAllOf {\n");
    
    sb.append("  objEzsigndocument: ").append(objEzsigndocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
