/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.327
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.notifications.model.MatchingPattern;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The information required to update a subscription
 */
@ApiModel(description = "The information required to update a subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSubscription {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MATCHING_PATTERN = "matchingPattern";
  @SerializedName(SERIALIZED_NAME_MATCHING_PATTERN)
  private MatchingPattern matchingPattern;


  public UpdateSubscription displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * The name of the subscription
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "The name of the subscription")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public UpdateSubscription description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The summary of the services provided by the subscription
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The summary of the services provided by the subscription")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateSubscription status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * The current status of the subscription. Possible values are: Active, Inactive
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the subscription. Possible values are: Active, Inactive")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public UpdateSubscription matchingPattern(MatchingPattern matchingPattern) {
    this.matchingPattern = matchingPattern; 
    return this;
  }

   /**
   * Get matchingPattern
   * @return matchingPattern
  **/
  @ApiModelProperty(required = true, value = "")
  public MatchingPattern getMatchingPattern() {
    return matchingPattern;
  }

  public void setMatchingPattern(MatchingPattern matchingPattern) {
    this.matchingPattern = matchingPattern;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubscription {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    matchingPattern: ").append(toIndentedString(matchingPattern)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
