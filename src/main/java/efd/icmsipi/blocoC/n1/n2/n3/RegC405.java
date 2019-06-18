package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegC405 {

    @Getter @Inclui
    private final String reg = "C405";

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private Integer cro;

    @Getter @Setter @Inclui
    private Integer crz;

    @Getter @Setter @Inclui
    private Integer numCooFin;

    @Getter @Setter @Inclui
    private BigDecimal gtFin;

    @Getter @Setter @Inclui
    private BigDecimal vlBrt;

    @Getter @Setter @Filho
    private RegC410 regC410;

    @Getter @Setter @Filho
    private List<RegC420> regC420;

    @Getter @Setter @Filho
    private List<RegC460> regC460;

    @Getter @Setter @Filho
    private List<RegC490> regC490;

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