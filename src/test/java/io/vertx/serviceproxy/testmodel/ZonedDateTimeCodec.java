package io.vertx.serviceproxy.testmodel;

import io.vertx.core.spi.json.JsonMapper;

import java.time.ZonedDateTime;

public class ZonedDateTimeCodec implements JsonMapper<ZonedDateTime, String> {

  public static final ZonedDateTimeCodec INSTANCE = new ZonedDateTimeCodec();

  @Override
  public String serialize(ZonedDateTime value) throws IllegalArgumentException {
    return (value != null) ? value.toString() : null;
  }

  @Override
  public Class<ZonedDateTime> getTargetClass() {
    return ZonedDateTime.class;
  }

  @Override
  public ZonedDateTime deserialize(String value) throws IllegalArgumentException {
    return (value != null) ? ZonedDateTime.parse(value) : null;
  }
}
