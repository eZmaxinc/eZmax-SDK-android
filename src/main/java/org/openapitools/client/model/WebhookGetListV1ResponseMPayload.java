/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.CommonGetListV1ResponseMPayload;
import org.openapitools.client.model.WebhookGetListV1ResponseMPayloadAllOf;
import org.openapitools.client.model.WebhookListElement;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Payload for GET /1/object/webhook/getList
 **/
@ApiModel(description = "Payload for GET /1/object/webhook/getList")
public class WebhookGetListV1ResponseMPayload {
  
  @SerializedName("a_objWebhook")
  private List<WebhookListElement> aObjWebhook = null;
  @SerializedName("iRowReturned")
  private Integer iRowReturned = null;
  @SerializedName("iRowFiltered")
  private Integer iRowFiltered = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<WebhookListElement> getAObjWebhook() {
    return aObjWebhook;
  }
  public void setAObjWebhook(List<WebhookListElement> aObjWebhook) {
    this.aObjWebhook = aObjWebhook;
  }

  /**
   * The number of rows returned
   **/
  @ApiModelProperty(required = true, value = "The number of rows returned")
  public Integer getIRowReturned() {
    return iRowReturned;
  }
  public void setIRowReturned(Integer iRowReturned) {
    this.iRowReturned = iRowReturned;
  }

  /**
   * The number of rows matching your filters (if any) or the total number of rows
   **/
  @ApiModelProperty(required = true, value = "The number of rows matching your filters (if any) or the total number of rows")
  public Integer getIRowFiltered() {
    return iRowFiltered;
  }
  public void setIRowFiltered(Integer iRowFiltered) {
    this.iRowFiltered = iRowFiltered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookGetListV1ResponseMPayload webhookGetListV1ResponseMPayload = (WebhookGetListV1ResponseMPayload) o;
    return (this.aObjWebhook == null ? webhookGetListV1ResponseMPayload.aObjWebhook == null : this.aObjWebhook.equals(webhookGetListV1ResponseMPayload.aObjWebhook)) &&
        (this.iRowReturned == null ? webhookGetListV1ResponseMPayload.iRowReturned == null : this.iRowReturned.equals(webhookGetListV1ResponseMPayload.iRowReturned)) &&
        (this.iRowFiltered == null ? webhookGetListV1ResponseMPayload.iRowFiltered == null : this.iRowFiltered.equals(webhookGetListV1ResponseMPayload.iRowFiltered));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aObjWebhook == null ? 0: this.aObjWebhook.hashCode());
    result = 31 * result + (this.iRowReturned == null ? 0: this.iRowReturned.hashCode());
    result = 31 * result + (this.iRowFiltered == null ? 0: this.iRowFiltered.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookGetListV1ResponseMPayload {\n");
    
    sb.append("  aObjWebhook: ").append(aObjWebhook).append("\n");
    sb.append("  iRowReturned: ").append(iRowReturned).append("\n");
    sb.append("  iRowFiltered: ").append(iRowFiltered).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
