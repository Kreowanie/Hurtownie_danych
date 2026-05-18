package HD.projekt.drug.Kontroler;


import HD.projekt.drug.Repozytorium.FactDrugRepository;
import HD.projekt.drug.entity.FactDrug;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fakty")
public class FactDrugKontroler {

        private final FactDrugRepository factDrugRepository;

        public FactDrugKontroler(FactDrugRepository factDrugRepository){
            this.factDrugRepository = factDrugRepository;
        }


        @GetMapping
        public List<FactDrug> getAllFacts(){
            return factDrugRepository.findAll();
        }
}
