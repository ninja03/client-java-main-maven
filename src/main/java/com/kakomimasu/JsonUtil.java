package com.kakomimasu;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

class JsonUtil {
  public static <T> T parse(String json, Class<T> dto) {
    ObjectMapper mapper = new ObjectMapper();
    try {
      return (T) mapper.readValue(json, dto);
    } catch (IOException e) {
      return null;
    }
  }
}
