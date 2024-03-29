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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A matching pattern object
 */
@ApiModel(description = "A matching pattern object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchingPattern {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter;


  public MatchingPattern eventType(String eventType) {
    this.eventType = eventType; 
    return this;
  }

   /**
   * The type of event to subscribe to. The list of available event types can be discovered  by calling the ‘List available EventTypes’ API endpoint.
   * @return eventType
  **/
  @ApiModelProperty(required = true, value = "The type of event to subscribe to. The list of available event types can be discovered  by calling the ‘List available EventTypes’ API endpoint.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public MatchingPattern filter(String filter) {
    this.filter = filter; 
    return this;
  }

   /**
   * A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. If not provided, all events will be matched
   * @return filter
  **/
  @ApiModelProperty(value = "A filter on the event. See https://support.lusid.com/filtering-results-from-lusid for more information. If not provided, all events will be matched")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
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
    sb.append("class MatchingPattern {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
