package com.swagger.swaggerdemo.Controller;

import com.swagger.swaggerdemo.Model.CustomerModel;
import com.swagger.swaggerdemo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/listAllCustomers")
    public List<CustomerModel> getAllCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping("/oneCustomer/{id}")
    public Optional<CustomerModel> getCustomerById(@PathVariable("id") int id){
        return customerRepository.findById(id);
    }
    @PostMapping("/createCustomer")
    public CustomerModel creatCustomer(@RequestBody CustomerModel customerData ){
        return customerRepository.save(customerData);
    }
    @PutMapping("/updateCustomer/{id}")
    void updateCustomer(@PathVariable("id") int id,@RequestBody CustomerModel customerData){
        customerRepository.findById(id).map(customer->{
            customer.setcustomerId(customerData.getcustomerId());
            customer.setcustomerName(customerData.getcustomerName());
            customer.setEmailId(customerData.getEmailId());
            customer.setMobileNumber(customerData.getMobileNumber());
            customer.setExperience(customerData.getExperience());
            customer.setRole(customerData.getRole());
            return customerRepository.save(customer);
        }).orElseGet(()->{
            return customerRepository.save(customerData);
        });
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public String updateCustomer(@PathVariable("id") int id){
       customerRepository.deleteById(id);
       return "Customer data has been removed";
    }
}
