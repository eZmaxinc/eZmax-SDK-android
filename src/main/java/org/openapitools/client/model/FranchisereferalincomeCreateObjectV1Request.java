/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.38
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.FranchisereferalincomeRequest;
import org.openapitools.client.model.FranchisereferalincomeRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the /1/object/franchisereferalincome/createObject API Request
 **/
@ApiModel(description = "Request for the /1/object/franchisereferalincome/createObject API Request")
public class FranchisereferalincomeCreateObjectV1Request {
  
  @SerializedName("objFranchisereferalincome")
  private FranchisereferalincomeRequest objFranchisereferalincome = null;
  @SerializedName("objFranchisereferalincomeCompound")
  private FranchisereferalincomeRequestCompound objFranchisereferalincomeCompound = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FranchisereferalincomeRequest getObjFranchisereferalincome() {
    return objFranchisereferalincome;
  }
  public void setObjFranchisereferalincome(FranchisereferalincomeRequest objFranchisereferalincome) {
    this.objFranchisereferalincome = objFranchisereferalincome;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FranchisereferalincomeRequestCompound getObjFranchisereferalincomeCompound() {
    return objFranchisereferalincomeCompound;
  }
  public void setObjFranchisereferalincomeCompound(FranchisereferalincomeRequestCompound objFranchisereferalincomeCompound) {
    this.objFranchisereferalincomeCompound = objFranchisereferalincomeCompound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FranchisereferalincomeCreateObjectV1Request franchisereferalincomeCreateObjectV1Request = (FranchisereferalincomeCreateObjectV1Request) o;
    return (this.objFranchisereferalincome == null ? franchisereferalincomeCreateObjectV1Request.objFranchisereferalincome == null : this.objFranchisereferalincome.equals(franchisereferalincomeCreateObjectV1Request.objFranchisereferalincome)) &&
        (this.objFranchisereferalincomeCompound == null ? franchisereferalincomeCreateObjectV1Request.objFranchisereferalincomeCompound == null : this.objFranchisereferalincomeCompound.equals(franchisereferalincomeCreateObjectV1Request.objFranchisereferalincomeCompound));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objFranchisereferalincome == null ? 0: this.objFranchisereferalincome.hashCode());
    result = 31 * result + (this.objFranchisereferalincomeCompound == null ? 0: this.objFranchisereferalincomeCompound.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FranchisereferalincomeCreateObjectV1Request {\n");
    
    sb.append("  objFranchisereferalincome: ").append(objFranchisereferalincome).append("\n");
    sb.append("  objFranchisereferalincomeCompound: ").append(objFranchisereferalincomeCompound).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
