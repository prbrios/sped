package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegB510 {

    @Inclui
    private final String reg = "B510";

    @Inclui
    private String indProf;

    @Inclui
    private String indEsc;

    @Inclui
    private String indSoc;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String nome;

}
