package com.foo.umbrella.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

final class AutoValue_ForecastConditionAdapter_ForecastConditionJson extends $AutoValue_ForecastConditionAdapter_ForecastConditionJson {
  AutoValue_ForecastConditionAdapter_ForecastConditionJson(String icon, String condition, ForecastConditionAdapter.FctTime fcTTime, ForecastConditionAdapter.Temperature temperature) {
    super(icon, condition, fcTTime, temperature);
  }

  public static JsonAdapter<ForecastConditionAdapter.ForecastConditionJson> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<ForecastConditionAdapter.ForecastConditionJson> {
    private final JsonAdapter<String> iconAdapter;
    private final JsonAdapter<String> conditionAdapter;
    private final JsonAdapter<ForecastConditionAdapter.FctTime> fcTTimeAdapter;
    private final JsonAdapter<ForecastConditionAdapter.Temperature> temperatureAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.iconAdapter = moshi.adapter(String.class);
      this.conditionAdapter = moshi.adapter(String.class);
      this.fcTTimeAdapter = moshi.adapter(ForecastConditionAdapter.FctTime.class);
      this.temperatureAdapter = moshi.adapter(ForecastConditionAdapter.Temperature.class);
    }
    @Override
    public ForecastConditionAdapter.ForecastConditionJson fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      String icon = null;
      String condition = null;
      ForecastConditionAdapter.FctTime fcTTime = null;
      ForecastConditionAdapter.Temperature temperature = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "icon": {
            icon = iconAdapter.fromJson(reader);
            break;
          }
          case "condition": {
            condition = conditionAdapter.fromJson(reader);
            break;
          }
          case "FCTTIME": {
            fcTTime = fcTTimeAdapter.fromJson(reader);
            break;
          }
          case "temp": {
            temperature = temperatureAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_ForecastConditionAdapter_ForecastConditionJson(icon, condition, fcTTime, temperature);
    }
    @Override
    public void toJson(JsonWriter writer, ForecastConditionAdapter.ForecastConditionJson value) throws IOException {
      writer.beginObject();
      writer.name("icon");
      iconAdapter.toJson(writer, value.getIcon());
      writer.name("condition");
      conditionAdapter.toJson(writer, value.getCondition());
      writer.name("FCTTIME");
      fcTTimeAdapter.toJson(writer, value.getFcTTime());
      writer.name("temp");
      temperatureAdapter.toJson(writer, value.getTemperature());
      writer.endObject();
    }
  }
}
