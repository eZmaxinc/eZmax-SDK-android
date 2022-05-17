/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CustomWordPositionOccurenceResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Word Position Object
 **/
@ApiModel(description = "A Word Position Object")
public class CustomWordPositionWordResponse {
  
  @SerializedName("sWord")
  private String sWord = null;
  @SerializedName("a_objWordPositionOccurence")
  private List<CustomWordPositionOccurenceResponse> aObjWordPositionOccurence = null;

  /**
   * The searched word
   **/
  @ApiModelProperty(required = true, value = "The searched word")
  public String getSWord() {
    return sWord;
  }
  public void setSWord(String sWord) {
    this.sWord = sWord;
  }

  /**
   * The found occurences for the seached word
   **/
  @ApiModelProperty(required = true, value = "The found occurences for the seached word")
  public List<CustomWordPositionOccurenceResponse> getAObjWordPositionOccurence() {
    return aObjWordPositionOccurence;
  }
  public void setAObjWordPositionOccurence(List<CustomWordPositionOccurenceResponse> aObjWordPositionOccurence) {
    this.aObjWordPositionOccurence = aObjWordPositionOccurence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomWordPositionWordResponse customWordPositionWordResponse = (CustomWordPositionWordResponse) o;
    return (this.sWord == null ? customWordPositionWordResponse.sWord == null : this.sWord.equals(customWordPositionWordResponse.sWord)) &&
        (this.aObjWordPositionOccurence == null ? customWordPositionWordResponse.aObjWordPositionOccurence == null : this.aObjWordPositionOccurence.equals(customWordPositionWordResponse.aObjWordPositionOccurence));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sWord == null ? 0: this.sWord.hashCode());
    result = 31 * result + (this.aObjWordPositionOccurence == null ? 0: this.aObjWordPositionOccurence.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomWordPositionWordResponse {\n");
    
    sb.append("  sWord: ").append(sWord).append("\n");
    sb.append("  aObjWordPositionOccurence: ").append(aObjWordPositionOccurence).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
