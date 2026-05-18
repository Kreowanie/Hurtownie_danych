package HD.projekt.drug.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "DimTime", schema = "dbo")

public class DimTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "timeDay", nullable = false)
    private LocalDate timeDay;

    @Column(name = "timeWeek")
    private int timeWeek;

    @Column(name = "timeMonth")
    private String timeMonth;

    @Column(name = "timeYear")
    private int timeYear;

    protected DimTime() {
    }

    public DimTime(
            final LocalDate timeDay,
            final String timeMonth,
            final int timeWeek,
            final int timeYear
    ) {
        this.timeDay = timeDay;
        this.timeMonth = timeMonth;
        this.timeWeek = timeWeek;
        this.timeYear = timeYear;
    }
}