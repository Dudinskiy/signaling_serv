package com.example.signaling_serv.entity;

import org.springframework.data.domain.Persistable;

import java.util.UUID;

public interface PersistableEntity extends Persistable<UUID> {
    void setId(UUID id);

    void setIsNew(boolean isNew);
}
