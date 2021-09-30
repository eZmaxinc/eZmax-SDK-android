/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.EzsignfoldersignerassociationRequest;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/ezsignfoldersignerassociation/editObject API Request
 **/
@ApiModel(description = "Request for the /1/object/ezsignfoldersignerassociation/editObject API Request")
public class UNUSEDEzsignfoldersignerassociationEditObjectV1Request {
  
  @SerializedName("objEzsignfoldersignerassociation")
  private EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public EzsignfoldersignerassociationRequest getObjEzsignfoldersignerassociation() {
    return objEzsignfoldersignerassociation;
  }
  public void setObjEzsignfoldersignerassociation(EzsignfoldersignerassociationRequest objEzsignfoldersignerassociation) {
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
    UNUSEDEzsignfoldersignerassociationEditObjectV1Request uNUSEDEzsignfoldersignerassociationEditObjectV1Request = (UNUSEDEzsignfoldersignerassociationEditObjectV1Request) o;
    return (this.objEzsignfoldersignerassociation == null ? uNUSEDEzsignfoldersignerassociationEditObjectV1Request.objEzsignfoldersignerassociation == null : this.objEzsignfoldersignerassociation.equals(uNUSEDEzsignfoldersignerassociationEditObjectV1Request.objEzsignfoldersignerassociation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzsignfoldersignerassociation == null ? 0: this.objEzsignfoldersignerassociation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNUSEDEzsignfoldersignerassociationEditObjectV1Request {\n");
    
    sb.append("  objEzsignfoldersignerassociation: ").append(objEzsignfoldersignerassociation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
