package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegK280 implements Serializable {
	private static final long serialVersionUID = 8574191290874040846L;

	@Inclui
    private final String reg = "K280";

    @Inclui
    private LocalDate dtEst;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtdCodNeg;

    @Inclui
    private String indEst;

    @Inclui
    private String codPart;

    public RegK280(LocalDate dtEst, String codItem, BigDecimal qtdCorPos, BigDecimal qtdCodNeg, String indEst, String codPart) {
        this.dtEst = dtEst;
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCodNeg = qtdCodNeg;
        this.indEst = indEst;
        this.codPart = codPart;
    }

    public RegK280(){}

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

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCodNeg() {
        return qtdCodNeg;
    }

    public void setQtdCodNeg(BigDecimal qtdCodNeg) {
        this.qtdCodNeg = qtdCodNeg;
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