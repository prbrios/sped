package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegK200 implements Serializable {
	private static final long serialVersionUID = -382752401758872422L;

	@Inclui
    private final String reg = "K200";

    @Inclui
    private LocalDate dtEst;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String indEst;

    @Inclui
    private String codPart;

    public RegK200(LocalDate dtEst, String codItem, BigDecimal qtd, String indEst, String codPart) {
        this.dtEst = dtEst;
        this.codItem = codItem;
        this.qtd = qtd;
        this.indEst = indEst;
        this.codPart = codPart;
    }

    public RegK200(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtEst() {
        return dtEst;
    }

    public void setDtEst(LocalDate dtEst) {
        this.dtEst = dtEst;
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

    public String getIndEst() {
        return indEst;
    }

    public void setIndEst(String indEst) {
        this.indEst = indEst;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
}