package via.sep3.group11.tier3.model;

import javax.persistence.*;
import java.time.LocalDate;

import static via.sep3.group11.tier3.model.Date.convertDateObjectToLocalDate;

@Entity
@Table(name = "agreement")
public class Agreement {

    @Id
    @SequenceGenerator(name = "agreement_sequence", sequenceName = "agreement_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agreement_sequence")
    private long agreementId;

    @Column(name = "agreement_date")
    private LocalDate date;


    //Todo many to one??
    @OneToOne
    @JoinColumn(name = "refugee_id")
    private Refugee refugee;


    // todo change to one to many
    @OneToOne
    @JoinColumn(name = "housing_id")
    private Housing housing;

    @ManyToOne
    @JoinColumn(name = "host_id")
    private Host host;

    @Column(name = "accepted")
    private boolean accepted;

    public Agreement() {
    }

    public Agreement(Date date, Refugee refugee, Housing housing, Host host) {
        this.date = convertDateObjectToLocalDate(date);
        this.refugee = refugee;
        this.housing = housing;
        this.host = host;
        accepted = false;
    }

    public long getAgreementId() {
        return agreementId;
    }

    public LocalDate getDate() {
        return date;
    }

    public Refugee getRefugee() {
        return refugee;
    }

    public Housing getHousing() {
        return housing;
    }

    public Host getHost() {
        return host;
    }

    //TODO DELETE AGAIN ONLY FOR TESTING!
    public void setDate(LocalDate date) {
        this.date = date;
    }
}
