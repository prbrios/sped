package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Bloco1391;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Bloco1390 {

    @Inclui
    private final String reg = "1390";

    @Inclui(zerosEsquerda = 2)
    private Integer codProd;

    @Filho
    private List<Bloco1391> bloco1391;

}