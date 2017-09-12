package com.foo.umbrella.data.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

final class AutoValue_CurrentObservation extends $AutoValue_CurrentObservation {
  AutoValue_CurrentObservation(DisplayLocation displayLocation, String tempFahrenheit, String tempCelsius, String weatherDescription, String iconName) {
    super(displayLocation, tempFahrenheit, tempCelsius, weatherDescription, iconName);
  }

  public static JsonAdapter<CurrentObservation> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<CurrentObservation> {
    private final JsonAdapter<DisplayLocation> displayLocationAdapter;
    private final JsonAdapter<String> tempFahrenheitAdapter;
    private final JsonAdapter<String> tempCelsiusAdapter;
    private final JsonAdapter<String> weatherDescriptionAdapter;
    private final JsonAdapter<String> iconNameAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.displayLocationAdapter = moshi.adapter(DisplayLocation.class);
      this.tempFahrenheitAdapter = moshi.adapter(String.class);
      this.tempCelsiusAdapter = moshi.adapter(String.class);
      this.weatherDescriptionAdapter = moshi.adapter(String.class);
      this.iconNameAdapter = moshi.adapter(String.class);
    }
    @Override
    public CurrentObservation fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      DisplayLocation displayLocation = null;
      String tempFahrenheit = null;
      String tempCelsius = null;
      String weatherDescription = null;
      String iconName = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "display_location": {
            displayLocation = displayLocationAdapter.fromJson(reader);
            break;
          }
          case "temp_f": {
            tempFahrenheit = tempFahrenheitAdapter.fromJson(reader);
            break;
          }
          case "temp_c": {
            tempCelsius = tempCelsiusAdapter.fromJson(reader);
            break;
          }
          case "weather": {
            weatherDescription = weatherDescriptionAdapter.fromJson(reader);
            break;
          }
          case "icon": {
            iconName = iconNameAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_CurrentObservation(displayLocation, tempFahrenheit, tempCelsius, weatherDescription, iconName);
    }
    @Override
    public void toJson(JsonWriter writer, CurrentObservation value) throws IOException {
      writer.beginObject();
      writer.name("display_location");
      displayLocationAdapter.toJson(writer, value.getDisplayLocation());
      writer.name("temp_f");
      tempFahrenheitAdapter.toJson(writer, value.getTempFahrenheit());
      writer.name("temp_c");
      tempCelsiusAdapter.toJson(writer, value.getTempCelsius());
      writer.name("weather");
      weatherDescriptionAdapter.toJson(writer, value.getWeatherDescription());
      writer.name("icon");
      iconNameAdapter.toJson(writer, value.getIconName());
      writer.endObject();
    }
  }
}
