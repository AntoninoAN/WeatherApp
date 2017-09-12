package com.foo.umbrella.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

final class AutoValue_ForecastConditionAdapter_Temperature extends $AutoValue_ForecastConditionAdapter_Temperature {
  AutoValue_ForecastConditionAdapter_Temperature(String english, String metric) {
    super(english, metric);
  }

  public static JsonAdapter<ForecastConditionAdapter.Temperature> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<ForecastConditionAdapter.Temperature> {
    private final JsonAdapter<String> englishAdapter;
    private final JsonAdapter<String> metricAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.englishAdapter = moshi.adapter(String.class);
      this.metricAdapter = moshi.adapter(String.class);
    }
    @Override
    public ForecastConditionAdapter.Temperature fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      String english = null;
      String metric = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "english": {
            english = englishAdapter.fromJson(reader);
            break;
          }
          case "metric": {
            metric = metricAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_ForecastConditionAdapter_Temperature(english, metric);
    }
    @Override
    public void toJson(JsonWriter writer, ForecastConditionAdapter.Temperature value) throws IOException {
      writer.beginObject();
      writer.name("english");
      englishAdapter.toJson(writer, value.getEnglish());
      writer.name("metric");
      metricAdapter.toJson(writer, value.getMetric());
      writer.endObject();
    }
  }
}
