package club.aibles.outbox.pattern.repository;

import club.aibles.outbox.pattern.entity.OrderLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLogRepository extends JpaRepository<OrderLogEntity, Integer> {
}
