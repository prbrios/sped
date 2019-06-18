package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegK255 {

    @Getter @Inclui
    private final String reg = "K255";

    @Getter @Setter @Inclui
    private LocalDate dtCons;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String codInsSubst;

    public RegK255(LocalDate dtCons, String codItem, BigDecimal qtd, String codInsSubst) {
        this.dtCons = dtCons;
        this.codItem = codItem;
        this.qtd = qtd;
        this.codInsSubst = codInsSubst;
    }

    public RegK255(){}
}