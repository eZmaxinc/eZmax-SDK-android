/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/object/ezsignfoldersignerassociation
 **/
@ApiModel(description = "Payload for POST /1/object/ezsignfoldersignerassociation")
public class EzsignfoldersignerassociationCreateObjectV1ResponseMPayload {
  
  @SerializedName("a_pkiEzsignfoldersignerassociationID")
  private List<Integer> aPkiEzsignfoldersignerassociationID = null;

  /**
   * An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.
   **/
  @ApiModelProperty(required = true, value = "An array of unique IDs representing the object that were requested to be created.  They are returned in the same order as the array containing the objects to be created that was sent in the request.")
  public List<Integer> getAPkiEzsignfoldersignerassociationID() {
    return aPkiEzsignfoldersignerassociationID;
  }
  public void setAPkiEzsignfoldersignerassociationID(List<Integer> aPkiEzsignfoldersignerassociationID) {
    this.aPkiEzsignfoldersignerassociationID = aPkiEzsignfoldersignerassociationID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfoldersignerassociationCreateObjectV1ResponseMPayload ezsignfoldersignerassociationCreateObjectV1ResponseMPayload = (EzsignfoldersignerassociationCreateObjectV1ResponseMPayload) o;
    return (this.aPkiEzsignfoldersignerassociationID == null ? ezsignfoldersignerassociationCreateObjectV1ResponseMPayload.aPkiEzsignfoldersignerassociationID == null : this.aPkiEzsignfoldersignerassociationID.equals(ezsignfoldersignerassociationCreateObjectV1ResponseMPayload.aPkiEzsignfoldersignerassociationID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignfoldersignerassociationID == null ? 0: this.aPkiEzsignfoldersignerassociationID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfoldersignerassociationCreateObjectV1ResponseMPayload {\n");
    
    sb.append("  aPkiEzsignfoldersignerassociationID: ").append(aPkiEzsignfoldersignerassociationID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
