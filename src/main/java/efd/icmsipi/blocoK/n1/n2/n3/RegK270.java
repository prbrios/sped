package efd.icmsipi.blocoK.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK275;
import lombok.Getter;
import lombok.Setter;


public class RegK270 {

    @Getter @Inclui
    private final String reg = "K270";

    @Getter @Setter @Inclui
    private LocalDate dtIniAp;

    @Getter @Setter @Inclui
    private LocalDate dtFinAp;

    @Getter @Setter @Inclui
    private String codOpOs;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Getter @Setter @Inclui
    private String origem;

    @Getter @Setter @Filho
    private List<RegK275> regK275;

    public RegK270(LocalDate dtIniAp, LocalDate dtFinAp, String codOpOs, String codItem, BigDecimal qtdCorPos, BigDecimal qtdCorNeg, String origem) {
        this.dtIniAp = dtIniAp;
        this.dtFinAp = dtFinAp;
        this.codOpOs = codOpOs;
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCorNeg = qtdCorNeg;
        this.origem = origem;
    }

    public RegK270(){}
}