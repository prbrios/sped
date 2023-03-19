package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegK255 implements Serializable {
	private static final long serialVersionUID = 6291858874732489848L;

	@Inclui
    private final String reg = "K255";

    @Inclui
    private LocalDate dtCons;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Inclui
    private String codInsSubst;

    public RegK255(LocalDate dtCons, String codItem, BigDecimal qtd, String codInsSubst) {
        this.dtCons = dtCons;
        this.codItem = codItem;
        this.qtd = qtd;
        this.codInsSubst = codInsSubst;
    }

    public RegK255(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtCons() {
        return dtCons;
    }

    public void setDtCons(LocalDate dtCons) {
        this.dtCons = dtCons;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getCodInsSubst() {
        return codInsSubst;
    }

    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
    }
    
}