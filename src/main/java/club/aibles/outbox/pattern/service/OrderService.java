package club.aibles.outbox.pattern.service;

import club.aibles.outbox.pattern.entity.OrderEntity;

public interface OrderService {
  OrderEntity create(int total, String buyer);
}
