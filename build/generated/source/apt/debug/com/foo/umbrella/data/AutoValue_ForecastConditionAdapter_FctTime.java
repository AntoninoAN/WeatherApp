package com.foo.umbrella.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

final class AutoValue_ForecastConditionAdapter_FctTime extends $AutoValue_ForecastConditionAdapter_FctTime {
  AutoValue_ForecastConditionAdapter_FctTime(int hour, int min, int year, int mon, int mday, String ampm) {
    super(hour, min, year, mon, mday, ampm);
  }

  public static JsonAdapter<ForecastConditionAdapter.FctTime> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<ForecastConditionAdapter.FctTime> {
    private final JsonAdapter<Integer> hourAdapter;
    private final JsonAdapter<Integer> minAdapter;
    private final JsonAdapter<Integer> yearAdapter;
    private final JsonAdapter<Integer> monAdapter;
    private final JsonAdapter<Integer> mdayAdapter;
    private final JsonAdapter<String> ampmAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.hourAdapter = moshi.adapter(int.class);
      this.minAdapter = moshi.adapter(int.class);
      this.yearAdapter = moshi.adapter(int.class);
      this.monAdapter = moshi.adapter(int.class);
      this.mdayAdapter = moshi.adapter(int.class);
      this.ampmAdapter = moshi.adapter(String.class);
    }
    @Override
    public ForecastConditionAdapter.FctTime fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      int hour = 0;
      int min = 0;
      int year = 0;
      int mon = 0;
      int mday = 0;
      String ampm = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "hour": {
            hour = hourAdapter.fromJson(reader);
            break;
          }
          case "min": {
            min = minAdapter.fromJson(reader);
            break;
          }
          case "year": {
            year = yearAdapter.fromJson(reader);
            break;
          }
          case "mon": {
            mon = monAdapter.fromJson(reader);
            break;
          }
          case "mday": {
            mday = mdayAdapter.fromJson(reader);
            break;
          }
          case "ampm": {
            ampm = ampmAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_ForecastConditionAdapter_FctTime(hour, min, year, mon, mday, ampm);
    }
    @Override
    public void toJson(JsonWriter writer, ForecastConditionAdapter.FctTime value) throws IOException {
      writer.beginObject();
      writer.name("hour");
      hourAdapter.toJson(writer, value.getHour());
      writer.name("min");
      minAdapter.toJson(writer, value.getMin());
      writer.name("year");
      yearAdapter.toJson(writer, value.getYear());
      writer.name("mon");
      monAdapter.toJson(writer, value.getMon());
      writer.name("mday");
      mdayAdapter.toJson(writer, value.getMday());
      writer.name("ampm");
      ampmAdapter.toJson(writer, value.getAmpm());
      writer.endObject();
    }
  }
}
