/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder
 **/
@ApiModel(description = "Request for POST /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder")
public class EzsignfolderReorderV1Request {
  
  @SerializedName("a_pkiEzsigndocumentID")
  private List<Integer> aPkiEzsigndocumentID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Integer> getAPkiEzsigndocumentID() {
    return aPkiEzsigndocumentID;
  }
  public void setAPkiEzsigndocumentID(List<Integer> aPkiEzsigndocumentID) {
    this.aPkiEzsigndocumentID = aPkiEzsigndocumentID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignfolderReorderV1Request ezsignfolderReorderV1Request = (EzsignfolderReorderV1Request) o;
    return (this.aPkiEzsigndocumentID == null ? ezsignfolderReorderV1Request.aPkiEzsigndocumentID == null : this.aPkiEzsigndocumentID.equals(ezsignfolderReorderV1Request.aPkiEzsigndocumentID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiEzsigndocumentID == null ? 0: this.aPkiEzsigndocumentID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignfolderReorderV1Request {\n");
    
    sb.append("  aPkiEzsigndocumentID: ").append(aPkiEzsigndocumentID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
