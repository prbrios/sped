package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegK235 implements Serializable {
	private static final long serialVersionUID = 8077460082970537775L;

	@Inclui
    private final String reg = "K235";

    @Inclui
    private LocalDate dtSaida;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Inclui
    private String codInsSubst;

    public RegK235(LocalDate dtSaida, String codItem, BigDecimal qtd, String codInsSubst) {
        this.dtSaida = dtSaida;
        this.codItem = codItem;
        this.qtd = qtd;
        this.codInsSubst = codInsSubst;
    }

    public RegK235(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(LocalDate dtSaida) {
        this.dtSaida = dtSaida;
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