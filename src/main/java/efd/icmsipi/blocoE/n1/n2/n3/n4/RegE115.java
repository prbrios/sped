package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RegE115 {

    @Inclui
    private final String reg = "E115";

    @Inclui
    private String codInfAdic;

    @Inclui
    private BigDecimal vlInfAdic;

    @Inclui
    private String descrComplAj;

}