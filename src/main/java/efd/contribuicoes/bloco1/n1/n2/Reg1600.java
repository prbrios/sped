package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1610;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1620;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1600 implements Serializable {
	private static final long serialVersionUID = -7385597270183546153L;

	@Inclui
	private final String reg = "1600";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApurAnt;

    @Inclui
    private String natContRec;

    @Inclui
    private BigDecimal vlContApur;

    @Inclui
    private BigDecimal vlCredCofinsDesc;

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
    private List<Reg1610> reg1610;

    @Filho
    private List<Reg1620> reg1620;

    public Reg1600(LocalDate perApurAnt, String natContRec, BigDecimal vlContApur, BigDecimal vlCredCofinsDesc, BigDecimal vlContDev, BigDecimal vlOutDed, BigDecimal vlContExt, BigDecimal vlMul, BigDecimal vlJur, LocalDate dtRecol) {
        this.perApurAnt = perApurAnt;
        this.natContRec = natContRec;
        this.vlContApur = vlContApur;
        this.vlCredCofinsDesc = vlCredCofinsDesc;
        this.vlContDev = vlContDev;
        this.vlOutDed = vlOutDed;
        this.vlContExt = vlContExt;
        this.vlMul = vlMul;
        this.vlJur = vlJur;
        this.dtRecol = dtRecol;
    }

    public Reg1600(){ }

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

    public BigDecimal getVlCredCofinsDesc() {
        return vlCredCofinsDesc;
    }

    public void setVlCredCofinsDesc(BigDecimal vlCredCofinsDesc) {
        this.vlCredCofinsDesc = vlCredCofinsDesc;
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

    public List<Reg1610> getReg1610() {
        return reg1610;
    }

    public void setReg1610(List<Reg1610> reg1610) {
        this.reg1610 = reg1610;
    }

    public List<Reg1620> getReg1620() {
        return reg1620;
    }

    public void setReg1620(List<Reg1620> reg1620) {
        this.reg1620 = reg1620;
    }
    
}
