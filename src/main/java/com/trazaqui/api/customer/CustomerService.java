package com.trazaqui.api.customer;

import java.util.List;

import com.trazaqui.api.address.Address;
import com.trazaqui.api.address.AddressType;
import com.trazaqui.api.document.Document;
import com.trazaqui.api.document.DocumentType;
import com.trazaqui.api.valueObjects.CustomerName;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public List<Customer> getAllCustumers() {
        Address address = new Address("123124121", "street", "number", "district", "zipCode", "city",
                AddressType.HOME);
        Document document = new Document("111241241242342", "number", DocumentType.CPF);

        CustomerName cName = new CustomerName("Marcos", "Sabatini");

        Customer customer = new Customer("881712666", cName, address, document);
        return List.of(customer);
    }
}
