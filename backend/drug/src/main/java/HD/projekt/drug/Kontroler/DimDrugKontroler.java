package HD.projekt.drug.Kontroler;

import HD.projekt.drug.Repozytorium.DimDrugRepository;
import HD.projekt.drug.entity.DimDrug;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leki")
public class DimDrugKontroler {
    private final DimDrugRepository DimDrugRepository;

    public DimDrugKontroler(DimDrugRepository DimDrugRepository) {
        this.DimDrugRepository = DimDrugRepository;
    }


    @GetMapping
    public List<DimDrug> getAllDrugs()
    {
        return DimDrugRepository.findAll();
    }
}