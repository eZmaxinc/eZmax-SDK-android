/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
 *
 * The version of the OpenAPI document: 1.0.27
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