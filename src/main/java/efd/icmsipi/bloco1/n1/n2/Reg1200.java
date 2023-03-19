package efd.icmsipi.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.Reg1210;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Reg1200 implements Serializable {
	private static final long serialVersionUID = 5246723500615235277L;

	@Inclui
    private final String reg = "1200";

    @Inclui
    private String codAjApur;

    @Inclui
    private BigDecimal sldCred;

    @Inclui
    private BigDecimal credApr;

    @Inclui
    private BigDecimal credReceb;

    @Inclui
    private BigDecimal credUtil;

    @Inclui
    private BigDecimal sldCredFim;

    @Filho
    private List<Reg1210> reg1210;

    public Reg1200(String codAjApur, BigDecimal sldCred, BigDecimal credApr, BigDecimal credReceb, BigDecimal credUtil, BigDecimal sldCredFim) {
        this.codAjApur = codAjApur;
        this.sldCred = sldCred;
        this.credApr = credApr;
        this.credReceb = credReceb;
        this.credUtil = credUtil;
        this.sldCredFim = sldCredFim;
    }

    public Reg1200(){}

    public String getReg() {
        return reg;
    }

    public String getCodAjApur() {
        return codAjApur;
    }

    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }

    public BigDecimal getSldCred() {
        return sldCred;
    }

    public void setSldCred(BigDecimal sldCred) {
        this.sldCred = sldCred;
    }

    public BigDecimal getCredApr() {
        return credApr;
    }

    public void setCredApr(BigDecimal credApr) {
        this.credApr = credApr;
    }

    public BigDecimal getCredReceb() {
        return credReceb;
    }

    public void setCredReceb(BigDecimal credReceb) {
        this.credReceb = credReceb;
    }

    public BigDecimal getCredUtil() {
        return credUtil;
    }

    public void setCredUtil(BigDecimal credUtil) {
        this.credUtil = credUtil;
    }

    public BigDecimal getSldCredFim() {
        return sldCredFim;
    }

    public void setSldCredFim(BigDecimal sldCredFim) {
        this.sldCredFim = sldCredFim;
    }

    public List<Reg1210> getReg1210() {
        return reg1210;
    }

    public void setReg1210(List<Reg1210> reg1210) {
        this.reg1210 = reg1210;
    }
    
}