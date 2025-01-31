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

import java.util.*;
import org.openapitools.client.model.DiscussionmembershipRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for POST /1/object/discussionmembership
 **/
@ApiModel(description = "Request for POST /1/object/discussionmembership")
public class DiscussionmembershipCreateObjectV1Request {
  
  @SerializedName("a_objDiscussionmembership")
  private List<DiscussionmembershipRequestCompound> aObjDiscussionmembership = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<DiscussionmembershipRequestCompound> getAObjDiscussionmembership() {
    return aObjDiscussionmembership;
  }
  public void setAObjDiscussionmembership(List<DiscussionmembershipRequestCompound> aObjDiscussionmembership) {
    this.aObjDiscussionmembership = aObjDiscussionmembership;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscussionmembershipCreateObjectV1Request discussionmembershipCreateObjectV1Request = (DiscussionmembershipCreateObjectV1Request) o;
    return (this.aObjDiscussionmembership == null ? discussionmembershipCreateObjectV1Request.aObjDiscussionmembership == null : this.aObjDiscussionmembership.equals(discussionmembershipCreateObjectV1Request.aObjDiscussionmembership));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjDiscussionmembership == null ? 0: this.aObjDiscussionmembership.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionmembershipCreateObjectV1Request {\n");
    
    sb.append("  aObjDiscussionmembership: ").append(aObjDiscussionmembership).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
