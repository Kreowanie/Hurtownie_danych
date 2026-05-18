package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DimConType", schema = "dbo")
public class DimConType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dimName")
    private String dimName;

    public DimConType() {
    }

    public DimConType(final String dimName) {
        this.dimName = dimName;
    }

    public Integer getId() {
        return id;
    }

    public String getDimName() {
        return dimName;
    }
}