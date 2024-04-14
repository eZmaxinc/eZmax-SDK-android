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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsignfolder/disposeEzsignfolders
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder/disposeEzsignfolders")
public class EzsignfolderDisposeEzsignfoldersV1Request {
  
  @SerializedName("a_pkiEzsignfolderID")
  private List<Integer> aPkiEzsignfolderID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsignfolderID() {
    return aPkiEzsignfolderID;
  }
  public void setAPkiEzsignfolderID(List<Integer> aPkiEzsignfolderID) {
    this.aPkiEzsignfolderID = aPkiEzsignfolderID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderDisposeEzsignfoldersV1Request ezsignfolderDisposeEzsignfoldersV1Request = (EzsignfolderDisposeEzsignfoldersV1Request) o;
    return (this.aPkiEzsignfolderID == null ? ezsignfolderDisposeEzsignfoldersV1Request.aPkiEzsignfolderID == null : this.aPkiEzsignfolderID.equals(ezsignfolderDisposeEzsignfoldersV1Request.aPkiEzsignfolderID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsignfolderID == null ? 0: this.aPkiEzsignfolderID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderDisposeEzsignfoldersV1Request {\n");
    
    sb.append("  aPkiEzsignfolderID: ").append(aPkiEzsignfolderID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
