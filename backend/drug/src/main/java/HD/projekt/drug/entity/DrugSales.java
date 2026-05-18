package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DrugSales", schema = "dbo")
public class DrugSales {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dimName")
    private String dimName;

    public DrugSales(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}

