package club.aibles.outbox.pattern.entity;

import club.aibles.outbox.pattern.entity.converter.OrderConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderLogEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "change_type")
  private String changeType; // new, modify, delete

  @Convert(converter = OrderConverter.class)
  @Column(name = "detail_order")
  private OrderEntity detailOrder; // convert order to string
}
