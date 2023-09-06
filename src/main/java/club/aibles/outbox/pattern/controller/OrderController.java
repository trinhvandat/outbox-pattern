package club.aibles.outbox.pattern.controller;

import club.aibles.outbox.pattern.controller.request.OrderCreatingRequest;
import club.aibles.outbox.pattern.entity.OrderEntity;
import club.aibles.outbox.pattern.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {
  private final OrderService orderService;

  @PostMapping("/v1/orders")
  public OrderEntity create(@RequestBody OrderCreatingRequest request) {
    return orderService.create(request.getTotal(), request.getBuyer());
  }
}
