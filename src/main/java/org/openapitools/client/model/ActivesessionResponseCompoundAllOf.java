/**
 * eZmax API Definition (Full)
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
 * Contact: support-api@ezmax.ca
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ActivesessionResponseCompoundApikey;
import org.openapitools.client.model.ActivesessionResponseCompoundUser;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ActivesessionResponseCompoundAllOf {
  
  @SerializedName("a_pkiPermissionID")
  private List<Integer> aPkiPermissionID = null;
  @SerializedName("objUserReal")
  private ActivesessionResponseCompoundUser objUserReal = null;
  @SerializedName("objUserCloned")
  private ActivesessionResponseCompoundUser objUserCloned = null;
  @SerializedName("objApikey")
  private ActivesessionResponseCompoundApikey objApikey = null;
  @SerializedName("a_eModuleInternalname")
  private List<String> aEModuleInternalname = null;

  /**
   * An array of permissions granted to the user or api key
   **/
  @ApiModelProperty(required = true, value = "An array of permissions granted to the user or api key")
  public List<Integer> getAPkiPermissionID() {
    return aPkiPermissionID;
  }
  public void setAPkiPermissionID(List<Integer> aPkiPermissionID) {
    this.aPkiPermissionID = aPkiPermissionID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ActivesessionResponseCompoundUser getObjUserReal() {
    return objUserReal;
  }
  public void setObjUserReal(ActivesessionResponseCompoundUser objUserReal) {
    this.objUserReal = objUserReal;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActivesessionResponseCompoundUser getObjUserCloned() {
    return objUserCloned;
  }
  public void setObjUserCloned(ActivesessionResponseCompoundUser objUserCloned) {
    this.objUserCloned = objUserCloned;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ActivesessionResponseCompoundApikey getObjApikey() {
    return objApikey;
  }
  public void setObjApikey(ActivesessionResponseCompoundApikey objApikey) {
    this.objApikey = objApikey;
  }

  /**
   * An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
   **/
  @ApiModelProperty(required = true, value = "An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.")
  public List<String> getAEModuleInternalname() {
    return aEModuleInternalname;
  }
  public void setAEModuleInternalname(List<String> aEModuleInternalname) {
    this.aEModuleInternalname = aEModuleInternalname;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivesessionResponseCompoundAllOf activesessionResponseCompoundAllOf = (ActivesessionResponseCompoundAllOf) o;
    return (this.aPkiPermissionID == null ? activesessionResponseCompoundAllOf.aPkiPermissionID == null : this.aPkiPermissionID.equals(activesessionResponseCompoundAllOf.aPkiPermissionID)) &&
        (this.objUserReal == null ? activesessionResponseCompoundAllOf.objUserReal == null : this.objUserReal.equals(activesessionResponseCompoundAllOf.objUserReal)) &&
        (this.objUserCloned == null ? activesessionResponseCompoundAllOf.objUserCloned == null : this.objUserCloned.equals(activesessionResponseCompoundAllOf.objUserCloned)) &&
        (this.objApikey == null ? activesessionResponseCompoundAllOf.objApikey == null : this.objApikey.equals(activesessionResponseCompoundAllOf.objApikey)) &&
        (this.aEModuleInternalname == null ? activesessionResponseCompoundAllOf.aEModuleInternalname == null : this.aEModuleInternalname.equals(activesessionResponseCompoundAllOf.aEModuleInternalname));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.aPkiPermissionID == null ? 0: this.aPkiPermissionID.hashCode());
    result = 31 * result + (this.objUserReal == null ? 0: this.objUserReal.hashCode());
    result = 31 * result + (this.objUserCloned == null ? 0: this.objUserCloned.hashCode());
    result = 31 * result + (this.objApikey == null ? 0: this.objApikey.hashCode());
    result = 31 * result + (this.aEModuleInternalname == null ? 0: this.aEModuleInternalname.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivesessionResponseCompoundAllOf {\n");
    
    sb.append("  aPkiPermissionID: ").append(aPkiPermissionID).append("\n");
    sb.append("  objUserReal: ").append(objUserReal).append("\n");
    sb.append("  objUserCloned: ").append(objUserCloned).append("\n");
    sb.append("  objApikey: ").append(objApikey).append("\n");
    sb.append("  aEModuleInternalname: ").append(aEModuleInternalname).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
