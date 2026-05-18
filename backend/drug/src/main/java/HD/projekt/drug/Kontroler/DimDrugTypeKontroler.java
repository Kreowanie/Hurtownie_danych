package HD.projekt.drug.Kontroler;



import HD.projekt.drug.Repozytorium.DimDrugTypeRepository;
import HD.projekt.drug.entity.DimDrugType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("typleku")
public class DimDrugTypeKontroler {
    private final DimDrugTypeRepository DimDrugTypeRepository;

    public DimDrugTypeKontroler(DimDrugTypeRepository dimDrugTypeRepository) {
        DimDrugTypeRepository = dimDrugTypeRepository;
    }


@GetMapping
public List<DimDrugType> getAllTypes() {
    return DimDrugTypeRepository.findAll();
}
}