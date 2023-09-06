package club.aibles.outbox.pattern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "orders")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEntity {
  @Id
  private String id;
  private Integer total;
  private String status;
  private String buyer;

  @PrePersist
  public void ensureId() {
    this.id = this.id == null ? UUID.randomUUID().toString() : this.id;
  }
}
