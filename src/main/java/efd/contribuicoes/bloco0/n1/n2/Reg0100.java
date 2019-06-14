package efd.contribuicoes.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0100 {

    @Inclui
    private final String reg = "0100";

    @Inclui
    private String nome;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String crc;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui(zerosEsquerda = 8)
    private Integer cep;

    @Inclui
    private String end;

    @Inclui
    private String num;

    @Inclui
    private String compl;

    @Inclui
    private String bairro;

    @Inclui
    private String fone;

    @Inclui
    private String fax;

    @Inclui
    private String email;

    @Inclui(zerosEsquerda = 7)
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
