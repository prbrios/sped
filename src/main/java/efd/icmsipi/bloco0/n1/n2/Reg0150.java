package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0175;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class Reg0150 {

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

    @Getter @Setter @Inclui
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

    @Getter @Setter @Filho
    private List<Reg0175> reg0175;

    public Reg0150(String codPart, String nome, Integer codPais, Long cnpj, Long cpf,
                   String ie, Integer codMun, String suframa, String end, String num,
                   String compl, String bairro) {

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
