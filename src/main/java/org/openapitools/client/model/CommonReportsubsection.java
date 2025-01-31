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

import org.openapitools.client.model.CommonReportsubsectionpart;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Subsection in a Reportsection. It contains 3 Reportsubsectionparts (Header, Body and Footer) 
 **/
@ApiModel(description = "A Subsection in a Reportsection. It contains 3 Reportsubsectionparts (Header, Body and Footer) ")
public class CommonReportsubsection {
  
  @SerializedName("objReportsubsectionpartHeader")
  private CommonReportsubsectionpart objReportsubsectionpartHeader = null;
  @SerializedName("objReportsubsectionpartBody")
  private CommonReportsubsectionpart objReportsubsectionpartBody = null;
  @SerializedName("objReportsubsectionpartFooter")
  private CommonReportsubsectionpart objReportsubsectionpartFooter = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonReportsubsectionpart getObjReportsubsectionpartHeader() {
    return objReportsubsectionpartHeader;
  }
  public void setObjReportsubsectionpartHeader(CommonReportsubsectionpart objReportsubsectionpartHeader) {
    this.objReportsubsectionpartHeader = objReportsubsectionpartHeader;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonReportsubsectionpart getObjReportsubsectionpartBody() {
    return objReportsubsectionpartBody;
  }
  public void setObjReportsubsectionpartBody(CommonReportsubsectionpart objReportsubsectionpartBody) {
    this.objReportsubsectionpartBody = objReportsubsectionpartBody;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CommonReportsubsectionpart getObjReportsubsectionpartFooter() {
    return objReportsubsectionpartFooter;
  }
  public void setObjReportsubsectionpartFooter(CommonReportsubsectionpart objReportsubsectionpartFooter) {
    this.objReportsubsectionpartFooter = objReportsubsectionpartFooter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReportsubsection commonReportsubsection = (CommonReportsubsection) o;
    return (this.objReportsubsectionpartHeader == null ? commonReportsubsection.objReportsubsectionpartHeader == null : this.objReportsubsectionpartHeader.equals(commonReportsubsection.objReportsubsectionpartHeader)) &&
        (this.objReportsubsectionpartBody == null ? commonReportsubsection.objReportsubsectionpartBody == null : this.objReportsubsectionpartBody.equals(commonReportsubsection.objReportsubsectionpartBody)) &&
        (this.objReportsubsectionpartFooter == null ? commonReportsubsection.objReportsubsectionpartFooter == null : this.objReportsubsectionpartFooter.equals(commonReportsubsection.objReportsubsectionpartFooter));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objReportsubsectionpartHeader == null ? 0: this.objReportsubsectionpartHeader.hashCode());
    result = 31 * result + (this.objReportsubsectionpartBody == null ? 0: this.objReportsubsectionpartBody.hashCode());
    result = 31 * result + (this.objReportsubsectionpartFooter == null ? 0: this.objReportsubsectionpartFooter.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReportsubsection {\n");
    
    sb.append("  objReportsubsectionpartHeader: ").append(objReportsubsectionpartHeader).append("\n");
    sb.append("  objReportsubsectionpartBody: ").append(objReportsubsectionpartBody).append("\n");
    sb.append("  objReportsubsectionpartFooter: ").append(objReportsubsectionpartFooter).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
