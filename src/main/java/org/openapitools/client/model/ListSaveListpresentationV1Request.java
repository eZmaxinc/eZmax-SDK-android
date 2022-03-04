/**
 * eZmax API Definition
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.6
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ListpresentationRequestCompound;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Request for the POST /1/module/list/listpresentation/{sListName} API Request
 **/
@ApiModel(description = "Request for the POST /1/module/list/listpresentation/{sListName} API Request")
public class ListSaveListpresentationV1Request {
  
  @SerializedName("a_objListpresentation")
  private List<ListpresentationRequestCompound> aObjListpresentation = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ListpresentationRequestCompound> getAObjListpresentation() {
    return aObjListpresentation;
  }
  public void setAObjListpresentation(List<ListpresentationRequestCompound> aObjListpresentation) {
    this.aObjListpresentation = aObjListpresentation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSaveListpresentationV1Request listSaveListpresentationV1Request = (ListSaveListpresentationV1Request) o;
    return (this.aObjListpresentation == null ? listSaveListpresentationV1Request.aObjListpresentation == null : this.aObjListpresentation.equals(listSaveListpresentationV1Request.aObjListpresentation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjListpresentation == null ? 0: this.aObjListpresentation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSaveListpresentationV1Request {\n");
    
    sb.append("  aObjListpresentation: ").append(aObjListpresentation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
