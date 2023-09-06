package club.aibles.outbox.pattern.service.impl;

import club.aibles.outbox.pattern.entity.OrderLogEntity;
import club.aibles.outbox.pattern.repository.OrderLogRepository;
import club.aibles.outbox.pattern.service.OrderLogService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderLogServiceImpl implements OrderLogService {

  @PersistenceContext
  private EntityManager entityManager;

  @Override
  public void delete(OrderLogEntity orderLog) {
    entityManager.remove(orderLog);
  }
}
