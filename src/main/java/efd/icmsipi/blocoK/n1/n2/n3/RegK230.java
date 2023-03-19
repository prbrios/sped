package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK235;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegK230 implements Serializable {
	private static final long serialVersionUID = 1376141362506156402L;

	@Inclui
    private final String reg = "K230";

    @Inclui
    private LocalDate dtIniOp;

    @Inclui
    private LocalDate dtFinOp;

    @Inclui
    private String codDocOp;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdEnc;

    @Filho
    private List<RegK235> regK235;

    public RegK230(LocalDate dtIniOp, LocalDate dtFinOp, String codDocOp, String codItem, BigDecimal qtdEnc) {
        this.dtIniOp = dtIniOp;
        this.dtFinOp = dtFinOp;
        this.codDocOp = codDocOp;
        this.codItem = codItem;
        this.qtdEnc = qtdEnc;
    }

    public RegK230(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtIniOp() {
        return dtIniOp;
    }

    public void setDtIniOp(LocalDate dtIniOp) {
        this.dtIniOp = dtIniOp;
    }

    public LocalDate getDtFinOp() {
        return dtFinOp;
    }

    public void setDtFinOp(LocalDate dtFinOp) {
        this.dtFinOp = dtFinOp;
    }

    public String getCodDocOp() {
        return codDocOp;
    }

    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdEnc() {
        return qtdEnc;
    }

    public void setQtdEnc(BigDecimal qtdEnc) {
        this.qtdEnc = qtdEnc;
    }

    public List<RegK235> getRegK235() {
        return regK235;
    }

    public void setRegK235(List<RegK235> regK235) {
        this.regK235 = regK235;
    }
    
}