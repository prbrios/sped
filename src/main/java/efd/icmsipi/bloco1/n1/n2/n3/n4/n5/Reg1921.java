package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1922;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1923;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class Reg1921 implements Serializable {
	private static final long serialVersionUID = 4263313987251147471L;

	@Getter @Inclui
    private final String reg = "1921";

    @Getter @Setter @Inclui
    private String codAjApur;

    @Getter @Setter @Inclui
    private String descrComplAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAjApur;

    @Getter @Setter @Filho
    private List<Reg1922> reg1922;

    @Getter @Setter @Filho
    private List<Reg1923> reg1923;

    public Reg1921(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public Reg1921(){}
}