/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CustomNotificationtestgetnotificationtestsResponseAllOf;
import org.openapitools.client.model.FieldENotificationpreferenceStatus;
import org.openapitools.client.model.MultilingualNotificationtestName;
import org.openapitools.client.model.NotificationtestResponse;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A Notificationtest Object in the context of getNotificationtests
 **/
@ApiModel(description = "A Notificationtest Object in the context of getNotificationtests")
public class CustomNotificationtestgetnotificationtestsResponse {
  
  @SerializedName("pkiNotificationtestID")
  private Integer pkiNotificationtestID = null;
  @SerializedName("objNotificationtestName")
  private MultilingualNotificationtestName objNotificationtestName = null;
  @SerializedName("fkiNotificationsubsectionID")
  private Integer fkiNotificationsubsectionID = null;
  @SerializedName("sNotificationtestFunction")
  private String sNotificationtestFunction = null;
  @SerializedName("sNotificationtestNameX")
  private String sNotificationtestNameX = null;
  @SerializedName("eNotificationpreferenceStatus")
  private FieldENotificationpreferenceStatus eNotificationpreferenceStatus = null;
  @SerializedName("iNotificationtest")
  private Integer iNotificationtest = null;

  /**
   * The unique ID of the Notificationtest
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationtest")
  public Integer getPkiNotificationtestID() {
    return pkiNotificationtestID;
  }
  public void setPkiNotificationtestID(Integer pkiNotificationtestID) {
    this.pkiNotificationtestID = pkiNotificationtestID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public MultilingualNotificationtestName getObjNotificationtestName() {
    return objNotificationtestName;
  }
  public void setObjNotificationtestName(MultilingualNotificationtestName objNotificationtestName) {
    this.objNotificationtestName = objNotificationtestName;
  }

  /**
   * The unique ID of the Notificationsubsection
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "The unique ID of the Notificationsubsection")
  public Integer getFkiNotificationsubsectionID() {
    return fkiNotificationsubsectionID;
  }
  public void setFkiNotificationsubsectionID(Integer fkiNotificationsubsectionID) {
    this.fkiNotificationsubsectionID = fkiNotificationsubsectionID;
  }

  /**
   * The function name of the Notificationtest
   **/
  @ApiModelProperty(required = true, value = "The function name of the Notificationtest")
  public String getSNotificationtestFunction() {
    return sNotificationtestFunction;
  }
  public void setSNotificationtestFunction(String sNotificationtestFunction) {
    this.sNotificationtestFunction = sNotificationtestFunction;
  }

  /**
   * The name of the Notificationtest in the language of the requester
   **/
  @ApiModelProperty(required = true, value = "The name of the Notificationtest in the language of the requester")
  public String getSNotificationtestNameX() {
    return sNotificationtestNameX;
  }
  public void setSNotificationtestNameX(String sNotificationtestNameX) {
    this.sNotificationtestNameX = sNotificationtestNameX;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public FieldENotificationpreferenceStatus getENotificationpreferenceStatus() {
    return eNotificationpreferenceStatus;
  }
  public void setENotificationpreferenceStatus(FieldENotificationpreferenceStatus eNotificationpreferenceStatus) {
    this.eNotificationpreferenceStatus = eNotificationpreferenceStatus;
  }

  /**
   * The number of elements returned by the Notificationtest
   **/
  @ApiModelProperty(required = true, value = "The number of elements returned by the Notificationtest")
  public Integer getINotificationtest() {
    return iNotificationtest;
  }
  public void setINotificationtest(Integer iNotificationtest) {
    this.iNotificationtest = iNotificationtest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNotificationtestgetnotificationtestsResponse customNotificationtestgetnotificationtestsResponse = (CustomNotificationtestgetnotificationtestsResponse) o;
    return (this.pkiNotificationtestID == null ? customNotificationtestgetnotificationtestsResponse.pkiNotificationtestID == null : this.pkiNotificationtestID.equals(customNotificationtestgetnotificationtestsResponse.pkiNotificationtestID)) &&
        (this.objNotificationtestName == null ? customNotificationtestgetnotificationtestsResponse.objNotificationtestName == null : this.objNotificationtestName.equals(customNotificationtestgetnotificationtestsResponse.objNotificationtestName)) &&
        (this.fkiNotificationsubsectionID == null ? customNotificationtestgetnotificationtestsResponse.fkiNotificationsubsectionID == null : this.fkiNotificationsubsectionID.equals(customNotificationtestgetnotificationtestsResponse.fkiNotificationsubsectionID)) &&
        (this.sNotificationtestFunction == null ? customNotificationtestgetnotificationtestsResponse.sNotificationtestFunction == null : this.sNotificationtestFunction.equals(customNotificationtestgetnotificationtestsResponse.sNotificationtestFunction)) &&
        (this.sNotificationtestNameX == null ? customNotificationtestgetnotificationtestsResponse.sNotificationtestNameX == null : this.sNotificationtestNameX.equals(customNotificationtestgetnotificationtestsResponse.sNotificationtestNameX)) &&
        (this.eNotificationpreferenceStatus == null ? customNotificationtestgetnotificationtestsResponse.eNotificationpreferenceStatus == null : this.eNotificationpreferenceStatus.equals(customNotificationtestgetnotificationtestsResponse.eNotificationpreferenceStatus)) &&
        (this.iNotificationtest == null ? customNotificationtestgetnotificationtestsResponse.iNotificationtest == null : this.iNotificationtest.equals(customNotificationtestgetnotificationtestsResponse.iNotificationtest));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pkiNotificationtestID == null ? 0: this.pkiNotificationtestID.hashCode());
    result = 31 * result + (this.objNotificationtestName == null ? 0: this.objNotificationtestName.hashCode());
    result = 31 * result + (this.fkiNotificationsubsectionID == null ? 0: this.fkiNotificationsubsectionID.hashCode());
    result = 31 * result + (this.sNotificationtestFunction == null ? 0: this.sNotificationtestFunction.hashCode());
    result = 31 * result + (this.sNotificationtestNameX == null ? 0: this.sNotificationtestNameX.hashCode());
    result = 31 * result + (this.eNotificationpreferenceStatus == null ? 0: this.eNotificationpreferenceStatus.hashCode());
    result = 31 * result + (this.iNotificationtest == null ? 0: this.iNotificationtest.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNotificationtestgetnotificationtestsResponse {\n");
    
    sb.append("  pkiNotificationtestID: ").append(pkiNotificationtestID).append("\n");
    sb.append("  objNotificationtestName: ").append(objNotificationtestName).append("\n");
    sb.append("  fkiNotificationsubsectionID: ").append(fkiNotificationsubsectionID).append("\n");
    sb.append("  sNotificationtestFunction: ").append(sNotificationtestFunction).append("\n");
    sb.append("  sNotificationtestNameX: ").append(sNotificationtestNameX).append("\n");
    sb.append("  eNotificationpreferenceStatus: ").append(eNotificationpreferenceStatus).append("\n");
    sb.append("  iNotificationtest: ").append(iNotificationtest).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
