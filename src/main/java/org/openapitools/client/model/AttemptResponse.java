/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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
 * An Attempt object
 **/
@ApiModel(description = "An Attempt object")
public class AttemptResponse {
  
  @SerializedName("dtAttemptStart")
  private String dtAttemptStart = null;
  @SerializedName("sAttemptResult")
  private String sAttemptResult = null;
  @SerializedName("iAttemptDuration")
  private Integer iAttemptDuration = null;

  /**
   * Represent a Date Time. The timezone is the one configured in the User's profile.
   **/
  @ApiModelProperty(required = true, value = "Represent a Date Time. The timezone is the one configured in the User's profile.")
  public String getDtAttemptStart() {
    return dtAttemptStart;
  }
  public void setDtAttemptStart(String dtAttemptStart) {
    this.dtAttemptStart = dtAttemptStart;
  }

  /**
   * The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.
   **/
  @ApiModelProperty(required = true, value = "The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.")
  public String getSAttemptResult() {
    return sAttemptResult;
  }
  public void setSAttemptResult(String sAttemptResult) {
    this.sAttemptResult = sAttemptResult;
  }

  /**
   * The number of second it took to process the webhook or get an error
   **/
  @ApiModelProperty(required = true, value = "The number of second it took to process the webhook or get an error")
  public Integer getIAttemptDuration() {
    return iAttemptDuration;
  }
  public void setIAttemptDuration(Integer iAttemptDuration) {
    this.iAttemptDuration = iAttemptDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttemptResponse attemptResponse = (AttemptResponse) o;
    return (this.dtAttemptStart == null ? attemptResponse.dtAttemptStart == null : this.dtAttemptStart.equals(attemptResponse.dtAttemptStart)) &&
        (this.sAttemptResult == null ? attemptResponse.sAttemptResult == null : this.sAttemptResult.equals(attemptResponse.sAttemptResult)) &&
        (this.iAttemptDuration == null ? attemptResponse.iAttemptDuration == null : this.iAttemptDuration.equals(attemptResponse.iAttemptDuration));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.dtAttemptStart == null ? 0: this.dtAttemptStart.hashCode());
    result = 31 * result + (this.sAttemptResult == null ? 0: this.sAttemptResult.hashCode());
    result = 31 * result + (this.iAttemptDuration == null ? 0: this.iAttemptDuration.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptResponse {\n");
    
    sb.append("  dtAttemptStart: ").append(dtAttemptStart).append("\n");
    sb.append("  sAttemptResult: ").append(sAttemptResult).append("\n");
    sb.append("  iAttemptDuration: ").append(iAttemptDuration).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
