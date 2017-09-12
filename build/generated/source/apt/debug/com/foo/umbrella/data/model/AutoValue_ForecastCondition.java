
package com.foo.umbrella.data.model;

import javax.annotation.Generated;
import org.threeten.bp.LocalDateTime;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ForecastCondition extends ForecastCondition {

  private final String displayTime;
  private final LocalDateTime dateTime;
  private final String icon;
  private final String condition;
  private final String tempFahrenheit;
  private final String tempCelsius;

  private AutoValue_ForecastCondition(
      String displayTime,
      LocalDateTime dateTime,
      String icon,
      String condition,
      String tempFahrenheit,
      String tempCelsius) {
    this.displayTime = displayTime;
    this.dateTime = dateTime;
    this.icon = icon;
    this.condition = condition;
    this.tempFahrenheit = tempFahrenheit;
    this.tempCelsius = tempCelsius;
  }

  @Override
  public String getDisplayTime() {
    return displayTime;
  }

  @Override
  public LocalDateTime getDateTime() {
    return dateTime;
  }

  @Override
  public String getIcon() {
    return icon;
  }

  @Override
  public String getCondition() {
    return condition;
  }

  @Override
  public String getTempFahrenheit() {
    return tempFahrenheit;
  }

  @Override
  public String getTempCelsius() {
    return tempCelsius;
  }

  @Override
  public String toString() {
    return "ForecastCondition{"
        + "displayTime=" + displayTime + ", "
        + "dateTime=" + dateTime + ", "
        + "icon=" + icon + ", "
        + "condition=" + condition + ", "
        + "tempFahrenheit=" + tempFahrenheit + ", "
        + "tempCelsius=" + tempCelsius
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ForecastCondition) {
      ForecastCondition that = (ForecastCondition) o;
      return (this.displayTime.equals(that.getDisplayTime()))
           && (this.dateTime.equals(that.getDateTime()))
           && (this.icon.equals(that.getIcon()))
           && (this.condition.equals(that.getCondition()))
           && (this.tempFahrenheit.equals(that.getTempFahrenheit()))
           && (this.tempCelsius.equals(that.getTempCelsius()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.displayTime.hashCode();
    h *= 1000003;
    h ^= this.dateTime.hashCode();
    h *= 1000003;
    h ^= this.icon.hashCode();
    h *= 1000003;
    h ^= this.condition.hashCode();
    h *= 1000003;
    h ^= this.tempFahrenheit.hashCode();
    h *= 1000003;
    h ^= this.tempCelsius.hashCode();
    return h;
  }

  static final class Builder extends ForecastCondition.Builder {
    private String displayTime;
    private LocalDateTime dateTime;
    private String icon;
    private String condition;
    private String tempFahrenheit;
    private String tempCelsius;
    Builder() {
    }
    Builder(ForecastCondition source) {
      this.displayTime = source.getDisplayTime();
      this.dateTime = source.getDateTime();
      this.icon = source.getIcon();
      this.condition = source.getCondition();
      this.tempFahrenheit = source.getTempFahrenheit();
      this.tempCelsius = source.getTempCelsius();
    }
    @Override
    public ForecastCondition.Builder setDisplayTime(String displayTime) {
      this.displayTime = displayTime;
      return this;
    }
    @Override
    public ForecastCondition.Builder setDateTime(LocalDateTime dateTime) {
      this.dateTime = dateTime;
      return this;
    }
    @Override
    public ForecastCondition.Builder setIcon(String icon) {
      this.icon = icon;
      return this;
    }
    @Override
    public ForecastCondition.Builder setCondition(String condition) {
      this.condition = condition;
      return this;
    }
    @Override
    public ForecastCondition.Builder setTempFahrenheit(String tempFahrenheit) {
      this.tempFahrenheit = tempFahrenheit;
      return this;
    }
    @Override
    public ForecastCondition.Builder setTempCelsius(String tempCelsius) {
      this.tempCelsius = tempCelsius;
      return this;
    }
    @Override
    public ForecastCondition build() {
      String missing = "";
      if (displayTime == null) {
        missing += " displayTime";
      }
      if (dateTime == null) {
        missing += " dateTime";
      }
      if (icon == null) {
        missing += " icon";
      }
      if (condition == null) {
        missing += " condition";
      }
      if (tempFahrenheit == null) {
        missing += " tempFahrenheit";
      }
      if (tempCelsius == null) {
        missing += " tempCelsius";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ForecastCondition(
          this.displayTime,
          this.dateTime,
          this.icon,
          this.condition,
          this.tempFahrenheit,
          this.tempCelsius);
    }
  }

}
