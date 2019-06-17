package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco0.n1.n2.n3.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Getter @Setter @Filho
    private Reg0145 reg0145;

    @Getter @Setter @Filho
    private List<Reg0150> reg0150;

    @Getter @Setter @Filho
    private List<Reg0190> reg0190;

    @Getter @Setter @Filho
    private List<Reg0200> reg0200;

    @Getter @Setter @Filho
    private List<Reg0400> reg0400;

    @Getter @Setter @Filho
    private List<Reg0450> reg0450;

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
