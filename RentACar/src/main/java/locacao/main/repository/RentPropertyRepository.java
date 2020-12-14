package locacao.main.repository;

import locacao.main.entity.RentProperty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentPropertyRepository extends JpaRepository<RentProperty, Long> {
}
