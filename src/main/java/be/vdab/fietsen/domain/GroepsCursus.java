package be.vdab.fietsen.domain;

import be.vdab.fietsen.domain.Cursus;
import net.bytebuddy.asm.Advice;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "groepscursussen")
//@DiscriminatorValue("G")
public class GroepsCursus extends Cursus {
    private LocalDate van;
    private LocalDate tot;

    protected GroepsCursus() {
    }

    public GroepsCursus(String naam, LocalDate van, LocalDate tot) {
        super(naam);
        this.van = van;
        this.tot = tot;
    }
}
