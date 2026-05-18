package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Table(name = "DimMan")
public class DimMan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "dimName")
    private String dimName;

    public DimMan(

            final String dimName

    ) {
        this.dimName = dimName;
    }
}
