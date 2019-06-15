package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0150 {

    @Getter @Inclui
    private final String reg = "0150";

    @Getter @Inclui
    private String codPart;

    @Getter @Inclui
    private String nome;

    @Getter @Inclui
    private Integer codPais;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Inclui
    private String ie;

    @Getter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Inclui
    private String suframa;

    @Getter @Inclui
    private String end;

    @Getter @Inclui
    private String num;

    @Getter @Inclui
    private String compl;

    @Getter @Inclui
    private String bairro;

    public Reg0150(String codPart, String nome, Integer codPais, Long cnpj, Long cpf, String ie, Integer codMun, String suframa, String end, String num, String compl, String bairro) {
        this.codPart = codPart;
        this.nome = nome;
        this.codPais = codPais;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.ie = ie;
        this.codMun = codMun;
        this.suframa = suframa;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
    }

    public Reg0150(){}
}
