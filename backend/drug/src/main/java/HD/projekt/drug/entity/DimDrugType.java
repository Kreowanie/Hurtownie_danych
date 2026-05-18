package HD.projekt.drug.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "DimDrugType", schema = "dbo")
public class DimDrugType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dimName")
    private String dimName;

    public DimDrugType(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}
