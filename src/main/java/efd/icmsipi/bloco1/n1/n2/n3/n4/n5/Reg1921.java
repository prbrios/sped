package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1922;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1923;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1921 implements Serializable {
	private static final long serialVersionUID = 4263313987251147471L;

	@Inclui
    private final String reg = "1921";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<Reg1922> reg1922;

    @Filho
    private List<Reg1923> reg1923;

    public Reg1921(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public Reg1921(){}

    public String getReg() {
        return reg;
    }

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public String getDescrComplAj() {
        return descrComplAj;
    }

    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }

    public BigDecimal getVlAjApur() {
        return vlAjApur;
    }

    public void setVlAjApur(BigDecimal vlAjApur) {
        this.vlAjApur = vlAjApur;
    }

    public List<Reg1922> getReg1922() {
        return reg1922;
    }

    public void setReg1922(List<Reg1922> reg1922) {
        this.reg1922 = reg1922;
    }

    public List<Reg1923> getReg1923() {
        return reg1923;
    }

    public void setReg1923(List<Reg1923> reg1923) {
        this.reg1923 = reg1923;
    }
    
}