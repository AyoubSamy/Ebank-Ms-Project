package net.ayoub.customerservice.web;

import lombok.RequiredArgsConstructor;
import net.ayoub.customerservice.entities.Customer;
import net.ayoub.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerRestController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }
}
