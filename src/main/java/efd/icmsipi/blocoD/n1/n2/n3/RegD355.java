package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD360;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD365;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD390;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegD355 {

    @Inclui
    private final String reg = "D355";

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Integer cro;

    @Inclui
    private Integer crz;

    @Inclui
    private Integer numCooFin;

    @Inclui
    private Integer gtFin;

    @Inclui
    private BigDecimal vlBrt;

    @Filho
    private RegD360 regD360;

    @Filho
    private List<RegD365> regD365;

    @Filho
    private List<RegD390> regD390;

    public RegD355(LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, Integer gtFin, BigDecimal vlBrt) {
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
    }

    public RegD355(){}
}