package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK255;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK250 {

    @Inclui
    private final String reg = "K250";

    @Inclui
    private LocalDate dtProd;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Filho
    private List<RegK255> regK255;

    public RegK250(LocalDate dtProd, String codItem, BigDecimal qtd) {
        this.dtProd = dtProd;
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK250(){}
}