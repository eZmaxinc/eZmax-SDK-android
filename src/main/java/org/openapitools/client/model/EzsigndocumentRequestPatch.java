/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigndocument Object
 **/
@ApiModel(description = "An Ezsigndocument Object")
public class EzsigndocumentRequestPatch {
  
  @SerializedName("dtEzsigndocumentDuedate")
  private String dtEzsigndocumentDuedate = null;
  @SerializedName("sEzsigndocumentName")
  private String sEzsigndocumentName = null;

  /**
   * The maximum date and time at which the Ezsigndocument can be signed.
   **/
  @ApiModelProperty(value = "The maximum date and time at which the Ezsigndocument can be signed.")
  public String getDtEzsigndocumentDuedate() {
    return dtEzsigndocumentDuedate;
  }
  public void setDtEzsigndocumentDuedate(String dtEzsigndocumentDuedate) {
    this.dtEzsigndocumentDuedate = dtEzsigndocumentDuedate;
  }

  /**
   * The name of the document that will be presented to Ezsignfoldersignerassociations
   **/
  @ApiModelProperty(value = "The name of the document that will be presented to Ezsignfoldersignerassociations")
  public String getSEzsigndocumentName() {
    return sEzsigndocumentName;
  }
  public void setSEzsigndocumentName(String sEzsigndocumentName) {
    this.sEzsigndocumentName = sEzsigndocumentName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigndocumentRequestPatch ezsigndocumentRequestPatch = (EzsigndocumentRequestPatch) o;
    return (this.dtEzsigndocumentDuedate == null ? ezsigndocumentRequestPatch.dtEzsigndocumentDuedate == null : this.dtEzsigndocumentDuedate.equals(ezsigndocumentRequestPatch.dtEzsigndocumentDuedate)) &&
        (this.sEzsigndocumentName == null ? ezsigndocumentRequestPatch.sEzsigndocumentName == null : this.sEzsigndocumentName.equals(ezsigndocumentRequestPatch.sEzsigndocumentName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dtEzsigndocumentDuedate == null ? 0: this.dtEzsigndocumentDuedate.hashCode());
    result = 31 * result + (this.sEzsigndocumentName == null ? 0: this.sEzsigndocumentName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigndocumentRequestPatch {\n");
    
    sb.append("  dtEzsigndocumentDuedate: ").append(dtEzsigndocumentDuedate).append("\n");
    sb.append("  sEzsigndocumentName: ").append(sEzsigndocumentName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
