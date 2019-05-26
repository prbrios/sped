package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bloco1390 {

    @Inclui
    private final String reg = "1390";

    @Inclui(zerosEsquerda = 2)
    private Integer codProd;

}