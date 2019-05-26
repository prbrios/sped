package efd.icmsipi.bloco0.n1.n2;

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

}
