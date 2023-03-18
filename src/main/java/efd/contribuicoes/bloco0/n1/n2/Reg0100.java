package efd.contribuicoes.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0100 implements Serializable {
	private static final long serialVersionUID = -4589368267802450088L;

	@Getter @Inclui
    private final String reg = "0100";

    @Getter @Setter @Inclui
    private String nome;

    @Getter @Setter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Setter @Inclui
    private String crc;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Setter @Inclui(zerosEsquerda = 8)
    private Integer cep;

    @Getter @Setter @Inclui
    private String end;

    @Getter @Setter @Inclui
    private String num;

    @Getter @Setter @Inclui
    private String compl;

    @Getter @Setter @Inclui
    private String bairro;

    @Getter @Setter @Inclui
    private String fone;

    @Getter @Setter @Inclui
    private String fax;

    @Getter @Setter @Inclui
    private String email;

    @Getter @Setter @Inclui(zerosEsquerda = 7)
    private Integer codMun;

    public Reg0100(String nome, Long cpf, String crc, Long cnpj, Integer cep, String end, String num, String compl, String bairro, String fone, String fax, String email, Integer codMun) {
        this.nome = nome;
        this.cpf = cpf;
        this.crc = crc;
        this.cnpj = cnpj;
        this.cep = cep;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
        this.fone = fone;
        this.fax = fax;
        this.email = email;
        this.codMun = codMun;
    }

    public Reg0100(){}
}
