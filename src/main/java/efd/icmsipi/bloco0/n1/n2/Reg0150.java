package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0175;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @Inclui
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

    @Filho
    private List<Reg0175> reg0175;

}