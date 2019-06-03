package efd.icmsipi.bloco0.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reg0005 {

    @Inclui
    private final String reg = "0005";

    @Inclui
    private String fantasia;

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

    public Reg0005(String fantasia, Integer cep, String end, String num, String compl,
                   String bairro, String fone, String fax, String email) {

        this.fantasia = fantasia;
        this.cep = cep;
        this.end = end;
        this.num = num;
        this.compl = compl;
        this.bairro = bairro;
        this.fone = fone;
        this.fax = fax;
        this.email = email;

    }

    public Reg0005(){}

}
