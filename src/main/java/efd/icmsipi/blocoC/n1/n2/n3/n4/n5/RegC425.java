package efd.icmsipi.blocoC.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.n6.RegC430;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC425 implements Serializable {
	private static final long serialVersionUID = 8202790400038038390L;

	@Inclui
    private final String reg = "C425";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Filho
    private RegC430 regC430;

    public RegC425(String codItem, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlPis, BigDecimal vlCofins) {
        this.codItem = codItem;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
    }

    public RegC425(){}

    public String getReg() {
        return reg;
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

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public RegC430 getRegC430() {
        return regC430;
    }

    public void setRegC430(RegC430 regC430) {
        this.regC430 = regC430;
    }
    
}