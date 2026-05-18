package HD.projekt.drug.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "DimCity", schema = "dbo")
public class DimCity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dimName")
    private String dimName;

    public DimCity() {
    }

    public Integer getId() {
        return id;
    }

    public String getDimName() {
        return dimName;
    }
}