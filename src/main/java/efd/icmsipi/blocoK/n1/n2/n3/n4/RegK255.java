package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class RegK255 {

    @Inclui
    private final String reg = "K255";

    @Inclui
    private LocalDate dtCons;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Inclui
    private String codInsSubst;

    public RegK255(LocalDate dtCons, String codItem, BigDecimal qtd, String codInsSubst) {
        this.dtCons = dtCons;
        this.codItem = codItem;
        this.qtd = qtd;
        this.codInsSubst = codInsSubst;
    }

    public RegK255(){}
}