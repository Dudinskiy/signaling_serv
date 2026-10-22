package com.example.signaling_serv.entity;

import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Table("rooms")
@Getter
@Setter
public class RoomEntity implements PersistableEntity {

    @Id
    private UUID id;
    private LocalDateTime createdTime;
    @Transient
    private boolean isNew;


    @Override
    public @Nullable UUID getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return isNew || id == null;
    }

    @Override
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
