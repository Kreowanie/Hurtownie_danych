package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Table(name = "DimDrug")
public class DimDrug {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dimName")
    private String dimName;

    public DimDrug(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}