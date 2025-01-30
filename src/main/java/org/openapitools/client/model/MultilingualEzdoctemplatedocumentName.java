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
 * The name1 of the Ezdoctemplatedocument
 **/
@ApiModel(description = "The name1 of the Ezdoctemplatedocument")
public class MultilingualEzdoctemplatedocumentName {
  
  @SerializedName("sEzdoctemplatedocumentName1")
  private String sEzdoctemplatedocumentName1 = null;
  @SerializedName("sEzdoctemplatedocumentName2")
  private String sEzdoctemplatedocumentName2 = null;

  /**
   * The name1 of the Ezdoctemplatedocument
   **/
  @ApiModelProperty(value = "The name1 of the Ezdoctemplatedocument")
  public String getSEzdoctemplatedocumentName1() {
    return sEzdoctemplatedocumentName1;
  }
  public void setSEzdoctemplatedocumentName1(String sEzdoctemplatedocumentName1) {
    this.sEzdoctemplatedocumentName1 = sEzdoctemplatedocumentName1;
  }

  /**
   * The name2 of the Ezdoctemplatedocument
   **/
  @ApiModelProperty(value = "The name2 of the Ezdoctemplatedocument")
  public String getSEzdoctemplatedocumentName2() {
    return sEzdoctemplatedocumentName2;
  }
  public void setSEzdoctemplatedocumentName2(String sEzdoctemplatedocumentName2) {
    this.sEzdoctemplatedocumentName2 = sEzdoctemplatedocumentName2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualEzdoctemplatedocumentName multilingualEzdoctemplatedocumentName = (MultilingualEzdoctemplatedocumentName) o;
    return (this.sEzdoctemplatedocumentName1 == null ? multilingualEzdoctemplatedocumentName.sEzdoctemplatedocumentName1 == null : this.sEzdoctemplatedocumentName1.equals(multilingualEzdoctemplatedocumentName.sEzdoctemplatedocumentName1)) &&
        (this.sEzdoctemplatedocumentName2 == null ? multilingualEzdoctemplatedocumentName.sEzdoctemplatedocumentName2 == null : this.sEzdoctemplatedocumentName2.equals(multilingualEzdoctemplatedocumentName.sEzdoctemplatedocumentName2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sEzdoctemplatedocumentName1 == null ? 0: this.sEzdoctemplatedocumentName1.hashCode());
    result = 31 * result + (this.sEzdoctemplatedocumentName2 == null ? 0: this.sEzdoctemplatedocumentName2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualEzdoctemplatedocumentName {\n");
    
    sb.append("  sEzdoctemplatedocumentName1: ").append(sEzdoctemplatedocumentName1).append("\n");
    sb.append("  sEzdoctemplatedocumentName2: ").append(sEzdoctemplatedocumentName2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
