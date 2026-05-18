package HD.projekt.drug.Kontroler;

import HD.projekt.drug.entity.DimConType;
import HD.projekt.drug.Repozytorium.DimConTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("typy")
public class DimConTypeKontroler {

    private final DimConTypeRepository  DimConTypeRepository ;


    public  DimConTypeKontroler(DimConTypeRepository DimConTypeRepository)
    {
        this.DimConTypeRepository = DimConTypeRepository;
    }

    @GetMapping
    public List<DimConType> getAllTypes() {
        return DimConTypeRepository.findAll();
    }

}
