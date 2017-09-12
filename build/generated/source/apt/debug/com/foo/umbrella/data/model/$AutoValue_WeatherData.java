
package com.foo.umbrella.data.model;

import com.squareup.moshi.Json;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_WeatherData extends WeatherData {

  private final CurrentObservation currentObservation;
  private final List<ForecastCondition> forecast;

  $AutoValue_WeatherData(
      CurrentObservation currentObservation,
      List<ForecastCondition> forecast) {
    if (currentObservation == null) {
      throw new NullPointerException("Null currentObservation");
    }
    this.currentObservation = currentObservation;
    if (forecast == null) {
      throw new NullPointerException("Null forecast");
    }
    this.forecast = forecast;
  }

  @Json(name = "current_observation")
  @Override
  public CurrentObservation getCurrentObservation() {
    return currentObservation;
  }

  @Json(name = "hourly_forecast")
  @Override
  public List<ForecastCondition> getForecast() {
    return forecast;
  }

  @Override
  public String toString() {
    return "WeatherData{"
        + "currentObservation=" + currentObservation + ", "
        + "forecast=" + forecast
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof WeatherData) {
      WeatherData that = (WeatherData) o;
      return (this.currentObservation.equals(that.getCurrentObservation()))
           && (this.forecast.equals(that.getForecast()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.currentObservation.hashCode();
    h *= 1000003;
    h ^= this.forecast.hashCode();
    return h;
  }

}
