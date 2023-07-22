/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.18
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
 * Description of the Paymentterm
 **/
@ApiModel(description = "Description of the Paymentterm")
public class MultilingualPaymenttermDescription {
  
  @SerializedName("sPaymenttermDescription1")
  private String sPaymenttermDescription1 = null;
  @SerializedName("sPaymenttermDescription2")
  private String sPaymenttermDescription2 = null;

  /**
   * The description of the Paymentterm in French
   **/
  @ApiModelProperty(value = "The description of the Paymentterm in French")
  public String getSPaymenttermDescription1() {
    return sPaymenttermDescription1;
  }
  public void setSPaymenttermDescription1(String sPaymenttermDescription1) {
    this.sPaymenttermDescription1 = sPaymenttermDescription1;
  }

  /**
   * The description of the Paymentterm in English
   **/
  @ApiModelProperty(value = "The description of the Paymentterm in English")
  public String getSPaymenttermDescription2() {
    return sPaymenttermDescription2;
  }
  public void setSPaymenttermDescription2(String sPaymenttermDescription2) {
    this.sPaymenttermDescription2 = sPaymenttermDescription2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualPaymenttermDescription multilingualPaymenttermDescription = (MultilingualPaymenttermDescription) o;
    return (this.sPaymenttermDescription1 == null ? multilingualPaymenttermDescription.sPaymenttermDescription1 == null : this.sPaymenttermDescription1.equals(multilingualPaymenttermDescription.sPaymenttermDescription1)) &&
        (this.sPaymenttermDescription2 == null ? multilingualPaymenttermDescription.sPaymenttermDescription2 == null : this.sPaymenttermDescription2.equals(multilingualPaymenttermDescription.sPaymenttermDescription2));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.sPaymenttermDescription1 == null ? 0: this.sPaymenttermDescription1.hashCode());
    result = 31 * result + (this.sPaymenttermDescription2 == null ? 0: this.sPaymenttermDescription2.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualPaymenttermDescription {\n");
    
    sb.append("  sPaymenttermDescription1: ").append(sPaymenttermDescription1).append("\n");
    sb.append("  sPaymenttermDescription2: ").append(sPaymenttermDescription2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
