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

import org.openapitools.client.model.SupplyResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/supply/{pkiSupplyID}
 **/
@ApiModel(description = "Payload for GET /2/object/supply/{pkiSupplyID}")
public class SupplyGetObjectV2ResponseMPayload {
  
  @SerializedName("objSupply")
  private SupplyResponseCompound objSupply = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SupplyResponseCompound getObjSupply() {
    return objSupply;
  }
  public void setObjSupply(SupplyResponseCompound objSupply) {
    this.objSupply = objSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupplyGetObjectV2ResponseMPayload supplyGetObjectV2ResponseMPayload = (SupplyGetObjectV2ResponseMPayload) o;
    return (this.objSupply == null ? supplyGetObjectV2ResponseMPayload.objSupply == null : this.objSupply.equals(supplyGetObjectV2ResponseMPayload.objSupply));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objSupply == null ? 0: this.objSupply.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplyGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objSupply: ").append(objSupply).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
