package com.example.signaling_serv.util;

import com.example.signaling_serv.entity.PersistableEntity;
import com.github.f4b6a3.uuid.UuidCreator;
import org.springframework.data.r2dbc.mapping.event.BeforeConvertCallback;
import org.springframework.data.relational.core.sql.SqlIdentifier;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class UuidV7BeforeConvert implements BeforeConvertCallback<PersistableEntity> {

    @Override
    public Mono<PersistableEntity> onBeforeConvert(PersistableEntity entity, SqlIdentifier table) {
        if(entity.getId() == null){
            entity.setId(UuidCreator.getTimeOrderedEpoch());
            entity.setIsNew(true);
        }
        return Mono.just(entity);
    }
}
