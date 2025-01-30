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

import org.openapitools.client.model.FieldEVariableexpenseTaxable;
import org.openapitools.client.model.MultilingualVariableexpenseDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Variableexpense Object
 **/
@ApiModel(description = "A Variableexpense Object")
public class VariableexpenseResponseCompound {
  
  @SerializedName("pkiVariableexpenseID")
  private Integer pkiVariableexpenseID = null;
  @SerializedName("sVariableexpenseCode")
  private String sVariableexpenseCode = null;
  @SerializedName("objVariableexpenseDescription")
  private MultilingualVariableexpenseDescription objVariableexpenseDescription = null;
  @SerializedName("eVariableexpenseTaxable")
  private FieldEVariableexpenseTaxable eVariableexpenseTaxable = null;
  @SerializedName("bVariableexpenseIsactive")
  private Boolean bVariableexpenseIsactive = null;

  /**
   * The unique ID of the Variableexpense
   * minimum: 1
   * maximum: 255
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Variableexpense")
  public Integer getPkiVariableexpenseID() {
    return pkiVariableexpenseID;
  }
  public void setPkiVariableexpenseID(Integer pkiVariableexpenseID) {
    this.pkiVariableexpenseID = pkiVariableexpenseID;
  }

  /**
   * The code of the Variableexpense
   **/
  @ApiModelProperty(value = "The code of the Variableexpense")
  public String getSVariableexpenseCode() {
    return sVariableexpenseCode;
  }
  public void setSVariableexpenseCode(String sVariableexpenseCode) {
    this.sVariableexpenseCode = sVariableexpenseCode;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualVariableexpenseDescription getObjVariableexpenseDescription() {
    return objVariableexpenseDescription;
  }
  public void setObjVariableexpenseDescription(MultilingualVariableexpenseDescription objVariableexpenseDescription) {
    this.objVariableexpenseDescription = objVariableexpenseDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FieldEVariableexpenseTaxable getEVariableexpenseTaxable() {
    return eVariableexpenseTaxable;
  }
  public void setEVariableexpenseTaxable(FieldEVariableexpenseTaxable eVariableexpenseTaxable) {
    this.eVariableexpenseTaxable = eVariableexpenseTaxable;
  }

  /**
   * Whether the variableexpense is active or not
   **/
  @ApiModelProperty(value = "Whether the variableexpense is active or not")
  public Boolean getBVariableexpenseIsactive() {
    return bVariableexpenseIsactive;
  }
  public void setBVariableexpenseIsactive(Boolean bVariableexpenseIsactive) {
    this.bVariableexpenseIsactive = bVariableexpenseIsactive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableexpenseResponseCompound variableexpenseResponseCompound = (VariableexpenseResponseCompound) o;
    return (this.pkiVariableexpenseID == null ? variableexpenseResponseCompound.pkiVariableexpenseID == null : this.pkiVariableexpenseID.equals(variableexpenseResponseCompound.pkiVariableexpenseID)) &&
        (this.sVariableexpenseCode == null ? variableexpenseResponseCompound.sVariableexpenseCode == null : this.sVariableexpenseCode.equals(variableexpenseResponseCompound.sVariableexpenseCode)) &&
        (this.objVariableexpenseDescription == null ? variableexpenseResponseCompound.objVariableexpenseDescription == null : this.objVariableexpenseDescription.equals(variableexpenseResponseCompound.objVariableexpenseDescription)) &&
        (this.eVariableexpenseTaxable == null ? variableexpenseResponseCompound.eVariableexpenseTaxable == null : this.eVariableexpenseTaxable.equals(variableexpenseResponseCompound.eVariableexpenseTaxable)) &&
        (this.bVariableexpenseIsactive == null ? variableexpenseResponseCompound.bVariableexpenseIsactive == null : this.bVariableexpenseIsactive.equals(variableexpenseResponseCompound.bVariableexpenseIsactive));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiVariableexpenseID == null ? 0: this.pkiVariableexpenseID.hashCode());
    result = 31 * result + (this.sVariableexpenseCode == null ? 0: this.sVariableexpenseCode.hashCode());
    result = 31 * result + (this.objVariableexpenseDescription == null ? 0: this.objVariableexpenseDescription.hashCode());
    result = 31 * result + (this.eVariableexpenseTaxable == null ? 0: this.eVariableexpenseTaxable.hashCode());
    result = 31 * result + (this.bVariableexpenseIsactive == null ? 0: this.bVariableexpenseIsactive.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableexpenseResponseCompound {\n");
    
    sb.append("  pkiVariableexpenseID: ").append(pkiVariableexpenseID).append("\n");
    sb.append("  sVariableexpenseCode: ").append(sVariableexpenseCode).append("\n");
    sb.append("  objVariableexpenseDescription: ").append(objVariableexpenseDescription).append("\n");
    sb.append("  eVariableexpenseTaxable: ").append(eVariableexpenseTaxable).append("\n");
    sb.append("  bVariableexpenseIsactive: ").append(bVariableexpenseIsactive).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
