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

import org.openapitools.client.model.CommonReportgroup;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for POST /1/report/xxx/xxx and and /1/module/report/getReportFromCache
 **/
@ApiModel(description = "Payload for POST /1/report/xxx/xxx and and /1/module/report/getReportFromCache")
public class CommonGetReportV1ResponseMPayload {
  
  @SerializedName("objReportgroup")
  private CommonReportgroup objReportgroup = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonReportgroup getObjReportgroup() {
    return objReportgroup;
  }
  public void setObjReportgroup(CommonReportgroup objReportgroup) {
    this.objReportgroup = objReportgroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonGetReportV1ResponseMPayload commonGetReportV1ResponseMPayload = (CommonGetReportV1ResponseMPayload) o;
    return (this.objReportgroup == null ? commonGetReportV1ResponseMPayload.objReportgroup == null : this.objReportgroup.equals(commonGetReportV1ResponseMPayload.objReportgroup));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objReportgroup == null ? 0: this.objReportgroup.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonGetReportV1ResponseMPayload {\n");
    
    sb.append("  objReportgroup: ").append(objReportgroup).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
