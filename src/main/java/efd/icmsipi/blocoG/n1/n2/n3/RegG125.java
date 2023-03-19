package efd.icmsipi.blocoG.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG126;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG130;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegG125 implements Serializable {
	private static final long serialVersionUID = 3336817459219171142L;

	@Inclui
    private final String reg = "G125";

    @Inclui
    private String codIndBem;

    @Inclui
    private LocalDate dtMov;

    @Inclui
    private String tipoMov;

    @Inclui
    private BigDecimal vlImobIcmsOp;

    @Inclui
    private BigDecimal vlImobicmsSt;

    @Inclui
    private BigDecimal vlImobIcmsFrt;

    @Inclui
    private BigDecimal vlImobIcmsDif;

    @Inclui
    private Integer numParc;

    @Inclui
    private  BigDecimal vlParcPass;

    @Filho
    private List<RegG126> regG126;

    @Filho
    private List<RegG130> regG130;

    public RegG125(String codIndBem, LocalDate dtMov, String tipoMov, BigDecimal vlImobIcmsOp, BigDecimal vlImobicmsSt, BigDecimal vlImobIcmsFrt, BigDecimal vlImobIcmsDif, Integer numParc, BigDecimal vlParcPass) {
        this.codIndBem = codIndBem;
        this.dtMov = dtMov;
        this.tipoMov = tipoMov;
        this.vlImobIcmsOp = vlImobIcmsOp;
        this.vlImobicmsSt = vlImobicmsSt;
        this.vlImobIcmsFrt = vlImobIcmsFrt;
        this.vlImobIcmsDif = vlImobIcmsDif;
        this.numParc = numParc;
        this.vlParcPass = vlParcPass;
    }

    public RegG125(){}

    public String getReg() {
        return reg;
    }

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public LocalDate getDtMov() {
        return dtMov;
    }

    public void setDtMov(LocalDate dtMov) {
        this.dtMov = dtMov;
    }

    public String getTipoMov() {
        return tipoMov;
    }

    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }

    public BigDecimal getVlImobIcmsOp() {
        return vlImobIcmsOp;
    }

    public void setVlImobIcmsOp(BigDecimal vlImobIcmsOp) {
        this.vlImobIcmsOp = vlImobIcmsOp;
    }

    public BigDecimal getVlImobicmsSt() {
        return vlImobicmsSt;
    }

    public void setVlImobicmsSt(BigDecimal vlImobicmsSt) {
        this.vlImobicmsSt = vlImobicmsSt;
    }

    public BigDecimal getVlImobIcmsFrt() {
        return vlImobIcmsFrt;
    }

    public void setVlImobIcmsFrt(BigDecimal vlImobIcmsFrt) {
        this.vlImobIcmsFrt = vlImobIcmsFrt;
    }

    public BigDecimal getVlImobIcmsDif() {
        return vlImobIcmsDif;
    }

    public void setVlImobIcmsDif(BigDecimal vlImobIcmsDif) {
        this.vlImobIcmsDif = vlImobIcmsDif;
    }

    public Integer getNumParc() {
        return numParc;
    }

    public void setNumParc(Integer numParc) {
        this.numParc = numParc;
    }

    public BigDecimal getVlParcPass() {
        return vlParcPass;
    }

    public void setVlParcPass(BigDecimal vlParcPass) {
        this.vlParcPass = vlParcPass;
    }

    public List<RegG126> getRegG126() {
        return regG126;
    }

    public void setRegG126(List<RegG126> regG126) {
        this.regG126 = regG126;
    }

    public List<RegG130> getRegG130() {
        return regG130;
    }

    public void setRegG130(List<RegG130> regG130) {
        this.regG130 = regG130;
    }
    
}