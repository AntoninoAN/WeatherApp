
package com.foo.umbrella.data;

import com.squareup.moshi.Json;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ForecastConditionAdapter_ForecastConditionJson extends ForecastConditionAdapter.ForecastConditionJson {

  private final String icon;
  private final String condition;
  private final ForecastConditionAdapter.FctTime fcTTime;
  private final ForecastConditionAdapter.Temperature temperature;

  $AutoValue_ForecastConditionAdapter_ForecastConditionJson(
      String icon,
      String condition,
      ForecastConditionAdapter.FctTime fcTTime,
      ForecastConditionAdapter.Temperature temperature) {
    if (icon == null) {
      throw new NullPointerException("Null icon");
    }
    this.icon = icon;
    if (condition == null) {
      throw new NullPointerException("Null condition");
    }
    this.condition = condition;
    if (fcTTime == null) {
      throw new NullPointerException("Null fcTTime");
    }
    this.fcTTime = fcTTime;
    if (temperature == null) {
      throw new NullPointerException("Null temperature");
    }
    this.temperature = temperature;
  }

  @Override
  String getIcon() {
    return icon;
  }

  @Override
  String getCondition() {
    return condition;
  }

  @Json(name = "FCTTIME")
  @Override
  ForecastConditionAdapter.FctTime getFcTTime() {
    return fcTTime;
  }

  @Json(name = "temp")
  @Override
  ForecastConditionAdapter.Temperature getTemperature() {
    return temperature;
  }

  @Override
  public String toString() {
    return "ForecastConditionJson{"
        + "icon=" + icon + ", "
        + "condition=" + condition + ", "
        + "fcTTime=" + fcTTime + ", "
        + "temperature=" + temperature
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ForecastConditionAdapter.ForecastConditionJson) {
      ForecastConditionAdapter.ForecastConditionJson that = (ForecastConditionAdapter.ForecastConditionJson) o;
      return (this.icon.equals(that.getIcon()))
           && (this.condition.equals(that.getCondition()))
           && (this.fcTTime.equals(that.getFcTTime()))
           && (this.temperature.equals(that.getTemperature()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.icon.hashCode();
    h *= 1000003;
    h ^= this.condition.hashCode();
    h *= 1000003;
    h ^= this.fcTTime.hashCode();
    h *= 1000003;
    h ^= this.temperature.hashCode();
    return h;
  }

}
