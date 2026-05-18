package HD.projekt.drug.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "FactDrug", schema = "dbo")
public class FactDrug {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "dimTime_id")
    private int dimTime_id;

    @Column(name = "dimMan_id")
    private int dimMan_id;

    @Column(name = "dimDrug_id")
    private int dimDrug_id;

    @Column(name = "dimConType_id")
    private int dimConType_id;

    @Column(name = "dimCity_id")
    private int dimCity_id;

    @Column(name = "Is_Refunded")
    private  float Is_Refunded;

    @Column(name = "fctCtn")
    private int fctCtn;

    @Column(name = "fctSum")
    private int fctSum;

    @Column(name = "fctAvg")
    private int fctAvg;

    @Column(name = "fctMin")
    private int fctMin;

    @Column(name = "fctMax")
    private int fctMax;


    public FactDrug(

            final int dimTime_id,
            final int dimMan_id,
            final int dimDrug_id,
            final int dimConType_id,
            final int dimCity_id,
            final float Is_Refunded,
            final int fctCtn,
            final int fctSum,
            final int fctAvg,
            final int fctMin,
            final int fctMax

    ) {
        this.dimTime_id = dimTime_id;
        this.dimMan_id = dimMan_id;
        this.dimDrug_id = dimDrug_id;
        this.dimConType_id = dimConType_id;
        this.dimCity_id = dimCity_id;
        this.Is_Refunded = Is_Refunded;
        this.fctCtn = fctCtn;
        this.fctSum = fctSum;
        this.fctAvg = fctAvg;
        this.fctMin = fctMin;
        this.fctMax = fctMax;
    }
}
