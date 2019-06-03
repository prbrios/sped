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

    public RegB510(String indProf, String indEsc, String indSoc, Long cpf, String nome) {
        this.indProf = indProf;
        this.indEsc = indEsc;
        this.indSoc = indSoc;
        this.cpf = cpf;
        this.nome = nome;
    }

    public RegB510(){}
}
