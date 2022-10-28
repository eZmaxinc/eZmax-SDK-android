/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.EzsigntemplatepackagemembershipRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/ezsigntemplatepackagemembership
 **/
@ApiModel(description = "Request for POST /1/object/ezsigntemplatepackagemembership")
public class EzsigntemplatepackagemembershipCreateObjectV1Request {
  
  @SerializedName("a_objEzsigntemplatepackagemembership")
  private List<EzsigntemplatepackagemembershipRequestCompound> aObjEzsigntemplatepackagemembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzsigntemplatepackagemembershipRequestCompound> getAObjEzsigntemplatepackagemembership() {
    return aObjEzsigntemplatepackagemembership;
  }
  public void setAObjEzsigntemplatepackagemembership(List<EzsigntemplatepackagemembershipRequestCompound> aObjEzsigntemplatepackagemembership) {
    this.aObjEzsigntemplatepackagemembership = aObjEzsigntemplatepackagemembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatepackagemembershipCreateObjectV1Request ezsigntemplatepackagemembershipCreateObjectV1Request = (EzsigntemplatepackagemembershipCreateObjectV1Request) o;
    return (this.aObjEzsigntemplatepackagemembership == null ? ezsigntemplatepackagemembershipCreateObjectV1Request.aObjEzsigntemplatepackagemembership == null : this.aObjEzsigntemplatepackagemembership.equals(ezsigntemplatepackagemembershipCreateObjectV1Request.aObjEzsigntemplatepackagemembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjEzsigntemplatepackagemembership == null ? 0: this.aObjEzsigntemplatepackagemembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatepackagemembershipCreateObjectV1Request {\n");
    
    sb.append("  aObjEzsigntemplatepackagemembership: ").append(aObjEzsigntemplatepackagemembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
