package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.n5.RegC481;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.n5.RegC485;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC405 {

    @Getter @Inclui
    private final String reg = "C405";

    @Getter @Inclui
    private LocalDate dtDoc;

    @Getter @Inclui
    private Integer cro;

    @Getter @Inclui
    private Integer crz;

    @Getter @Inclui
    private Integer numCooFin;

    @Getter @Inclui
    private BigDecimal gtFin;

    @Getter @Inclui
    private BigDecimal vlBrt;

    @Getter @Setter @Filho
    private List<RegC481> regC481;

    @Getter @Setter @Filho
    private List<RegC485> regC485;

    public RegC405(LocalDate dtDoc, Integer cro, Integer crz, Integer numCooFin, BigDecimal gtFin, BigDecimal vlBrt) {
        this.dtDoc = dtDoc;
        this.cro = cro;
        this.crz = crz;
        this.numCooFin = numCooFin;
        this.gtFin = gtFin;
        this.vlBrt = vlBrt;
    }

    public RegC405(){}
}
