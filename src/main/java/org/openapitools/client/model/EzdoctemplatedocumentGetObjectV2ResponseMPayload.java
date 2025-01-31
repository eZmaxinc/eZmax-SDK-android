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

import org.openapitools.client.model.EzdoctemplatedocumentResponseCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}
 **/
@ApiModel(description = "Payload for GET /2/object/ezdoctemplatedocument/{pkiEzdoctemplatedocumentID}")
public class EzdoctemplatedocumentGetObjectV2ResponseMPayload {
  
  @SerializedName("objEzdoctemplatedocument")
  private EzdoctemplatedocumentResponseCompound objEzdoctemplatedocument = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public EzdoctemplatedocumentResponseCompound getObjEzdoctemplatedocument() {
    return objEzdoctemplatedocument;
  }
  public void setObjEzdoctemplatedocument(EzdoctemplatedocumentResponseCompound objEzdoctemplatedocument) {
    this.objEzdoctemplatedocument = objEzdoctemplatedocument;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzdoctemplatedocumentGetObjectV2ResponseMPayload ezdoctemplatedocumentGetObjectV2ResponseMPayload = (EzdoctemplatedocumentGetObjectV2ResponseMPayload) o;
    return (this.objEzdoctemplatedocument == null ? ezdoctemplatedocumentGetObjectV2ResponseMPayload.objEzdoctemplatedocument == null : this.objEzdoctemplatedocument.equals(ezdoctemplatedocumentGetObjectV2ResponseMPayload.objEzdoctemplatedocument));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objEzdoctemplatedocument == null ? 0: this.objEzdoctemplatedocument.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzdoctemplatedocumentGetObjectV2ResponseMPayload {\n");
    
    sb.append("  objEzdoctemplatedocument: ").append(objEzdoctemplatedocument).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
