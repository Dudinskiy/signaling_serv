package com.example.signaling_serv.entity;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.Nullable;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;


@Table("users")
@Getter
@Setter
public class UserEntity implements PersistableEntity {

    @Id
    private UUID id;
    private String userName;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    @Transient
    private boolean isNew;


    @Override
    public @Nullable UUID getId() {
        return id;
    }

    @Transient
    public boolean isNew() {
        return isNew || id == null;
    }

    @Override
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
