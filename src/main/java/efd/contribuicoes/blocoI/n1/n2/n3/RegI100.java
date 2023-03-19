package efd.contribuicoes.blocoI.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI199;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.RegI200;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegI100 implements Serializable {
	private static final long serialVersionUID = 2503570151984624779L;

	@Inclui
	private final String reg = "I100";

    @Inclui
    private BigDecimal vlRec;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPisCofins;

    @Inclui
    private BigDecimal vlTotDedGer;

    @Inclui
    private BigDecimal vlTotDedEsp;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String infoCompl;

    @Filho
    private List<RegI199> regI199;

    @Filho
    private List<RegI200> regI200;

    public RegI100(BigDecimal vlRec, Integer cstPisCofins, BigDecimal vlTotDedGer, BigDecimal vlTotDedEsp, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal vlCofins, String infoCompl) {
        this.vlRec = vlRec;
        this.cstPisCofins = cstPisCofins;
        this.vlTotDedGer = vlTotDedGer;
        this.vlTotDedEsp = vlTotDedEsp;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.vlCofins = vlCofins;
        this.infoCompl = infoCompl;
    }

    public RegI100(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public Integer getCstPisCofins() {
        return cstPisCofins;
    }

    public void setCstPisCofins(Integer cstPisCofins) {
        this.cstPisCofins = cstPisCofins;
    }

    public BigDecimal getVlTotDedGer() {
        return vlTotDedGer;
    }

    public void setVlTotDedGer(BigDecimal vlTotDedGer) {
        this.vlTotDedGer = vlTotDedGer;
    }

    public BigDecimal getVlTotDedEsp() {
        return vlTotDedEsp;
    }

    public void setVlTotDedEsp(BigDecimal vlTotDedEsp) {
        this.vlTotDedEsp = vlTotDedEsp;
    }

    public BigDecimal getVlBcPis() {
        return vlBcPis;
    }

    public void setVlBcPis(BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }

    public BigDecimal getAliqPis() {
        return aliqPis;
    }

    public void setAliqPis(BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }

    public BigDecimal getVlPis() {
        return vlPis;
    }

    public void setVlPis(BigDecimal vlPis) {
        this.vlPis = vlPis;
    }

    public BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }

    public void setVlBcCofins(BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }

    public BigDecimal getAliqCofins() {
        return aliqCofins;
    }

    public void setAliqCofins(BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public List<RegI199> getRegI199() {
        return regI199;
    }

    public void setRegI199(List<RegI199> regI199) {
        this.regI199 = regI199;
    }

    public List<RegI200> getRegI200() {
        return regI200;
    }

    public void setRegI200(List<RegI200> regI200) {
        this.regI200 = regI200;
    }
    
}
