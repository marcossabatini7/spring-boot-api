package com.trazaqui.api.customer;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.trazaqui.api.address.Address;
import com.trazaqui.api.base.BaseUuidEntity;
import com.trazaqui.api.document.Document;
import com.trazaqui.api.valueObjects.CustomerName;

@Entity
@Table(name = "customer")
public class Customer extends BaseUuidEntity {
    private CustomerName name;
    private Address adress;
    private Document document;

    public Customer() {
    }

    public Customer(CustomerName name, Address adress, Document document) {
        this.name = name;
        this.adress = adress;
        this.document = document;
    }

    public Customer(String uuid, CustomerName name, Address adress, Document document) {
        super(uuid);
        this.name = name;
        this.adress = adress;
        this.document = document;
    }

    public Customer(Long id, String uuid, CustomerName name, Address adress, Document document) {
        super(id, uuid);
        this.name = name;
        this.adress = adress;
        this.document = document;
    }

    public CustomerName getName() {
        return name;
    }

    public void setName(CustomerName name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Customer [adress=" + adress + ", document=" + document + ", name=" + name + "]";
    }
}
