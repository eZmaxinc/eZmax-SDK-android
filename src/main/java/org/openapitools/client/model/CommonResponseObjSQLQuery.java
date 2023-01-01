/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.17
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
 * Definition of objSQLQuery Object
 **/
@ApiModel(description = "Definition of objSQLQuery Object")
public class CommonResponseObjSQLQuery {
  
  @SerializedName("sQuery")
  private String sQuery = null;
  @SerializedName("fDuration")
  private Float fDuration = null;

  /**
   * The SQL Query
   **/
  @ApiModelProperty(required = true, value = "The SQL Query")
  public String getSQuery() {
    return sQuery;
  }
  public void setSQuery(String sQuery) {
    this.sQuery = sQuery;
  }

  /**
   * Execution time of the SQL Query in seconds
   **/
  @ApiModelProperty(required = true, value = "Execution time of the SQL Query in seconds")
  public Float getFDuration() {
    return fDuration;
  }
  public void setFDuration(Float fDuration) {
    this.fDuration = fDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseObjSQLQuery commonResponseObjSQLQuery = (CommonResponseObjSQLQuery) o;
    return (this.sQuery == null ? commonResponseObjSQLQuery.sQuery == null : this.sQuery.equals(commonResponseObjSQLQuery.sQuery)) &&
        (this.fDuration == null ? commonResponseObjSQLQuery.fDuration == null : this.fDuration.equals(commonResponseObjSQLQuery.fDuration));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sQuery == null ? 0: this.sQuery.hashCode());
    result = 31 * result + (this.fDuration == null ? 0: this.fDuration.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseObjSQLQuery {\n");
    
    sb.append("  sQuery: ").append(sQuery).append("\n");
    sb.append("  fDuration: ").append(fDuration).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
