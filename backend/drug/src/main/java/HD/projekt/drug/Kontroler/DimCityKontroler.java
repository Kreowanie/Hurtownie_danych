package HD.projekt.drug.Kontroler;

import HD.projekt.drug.entity.DimCity;
import HD.projekt.drug.Repozytorium.DimCityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RestController
    @RequestMapping("/miasta")
public class DimCityKontroler {
        private final DimCityRepository dimCityRepository;

        public  DimCityKontroler(DimCityRepository dimCityRepository) {
            this.dimCityRepository = dimCityRepository;
        }
        @GetMapping
        public List<DimCity> getAllCities() {
            return dimCityRepository.findAll();
        }
    }






