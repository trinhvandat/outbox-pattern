package club.aibles.outbox.pattern.service;

import club.aibles.outbox.pattern.entity.OrderLogEntity;

public interface OrderLogService {
  void delete(OrderLogEntity orderLog);
}
