package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Table(name = "DrugSales")

public class DrugSales {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dimName")
    private String dimName;

    public DrugSales(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}

