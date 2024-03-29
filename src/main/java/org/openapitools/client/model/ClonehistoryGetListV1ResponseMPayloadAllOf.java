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

import java.util.*;
import org.openapitools.client.model.ClonehistoryListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ClonehistoryGetListV1ResponseMPayloadAllOf {
  
  @SerializedName("a_objClonehistory")
  private List<ClonehistoryListElement> aObjClonehistory = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ClonehistoryListElement> getAObjClonehistory() {
    return aObjClonehistory;
  }
  public void setAObjClonehistory(List<ClonehistoryListElement> aObjClonehistory) {
    this.aObjClonehistory = aObjClonehistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClonehistoryGetListV1ResponseMPayloadAllOf clonehistoryGetListV1ResponseMPayloadAllOf = (ClonehistoryGetListV1ResponseMPayloadAllOf) o;
    return (this.aObjClonehistory == null ? clonehistoryGetListV1ResponseMPayloadAllOf.aObjClonehistory == null : this.aObjClonehistory.equals(clonehistoryGetListV1ResponseMPayloadAllOf.aObjClonehistory));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjClonehistory == null ? 0: this.aObjClonehistory.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClonehistoryGetListV1ResponseMPayloadAllOf {\n");
    
    sb.append("  aObjClonehistory: ").append(aObjClonehistory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
