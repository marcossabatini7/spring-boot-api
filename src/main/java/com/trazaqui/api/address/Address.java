package com.trazaqui.api.address;

import com.trazaqui.api.base.BaseUuidEntity;

public class Address extends BaseUuidEntity {
    private String street;
    private String number;
    private String district;
    private String zipCode;
    private String city;
    private AddressType type;

    public Address() {
    }

    public Address(String street, String number, String district, String zipCode, String city, AddressType type) {
        this.street = street;
        this.number = number;
        this.district = district;
        this.zipCode = zipCode;
        this.city = city;
        this.type = type;
    }

    public Address(String uuid, String street, String number, String district, String zipCode, String city,
            AddressType type) {
        super(uuid);
        this.street = street;
        this.number = number;
        this.district = district;
        this.zipCode = zipCode;
        this.city = city;
        this.type = type;
    }

    public Address(Long id, String uuid, String street, String number, String district, String zipCode, String city,
            AddressType type) {
        super(id, uuid);
        this.street = street;
        this.number = number;
        this.district = district;
        this.zipCode = zipCode;
        this.city = city;
        this.type = type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", street=" + street + ", type=" + type + "]";
    }
}
