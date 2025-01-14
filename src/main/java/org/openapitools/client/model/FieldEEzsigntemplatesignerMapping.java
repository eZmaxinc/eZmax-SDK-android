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
 * Mapping configuration to use when template is apply to an document.  1. **Manual** User need to choose mapping manually. 2. **Creator** mapping will be set to creator of template. 3. **User** mapping will be set to fkiUserID 4. **Usergroup** mapping will be set to fkiUsergroupID.
 **/
@ApiModel(description = "Mapping configuration to use when template is apply to an document.  1. **Manual** User need to choose mapping manually. 2. **Creator** mapping will be set to creator of template. 3. **User** mapping will be set to fkiUserID 4. **Usergroup** mapping will be set to fkiUsergroupID.")
public class FieldEEzsigntemplatesignerMapping {
  


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldEEzsigntemplatesignerMapping fieldEEzsigntemplatesignerMapping = (FieldEEzsigntemplatesignerMapping) o;
    return true;
  }

  @Override
  public int hashCode() {
    int result = 17;
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldEEzsigntemplatesignerMapping {\n");
    
    sb.append("}\n");
    return sb.toString();
  }
}
