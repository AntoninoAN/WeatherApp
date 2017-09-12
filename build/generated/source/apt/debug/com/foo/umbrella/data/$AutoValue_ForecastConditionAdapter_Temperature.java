
package com.foo.umbrella.data;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ForecastConditionAdapter_Temperature extends ForecastConditionAdapter.Temperature {

  private final String english;
  private final String metric;

  $AutoValue_ForecastConditionAdapter_Temperature(
      String english,
      String metric) {
    if (english == null) {
      throw new NullPointerException("Null english");
    }
    this.english = english;
    if (metric == null) {
      throw new NullPointerException("Null metric");
    }
    this.metric = metric;
  }

  @Override
  String getEnglish() {
    return english;
  }

  @Override
  String getMetric() {
    return metric;
  }

  @Override
  public String toString() {
    return "Temperature{"
        + "english=" + english + ", "
        + "metric=" + metric
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ForecastConditionAdapter.Temperature) {
      ForecastConditionAdapter.Temperature that = (ForecastConditionAdapter.Temperature) o;
      return (this.english.equals(that.getEnglish()))
           && (this.metric.equals(that.getMetric()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.english.hashCode();
    h *= 1000003;
    h ^= this.metric.hashCode();
    return h;
  }

}
