package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK255;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegK250 implements Serializable {
	private static final long serialVersionUID = 4572476482293586765L;

	@Inclui
    private final String reg = "K250";

    @Inclui
    private LocalDate dtProd;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Filho
    private List<RegK255> regK255;

    public RegK250(LocalDate dtProd, String codItem, BigDecimal qtd) {
        this.dtProd = dtProd;
        this.codItem = codItem;
        this.qtd = qtd;
    }

    public RegK250(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtProd() {
        return dtProd;
    }

    public void setDtProd(LocalDate dtProd) {
        this.dtProd = dtProd;
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

    public List<RegK255> getRegK255() {
        return regK255;
    }

    public void setRegK255(List<RegK255> regK255) {
        this.regK255 = regK255;
    }
    
}