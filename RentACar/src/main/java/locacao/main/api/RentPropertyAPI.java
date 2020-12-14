package locacao.main.api;


import locacao.main.entity.RentProperty;
import locacao.main.repository.RentPropertyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/rentProperty")
public class RentPropertyAPI {

    private final RentPropertyRepository rentPropertyRepository;

    public RentPropertyAPI(RentPropertyRepository rentPropertyRepository) {
        this.rentPropertyRepository = rentPropertyRepository;
    }

    @GetMapping
    public List<RentProperty> getAll(){
        return this.rentPropertyRepository.findAll();
    }
}