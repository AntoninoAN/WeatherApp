package com.foo.umbrella.data.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.List;

final class AutoValue_WeatherData extends $AutoValue_WeatherData {
  AutoValue_WeatherData(CurrentObservation currentObservation, List<ForecastCondition> forecast) {
    super(currentObservation, forecast);
  }

  public static JsonAdapter<WeatherData> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<WeatherData> {
    private final JsonAdapter<CurrentObservation> currentObservationAdapter;
    private final JsonAdapter<List<ForecastCondition>> forecastAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.currentObservationAdapter = moshi.adapter(CurrentObservation.class);
      this.forecastAdapter = moshi.adapter(Types.newParameterizedType(List.class, ForecastCondition.class));
    }
    @Override
    public WeatherData fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      CurrentObservation currentObservation = null;
      List<ForecastCondition> forecast = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "current_observation": {
            currentObservation = currentObservationAdapter.fromJson(reader);
            break;
          }
          case "hourly_forecast": {
            forecast = forecastAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_WeatherData(currentObservation, forecast);
    }
    @Override
    public void toJson(JsonWriter writer, WeatherData value) throws IOException {
      writer.beginObject();
      writer.name("current_observation");
      currentObservationAdapter.toJson(writer, value.getCurrentObservation());
      writer.name("hourly_forecast");
      forecastAdapter.toJson(writer, value.getForecast());
      writer.endObject();
    }
  }
}
