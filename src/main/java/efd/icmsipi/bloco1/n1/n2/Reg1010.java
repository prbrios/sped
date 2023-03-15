package efd.icmsipi.bloco1.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class Reg1010 implements Serializable {
	private static final long serialVersionUID = 2768860285240212645L;

	@Getter @Inclui
    private final String reg = "1010";

    @Getter @Setter @Inclui
    private String indExp;

    @Getter @Setter @Inclui
    private String indCcrf;

    @Getter @Setter @Inclui
    private String indComb;

    @Getter @Setter @Inclui
    private String indUsina;

    @Getter @Setter @Inclui
    private String indVa;

    @Getter @Setter @Inclui
    private String indEe;

    @Getter @Setter @Inclui
    private String indCart;

    @Getter @Setter @Inclui
    private String indForm;

    @Getter @Setter @Inclui
    private String indAer;

    @Getter @Setter @Inclui
    private String indGiaf1;

    @Getter @Setter @Inclui
    private String indGiaf3;

    @Getter @Setter @Inclui
    private String indGiaf4;

    @Getter @Setter @Inclui
    private String indRestResarcComplIcms;

    public Reg1010(String indExp, String indCcrf, String indComb, String indUsina, String indVa, String indEe, String indCart, String indForm, String indAer, String indGiaf1, String indGiaf3, String indGiaf4, String indRestResarcComplIcms) {
        this.indExp = indExp;
        this.indCcrf = indCcrf;
        this.indComb = indComb;
        this.indUsina = indUsina;
        this.indVa = indVa;
        this.indEe = indEe;
        this.indCart = indCart;
        this.indForm = indForm;
        this.indAer = indAer;
        this.indGiaf1 = indGiaf1;
        this.indGiaf3 = indGiaf3;
        this.indGiaf4 = indGiaf4;
        this.indRestResarcComplIcms = indRestResarcComplIcms;
    }

    public Reg1010(){}
}