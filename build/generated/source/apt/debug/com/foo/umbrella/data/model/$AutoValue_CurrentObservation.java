
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_CurrentObservation extends CurrentObservation {

  private final DisplayLocation displayLocation;
  private final String tempFahrenheit;
  private final String tempCelsius;
  private final String weatherDescription;
  private final String iconName;

  $AutoValue_CurrentObservation(
      DisplayLocation displayLocation,
      String tempFahrenheit,
      String tempCelsius,
      String weatherDescription,
      String iconName) {
    if (displayLocation == null) {
      throw new NullPointerException("Null displayLocation");
    }
    this.displayLocation = displayLocation;
    if (tempFahrenheit == null) {
      throw new NullPointerException("Null tempFahrenheit");
    }
    this.tempFahrenheit = tempFahrenheit;
    if (tempCelsius == null) {
      throw new NullPointerException("Null tempCelsius");
    }
    this.tempCelsius = tempCelsius;
    if (weatherDescription == null) {
      throw new NullPointerException("Null weatherDescription");
    }
    this.weatherDescription = weatherDescription;
    if (iconName == null) {
      throw new NullPointerException("Null iconName");
    }
    this.iconName = iconName;
  }

  @Json(name = "display_location")
  @Override
  public DisplayLocation getDisplayLocation() {
    return displayLocation;
  }

  @Json(name = "temp_f")
  @Override
  public String getTempFahrenheit() {
    return tempFahrenheit;
  }

  @Json(name = "temp_c")
  @Override
  public String getTempCelsius() {
    return tempCelsius;
  }

  @Json(name = "weather")
  @Override
  public String getWeatherDescription() {
    return weatherDescription;
  }

  @Json(name = "icon")
  @Override
  public String getIconName() {
    return iconName;
  }

  @Override
  public String toString() {
    return "CurrentObservation{"
        + "displayLocation=" + displayLocation + ", "
        + "tempFahrenheit=" + tempFahrenheit + ", "
        + "tempCelsius=" + tempCelsius + ", "
        + "weatherDescription=" + weatherDescription + ", "
        + "iconName=" + iconName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CurrentObservation) {
      CurrentObservation that = (CurrentObservation) o;
      return (this.displayLocation.equals(that.getDisplayLocation()))
           && (this.tempFahrenheit.equals(that.getTempFahrenheit()))
           && (this.tempCelsius.equals(that.getTempCelsius()))
           && (this.weatherDescription.equals(that.getWeatherDescription()))
           && (this.iconName.equals(that.getIconName()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.displayLocation.hashCode();
    h *= 1000003;
    h ^= this.tempFahrenheit.hashCode();
    h *= 1000003;
    h ^= this.tempCelsius.hashCode();
    h *= 1000003;
    h ^= this.weatherDescription.hashCode();
    h *= 1000003;
    h ^= this.iconName.hashCode();
    return h;
  }

}
