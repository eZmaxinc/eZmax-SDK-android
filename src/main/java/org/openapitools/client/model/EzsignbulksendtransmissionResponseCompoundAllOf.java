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
import org.openapitools.client.model.CustomEzsignfoldertransmissionResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class EzsignbulksendtransmissionResponseCompoundAllOf {
  
  @SerializedName("a_objEzsignfoldertransmission")
  private List<CustomEzsignfoldertransmissionResponse> aObjEzsignfoldertransmission = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CustomEzsignfoldertransmissionResponse> getAObjEzsignfoldertransmission() {
    return aObjEzsignfoldertransmission;
  }
  public void setAObjEzsignfoldertransmission(List<CustomEzsignfoldertransmissionResponse> aObjEzsignfoldertransmission) {
    this.aObjEzsignfoldertransmission = aObjEzsignfoldertransmission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsignbulksendtransmissionResponseCompoundAllOf ezsignbulksendtransmissionResponseCompoundAllOf = (EzsignbulksendtransmissionResponseCompoundAllOf) o;
    return (this.aObjEzsignfoldertransmission == null ? ezsignbulksendtransmissionResponseCompoundAllOf.aObjEzsignfoldertransmission == null : this.aObjEzsignfoldertransmission.equals(ezsignbulksendtransmissionResponseCompoundAllOf.aObjEzsignfoldertransmission));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsignfoldertransmission == null ? 0: this.aObjEzsignfoldertransmission.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsignbulksendtransmissionResponseCompoundAllOf {\n");
    
    sb.append("  aObjEzsignfoldertransmission: ").append(aObjEzsignfoldertransmission).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
