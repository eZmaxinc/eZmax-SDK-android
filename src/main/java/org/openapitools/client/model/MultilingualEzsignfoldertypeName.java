/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.2.2
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
 * Name of the Ezsignfoldertype
 **/
@ApiModel(description = "Name of the Ezsignfoldertype")
public class MultilingualEzsignfoldertypeName {
  
  @SerializedName("sEzsignfoldertypeName1")
  private String sEzsignfoldertypeName1 = null;
  @SerializedName("sEzsignfoldertypeName2")
  private String sEzsignfoldertypeName2 = null;

  /**
   * The name of the Ezsignfoldertype in French
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in French")
  public String getSEzsignfoldertypeName1() {
    return sEzsignfoldertypeName1;
  }
  public void setSEzsignfoldertypeName1(String sEzsignfoldertypeName1) {
    this.sEzsignfoldertypeName1 = sEzsignfoldertypeName1;
  }

  /**
   * The name of the Ezsignfoldertype in English
   **/
  @ApiModelProperty(value = "The name of the Ezsignfoldertype in English")
  public String getSEzsignfoldertypeName2() {
    return sEzsignfoldertypeName2;
  }
  public void setSEzsignfoldertypeName2(String sEzsignfoldertypeName2) {
    this.sEzsignfoldertypeName2 = sEzsignfoldertypeName2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualEzsignfoldertypeName multilingualEzsignfoldertypeName = (MultilingualEzsignfoldertypeName) o;
    return (this.sEzsignfoldertypeName1 == null ? multilingualEzsignfoldertypeName.sEzsignfoldertypeName1 == null : this.sEzsignfoldertypeName1.equals(multilingualEzsignfoldertypeName.sEzsignfoldertypeName1)) &&
        (this.sEzsignfoldertypeName2 == null ? multilingualEzsignfoldertypeName.sEzsignfoldertypeName2 == null : this.sEzsignfoldertypeName2.equals(multilingualEzsignfoldertypeName.sEzsignfoldertypeName2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzsignfoldertypeName1 == null ? 0: this.sEzsignfoldertypeName1.hashCode());
    result = 31 * result + (this.sEzsignfoldertypeName2 == null ? 0: this.sEzsignfoldertypeName2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualEzsignfoldertypeName {\n");
    
    sb.append("  sEzsignfoldertypeName1: ").append(sEzsignfoldertypeName1).append("\n");
    sb.append("  sEzsignfoldertypeName2: ").append(sEzsignfoldertypeName2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
