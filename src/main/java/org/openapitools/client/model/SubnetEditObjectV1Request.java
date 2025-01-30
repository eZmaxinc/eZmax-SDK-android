/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.SubnetRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/subnet/{pkiSubnetID}
 **/
@ApiModel(description = "Request for PUT /1/object/subnet/{pkiSubnetID}")
public class SubnetEditObjectV1Request {
  
  @SerializedName("objSubnet")
  private SubnetRequestCompound objSubnet = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SubnetRequestCompound getObjSubnet() {
    return objSubnet;
  }
  public void setObjSubnet(SubnetRequestCompound objSubnet) {
    this.objSubnet = objSubnet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubnetEditObjectV1Request subnetEditObjectV1Request = (SubnetEditObjectV1Request) o;
    return (this.objSubnet == null ? subnetEditObjectV1Request.objSubnet == null : this.objSubnet.equals(subnetEditObjectV1Request.objSubnet));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objSubnet == null ? 0: this.objSubnet.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubnetEditObjectV1Request {\n");
    
    sb.append("  objSubnet: ").append(objSubnet).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
