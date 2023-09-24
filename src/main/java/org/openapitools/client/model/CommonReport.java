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
import org.openapitools.client.model.CommonReportsection;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Report containing Reportsections 
 **/
@ApiModel(description = "A Report containing Reportsections ")
public class CommonReport {
  
  @SerializedName("a_objReportsection")
  private List<CommonReportsection> aObjReportsection = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<CommonReportsection> getAObjReportsection() {
    return aObjReportsection;
  }
  public void setAObjReportsection(List<CommonReportsection> aObjReportsection) {
    this.aObjReportsection = aObjReportsection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonReport commonReport = (CommonReport) o;
    return (this.aObjReportsection == null ? commonReport.aObjReportsection == null : this.aObjReportsection.equals(commonReport.aObjReportsection));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjReportsection == null ? 0: this.aObjReportsection.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonReport {\n");
    
    sb.append("  aObjReportsection: ").append(aObjReportsection).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
