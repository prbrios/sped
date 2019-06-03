package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK275;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK270 {

    @Inclui
    private final String reg = "K270";

    @Inclui
    private LocalDate dtIniAp;

    @Inclui
    private LocalDate dtFinAp;

    @Inclui
    private String codOpOs;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Inclui
    private String origem;

    @Filho
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