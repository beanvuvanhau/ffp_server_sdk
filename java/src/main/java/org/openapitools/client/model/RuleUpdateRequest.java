/*
 * api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.46.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.RuleSegmentOperator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RuleUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-31T13:29:42.404334+07:00[Asia/Ho_Chi_Minh]", comments = "Generator version: 7.9.0")
public class RuleUpdateRequest {
  public static final String SERIALIZED_NAME_SEGMENT_KEY = "segmentKey";
  @SerializedName(SERIALIZED_NAME_SEGMENT_KEY)
  private String segmentKey;

  public static final String SERIALIZED_NAME_SEGMENT_KEYS = "segmentKeys";
  @SerializedName(SERIALIZED_NAME_SEGMENT_KEYS)
  private List<String> segmentKeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_SEGMENT_OPERATOR = "segmentOperator";
  @SerializedName(SERIALIZED_NAME_SEGMENT_OPERATOR)
  private RuleSegmentOperator segmentOperator;

  public RuleUpdateRequest() {
  }

  public RuleUpdateRequest segmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
    return this;
  }

  /**
   * Get segmentKey
   * @return segmentKey
   */
  @javax.annotation.Nonnull
  public String getSegmentKey() {
    return segmentKey;
  }

  public void setSegmentKey(String segmentKey) {
    this.segmentKey = segmentKey;
  }


  public RuleUpdateRequest segmentKeys(List<String> segmentKeys) {
    this.segmentKeys = segmentKeys;
    return this;
  }

  public RuleUpdateRequest addSegmentKeysItem(String segmentKeysItem) {
    if (this.segmentKeys == null) {
      this.segmentKeys = new ArrayList<>();
    }
    this.segmentKeys.add(segmentKeysItem);
    return this;
  }

  /**
   * Get segmentKeys
   * @return segmentKeys
   */
  @javax.annotation.Nullable
  public List<String> getSegmentKeys() {
    return segmentKeys;
  }

  public void setSegmentKeys(List<String> segmentKeys) {
    this.segmentKeys = segmentKeys;
  }


  public RuleUpdateRequest segmentOperator(RuleSegmentOperator segmentOperator) {
    this.segmentOperator = segmentOperator;
    return this;
  }

  /**
   * Get segmentOperator
   * @return segmentOperator
   */
  @javax.annotation.Nullable
  public RuleSegmentOperator getSegmentOperator() {
    return segmentOperator;
  }

  public void setSegmentOperator(RuleSegmentOperator segmentOperator) {
    this.segmentOperator = segmentOperator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleUpdateRequest ruleUpdateRequest = (RuleUpdateRequest) o;
    return Objects.equals(this.segmentKey, ruleUpdateRequest.segmentKey) &&
        Objects.equals(this.segmentKeys, ruleUpdateRequest.segmentKeys) &&
        Objects.equals(this.segmentOperator, ruleUpdateRequest.segmentOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentKey, segmentKeys, segmentOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleUpdateRequest {\n");
    sb.append("    segmentKey: ").append(toIndentedString(segmentKey)).append("\n");
    sb.append("    segmentKeys: ").append(toIndentedString(segmentKeys)).append("\n");
    sb.append("    segmentOperator: ").append(toIndentedString(segmentOperator)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("segmentKey");
    openapiFields.add("segmentKeys");
    openapiFields.add("segmentOperator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("segmentKey");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RuleUpdateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleUpdateRequest is not found in the empty JSON string", RuleUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleUpdateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RuleUpdateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("segmentKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segmentKey").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("segmentKeys") != null && !jsonObj.get("segmentKeys").isJsonNull() && !jsonObj.get("segmentKeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `segmentKeys` to be an array in the JSON string but got `%s`", jsonObj.get("segmentKeys").toString()));
      }
      // validate the optional field `segmentOperator`
      if (jsonObj.get("segmentOperator") != null && !jsonObj.get("segmentOperator").isJsonNull()) {
        RuleSegmentOperator.validateJsonElement(jsonObj.get("segmentOperator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleUpdateRequest>() {
           @Override
           public void write(JsonWriter out, RuleUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleUpdateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RuleUpdateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RuleUpdateRequest
   * @throws IOException if the JSON string is invalid with respect to RuleUpdateRequest
   */
  public static RuleUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleUpdateRequest.class);
  }

  /**
   * Convert an instance of RuleUpdateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
