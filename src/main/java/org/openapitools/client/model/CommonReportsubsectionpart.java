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

import java.util.*;
import org.openapitools.client.model.CommonReportrow;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A part in the Reportsubsection 
 **/
@ApiModel(description = "A part in the Reportsubsection ")
public class CommonReportsubsectionpart {
  
  public enum EReportsubsectionpartTypeEnum {
     Header,  Body,  Footer, 
  };
  @SerializedName("eReportsubsectionpartType")
  private EReportsubsectionpartTypeEnum eReportsubsectionpartType = null;
  @SerializedName("a_objReportrow")
  private List<CommonReportrow> aObjReportrow = null;

  /**
   * The type of the Reportsubsectionpart
   **/
  @ApiModelProperty(required = true, value = "The type of the Reportsubsectionpart")
  public EReportsubsectionpartTypeEnum getEReportsubsectionpartType() {
    return eReportsubsectionpartType;
  }
  public void setEReportsubsectionpartType(EReportsubsectionpartTypeEnum eReportsubsectionpartType) {
    this.eReportsubsectionpartType = eReportsubsectionpartType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommonReportrow> getAObjReportrow() {
    return aObjReportrow;
  }
  public void setAObjReportrow(List<CommonReportrow> aObjReportrow) {
    this.aObjReportrow = aObjReportrow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReportsubsectionpart commonReportsubsectionpart = (CommonReportsubsectionpart) o;
    return (this.eReportsubsectionpartType == null ? commonReportsubsectionpart.eReportsubsectionpartType == null : this.eReportsubsectionpartType.equals(commonReportsubsectionpart.eReportsubsectionpartType)) &&
        (this.aObjReportrow == null ? commonReportsubsectionpart.aObjReportrow == null : this.aObjReportrow.equals(commonReportsubsectionpart.aObjReportrow));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.eReportsubsectionpartType == null ? 0: this.eReportsubsectionpartType.hashCode());
    result = 31 * result + (this.aObjReportrow == null ? 0: this.aObjReportrow.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReportsubsectionpart {\n");
    
    sb.append("  eReportsubsectionpartType: ").append(eReportsubsectionpartType).append("\n");
    sb.append("  aObjReportrow: ").append(aObjReportrow).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
