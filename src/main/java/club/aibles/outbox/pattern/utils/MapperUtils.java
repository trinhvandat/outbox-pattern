package club.aibles.outbox.pattern.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtils {

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  public static ObjectMapper getObjectMapper() {
    return OBJECT_MAPPER;
  }
}
