/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.356
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.notifications.model.NotificationStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A notification object
 */
@ApiModel(description = "A notification object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Notification {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DELIVERY_CHANNEL = "deliveryChannel";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CHANNEL)
  private String deliveryChannel;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private Map<String, Object> recipients = new HashMap<>();

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Map<String, Object> content = new HashMap<>();

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private NotificationStatus status;

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


  public Notification id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The identifier of the notification
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the notification")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Notification description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The summary of the services provided by the notification
   * @return description
  **/
  @ApiModelProperty(value = "The summary of the services provided by the notification")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Notification deliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel; 
    return this;
  }

   /**
   * The medium through which the notification is delivered
   * @return deliveryChannel
  **/
  @ApiModelProperty(required = true, value = "The medium through which the notification is delivered")
  public String getDeliveryChannel() {
    return deliveryChannel;
  }

  public void setDeliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
  }


  public Notification recipients(Map<String, Object> recipients) {
    this.recipients = recipients; 
    return this;
  }

  public Notification putRecipientsItem(String key, Object recipientsItem) {
    this.recipients.put(key, recipientsItem);
    return this;
  }

   /**
   * Recipient of the notification
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Recipient of the notification")
  public Map<String, Object> getRecipients() {
    return recipients;
  }

  public void setRecipients(Map<String, Object> recipients) {
    this.recipients = recipients;
  }


  public Notification content(Map<String, Object> content) {
    this.content = content; 
    return this;
  }

  public Notification putContentItem(String key, Object contentItem) {
    this.content.put(key, contentItem);
    return this;
  }

   /**
   * The contents of the notification
   * @return content
  **/
  @ApiModelProperty(required = true, value = "The contents of the notification")
  public Map<String, Object> getContent() {
    return content;
  }

  public void setContent(Map<String, Object> content) {
    this.content = content;
  }


  public Notification status(NotificationStatus status) {
    this.status = status; 
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public NotificationStatus getStatus() {
    return status;
  }

  public void setStatus(NotificationStatus status) {
    this.status = status;
  }


  public Notification createdAt(OffsetDateTime createdAt) {
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


  public Notification createdBy(String createdBy) {
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


  public Notification lastModifiedAt(OffsetDateTime lastModifiedAt) {
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


  public Notification lastModifiedBy(String lastModifiedBy) {
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
    sb.append("class Notification {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deliveryChannel: ").append(toIndentedString(deliveryChannel)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
