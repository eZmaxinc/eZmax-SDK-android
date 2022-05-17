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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * An Ezsigntemplatedocumentpage Object
 **/
@ApiModel(description = "An Ezsigntemplatedocumentpage Object")
public class EzsigntemplatedocumentpageResponse {
  
  @SerializedName("pkiEzsigntemplatedocumentpageID")
  private Integer pkiEzsigntemplatedocumentpageID = null;
  @SerializedName("iEzsigntemplatedocumentpageWidthimage")
  private Integer iEzsigntemplatedocumentpageWidthimage = null;
  @SerializedName("iEzsigntemplatedocumentpageHeightimage")
  private Integer iEzsigntemplatedocumentpageHeightimage = null;
  @SerializedName("iEzsigntemplatedocumentpageWidthpdf")
  private Integer iEzsigntemplatedocumentpageWidthpdf = null;
  @SerializedName("iEzsigntemplatedocumentpageHeightpdf")
  private Integer iEzsigntemplatedocumentpageHeightpdf = null;
  @SerializedName("iEzsigntemplatedocumentpagePagenumber")
  private Integer iEzsigntemplatedocumentpagePagenumber = null;
  @SerializedName("sImageUrl")
  private String sImageUrl = null;

  /**
   * The unique ID of the Ezsigntemplatedocumentpage
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Ezsigntemplatedocumentpage")
  public Integer getPkiEzsigntemplatedocumentpageID() {
    return pkiEzsigntemplatedocumentpageID;
  }
  public void setPkiEzsigntemplatedocumentpageID(Integer pkiEzsigntemplatedocumentpageID) {
    this.pkiEzsigntemplatedocumentpageID = pkiEzsigntemplatedocumentpageID;
  }

  /**
   * The Width of the page's image in pixels calculated at 100 DPI
   **/
  @ApiModelProperty(required = true, value = "The Width of the page's image in pixels calculated at 100 DPI")
  public Integer getIEzsigntemplatedocumentpageWidthimage() {
    return iEzsigntemplatedocumentpageWidthimage;
  }
  public void setIEzsigntemplatedocumentpageWidthimage(Integer iEzsigntemplatedocumentpageWidthimage) {
    this.iEzsigntemplatedocumentpageWidthimage = iEzsigntemplatedocumentpageWidthimage;
  }

  /**
   * The Height of the page's image in pixels calculated at 100 DPI
   **/
  @ApiModelProperty(required = true, value = "The Height of the page's image in pixels calculated at 100 DPI")
  public Integer getIEzsigntemplatedocumentpageHeightimage() {
    return iEzsigntemplatedocumentpageHeightimage;
  }
  public void setIEzsigntemplatedocumentpageHeightimage(Integer iEzsigntemplatedocumentpageHeightimage) {
    this.iEzsigntemplatedocumentpageHeightimage = iEzsigntemplatedocumentpageHeightimage;
  }

  /**
   * The Width of the page in points calculated at 72 DPI
   **/
  @ApiModelProperty(required = true, value = "The Width of the page in points calculated at 72 DPI")
  public Integer getIEzsigntemplatedocumentpageWidthpdf() {
    return iEzsigntemplatedocumentpageWidthpdf;
  }
  public void setIEzsigntemplatedocumentpageWidthpdf(Integer iEzsigntemplatedocumentpageWidthpdf) {
    this.iEzsigntemplatedocumentpageWidthpdf = iEzsigntemplatedocumentpageWidthpdf;
  }

  /**
   * The Height of the page in points calculated at 72 DPI
   **/
  @ApiModelProperty(required = true, value = "The Height of the page in points calculated at 72 DPI")
  public Integer getIEzsigntemplatedocumentpageHeightpdf() {
    return iEzsigntemplatedocumentpageHeightpdf;
  }
  public void setIEzsigntemplatedocumentpageHeightpdf(Integer iEzsigntemplatedocumentpageHeightpdf) {
    this.iEzsigntemplatedocumentpageHeightpdf = iEzsigntemplatedocumentpageHeightpdf;
  }

  /**
   * The page number in the Ezsigntemplatedocument
   **/
  @ApiModelProperty(required = true, value = "The page number in the Ezsigntemplatedocument")
  public Integer getIEzsigntemplatedocumentpagePagenumber() {
    return iEzsigntemplatedocumentpagePagenumber;
  }
  public void setIEzsigntemplatedocumentpagePagenumber(Integer iEzsigntemplatedocumentpagePagenumber) {
    this.iEzsigntemplatedocumentpagePagenumber = iEzsigntemplatedocumentpagePagenumber;
  }

  /**
   * The Url to the Ezsigntemplatedocumentpage's rasterized image.  Url will expire after 5 minutes.
   **/
  @ApiModelProperty(required = true, value = "The Url to the Ezsigntemplatedocumentpage's rasterized image.  Url will expire after 5 minutes.")
  public String getSImageUrl() {
    return sImageUrl;
  }
  public void setSImageUrl(String sImageUrl) {
    this.sImageUrl = sImageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EzsigntemplatedocumentpageResponse ezsigntemplatedocumentpageResponse = (EzsigntemplatedocumentpageResponse) o;
    return (this.pkiEzsigntemplatedocumentpageID == null ? ezsigntemplatedocumentpageResponse.pkiEzsigntemplatedocumentpageID == null : this.pkiEzsigntemplatedocumentpageID.equals(ezsigntemplatedocumentpageResponse.pkiEzsigntemplatedocumentpageID)) &&
        (this.iEzsigntemplatedocumentpageWidthimage == null ? ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageWidthimage == null : this.iEzsigntemplatedocumentpageWidthimage.equals(ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageWidthimage)) &&
        (this.iEzsigntemplatedocumentpageHeightimage == null ? ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageHeightimage == null : this.iEzsigntemplatedocumentpageHeightimage.equals(ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageHeightimage)) &&
        (this.iEzsigntemplatedocumentpageWidthpdf == null ? ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageWidthpdf == null : this.iEzsigntemplatedocumentpageWidthpdf.equals(ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageWidthpdf)) &&
        (this.iEzsigntemplatedocumentpageHeightpdf == null ? ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageHeightpdf == null : this.iEzsigntemplatedocumentpageHeightpdf.equals(ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpageHeightpdf)) &&
        (this.iEzsigntemplatedocumentpagePagenumber == null ? ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpagePagenumber == null : this.iEzsigntemplatedocumentpagePagenumber.equals(ezsigntemplatedocumentpageResponse.iEzsigntemplatedocumentpagePagenumber)) &&
        (this.sImageUrl == null ? ezsigntemplatedocumentpageResponse.sImageUrl == null : this.sImageUrl.equals(ezsigntemplatedocumentpageResponse.sImageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiEzsigntemplatedocumentpageID == null ? 0: this.pkiEzsigntemplatedocumentpageID.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpageWidthimage == null ? 0: this.iEzsigntemplatedocumentpageWidthimage.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpageHeightimage == null ? 0: this.iEzsigntemplatedocumentpageHeightimage.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpageWidthpdf == null ? 0: this.iEzsigntemplatedocumentpageWidthpdf.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpageHeightpdf == null ? 0: this.iEzsigntemplatedocumentpageHeightpdf.hashCode());
    result = 31 * result + (this.iEzsigntemplatedocumentpagePagenumber == null ? 0: this.iEzsigntemplatedocumentpagePagenumber.hashCode());
    result = 31 * result + (this.sImageUrl == null ? 0: this.sImageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EzsigntemplatedocumentpageResponse {\n");
    
    sb.append("  pkiEzsigntemplatedocumentpageID: ").append(pkiEzsigntemplatedocumentpageID).append("\n");
    sb.append("  iEzsigntemplatedocumentpageWidthimage: ").append(iEzsigntemplatedocumentpageWidthimage).append("\n");
    sb.append("  iEzsigntemplatedocumentpageHeightimage: ").append(iEzsigntemplatedocumentpageHeightimage).append("\n");
    sb.append("  iEzsigntemplatedocumentpageWidthpdf: ").append(iEzsigntemplatedocumentpageWidthpdf).append("\n");
    sb.append("  iEzsigntemplatedocumentpageHeightpdf: ").append(iEzsigntemplatedocumentpageHeightpdf).append("\n");
    sb.append("  iEzsigntemplatedocumentpagePagenumber: ").append(iEzsigntemplatedocumentpagePagenumber).append("\n");
    sb.append("  sImageUrl: ").append(sImageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
