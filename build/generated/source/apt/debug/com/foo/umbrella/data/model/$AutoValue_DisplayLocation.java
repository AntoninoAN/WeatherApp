
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_DisplayLocation extends DisplayLocation {

  private final String fullName;
  private final String city;
  private final String stateAbbreviation;
  private final String stateName;
  private final String country;
  private final String zip;

  $AutoValue_DisplayLocation(
      String fullName,
      String city,
      String stateAbbreviation,
      String stateName,
      String country,
      String zip) {
    if (fullName == null) {
      throw new NullPointerException("Null fullName");
    }
    this.fullName = fullName;
    if (city == null) {
      throw new NullPointerException("Null city");
    }
    this.city = city;
    if (stateAbbreviation == null) {
      throw new NullPointerException("Null stateAbbreviation");
    }
    this.stateAbbreviation = stateAbbreviation;
    if (stateName == null) {
      throw new NullPointerException("Null stateName");
    }
    this.stateName = stateName;
    if (country == null) {
      throw new NullPointerException("Null country");
    }
    this.country = country;
    if (zip == null) {
      throw new NullPointerException("Null zip");
    }
    this.zip = zip;
  }

  @Json(name = "full")
  @Override
  public String getFullName() {
    return fullName;
  }

  @Override
  String getCity() {
    return city;
  }

  @Json(name = "state")
  @Override
  public String getStateAbbreviation() {
    return stateAbbreviation;
  }

  @Json(name = "state_name")
  @Override
  public String getStateName() {
    return stateName;
  }

  @Override
  public String getCountry() {
    return country;
  }

  @Override
  public String getZip() {
    return zip;
  }

  @Override
  public String toString() {
    return "DisplayLocation{"
        + "fullName=" + fullName + ", "
        + "city=" + city + ", "
        + "stateAbbreviation=" + stateAbbreviation + ", "
        + "stateName=" + stateName + ", "
        + "country=" + country + ", "
        + "zip=" + zip
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DisplayLocation) {
      DisplayLocation that = (DisplayLocation) o;
      return (this.fullName.equals(that.getFullName()))
           && (this.city.equals(that.getCity()))
           && (this.stateAbbreviation.equals(that.getStateAbbreviation()))
           && (this.stateName.equals(that.getStateName()))
           && (this.country.equals(that.getCountry()))
           && (this.zip.equals(that.getZip()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.fullName.hashCode();
    h *= 1000003;
    h ^= this.city.hashCode();
    h *= 1000003;
    h ^= this.stateAbbreviation.hashCode();
    h *= 1000003;
    h ^= this.stateName.hashCode();
    h *= 1000003;
    h ^= this.country.hashCode();
    h *= 1000003;
    h ^= this.zip.hashCode();
    return h;
  }

}
