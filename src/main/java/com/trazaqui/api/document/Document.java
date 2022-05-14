package com.trazaqui.api.document;

import com.trazaqui.api.base.BaseUuidEntity;

public class Document extends BaseUuidEntity {
    private String Number;
    private DocumentType type;

    public Document() {
    }

    public Document(String number, DocumentType type) {
        Number = number;
        this.type = type;
    }

    public Document(String uuid, String number, DocumentType type) {
        super(uuid);
        Number = number;
        this.type = type;
    }

    public Document(Long id, String uuid, String number, DocumentType type) {
        super(id, uuid);
        Number = number;
        this.type = type;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public DocumentType getType() {
        return type;
    }

    public void setType(DocumentType type) {
        this.type = type;
    }
}
