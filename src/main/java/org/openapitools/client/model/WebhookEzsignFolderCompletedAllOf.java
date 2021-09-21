/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.48
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfolderResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WebhookEzsignFolderCompletedAllOf {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderResponse objEzsignfolder = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfolderResponse getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignFolderCompletedAllOf webhookEzsignFolderCompletedAllOf = (WebhookEzsignFolderCompletedAllOf) o;
    return (this.objEzsignfolder == null ? webhookEzsignFolderCompletedAllOf.objEzsignfolder == null : this.objEzsignfolder.equals(webhookEzsignFolderCompletedAllOf.objEzsignfolder));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignFolderCompletedAllOf {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
