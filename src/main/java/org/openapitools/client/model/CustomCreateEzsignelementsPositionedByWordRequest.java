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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A CreateEzsignelementsPositionedByWord object
 **/
@ApiModel(description = "A CreateEzsignelementsPositionedByWord object")
public class CustomCreateEzsignelementsPositionedByWordRequest {
  
  @SerializedName("sCreateezsignelementspositionedbywordPattern")
  private String sCreateezsignelementspositionedbywordPattern = null;
  @SerializedName("iCreateezsignelementspositionedbywordOffsetx")
  private Integer iCreateezsignelementspositionedbywordOffsetx = null;
  @SerializedName("iCreateezsignelementspositionedbywordOffsety")
  private Integer iCreateezsignelementspositionedbywordOffsety = null;
  public enum ECreateezsignelementspositionedbywordOccuranceEnum {
     All,  First,  Last, 
  };
  @SerializedName("eCreateezsignelementspositionedbywordOccurance")
  private ECreateezsignelementspositionedbywordOccuranceEnum eCreateezsignelementspositionedbywordOccurance = null;

  /**
   * The word to search
   **/
  @ApiModelProperty(required = true, value = "The word to search")
  public String getSCreateezsignelementspositionedbywordPattern() {
    return sCreateezsignelementspositionedbywordPattern;
  }
  public void setSCreateezsignelementspositionedbywordPattern(String sCreateezsignelementspositionedbywordPattern) {
    this.sCreateezsignelementspositionedbywordPattern = sCreateezsignelementspositionedbywordPattern;
  }

  /**
   * The X offset
   **/
  @ApiModelProperty(required = true, value = "The X offset")
  public Integer getICreateezsignelementspositionedbywordOffsetx() {
    return iCreateezsignelementspositionedbywordOffsetx;
  }
  public void setICreateezsignelementspositionedbywordOffsetx(Integer iCreateezsignelementspositionedbywordOffsetx) {
    this.iCreateezsignelementspositionedbywordOffsetx = iCreateezsignelementspositionedbywordOffsetx;
  }

  /**
   * The Y offset
   **/
  @ApiModelProperty(required = true, value = "The Y offset")
  public Integer getICreateezsignelementspositionedbywordOffsety() {
    return iCreateezsignelementspositionedbywordOffsety;
  }
  public void setICreateezsignelementspositionedbywordOffsety(Integer iCreateezsignelementspositionedbywordOffsety) {
    this.iCreateezsignelementspositionedbywordOffsety = iCreateezsignelementspositionedbywordOffsety;
  }

  /**
   * The occurance in the search to add the ezsign element
   **/
  @ApiModelProperty(required = true, value = "The occurance in the search to add the ezsign element")
  public ECreateezsignelementspositionedbywordOccuranceEnum getECreateezsignelementspositionedbywordOccurance() {
    return eCreateezsignelementspositionedbywordOccurance;
  }
  public void setECreateezsignelementspositionedbywordOccurance(ECreateezsignelementspositionedbywordOccuranceEnum eCreateezsignelementspositionedbywordOccurance) {
    this.eCreateezsignelementspositionedbywordOccurance = eCreateezsignelementspositionedbywordOccurance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomCreateEzsignelementsPositionedByWordRequest customCreateEzsignelementsPositionedByWordRequest = (CustomCreateEzsignelementsPositionedByWordRequest) o;
    return (this.sCreateezsignelementspositionedbywordPattern == null ? customCreateEzsignelementsPositionedByWordRequest.sCreateezsignelementspositionedbywordPattern == null : this.sCreateezsignelementspositionedbywordPattern.equals(customCreateEzsignelementsPositionedByWordRequest.sCreateezsignelementspositionedbywordPattern)) &&
        (this.iCreateezsignelementspositionedbywordOffsetx == null ? customCreateEzsignelementsPositionedByWordRequest.iCreateezsignelementspositionedbywordOffsetx == null : this.iCreateezsignelementspositionedbywordOffsetx.equals(customCreateEzsignelementsPositionedByWordRequest.iCreateezsignelementspositionedbywordOffsetx)) &&
        (this.iCreateezsignelementspositionedbywordOffsety == null ? customCreateEzsignelementsPositionedByWordRequest.iCreateezsignelementspositionedbywordOffsety == null : this.iCreateezsignelementspositionedbywordOffsety.equals(customCreateEzsignelementsPositionedByWordRequest.iCreateezsignelementspositionedbywordOffsety)) &&
        (this.eCreateezsignelementspositionedbywordOccurance == null ? customCreateEzsignelementsPositionedByWordRequest.eCreateezsignelementspositionedbywordOccurance == null : this.eCreateezsignelementspositionedbywordOccurance.equals(customCreateEzsignelementsPositionedByWordRequest.eCreateezsignelementspositionedbywordOccurance));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sCreateezsignelementspositionedbywordPattern == null ? 0: this.sCreateezsignelementspositionedbywordPattern.hashCode());
    result = 31 * result + (this.iCreateezsignelementspositionedbywordOffsetx == null ? 0: this.iCreateezsignelementspositionedbywordOffsetx.hashCode());
    result = 31 * result + (this.iCreateezsignelementspositionedbywordOffsety == null ? 0: this.iCreateezsignelementspositionedbywordOffsety.hashCode());
    result = 31 * result + (this.eCreateezsignelementspositionedbywordOccurance == null ? 0: this.eCreateezsignelementspositionedbywordOccurance.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomCreateEzsignelementsPositionedByWordRequest {\n");
    
    sb.append("  sCreateezsignelementspositionedbywordPattern: ").append(sCreateezsignelementspositionedbywordPattern).append("\n");
    sb.append("  iCreateezsignelementspositionedbywordOffsetx: ").append(iCreateezsignelementspositionedbywordOffsetx).append("\n");
    sb.append("  iCreateezsignelementspositionedbywordOffsety: ").append(iCreateezsignelementspositionedbywordOffsety).append("\n");
    sb.append("  eCreateezsignelementspositionedbywordOccurance: ").append(eCreateezsignelementspositionedbywordOccurance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}