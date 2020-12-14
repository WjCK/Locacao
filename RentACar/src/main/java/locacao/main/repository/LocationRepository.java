package locacao.main.repository;


import locacao.main.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location,Long> {
}
