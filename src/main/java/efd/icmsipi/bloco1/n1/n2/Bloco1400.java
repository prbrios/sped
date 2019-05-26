package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1400 {

    @Inclui
    private final String reg = "1400";

    @Inclui
    private String codItemImp;

    @Inclui(zerosEsquerda = 7)
    private Integer mun;

    @Inclui
    private BigDecimal valor;

}