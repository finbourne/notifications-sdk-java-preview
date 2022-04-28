/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.315
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
import com.finbourne.notifications.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * A subscription object
 */
@ApiModel(description = "A subscription object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Subscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private ResourceId id;

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

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_AT = "lastModifiedAt";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_AT)
  private OffsetDateTime lastModifiedAt;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;


  public Subscription id(ResourceId id) {
    this.id = id; 
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getId() {
    return id;
  }

  public void setId(ResourceId id) {
    this.id = id;
  }


  public Subscription displayName(String displayName) {
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


  public Subscription description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The summary of the services provided by the subscription
   * @return description
  **/
  @ApiModelProperty(value = "The summary of the services provided by the subscription")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Subscription status(String status) {
    this.status = status; 
    return this;
  }

   /**
   * The current status of the subscription
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The current status of the subscription")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Subscription matchingPattern(MatchingPattern matchingPattern) {
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


  public Subscription createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt; 
    return this;
  }

   /**
   * The time at which the subscription was made
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time at which the subscription was made")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public Subscription createdBy(String createdBy) {
    this.createdBy = createdBy; 
    return this;
  }

   /**
   * The user who made the subscription
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "The user who made the subscription")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Subscription lastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt; 
    return this;
  }

   /**
   * The time at which the subscription was last modified
   * @return lastModifiedAt
  **/
  @ApiModelProperty(required = true, value = "The time at which the subscription was last modified")
  public OffsetDateTime getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }


  public Subscription lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy; 
    return this;
  }

   /**
   * The user who last modified the subscription
   * @return lastModifiedBy
  **/
  @ApiModelProperty(required = true, value = "The user who last modified the subscription")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
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
    sb.append("class Subscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    matchingPattern: ").append(toIndentedString(matchingPattern)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
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
