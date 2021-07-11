package com.swagger.swaggerdemo.Repository;

import com.swagger.swaggerdemo.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel,Integer> {

}
