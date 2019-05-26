package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1925 {

    @Inclui
    private final String reg = "1925";

    @Inclui
    private String codInfAdic;

    @Inclui
    private BigDecimal vlInfAdic;

    @Inclui
    private String descrComplAj;

}