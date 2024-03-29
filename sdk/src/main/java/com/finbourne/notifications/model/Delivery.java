/*
 * FINBOURNE Notifications API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.748
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.notifications.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.notifications.model.Attempt;
import com.finbourne.notifications.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Delivery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Delivery {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private ResourceId subscriptionId;

  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notificationId";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private String notificationId;

  public static final String SERIALIZED_NAME_DELIVERY_CHANNEL = "deliveryChannel";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CHANNEL)
  private String deliveryChannel;

  public static final String SERIALIZED_NAME_MESSAGE_DETAILS = "messageDetails";
  @SerializedName(SERIALIZED_NAME_MESSAGE_DETAILS)
  private String messageDetails;

  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private List<Attempt> attempts = new ArrayList<>();


  public Delivery id(UUID id) {
    this.id = id; 
    return this;
  }

   /**
   * The identifier of the delivery.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the delivery.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public Delivery eventId(String eventId) {
    this.eventId = eventId; 
    return this;
  }

   /**
   * The identifier of the associated event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the associated event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public Delivery subscriptionId(ResourceId subscriptionId) {
    this.subscriptionId = subscriptionId; 
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "")
  public ResourceId getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(ResourceId subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public Delivery notificationId(String notificationId) {
    this.notificationId = notificationId; 
    return this;
  }

   /**
   * The identifier of the associated notification.
   * @return notificationId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the associated notification.")
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }


  public Delivery deliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel; 
    return this;
  }

   /**
   * The delivery channel of the message.
   * @return deliveryChannel
  **/
  @ApiModelProperty(required = true, value = "The delivery channel of the message.")
  public String getDeliveryChannel() {
    return deliveryChannel;
  }

  public void setDeliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
  }


  public Delivery messageDetails(String messageDetails) {
    this.messageDetails = messageDetails; 
    return this;
  }

   /**
   * The Details of the delivery message as JSON string.
   * @return messageDetails
  **/
  @ApiModelProperty(required = true, value = "The Details of the delivery message as JSON string.")
  public String getMessageDetails() {
    return messageDetails;
  }

  public void setMessageDetails(String messageDetails) {
    this.messageDetails = messageDetails;
  }


  public Delivery attempts(List<Attempt> attempts) {
    this.attempts = attempts; 
    return this;
  }

  public Delivery addAttemptsItem(Attempt attemptsItem) {
   
    this.attempts.add(attemptsItem);
    return this;
  }

   /**
   * A list of all the delivery attempts made for this message.
   * @return attempts
  **/
  @ApiModelProperty(required = true, value = "A list of all the delivery attempts made for this message.")
  public List<Attempt> getAttempts() {
    return attempts;
  }

  public void setAttempts(List<Attempt> attempts) {
    this.attempts = attempts;
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
    sb.append("class Delivery {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    deliveryChannel: ").append(toIndentedString(deliveryChannel)).append("\n");
    sb.append("    messageDetails: ").append(toIndentedString(messageDetails)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
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
