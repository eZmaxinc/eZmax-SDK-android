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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Discussion Object
 **/
@ApiModel(description = "A Discussion Object")
public class DiscussionRequest {
  
  @SerializedName("pkiDiscussionID")
  private Integer pkiDiscussionID = null;
  @SerializedName("sDiscussionDescription")
  private String sDiscussionDescription = null;
  @SerializedName("bDiscussionClosed")
  private Boolean bDiscussionClosed = null;

  /**
   * The unique ID of the Discussion
   * minimum: 0
   * maximum: 16777215
   **/
  @ApiModelProperty(value = "The unique ID of the Discussion")
  public Integer getPkiDiscussionID() {
    return pkiDiscussionID;
  }
  public void setPkiDiscussionID(Integer pkiDiscussionID) {
    this.pkiDiscussionID = pkiDiscussionID;
  }

  /**
   * The description of the Discussion
   **/
  @ApiModelProperty(required = true, value = "The description of the Discussion")
  public String getSDiscussionDescription() {
    return sDiscussionDescription;
  }
  public void setSDiscussionDescription(String sDiscussionDescription) {
    this.sDiscussionDescription = sDiscussionDescription;
  }

  /**
   * Whether if it's an closed
   **/
  @ApiModelProperty(value = "Whether if it's an closed")
  public Boolean getBDiscussionClosed() {
    return bDiscussionClosed;
  }
  public void setBDiscussionClosed(Boolean bDiscussionClosed) {
    this.bDiscussionClosed = bDiscussionClosed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionRequest discussionRequest = (DiscussionRequest) o;
    return (this.pkiDiscussionID == null ? discussionRequest.pkiDiscussionID == null : this.pkiDiscussionID.equals(discussionRequest.pkiDiscussionID)) &&
        (this.sDiscussionDescription == null ? discussionRequest.sDiscussionDescription == null : this.sDiscussionDescription.equals(discussionRequest.sDiscussionDescription)) &&
        (this.bDiscussionClosed == null ? discussionRequest.bDiscussionClosed == null : this.bDiscussionClosed.equals(discussionRequest.bDiscussionClosed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiDiscussionID == null ? 0: this.pkiDiscussionID.hashCode());
    result = 31 * result + (this.sDiscussionDescription == null ? 0: this.sDiscussionDescription.hashCode());
    result = 31 * result + (this.bDiscussionClosed == null ? 0: this.bDiscussionClosed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionRequest {\n");
    
    sb.append("  pkiDiscussionID: ").append(pkiDiscussionID).append("\n");
    sb.append("  sDiscussionDescription: ").append(sDiscussionDescription).append("\n");
    sb.append("  bDiscussionClosed: ").append(bDiscussionClosed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
