package efd.contribuicoes.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC381;
import efd.contribuicoes.blocoC.n1.n2.n3.n4.RegC385;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC380 implements Serializable {
	private static final long serialVersionUID = 5960683522266230874L;

	@Inclui
	private final String reg = "C380";

    @Inclui
    private String codMod;

    @Inclui
    private LocalDate dtDocIni;

    @Inclui
    private LocalDate dtDocFin;

    @Inclui
    private Long numDocIni;

    @Inclui
    private Long numDocFin;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDocCanc;

    @Filho
    private List<RegC381> regC381;

    @Filho
    private List<RegC385> regC385;

    public RegC380(String codMod, LocalDate dtDocIni, LocalDate dtDocFin, Long numDocIni, Long numDocFin, BigDecimal vlDoc, BigDecimal vlDocCanc) {
        this.codMod = codMod;
        this.dtDocIni = dtDocIni;
        this.dtDocFin = dtDocFin;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.vlDoc = vlDoc;
        this.vlDocCanc = vlDocCanc;
    }

    public RegC380(){ }

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

    public Long getNumDocIni() {
        return numDocIni;
    }

    public void setNumDocIni(Long numDocIni) {
        this.numDocIni = numDocIni;
    }

    public Long getNumDocFin() {
        return numDocFin;
    }

    public void setNumDocFin(Long numDocFin) {
        this.numDocFin = numDocFin;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlDocCanc() {
        return vlDocCanc;
    }

    public void setVlDocCanc(BigDecimal vlDocCanc) {
        this.vlDocCanc = vlDocCanc;
    }

    public List<RegC381> getRegC381() {
        return regC381;
    }

    public void setRegC381(List<RegC381> regC381) {
        this.regC381 = regC381;
    }

    public List<RegC385> getRegC385() {
        return regC385;
    }

    public void setRegC385(List<RegC385> regC385) {
        this.regC385 = regC385;
    }
    
}
