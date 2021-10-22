/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.1
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignsignerRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignfoldersignerassociationRequestCompoundAllOf {
  
  @SerializedName("objEzsignsigner")
  private EzsignsignerRequestCompound objEzsignsigner = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignsignerRequestCompound getObjEzsignsigner() {
    return objEzsignsigner;
  }
  public void setObjEzsignsigner(EzsignsignerRequestCompound objEzsignsigner) {
    this.objEzsignsigner = objEzsignsigner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationRequestCompoundAllOf ezsignfoldersignerassociationRequestCompoundAllOf = (EzsignfoldersignerassociationRequestCompoundAllOf) o;
    return (this.objEzsignsigner == null ? ezsignfoldersignerassociationRequestCompoundAllOf.objEzsignsigner == null : this.objEzsignsigner.equals(ezsignfoldersignerassociationRequestCompoundAllOf.objEzsignsigner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignsigner == null ? 0: this.objEzsignsigner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationRequestCompoundAllOf {\n");
    
    sb.append("  objEzsignsigner: ").append(objEzsignsigner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
