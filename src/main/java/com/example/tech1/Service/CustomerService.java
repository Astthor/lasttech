package com.example.tech1.Service;

import com.example.tech1.Model.Customer;
import com.example.tech1.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> fetchAll(){
        return customerRepository.fetchAll();
    }
    public Customer addCustomer(Customer c){
        return customerRepository.addCustomer(c);
    }
    public Customer findCustomer(int customerID){
        return customerRepository.findCustomer(customerID);
    }
    public Boolean deleteCustomer(int customerID){
        return customerRepository.deleteCustomer(customerID);
    }
    public Customer updateCustomer(int customerID, Customer c){
        return customerRepository.updateCustomer(customerID, c);
    }
    public List<Customer> findByKeyword(String keyword){
        return customerRepository.findByKeyword(keyword);
    }
}
