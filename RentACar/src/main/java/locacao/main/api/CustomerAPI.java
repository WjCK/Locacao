package locacao.main.api;

import locacao.main.entity.Customer;
import locacao.main.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customer")
public class CustomerAPI {

    private final CustomerRepository customerRepository;

    public CustomerAPI(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/{username}")
    public Customer getCustomer(@PathVariable String username) {
        return this.customerRepository.getByUsername(username);
    }
}
