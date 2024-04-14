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
import org.openapitools.client.model.EzmaxinvoicingsummaryinternaldetailResponseCompound;
import org.openapitools.client.model.MultilingualEzmaxinvoicingsummaryinternalDescription;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Ezmaxinvoicingsummaryinternal Object
 **/
@ApiModel(description = "A Ezmaxinvoicingsummaryinternal Object")
public class EzmaxinvoicingsummaryinternalResponseCompound {
  
  @SerializedName("pkiEzmaxinvoicingsummaryinternalID")
  private Integer pkiEzmaxinvoicingsummaryinternalID = null;
  @SerializedName("objEzmaxinvoicingsummaryinternalDescription")
  private MultilingualEzmaxinvoicingsummaryinternalDescription objEzmaxinvoicingsummaryinternalDescription = null;
  @SerializedName("sEzmaxinvoicingsummaryinternalDescriptionX")
  private String sEzmaxinvoicingsummaryinternalDescriptionX = null;
  @SerializedName("fkiEzmaxinvoicingID")
  private Integer fkiEzmaxinvoicingID = null;
  @SerializedName("fkiBillingentityinternalID")
  private Integer fkiBillingentityinternalID = null;
  @SerializedName("sBillingentityinternalDescriptionX")
  private String sBillingentityinternalDescriptionX = null;
  @SerializedName("a_objEzmaxinvoicingsummaryinternaldetail")
  private List<EzmaxinvoicingsummaryinternaldetailResponseCompound> aObjEzmaxinvoicingsummaryinternaldetail = null;

  /**
   * The unique ID of the Ezmaxinvoicingsummaryinternal
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicingsummaryinternal")
  public Integer getPkiEzmaxinvoicingsummaryinternalID() {
    return pkiEzmaxinvoicingsummaryinternalID;
  }
  public void setPkiEzmaxinvoicingsummaryinternalID(Integer pkiEzmaxinvoicingsummaryinternalID) {
    this.pkiEzmaxinvoicingsummaryinternalID = pkiEzmaxinvoicingsummaryinternalID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualEzmaxinvoicingsummaryinternalDescription getObjEzmaxinvoicingsummaryinternalDescription() {
    return objEzmaxinvoicingsummaryinternalDescription;
  }
  public void setObjEzmaxinvoicingsummaryinternalDescription(MultilingualEzmaxinvoicingsummaryinternalDescription objEzmaxinvoicingsummaryinternalDescription) {
    this.objEzmaxinvoicingsummaryinternalDescription = objEzmaxinvoicingsummaryinternalDescription;
  }

  /**
   * The Ezmaxinvoicingsummaryinternal description in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The Ezmaxinvoicingsummaryinternal description in the language of the requester")
  public String getSEzmaxinvoicingsummaryinternalDescriptionX() {
    return sEzmaxinvoicingsummaryinternalDescriptionX;
  }
  public void setSEzmaxinvoicingsummaryinternalDescriptionX(String sEzmaxinvoicingsummaryinternalDescriptionX) {
    this.sEzmaxinvoicingsummaryinternalDescriptionX = sEzmaxinvoicingsummaryinternalDescriptionX;
  }

  /**
   * The unique ID of the Ezmaxinvoicing
   * minimum: 0
   **/
  @ApiModelProperty(value = "The unique ID of the Ezmaxinvoicing")
  public Integer getFkiEzmaxinvoicingID() {
    return fkiEzmaxinvoicingID;
  }
  public void setFkiEzmaxinvoicingID(Integer fkiEzmaxinvoicingID) {
    this.fkiEzmaxinvoicingID = fkiEzmaxinvoicingID;
  }

  /**
   * The unique ID of the Billingentityinternal.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Billingentityinternal.")
  public Integer getFkiBillingentityinternalID() {
    return fkiBillingentityinternalID;
  }
  public void setFkiBillingentityinternalID(Integer fkiBillingentityinternalID) {
    this.fkiBillingentityinternalID = fkiBillingentityinternalID;
  }

  /**
   * The description of the Billingentityinternal in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The description of the Billingentityinternal in the language of the requester")
  public String getSBillingentityinternalDescriptionX() {
    return sBillingentityinternalDescriptionX;
  }
  public void setSBillingentityinternalDescriptionX(String sBillingentityinternalDescriptionX) {
    this.sBillingentityinternalDescriptionX = sBillingentityinternalDescriptionX;
  }

  /**
   * 
   **/
  @ApiModelProperty(required = true, value = "")
  public List<EzmaxinvoicingsummaryinternaldetailResponseCompound> getAObjEzmaxinvoicingsummaryinternaldetail() {
    return aObjEzmaxinvoicingsummaryinternaldetail;
  }
  public void setAObjEzmaxinvoicingsummaryinternaldetail(List<EzmaxinvoicingsummaryinternaldetailResponseCompound> aObjEzmaxinvoicingsummaryinternaldetail) {
    this.aObjEzmaxinvoicingsummaryinternaldetail = aObjEzmaxinvoicingsummaryinternaldetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzmaxinvoicingsummaryinternalResponseCompound ezmaxinvoicingsummaryinternalResponseCompound = (EzmaxinvoicingsummaryinternalResponseCompound) o;
    return (this.pkiEzmaxinvoicingsummaryinternalID == null ? ezmaxinvoicingsummaryinternalResponseCompound.pkiEzmaxinvoicingsummaryinternalID == null : this.pkiEzmaxinvoicingsummaryinternalID.equals(ezmaxinvoicingsummaryinternalResponseCompound.pkiEzmaxinvoicingsummaryinternalID)) &&
        (this.objEzmaxinvoicingsummaryinternalDescription == null ? ezmaxinvoicingsummaryinternalResponseCompound.objEzmaxinvoicingsummaryinternalDescription == null : this.objEzmaxinvoicingsummaryinternalDescription.equals(ezmaxinvoicingsummaryinternalResponseCompound.objEzmaxinvoicingsummaryinternalDescription)) &&
        (this.sEzmaxinvoicingsummaryinternalDescriptionX == null ? ezmaxinvoicingsummaryinternalResponseCompound.sEzmaxinvoicingsummaryinternalDescriptionX == null : this.sEzmaxinvoicingsummaryinternalDescriptionX.equals(ezmaxinvoicingsummaryinternalResponseCompound.sEzmaxinvoicingsummaryinternalDescriptionX)) &&
        (this.fkiEzmaxinvoicingID == null ? ezmaxinvoicingsummaryinternalResponseCompound.fkiEzmaxinvoicingID == null : this.fkiEzmaxinvoicingID.equals(ezmaxinvoicingsummaryinternalResponseCompound.fkiEzmaxinvoicingID)) &&
        (this.fkiBillingentityinternalID == null ? ezmaxinvoicingsummaryinternalResponseCompound.fkiBillingentityinternalID == null : this.fkiBillingentityinternalID.equals(ezmaxinvoicingsummaryinternalResponseCompound.fkiBillingentityinternalID)) &&
        (this.sBillingentityinternalDescriptionX == null ? ezmaxinvoicingsummaryinternalResponseCompound.sBillingentityinternalDescriptionX == null : this.sBillingentityinternalDescriptionX.equals(ezmaxinvoicingsummaryinternalResponseCompound.sBillingentityinternalDescriptionX)) &&
        (this.aObjEzmaxinvoicingsummaryinternaldetail == null ? ezmaxinvoicingsummaryinternalResponseCompound.aObjEzmaxinvoicingsummaryinternaldetail == null : this.aObjEzmaxinvoicingsummaryinternaldetail.equals(ezmaxinvoicingsummaryinternalResponseCompound.aObjEzmaxinvoicingsummaryinternaldetail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzmaxinvoicingsummaryinternalID == null ? 0: this.pkiEzmaxinvoicingsummaryinternalID.hashCode());
    result = 31 * result + (this.objEzmaxinvoicingsummaryinternalDescription == null ? 0: this.objEzmaxinvoicingsummaryinternalDescription.hashCode());
    result = 31 * result + (this.sEzmaxinvoicingsummaryinternalDescriptionX == null ? 0: this.sEzmaxinvoicingsummaryinternalDescriptionX.hashCode());
    result = 31 * result + (this.fkiEzmaxinvoicingID == null ? 0: this.fkiEzmaxinvoicingID.hashCode());
    result = 31 * result + (this.fkiBillingentityinternalID == null ? 0: this.fkiBillingentityinternalID.hashCode());
    result = 31 * result + (this.sBillingentityinternalDescriptionX == null ? 0: this.sBillingentityinternalDescriptionX.hashCode());
    result = 31 * result + (this.aObjEzmaxinvoicingsummaryinternaldetail == null ? 0: this.aObjEzmaxinvoicingsummaryinternaldetail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzmaxinvoicingsummaryinternalResponseCompound {\n");
    
    sb.append("  pkiEzmaxinvoicingsummaryinternalID: ").append(pkiEzmaxinvoicingsummaryinternalID).append("\n");
    sb.append("  objEzmaxinvoicingsummaryinternalDescription: ").append(objEzmaxinvoicingsummaryinternalDescription).append("\n");
    sb.append("  sEzmaxinvoicingsummaryinternalDescriptionX: ").append(sEzmaxinvoicingsummaryinternalDescriptionX).append("\n");
    sb.append("  fkiEzmaxinvoicingID: ").append(fkiEzmaxinvoicingID).append("\n");
    sb.append("  fkiBillingentityinternalID: ").append(fkiBillingentityinternalID).append("\n");
    sb.append("  sBillingentityinternalDescriptionX: ").append(sBillingentityinternalDescriptionX).append("\n");
    sb.append("  aObjEzmaxinvoicingsummaryinternaldetail: ").append(aObjEzmaxinvoicingsummaryinternaldetail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
