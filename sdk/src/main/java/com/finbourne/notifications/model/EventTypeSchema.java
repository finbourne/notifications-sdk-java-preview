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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An EventType object
 */
@ApiModel(description = "An EventType object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventTypeSchema {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";
  @SerializedName(SERIALIZED_NAME_EVENT_NAME)
  private String eventName;

  public static final String SERIALIZED_NAME_JSON_SCHEMA = "jsonSchema";
  @SerializedName(SERIALIZED_NAME_JSON_SCHEMA)
  private Object jsonSchema;


  public EventTypeSchema id(String id) {
    this.id = id; 
    return this;
  }

   /**
   * The identifier of the event type
   * @return id
  **/
  @ApiModelProperty(value = "The identifier of the event type")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public EventTypeSchema description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * The summary of the event
   * @return description
  **/
  @ApiModelProperty(value = "The summary of the event")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public EventTypeSchema entity(String entity) {
    this.entity = entity; 
    return this;
  }

   /**
   * The entity against which the event originated
   * @return entity
  **/
  @ApiModelProperty(value = "The entity against which the event originated")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }


  public EventTypeSchema eventName(String eventName) {
    this.eventName = eventName; 
    return this;
  }

   /**
   * Identifier name of the event
   * @return eventName
  **/
  @ApiModelProperty(value = "Identifier name of the event")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  public EventTypeSchema jsonSchema(Object jsonSchema) {
    this.jsonSchema = jsonSchema; 
    return this;
  }

   /**
   * The schema of the event
   * @return jsonSchema
  **/
  @ApiModelProperty(required = true, value = "The schema of the event")
  public Object getJsonSchema() {
    return jsonSchema;
  }

  public void setJsonSchema(Object jsonSchema) {
    this.jsonSchema = jsonSchema;
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
    sb.append("class EventTypeSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
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
