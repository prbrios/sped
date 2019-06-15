package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class Reg0100 {

    @Getter @Inclui
    private final String reg = "0100";

    @Getter @Inclui
    private String nome;

    @Getter @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Getter @Inclui
    private String crc;

    @Getter @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Getter @Inclui(zerosEsquerda = 8)
    private Integer cep;

    @Getter @Inclui
    private String end;

    @Getter @Inclui
    private String num;

    @Getter @Inclui
    private String compl;

    @Getter @Inclui
    private String bairro;

    @Getter @Inclui
    private String fone;

    @Getter @Inclui
    private String fax;

    @Getter @Inclui
    private String email;

    @Getter @Inclui(zerosEsquerda = 7)
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
