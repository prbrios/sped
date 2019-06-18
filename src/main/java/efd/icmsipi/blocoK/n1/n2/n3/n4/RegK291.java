package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegK291 {

    @Getter @Inclui
    private final String reg = "K291";

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    public RegK291(String codItem, BigDecimal qtd) {
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK291(){}
}