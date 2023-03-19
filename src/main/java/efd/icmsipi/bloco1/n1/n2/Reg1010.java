package efd.icmsipi.bloco1.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Inclui;

public class Reg1010 implements Serializable {
	private static final long serialVersionUID = 2768860285240212645L;

	@Inclui
    private final String reg = "1010";

    @Inclui
    private String indExp;

    @Inclui
    private String indCcrf;

    @Inclui
    private String indComb;

    @Inclui
    private String indUsina;

    @Inclui
    private String indVa;

    @Inclui
    private String indEe;

    @Inclui
    private String indCart;

    @Inclui
    private String indForm;

    @Inclui
    private String indAer;

    @Inclui
    private String indGiaf1;

    @Inclui
    private String indGiaf3;

    @Inclui
    private String indGiaf4;

    @Inclui
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

    public String getReg() {
        return reg;
    }

    public String getIndExp() {
        return indExp;
    }

    public void setIndExp(String indExp) {
        this.indExp = indExp;
    }

    public String getIndCcrf() {
        return indCcrf;
    }

    public void setIndCcrf(String indCcrf) {
        this.indCcrf = indCcrf;
    }

    public String getIndComb() {
        return indComb;
    }

    public void setIndComb(String indComb) {
        this.indComb = indComb;
    }

    public String getIndUsina() {
        return indUsina;
    }

    public void setIndUsina(String indUsina) {
        this.indUsina = indUsina;
    }

    public String getIndVa() {
        return indVa;
    }

    public void setIndVa(String indVa) {
        this.indVa = indVa;
    }

    public String getIndEe() {
        return indEe;
    }

    public void setIndEe(String indEe) {
        this.indEe = indEe;
    }

    public String getIndCart() {
        return indCart;
    }

    public void setIndCart(String indCart) {
        this.indCart = indCart;
    }

    public String getIndForm() {
        return indForm;
    }

    public void setIndForm(String indForm) {
        this.indForm = indForm;
    }

    public String getIndAer() {
        return indAer;
    }

    public void setIndAer(String indAer) {
        this.indAer = indAer;
    }

    public String getIndGiaf1() {
        return indGiaf1;
    }

    public void setIndGiaf1(String indGiaf1) {
        this.indGiaf1 = indGiaf1;
    }

    public String getIndGiaf3() {
        return indGiaf3;
    }

    public void setIndGiaf3(String indGiaf3) {
        this.indGiaf3 = indGiaf3;
    }

    public String getIndGiaf4() {
        return indGiaf4;
    }

    public void setIndGiaf4(String indGiaf4) {
        this.indGiaf4 = indGiaf4;
    }

    public String getIndRestResarcComplIcms() {
        return indRestResarcComplIcms;
    }

    public void setIndRestResarcComplIcms(String indRestResarcComplIcms) {
        this.indRestResarcComplIcms = indRestResarcComplIcms;
    }
    
}