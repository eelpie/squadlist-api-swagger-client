/*
 * Squadlist
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.co.squadlist.model.swagger;

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
 * SubscriptionRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-06T09:59:33.441+01:00")
public class SubscriptionRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("club")
  private String club = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("tariff")
  private String tariff = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("received")
  private String received = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("accessDetails")
  private String accessDetails = null;

  @SerializedName("instance")
  private String instance = null;

  public SubscriptionRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionRequest club(String club) {
    this.club = club;
    return this;
  }

   /**
   * Get club
   * @return club
  **/
  @ApiModelProperty(required = true, value = "")
  public String getClub() {
    return club;
  }

  public void setClub(String club) {
    this.club = club;
  }

  public SubscriptionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public SubscriptionRequest location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public SubscriptionRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SubscriptionRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SubscriptionRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SubscriptionRequest tariff(String tariff) {
    this.tariff = tariff;
    return this;
  }

   /**
   * Get tariff
   * @return tariff
  **/
  @ApiModelProperty(value = "")
  public String getTariff() {
    return tariff;
  }

  public void setTariff(String tariff) {
    this.tariff = tariff;
  }

  public SubscriptionRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SubscriptionRequest received(String received) {
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @ApiModelProperty(required = true, value = "")
  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public SubscriptionRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public SubscriptionRequest accessDetails(String accessDetails) {
    this.accessDetails = accessDetails;
    return this;
  }

   /**
   * Get accessDetails
   * @return accessDetails
  **/
  @ApiModelProperty(value = "")
  public String getAccessDetails() {
    return accessDetails;
  }

  public void setAccessDetails(String accessDetails) {
    this.accessDetails = accessDetails;
  }

  public SubscriptionRequest instance(String instance) {
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @ApiModelProperty(value = "")
  public String getInstance() {
    return instance;
  }

  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRequest subscriptionRequest = (SubscriptionRequest) o;
    return Objects.equals(this.id, subscriptionRequest.id) &&
        Objects.equals(this.club, subscriptionRequest.club) &&
        Objects.equals(this.reason, subscriptionRequest.reason) &&
        Objects.equals(this.location, subscriptionRequest.location) &&
        Objects.equals(this.firstName, subscriptionRequest.firstName) &&
        Objects.equals(this.lastName, subscriptionRequest.lastName) &&
        Objects.equals(this.email, subscriptionRequest.email) &&
        Objects.equals(this.tariff, subscriptionRequest.tariff) &&
        Objects.equals(this.status, subscriptionRequest.status) &&
        Objects.equals(this.received, subscriptionRequest.received) &&
        Objects.equals(this.notes, subscriptionRequest.notes) &&
        Objects.equals(this.accessDetails, subscriptionRequest.accessDetails) &&
        Objects.equals(this.instance, subscriptionRequest.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, club, reason, location, firstName, lastName, email, tariff, status, received, notes, accessDetails, instance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    club: ").append(toIndentedString(club)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tariff: ").append(toIndentedString(tariff)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

