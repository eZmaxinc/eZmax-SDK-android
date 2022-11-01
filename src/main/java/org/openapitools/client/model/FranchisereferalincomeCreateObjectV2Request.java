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
import org.openapitools.client.model.FranchisereferalincomeRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /2/object/franchisereferalincome
 **/
@ApiModel(description = "Request for POST /2/object/franchisereferalincome")
public class FranchisereferalincomeCreateObjectV2Request {
  
  @SerializedName("a_objFranchisereferalincome")
  private List<FranchisereferalincomeRequestCompound> aObjFranchisereferalincome = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<FranchisereferalincomeRequestCompound> getAObjFranchisereferalincome() {
    return aObjFranchisereferalincome;
  }
  public void setAObjFranchisereferalincome(List<FranchisereferalincomeRequestCompound> aObjFranchisereferalincome) {
    this.aObjFranchisereferalincome = aObjFranchisereferalincome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeCreateObjectV2Request franchisereferalincomeCreateObjectV2Request = (FranchisereferalincomeCreateObjectV2Request) o;
    return (this.aObjFranchisereferalincome == null ? franchisereferalincomeCreateObjectV2Request.aObjFranchisereferalincome == null : this.aObjFranchisereferalincome.equals(franchisereferalincomeCreateObjectV2Request.aObjFranchisereferalincome));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjFranchisereferalincome == null ? 0: this.aObjFranchisereferalincome.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeCreateObjectV2Request {\n");
    
    sb.append("  aObjFranchisereferalincome: ").append(aObjFranchisereferalincome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
