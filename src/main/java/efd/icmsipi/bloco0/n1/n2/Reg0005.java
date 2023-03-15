package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg0005 implements Serializable {
	private static final long serialVersionUID = -3244182407110706470L;

	@Getter @Inclui
    private final String reg = "0005";

    @Getter @Setter @Inclui
    private String fantasia;

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
