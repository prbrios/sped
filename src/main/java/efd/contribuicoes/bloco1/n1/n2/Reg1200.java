package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1210;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1220;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1200 implements Serializable {
	private static final long serialVersionUID = -4080120168178844702L;

	@Inclui
	private final String reg = "1200";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApurAnt;

    @Inclui
    private String natContRec;

    @Inclui
    private BigDecimal vlContApur;

    @Inclui
    private BigDecimal vlCredPisDesc;

    @Inclui
    private BigDecimal vlContDev;

    @Inclui
    private BigDecimal vlOutDed;

    @Inclui
    private BigDecimal vlContExt;

    @Inclui
    private BigDecimal vlMul;

    @Inclui
    private BigDecimal vlJur;

    @Inclui
    private LocalDate dtRecol;

    @Filho
    private List<Reg1210> reg1210;

    @Filho
    private List<Reg1220> reg1220;

    public Reg1200(LocalDate perApurAnt, String natContRec, BigDecimal vlContApur, BigDecimal vlCredPisDesc, BigDecimal vlContDev, BigDecimal vlOutDed, BigDecimal vlContExt, BigDecimal vlMul, BigDecimal vlJur, LocalDate dtRecol) {
        this.perApurAnt = perApurAnt;
        this.natContRec = natContRec;
        this.vlContApur = vlContApur;
        this.vlCredPisDesc = vlCredPisDesc;
        this.vlContDev = vlContDev;
        this.vlOutDed = vlOutDed;
        this.vlContExt = vlContExt;
        this.vlMul = vlMul;
        this.vlJur = vlJur;
        this.dtRecol = dtRecol;
    }

    public Reg1200(){ }

    public String getReg() {
        return reg;
    }

    public LocalDate getPerApurAnt() {
        return perApurAnt;
    }

    public void setPerApurAnt(LocalDate perApurAnt) {
        this.perApurAnt = perApurAnt;
    }

    public String getNatContRec() {
        return natContRec;
    }

    public void setNatContRec(String natContRec) {
        this.natContRec = natContRec;
    }

    public BigDecimal getVlContApur() {
        return vlContApur;
    }

    public void setVlContApur(BigDecimal vlContApur) {
        this.vlContApur = vlContApur;
    }

    public BigDecimal getVlCredPisDesc() {
        return vlCredPisDesc;
    }

    public void setVlCredPisDesc(BigDecimal vlCredPisDesc) {
        this.vlCredPisDesc = vlCredPisDesc;
    }

    public BigDecimal getVlContDev() {
        return vlContDev;
    }

    public void setVlContDev(BigDecimal vlContDev) {
        this.vlContDev = vlContDev;
    }

    public BigDecimal getVlOutDed() {
        return vlOutDed;
    }

    public void setVlOutDed(BigDecimal vlOutDed) {
        this.vlOutDed = vlOutDed;
    }

    public BigDecimal getVlContExt() {
        return vlContExt;
    }

    public void setVlContExt(BigDecimal vlContExt) {
        this.vlContExt = vlContExt;
    }

    public BigDecimal getVlMul() {
        return vlMul;
    }

    public void setVlMul(BigDecimal vlMul) {
        this.vlMul = vlMul;
    }

    public BigDecimal getVlJur() {
        return vlJur;
    }

    public void setVlJur(BigDecimal vlJur) {
        this.vlJur = vlJur;
    }

    public LocalDate getDtRecol() {
        return dtRecol;
    }

    public void setDtRecol(LocalDate dtRecol) {
        this.dtRecol = dtRecol;
    }

    public List<Reg1210> getReg1210() {
        return reg1210;
    }

    public void setReg1210(List<Reg1210> reg1210) {
        this.reg1210 = reg1210;
    }

    public List<Reg1220> getReg1220() {
        return reg1220;
    }

    public void setReg1220(List<Reg1220> reg1220) {
        this.reg1220 = reg1220;
    }
    
}
