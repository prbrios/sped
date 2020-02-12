package efd.icmsipi.blocoK.n1.n2.n3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK255;
import lombok.Getter;
import lombok.Setter;


public class RegK250 {

    @Getter @Inclui
    private final String reg = "K250";

    @Getter @Setter @Inclui
    private LocalDate dtProd;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Getter @Setter @Filho
    private List<RegK255> regK255;

    public RegK250(LocalDate dtProd, String codItem, BigDecimal qtd) {
        this.dtProd = dtProd;
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK250(){}
}