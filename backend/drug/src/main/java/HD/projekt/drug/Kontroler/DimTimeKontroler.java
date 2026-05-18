package HD.projekt.drug.Kontroler;


import HD.projekt.drug.Repozytorium.DimTimeRepository;
import HD.projekt.drug.entity.DimTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/czas")

public class DimTimeKontroler {
    private final DimTimeRepository dimTimeRepository;

    public DimTimeKontroler(DimTimeRepository dimTimeRepository){
        this.dimTimeRepository = dimTimeRepository;

}

@GetMapping
public List<DimTime> getAllTime(){
    return dimTimeRepository.findAll();
}
}

