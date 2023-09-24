/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.SystemconfigurationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PUT /1/object/systemconfiguration/{pkiSystemconfigurationID}
 **/
@ApiModel(description = "Request for PUT /1/object/systemconfiguration/{pkiSystemconfigurationID}")
public class SystemconfigurationEditObjectV1Request {
  
  @SerializedName("objSystemconfiguration")
  private SystemconfigurationRequestCompound objSystemconfiguration = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SystemconfigurationRequestCompound getObjSystemconfiguration() {
    return objSystemconfiguration;
  }
  public void setObjSystemconfiguration(SystemconfigurationRequestCompound objSystemconfiguration) {
    this.objSystemconfiguration = objSystemconfiguration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemconfigurationEditObjectV1Request systemconfigurationEditObjectV1Request = (SystemconfigurationEditObjectV1Request) o;
    return (this.objSystemconfiguration == null ? systemconfigurationEditObjectV1Request.objSystemconfiguration == null : this.objSystemconfiguration.equals(systemconfigurationEditObjectV1Request.objSystemconfiguration));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objSystemconfiguration == null ? 0: this.objSystemconfiguration.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemconfigurationEditObjectV1Request {\n");
    
    sb.append("  objSystemconfiguration: ").append(objSystemconfiguration).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
