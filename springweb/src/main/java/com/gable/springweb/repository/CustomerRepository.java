package com.gable.springweb.repository;

import com.gable.springweb.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public default ArrayList<String> getFullName(){

        ArrayList<String> fullNameList = new ArrayList<String>();

        for(Customer customer:this.findAll()){
            fullNameList.add(customer.getFirstName() + " " + customer.getLastName());
        }

        return fullNameList;
    }
}
