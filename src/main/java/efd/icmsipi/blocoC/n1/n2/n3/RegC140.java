package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.RegC141;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegC140 implements Serializable {
	private static final long serialVersionUID = 5218036644729704452L;

	@Inclui
    private final String reg = "C140";

    @Inclui
    private String indEmit;

    @Inclui
    private String indTit;

    @Inclui
    private String descTit;

    @Inclui
    private String numTit;

    @Inclui
    private Integer qtdParc;

    @Inclui
    private BigDecimal vlTit;

    @Filho
    private List<RegC141> regC141;

    public RegC140(String indEmit, String indTit, String descTit, String numTit, Integer qtdParc, BigDecimal vlTit) {
        this.indEmit = indEmit;
        this.indTit = indTit;
        this.descTit = descTit;
        this.numTit = numTit;
        this.qtdParc = qtdParc;
        this.vlTit = vlTit;
    }

    public RegC140(){}

    public String getReg() {
        return reg;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getIndTit() {
        return indTit;
    }

    public void setIndTit(String indTit) {
        this.indTit = indTit;
    }

    public String getDescTit() {
        return descTit;
    }

    public void setDescTit(String descTit) {
        this.descTit = descTit;
    }

    public String getNumTit() {
        return numTit;
    }

    public void setNumTit(String numTit) {
        this.numTit = numTit;
    }

    public Integer getQtdParc() {
        return qtdParc;
    }

    public void setQtdParc(Integer qtdParc) {
        this.qtdParc = qtdParc;
    }

    public BigDecimal getVlTit() {
        return vlTit;
    }

    public void setVlTit(BigDecimal vlTit) {
        this.vlTit = vlTit;
    }

    public List<RegC141> getRegC141() {
        return regC141;
    }

    public void setRegC141(List<RegC141> regC141) {
        this.regC141 = regC141;
    }
    
}
