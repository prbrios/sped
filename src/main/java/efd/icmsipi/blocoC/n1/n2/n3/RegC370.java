package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC380;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC370 implements Serializable {
	private static final long serialVersionUID = 520851903544419729L;

	@Inclui
    private final String reg = "C370";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Filho
    private RegC380 regC380;

    public RegC370(Integer numItem, String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
    }

    public RegC370(){}

    public String getReg() {
        return reg;
    }

    public Integer getNumItem() {
        return numItem;
    }

    public void setNumItem(Integer numItem) {
        this.numItem = numItem;
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

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public RegC380 getRegC380() {
        return regC380;
    }

    public void setRegC380(RegC380 regC380) {
        this.regC380 = regC380;
    }
    
}