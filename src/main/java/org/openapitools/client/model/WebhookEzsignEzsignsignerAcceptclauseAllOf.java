/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfolderResponse;
import org.openapitools.client.model.EzsignfoldersignerassociationResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class WebhookEzsignEzsignsignerAcceptclauseAllOf {
  
  @SerializedName("objEzsignfolder")
  private EzsignfolderResponse objEzsignfolder = null;
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationResponseCompound objEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfolderResponse getObjEzsignfolder() {
    return objEzsignfolder;
  }
  public void setObjEzsignfolder(EzsignfolderResponse objEzsignfolder) {
    this.objEzsignfolder = objEzsignfolder;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzsignfoldersignerassociationResponseCompound getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationResponseCompound objEzsignfoldersignerassociation) {
    this.objEzsignfoldersignerassociation = objEzsignfoldersignerassociation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEzsignEzsignsignerAcceptclauseAllOf webhookEzsignEzsignsignerAcceptclauseAllOf = (WebhookEzsignEzsignsignerAcceptclauseAllOf) o;
    return (this.objEzsignfolder == null ? webhookEzsignEzsignsignerAcceptclauseAllOf.objEzsignfolder == null : this.objEzsignfolder.equals(webhookEzsignEzsignsignerAcceptclauseAllOf.objEzsignfolder)) &&
        (this.objEzsignfoldersignerassociation == null ? webhookEzsignEzsignsignerAcceptclauseAllOf.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(webhookEzsignEzsignsignerAcceptclauseAllOf.objEzsignfoldersignerassociation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfolder == null ? 0: this.objEzsignfolder.hashCode());
    result = 31 * result + (this.objEzsignfoldersignerassociation == null ? 0: this.objEzsignfoldersignerassociation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEzsignEzsignsignerAcceptclauseAllOf {\n");
    
    sb.append("  objEzsignfolder: ").append(objEzsignfolder).append("\n");
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
