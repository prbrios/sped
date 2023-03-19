package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC191;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC195;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC198;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC199;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC190 implements Serializable {
	private static final long serialVersionUID = -1488521384378609813L;

	@Inclui
	private final String reg = "C190";

    @Inclui
    private String codMod;

    @Inclui
    private LocalDate dtRefIni;

    @Inclui
    private LocalDate dtRefFin;

    @Inclui
    private String codItem;

    @Inclui
    private String codNcm;

    @Inclui
    private String exIpi;

    @Inclui
    private BigDecimal vlTotItem;

    @Filho
    private List<RegC191> regC191;

    @Filho
    private List<RegC195> regC195;

    @Filho
    private List<RegC198> regC198;

    @Filho
    private List<RegC199> regC199;

    public RegC190(String codMod, LocalDate dtRefIni, LocalDate dtRefFin, String codItem, String codNcm, String exIpi, BigDecimal vlTotItem) {
        this.codMod = codMod;
        this.dtRefIni = dtRefIni;
        this.dtRefFin = dtRefFin;
        this.codItem = codItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.vlTotItem = vlTotItem;
    }

    public RegC190(){ }

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public LocalDate getDtRefIni() {
        return dtRefIni;
    }

    public void setDtRefIni(LocalDate dtRefIni) {
        this.dtRefIni = dtRefIni;
    }

    public LocalDate getDtRefFin() {
        return dtRefFin;
    }

    public void setDtRefFin(LocalDate dtRefFin) {
        this.dtRefFin = dtRefFin;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getCodNcm() {
        return codNcm;
    }

    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }

    public String getExIpi() {
        return exIpi;
    }

    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }

    public BigDecimal getVlTotItem() {
        return vlTotItem;
    }

    public void setVlTotItem(BigDecimal vlTotItem) {
        this.vlTotItem = vlTotItem;
    }

    public List<RegC191> getRegC191() {
        return regC191;
    }

    public void setRegC191(List<RegC191> regC191) {
        this.regC191 = regC191;
    }

    public List<RegC195> getRegC195() {
        return regC195;
    }

    public void setRegC195(List<RegC195> regC195) {
        this.regC195 = regC195;
    }

    public List<RegC198> getRegC198() {
        return regC198;
    }

    public void setRegC198(List<RegC198> regC198) {
        this.regC198 = regC198;
    }

    public List<RegC199> getRegC199() {
        return regC199;
    }

    public void setRegC199(List<RegC199> regC199) {
        this.regC199 = regC199;
    }
    
}
