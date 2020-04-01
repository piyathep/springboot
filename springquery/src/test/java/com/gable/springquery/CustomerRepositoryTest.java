package com.gable.springquery;

import com.gable.springquery.entity.Customer;
import com.gable.springquery.entity.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringqueryApplication.class)
public class CustomerRepositoryTest {

    @Autowired
    public CustomerRepository repository;

    @Test
    public void doSomething(){
        insertData();
        getData();
    }

//    @Test
    public void insertData(){
        Customer customer = new Customer();
        customer.setFirstName("Fish");
        customer.setLastName("Stop");
//        repository.save(customer);

        System.out.println("Insert Data");
    }

//    @Test
    public void getData(){
        for (Customer customer : repository.findAll()){
            System.out.println(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getLastName());
        }
    }

//    @Test
    public void getData_1(){
//        Customer customer = repository.findOne(1L);
//        System.out.println(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getLastName());
    }
}
