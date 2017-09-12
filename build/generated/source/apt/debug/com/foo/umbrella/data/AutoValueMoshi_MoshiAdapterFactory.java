package com.foo.umbrella.data;

import com.foo.umbrella.data.model.CurrentObservation;
import com.foo.umbrella.data.model.DisplayLocation;
import com.foo.umbrella.data.model.WeatherData;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Override;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

public final class AutoValueMoshi_MoshiAdapterFactory extends MoshiAdapterFactory {
  @Override
  public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
    if (!annotations.isEmpty()) return null;
    if (type.equals(ForecastConditionAdapter.ForecastConditionJson.class)) {
      return ForecastConditionAdapter.ForecastConditionJson.jsonAdapter(moshi);
    } else if (type.equals(ForecastConditionAdapter.FctTime.class)) {
      return ForecastConditionAdapter.FctTime.jsonAdapter(moshi);
    } else if (type.equals(ForecastConditionAdapter.Temperature.class)) {
      return ForecastConditionAdapter.Temperature.jsonAdapter(moshi);
    } else if (type.equals(CurrentObservation.class)) {
      return CurrentObservation.jsonAdapter(moshi);
    } else if (type.equals(DisplayLocation.class)) {
      return DisplayLocation.jsonAdapter(moshi);
    } else if (type.equals(WeatherData.class)) {
      return WeatherData.jsonAdapter(moshi);
    }
    return null;
  }
}
