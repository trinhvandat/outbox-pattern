package club.aibles.outbox.pattern.controller.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderCreatingRequest {
  private int total;
  private String buyer;
}
