package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0140 {

    @Getter @Inclui
    private final String reg = "0140";

    @Getter @Inclui
    private String codEst;

    @Getter @Inclui
    private String nome;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui
    private String uf;

    @Getter @Inclui
    private String ie;

    @Getter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Inclui
    private String im;

    @Getter @Inclui
    private String suframa;

    public Reg0140(String codEst, String nome, Long cnpj, String uf, String ie, Integer codMun, String im, String suframa) {
        this.codEst = codEst;
        this.nome = nome;
        this.cnpj = cnpj;
        this.uf = uf;
        this.ie = ie;
        this.codMun = codMun;
        this.im = im;
        this.suframa = suframa;
    }

    public Reg0140(){}
}
