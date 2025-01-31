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

import org.openapitools.client.model.DiscussionRequestPatch;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for PATCH /1/object/discussion/{pkiDiscussionID}
 **/
@ApiModel(description = "Request for PATCH /1/object/discussion/{pkiDiscussionID}")
public class DiscussionPatchObjectV1Request {
  
  @SerializedName("objDiscussion")
  private DiscussionRequestPatch objDiscussion = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public DiscussionRequestPatch getObjDiscussion() {
    return objDiscussion;
  }
  public void setObjDiscussion(DiscussionRequestPatch objDiscussion) {
    this.objDiscussion = objDiscussion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionPatchObjectV1Request discussionPatchObjectV1Request = (DiscussionPatchObjectV1Request) o;
    return (this.objDiscussion == null ? discussionPatchObjectV1Request.objDiscussion == null : this.objDiscussion.equals(discussionPatchObjectV1Request.objDiscussion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.objDiscussion == null ? 0: this.objDiscussion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionPatchObjectV1Request {\n");
    
    sb.append("  objDiscussion: ").append(objDiscussion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
