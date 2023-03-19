package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.RegB025;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegB020 implements Serializable {
	private static final long serialVersionUID = -3633119462458690377L;

	@Inclui
    private final String reg = "B020";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String codSit;

    @Inclui
    private String ser;

    @Inclui
    private Long numDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private LocalDate dtDoc;

    @Inclui(zerosEsquerda = 7)
    private Integer codMunServ;

    @Inclui
    private BigDecimal vlCont;

    @Inclui
    private BigDecimal vlMatTerc;

    @Inclui
    private BigDecimal vlSub;

    @Inclui
    private BigDecimal vlInstIss;

    @Inclui
    private BigDecimal vlDedBc;

    @Inclui
    private BigDecimal vlBcIss;

    @Inclui
    private BigDecimal vlBsIssRt;

    @Inclui
    private BigDecimal vlIssRt;

    @Inclui
    private BigDecimal vlIss;

    @Inclui
    private String codInfObs;

    @Filho
    private List<RegB025> regB025;

    public RegB020(String indOper, String indEmit, String codPart, String codMod, String codSit, String ser, Long numDoc, String chvNfe, LocalDate dtDoc, Integer codMunServ, BigDecimal vlCont, BigDecimal vlMatTerc, BigDecimal vlSub, BigDecimal vlInstIss, BigDecimal vlDedBc, BigDecimal vlBcIss, BigDecimal vlBsIssRt, BigDecimal vlIssRt, BigDecimal vlIss, String codInfObs) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.codMunServ = codMunServ;
        this.vlCont = vlCont;
        this.vlMatTerc = vlMatTerc;
        this.vlSub = vlSub;
        this.vlInstIss = vlInstIss;
        this.vlDedBc = vlDedBc;
        this.vlBcIss = vlBcIss;
        this.vlBsIssRt = vlBsIssRt;
        this.vlIssRt = vlIssRt;
        this.vlIss = vlIss;
        this.codInfObs = codInfObs;
    }

    public RegB020(){}

    public String getReg() {
        return reg;
    }

    public String getIndOper() {
        return indOper;
    }

    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }

    public String getIndEmit() {
        return indEmit;
    }

    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getCodSit() {
        return codSit;
    }

    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public Integer getCodMunServ() {
        return codMunServ;
    }

    public void setCodMunServ(Integer codMunServ) {
        this.codMunServ = codMunServ;
    }

    public BigDecimal getVlCont() {
        return vlCont;
    }

    public void setVlCont(BigDecimal vlCont) {
        this.vlCont = vlCont;
    }

    public BigDecimal getVlMatTerc() {
        return vlMatTerc;
    }

    public void setVlMatTerc(BigDecimal vlMatTerc) {
        this.vlMatTerc = vlMatTerc;
    }

    public BigDecimal getVlSub() {
        return vlSub;
    }

    public void setVlSub(BigDecimal vlSub) {
        this.vlSub = vlSub;
    }

    public BigDecimal getVlInstIss() {
        return vlInstIss;
    }

    public void setVlInstIss(BigDecimal vlInstIss) {
        this.vlInstIss = vlInstIss;
    }

    public BigDecimal getVlDedBc() {
        return vlDedBc;
    }

    public void setVlDedBc(BigDecimal vlDedBc) {
        this.vlDedBc = vlDedBc;
    }

    public BigDecimal getVlBcIss() {
        return vlBcIss;
    }

    public void setVlBcIss(BigDecimal vlBcIss) {
        this.vlBcIss = vlBcIss;
    }

    public BigDecimal getVlBsIssRt() {
        return vlBsIssRt;
    }

    public void setVlBsIssRt(BigDecimal vlBsIssRt) {
        this.vlBsIssRt = vlBsIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }

    public BigDecimal getVlIss() {
        return vlIss;
    }

    public void setVlIss(BigDecimal vlIss) {
        this.vlIss = vlIss;
    }

    public String getCodInfObs() {
        return codInfObs;
    }

    public void setCodInfObs(String codInfObs) {
        this.codInfObs = codInfObs;
    }

    public List<RegB025> getRegB025() {
        return regB025;
    }

    public void setRegB025(List<RegB025> regB025) {
        this.regB025 = regB025;
    }
    
}
