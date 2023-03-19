package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC181;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC185;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC188;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC180 implements Serializable {
	private static final long serialVersionUID = 956353757632705447L;

	@Inclui
	private final String reg = "C180";

    @Inclui
    private String codMod;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private String codItem;

    @Inclui
    private String codNcm;

    @Inclui
    private String exIpi;

    @Inclui
    private BigDecimal vlTotItem;

    @Filho
    private List<RegC181> regC181;

    @Filho
    private List<RegC185> regC185;

    @Filho
    private List<RegC188> regC188;

    public RegC180(String codMod, LocalDate dtDocIni, LocalDate dtDocFin, String codItem, String codNcm, String exIpi, BigDecimal vlTotItem) {
        this.codMod = codMod;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.codItem = codItem;
        this.codNcm = codNcm;
        this.exIpi = exIpi;
        this.vlTotItem = vlTotItem;
    }

    public RegC180(){ }

    public String getReg() {
        return reg;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public LocalDate getDtDocIni() {
        return dtDocIni;
    }

    public void setDtDocIni(LocalDate dtDocIni) {
        this.dtDocIni = dtDocIni;
    }

    public LocalDate getDtDocFin() {
        return dtDocFin;
    }

    public void setDtDocFin(LocalDate dtDocFin) {
        this.dtDocFin = dtDocFin;
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

    public List<RegC181> getRegC181() {
        return regC181;
    }

    public void setRegC181(List<RegC181> regC181) {
        this.regC181 = regC181;
    }

    public List<RegC185> getRegC185() {
        return regC185;
    }

    public void setRegC185(List<RegC185> regC185) {
        this.regC185 = regC185;
    }

    public List<RegC188> getRegC188() {
        return regC188;
    }

    public void setRegC188(List<RegC188> regC188) {
        this.regC188 = regC188;
    }
    
}
