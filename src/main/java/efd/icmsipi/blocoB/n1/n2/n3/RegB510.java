package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegB510 {

    @Getter @Inclui
    private final String reg = "B510";

    @Getter @Setter @Inclui
    private String indProf;

    @Getter @Setter @Inclui
    private String indEsc;

    @Getter @Setter @Inclui
    private String indSoc;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Setter @Inclui
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
