package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.RegD120;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegD110 implements Serializable {
	private static final long serialVersionUID = 2362120510801769259L;

	@Inclui
    private final String reg = "D110";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private BigDecimal vlServ;

    @Inclui
    private BigDecimal vlOut;

    @Filho
    private List<RegD120> regD120;

    public RegD110(Integer numItem, String codItem, BigDecimal vlServ, BigDecimal vlOut) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.vlServ = vlServ;
        this.vlOut = vlOut;
    }

    public RegD110(){}

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

    public BigDecimal getVlServ() {
        return vlServ;
    }

    public void setVlServ(BigDecimal vlServ) {
        this.vlServ = vlServ;
    }

    public BigDecimal getVlOut() {
        return vlOut;
    }

    public void setVlOut(BigDecimal vlOut) {
        this.vlOut = vlOut;
    }

    public List<RegD120> getRegD120() {
        return regD120;
    }

    public void setRegD120(List<RegD120> regD120) {
        this.regD120 = regD120;
    }
    
}