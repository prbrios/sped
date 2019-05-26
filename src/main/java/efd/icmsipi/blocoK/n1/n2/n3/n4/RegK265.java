package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegK265 {

    @Inclui
    private final String reg = "K265";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCons;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdRet;

}