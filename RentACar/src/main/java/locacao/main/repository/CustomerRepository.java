package locacao.main.repository;

import locacao.main.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    public Customer getByUsername(String username);
}
