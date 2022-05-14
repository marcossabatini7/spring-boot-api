package com.trazaqui.api.base;

public abstract class BaseUuidEntity extends BaseEntity {
    private String uuid;

    public BaseUuidEntity() {
    }

    public BaseUuidEntity(String uuid) {
        this.uuid = uuid;
    }

    public BaseUuidEntity(Long id, String uuid) {
        super(id);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
