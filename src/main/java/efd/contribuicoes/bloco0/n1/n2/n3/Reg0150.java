package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0150 {

    @Inclui
    private final String reg = "0150";

    @Inclui
    private String codPart;

    @Inclui
    private String nome;

    @Inclui
    private Integer codPais;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String ie;

    @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Inclui
    private String suframa;

    @Inclui
    private String end;

    @Inclui
    private String num;

    @Inclui
    private String compl;

    @Inclui
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
