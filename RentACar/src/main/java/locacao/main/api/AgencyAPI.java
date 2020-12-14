package locacao.main.api;

import locacao.main.entity.Agency;
import locacao.main.repository.AgencyRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/agency")
public class AgencyAPI {

    private final AgencyRepository agencyRepository;

    public AgencyAPI(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    @GetMapping
    public List<Agency> getAllAgencies()
    {
        return this.agencyRepository.findAll();
    }

    @GetMapping("{id}")
    public Agency getOneAgency(@PathVariable Long id){
        return this.agencyRepository.getAgencyByQuery(id);
    }
}