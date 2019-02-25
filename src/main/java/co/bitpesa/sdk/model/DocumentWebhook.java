/*
 * BitPesa API
 * Reference documentation for the BitPesa API V1
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package co.bitpesa.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import co.bitpesa.sdk.model.Document;
import co.bitpesa.sdk.model.Webhook;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * DocumentWebhook
 */

public class DocumentWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private UUID webhook;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Document _object = null;

   /**
   * The ID of the webhook that was used to send out this callback
   * @return webhook
  **/
  @ApiModelProperty(example = "b2f574ff-7efe-4579-9f16-fcb9097e5ab6", required = true, value = "The ID of the webhook that was used to send out this callback")
  public UUID getWebhook() {
    return webhook;
  }

   /**
   * The event that triggered this webhook
   * @return event
  **/
  @ApiModelProperty(example = "transaction.paid", required = true, value = "The event that triggered this webhook")
  public String getEvent() {
    return event;
  }

  public DocumentWebhook _object(Document _object) {
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @ApiModelProperty(required = true, value = "")
  public Document getObject() {
    return _object;
  }

  public void setObject(Document _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentWebhook documentWebhook = (DocumentWebhook) o;
    return Objects.equals(this.webhook, documentWebhook.webhook) &&
        Objects.equals(this.event, documentWebhook.event) &&
        Objects.equals(this._object, documentWebhook._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhook, event, _object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentWebhook {\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

