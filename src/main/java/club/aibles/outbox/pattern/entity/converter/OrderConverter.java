package club.aibles.outbox.pattern.entity.converter;

import club.aibles.outbox.pattern.entity.OrderEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import static club.aibles.outbox.pattern.utils.MapperUtils.getObjectMapper;

@Converter(autoApply = true)
public class OrderConverter implements AttributeConverter<OrderEntity, String> {
  @Override
  public String convertToDatabaseColumn(OrderEntity orderEntity) {
    try {
      return getObjectMapper().writeValueAsString(orderEntity);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Failed to convert object to JSON", e);
    }
  }

  @Override
  public OrderEntity convertToEntityAttribute(String orderEntityString) {
    try {
      return getObjectMapper().readValue(orderEntityString, OrderEntity.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException("Failed to convert JSON to object", e);
    }
  }
}
