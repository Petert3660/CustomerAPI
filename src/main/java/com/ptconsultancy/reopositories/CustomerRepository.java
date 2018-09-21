package com.ptconsultancy.reopositories;

import com.ptconsultancy.entities.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findCustomerById(Long custId);
}
