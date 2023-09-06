package club.aibles.outbox.pattern.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CustomerListener {

  @KafkaListener(topics = "dbserver1.outbox.order_log")
  public void listen(@Payload String message) {
    System.out.println(message);
  }
}
