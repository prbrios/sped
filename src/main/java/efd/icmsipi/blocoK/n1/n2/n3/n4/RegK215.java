package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegK215 {

    @Inclui
    private final String reg = "K215";

    @Inclui
    private String codItemDes;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdDes;

    public RegK215(String codItemDes, BigDecimal qtdDes) {
        this.codItemDes = codItemDes;
        this.qtdDes = qtdDes;
    }

    public RegK215(){}
}