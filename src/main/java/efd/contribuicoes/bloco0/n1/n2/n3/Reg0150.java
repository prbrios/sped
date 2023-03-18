package efd.contribuicoes.bloco0.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0150 implements Serializable {
	private static final long serialVersionUID = -8616754463584656087L;

	@Getter @Inclui
	private final String reg = "0150";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String nome;

    @Getter @Setter @Inclui
    private Integer codPais;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Setter @Inclui
    private String ie;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    @Getter @Setter @Inclui
    private String suframa;

    @Getter @Setter @Inclui
    private String end;

    @Getter @Setter @Inclui
    private String num;

    @Getter @Setter @Inclui
    private String compl;

    @Getter @Setter @Inclui
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
