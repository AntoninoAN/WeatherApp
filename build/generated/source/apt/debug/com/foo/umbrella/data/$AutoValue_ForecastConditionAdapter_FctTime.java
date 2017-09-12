
package com.foo.umbrella.data;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 abstract class $AutoValue_ForecastConditionAdapter_FctTime extends ForecastConditionAdapter.FctTime {

  private final int hour;
  private final int min;
  private final int year;
  private final int mon;
  private final int mday;
  private final String ampm;

  $AutoValue_ForecastConditionAdapter_FctTime(
      int hour,
      int min,
      int year,
      int mon,
      int mday,
      String ampm) {
    this.hour = hour;
    this.min = min;
    this.year = year;
    this.mon = mon;
    this.mday = mday;
    if (ampm == null) {
      throw new NullPointerException("Null ampm");
    }
    this.ampm = ampm;
  }

  @Override
  int getHour() {
    return hour;
  }

  @Override
  int getMin() {
    return min;
  }

  @Override
  int getYear() {
    return year;
  }

  @Override
  int getMon() {
    return mon;
  }

  @Override
  int getMday() {
    return mday;
  }

  @Override
  String getAmpm() {
    return ampm;
  }

  @Override
  public String toString() {
    return "FctTime{"
        + "hour=" + hour + ", "
        + "min=" + min + ", "
        + "year=" + year + ", "
        + "mon=" + mon + ", "
        + "mday=" + mday + ", "
        + "ampm=" + ampm
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ForecastConditionAdapter.FctTime) {
      ForecastConditionAdapter.FctTime that = (ForecastConditionAdapter.FctTime) o;
      return (this.hour == that.getHour())
           && (this.min == that.getMin())
           && (this.year == that.getYear())
           && (this.mon == that.getMon())
           && (this.mday == that.getMday())
           && (this.ampm.equals(that.getAmpm()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.hour;
    h *= 1000003;
    h ^= this.min;
    h *= 1000003;
    h ^= this.year;
    h *= 1000003;
    h ^= this.mon;
    h *= 1000003;
    h ^= this.mday;
    h *= 1000003;
    h ^= this.ampm.hashCode();
    return h;
  }

}
