package club.aibles.outbox.pattern.service.impl;

import club.aibles.outbox.pattern.entity.OrderEntity;
import club.aibles.outbox.pattern.entity.OrderLogEntity;
import club.aibles.outbox.pattern.repository.OrderLogRepository;
import club.aibles.outbox.pattern.repository.OrderRepository;
import club.aibles.outbox.pattern.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

  private final OrderRepository orderRepository;
  private final OrderLogRepository orderLogRepository;

  @Transactional
  @Override
  public OrderEntity create(int total, String buyer) {
    var order = OrderEntity.builder()
        .total(total)
        .buyer(buyer)
        .status("CREATED")
        .build();

    order = orderRepository.save(order);

    var orderLog = OrderLogEntity.builder()
        .changeType("NEW")
        .detailOrder(order)
        .build();

    orderLogRepository.save(orderLog);

    return order;
  }
}
