package club.aibles.outbox.pattern.entity.event;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PostRemove;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractEvent<T> {

  @PostPersist
  protected abstract void afterCreate(T entity);

  @PostRemove
  protected void afterDelete(T entity) {
    if (log.isDebugEnabled()) {
      log.debug("afterDelete: {}", entity);
    }
  }
}
