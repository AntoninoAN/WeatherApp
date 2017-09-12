package com.foo.umbrella.data.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;

final class AutoValue_DisplayLocation extends $AutoValue_DisplayLocation {
  AutoValue_DisplayLocation(String fullName, String city, String stateAbbreviation, String stateName, String country, String zip) {
    super(fullName, city, stateAbbreviation, stateName, country, zip);
  }

  public static JsonAdapter<DisplayLocation> jsonAdapter(Moshi moshi) {
    return new MoshiJsonAdapter(moshi);
  }

  public static final class MoshiJsonAdapter extends JsonAdapter<DisplayLocation> {
    private final JsonAdapter<String> fullNameAdapter;
    private final JsonAdapter<String> cityAdapter;
    private final JsonAdapter<String> stateAbbreviationAdapter;
    private final JsonAdapter<String> stateNameAdapter;
    private final JsonAdapter<String> countryAdapter;
    private final JsonAdapter<String> zipAdapter;
    public MoshiJsonAdapter(Moshi moshi) {
      this.fullNameAdapter = moshi.adapter(String.class);
      this.cityAdapter = moshi.adapter(String.class);
      this.stateAbbreviationAdapter = moshi.adapter(String.class);
      this.stateNameAdapter = moshi.adapter(String.class);
      this.countryAdapter = moshi.adapter(String.class);
      this.zipAdapter = moshi.adapter(String.class);
    }
    @Override
    public DisplayLocation fromJson(JsonReader reader) throws IOException {
      reader.beginObject();
      String fullName = null;
      String city = null;
      String stateAbbreviation = null;
      String stateName = null;
      String country = null;
      String zip = null;
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (reader.peek() == JsonReader.Token.NULL) {
          reader.skipValue();
          continue;
        }
        switch (name) {
          case "full": {
            fullName = fullNameAdapter.fromJson(reader);
            break;
          }
          case "city": {
            city = cityAdapter.fromJson(reader);
            break;
          }
          case "state": {
            stateAbbreviation = stateAbbreviationAdapter.fromJson(reader);
            break;
          }
          case "state_name": {
            stateName = stateNameAdapter.fromJson(reader);
            break;
          }
          case "country": {
            country = countryAdapter.fromJson(reader);
            break;
          }
          case "zip": {
            zip = zipAdapter.fromJson(reader);
            break;
          }
          default: {
            reader.skipValue();
          }
        }
      }
      reader.endObject();
      return new AutoValue_DisplayLocation(fullName, city, stateAbbreviation, stateName, country, zip);
    }
    @Override
    public void toJson(JsonWriter writer, DisplayLocation value) throws IOException {
      writer.beginObject();
      writer.name("full");
      fullNameAdapter.toJson(writer, value.getFullName());
      writer.name("city");
      cityAdapter.toJson(writer, value.getCity());
      writer.name("state");
      stateAbbreviationAdapter.toJson(writer, value.getStateAbbreviation());
      writer.name("state_name");
      stateNameAdapter.toJson(writer, value.getStateName());
      writer.name("country");
      countryAdapter.toJson(writer, value.getCountry());
      writer.name("zip");
      zipAdapter.toJson(writer, value.getZip());
      writer.endObject();
    }
  }
}
