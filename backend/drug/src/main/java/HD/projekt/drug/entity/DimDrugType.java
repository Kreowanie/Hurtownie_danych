package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Table(name = "DimDrugType")
public class DimDrugType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dimName")
    private String dimName;

    public DimDrugType(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}
