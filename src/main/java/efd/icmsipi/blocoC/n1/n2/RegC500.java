package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC510;
import efd.icmsipi.blocoC.n1.n2.n3.RegC590;
import efd.icmsipi.blocoC.n1.n2.n3.RegC595;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegC500 implements Serializable {
	private static final long serialVersionUID = -6980176018219923358L;

	@Inclui
    private final String reg = "C500";

    @Inclui
    private String indOper;

    @Inclui
    private String indEmit;

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private String ser;

    @Inclui
    private Integer sub;

    @Inclui
    private String codCons;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private LocalDate dtEs;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlForn;

    @Inclui
    private BigDecimal vlServNt;

    @Inclui
    private BigDecimal vlTerc;

    @Inclui
    private BigDecimal vlDa;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private String codInf;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private Integer tpLigacao;

    @Inclui
    private String codGrupoTensao;

    @Inclui
    private String chvDocE;

    @Inclui
    private Integer finDocE;

    @Inclui
    private String chvDocERef;

    @Inclui
    private Integer indDest;

    @Inclui
    private Integer codMunDest;

    @Inclui
    private String codCta;
    
    @Inclui(zerosEsquerda = 2)
    private Integer codModDocRef;
    
    @Inclui
    private String hashDocRef;
    
    @Inclui
    private String serDocRef;
    
    @Inclui
    private Long numDocRef;
    
    @Inclui(zerosEsquerda = 6)
    private Integer mesDocRef;
    
    @Inclui(casasDecimais = 2)
    private BigDecimal enerInjet;
    
    @Inclui(casasDecimais = 2)
    private BigDecimal outrasDed;

    @Filho
    private List<RegC510> regC510;

    @Filho
    private List<RegC590> regC590;

    @Filho
    private List<RegC595> regC595;

    public RegC500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Integer sub, String codCons, Long numDoc, LocalDate dtDoc, LocalDate dtEs, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, String codInf, BigDecimal vlPis, BigDecimal vlCofins, Integer tpLigacao, String codGrupoTensao) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEs = dtEs;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlForn = vlForn;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.tpLigacao = tpLigacao;
        this.codGrupoTensao = codGrupoTensao;
    }

    /**
     * CAMPOS INCLUÍDOS NO LEIAUTE A PARTIR DO PERÍODO DE APURAÇÃO DE JANEIRO DE 2020
     */
    public RegC500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser, Integer sub, String codCons, Long numDoc, LocalDate dtDoc, LocalDate dtEs, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa, BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, String codInf, BigDecimal vlPis, BigDecimal vlCofins, Integer tpLigacao, String codGrupoTensao, String chvDocE, Integer finDocE, String chvDocERef, Integer indDest, Integer codMunDest, String codCta) {
        this.indOper = indOper;
        this.indEmit = indEmit;
        this.codPart = codPart;
        this.codMod = codMod;
        this.codSit = codSit;
        this.ser = ser;
        this.sub = sub;
        this.codCons = codCons;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.dtEs = dtEs;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlForn = vlForn;
        this.vlServNt = vlServNt;
        this.vlTerc = vlTerc;
        this.vlDa = vlDa;
        this.vlBcIcms = vlBcIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.vlIcmsSt = vlIcmsSt;
        this.codInf = codInf;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.tpLigacao = tpLigacao;
        this.codGrupoTensao = codGrupoTensao;
        this.chvDocE = chvDocE;
        this.finDocE = finDocE;
        this.chvDocERef = chvDocERef;
        this.indDest = indDest;
        this.codMunDest = codMunDest;
        this.codCta = codCta;
    }

	public RegC500(String indOper, String indEmit, String codPart, String codMod, Integer codSit, String ser,
			Integer sub, String codCons, Long numDoc, LocalDate dtDoc, LocalDate dtEs, BigDecimal vlDoc,
			BigDecimal vlDesc, BigDecimal vlForn, BigDecimal vlServNt, BigDecimal vlTerc, BigDecimal vlDa,
			BigDecimal vlBcIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal vlIcmsSt, String codInf,
			BigDecimal vlPis, BigDecimal vlCofins, Integer tpLigacao, String codGrupoTensao, String chvDocE,
			Integer finDocE, String chvDocERef, Integer indDest, Integer codMunDest, String codCta,
			Integer codModDocRef, String hashDocRef, String serDocRef, Long numDocRef, Integer mesDocRef,
			BigDecimal enerInjet, BigDecimal outrasDed) {
		super();
		this.indOper = indOper;
		this.indEmit = indEmit;
		this.codPart = codPart;
		this.codMod = codMod;
		this.codSit = codSit;
		this.ser = ser;
		this.sub = sub;
		this.codCons = codCons;
		this.numDoc = numDoc;
		this.dtDoc = dtDoc;
		this.dtEs = dtEs;
		this.vlDoc = vlDoc;
		this.vlDesc = vlDesc;
		this.vlForn = vlForn;
		this.vlServNt = vlServNt;
		this.vlTerc = vlTerc;
		this.vlDa = vlDa;
		this.vlBcIcms = vlBcIcms;
		this.vlIcms = vlIcms;
		this.vlBcIcmsSt = vlBcIcmsSt;
		this.vlIcmsSt = vlIcmsSt;
		this.codInf = codInf;
		this.vlPis = vlPis;
		this.vlCofins = vlCofins;
		this.tpLigacao = tpLigacao;
		this.codGrupoTensao = codGrupoTensao;
		this.chvDocE = chvDocE;
		this.finDocE = finDocE;
		this.chvDocERef = chvDocERef;
		this.indDest = indDest;
		this.codMunDest = codMunDest;
		this.codCta = codCta;
		this.codModDocRef = codModDocRef;
		this.hashDocRef = hashDocRef;
		this.serDocRef = serDocRef;
		this.numDocRef = numDocRef;
		this.mesDocRef = mesDocRef;
		this.enerInjet = enerInjet;
		this.outrasDed = outrasDed;
	}

    public RegC500(){}

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

    public Integer getCodSit() {
        return codSit;
    }

    public void setCodSit(Integer codSit) {
        this.codSit = codSit;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public String getCodCons() {
        return codCons;
    }

    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtDoc() {
        return dtDoc;
    }

    public void setDtDoc(LocalDate dtDoc) {
        this.dtDoc = dtDoc;
    }

    public LocalDate getDtEs() {
        return dtEs;
    }

    public void setDtEs(LocalDate dtEs) {
        this.dtEs = dtEs;
    }

    public BigDecimal getVlDoc() {
        return vlDoc;
    }

    public void setVlDoc(BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public BigDecimal getVlForn() {
        return vlForn;
    }

    public void setVlForn(BigDecimal vlForn) {
        this.vlForn = vlForn;
    }

    public BigDecimal getVlServNt() {
        return vlServNt;
    }

    public void setVlServNt(BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }

    public BigDecimal getVlTerc() {
        return vlTerc;
    }

    public void setVlTerc(BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }

    public BigDecimal getVlDa() {
        return vlDa;
    }

    public void setVlDa(BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getVlIcms() {
        return vlIcms;
    }

    public void setVlIcms(BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    public BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    public void setVlBcIcmsSt(BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
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

    public Integer getTpLigacao() {
        return tpLigacao;
    }

    public void setTpLigacao(Integer tpLigacao) {
        this.tpLigacao = tpLigacao;
    }

    public String getCodGrupoTensao() {
        return codGrupoTensao;
    }

    public void setCodGrupoTensao(String codGrupoTensao) {
        this.codGrupoTensao = codGrupoTensao;
    }

    public String getChvDocE() {
        return chvDocE;
    }

    public void setChvDocE(String chvDocE) {
        this.chvDocE = chvDocE;
    }

    public Integer getFinDocE() {
        return finDocE;
    }

    public void setFinDocE(Integer finDocE) {
        this.finDocE = finDocE;
    }

    public String getChvDocERef() {
        return chvDocERef;
    }

    public void setChvDocERef(String chvDocERef) {
        this.chvDocERef = chvDocERef;
    }

    public Integer getIndDest() {
        return indDest;
    }

    public void setIndDest(Integer indDest) {
        this.indDest = indDest;
    }

    public Integer getCodMunDest() {
        return codMunDest;
    }

    public void setCodMunDest(Integer codMunDest) {
        this.codMunDest = codMunDest;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Integer getCodModDocRef() {
        return codModDocRef;
    }

    public void setCodModDocRef(Integer codModDocRef) {
        this.codModDocRef = codModDocRef;
    }

    public String getHashDocRef() {
        return hashDocRef;
    }

    public void setHashDocRef(String hashDocRef) {
        this.hashDocRef = hashDocRef;
    }

    public String getSerDocRef() {
        return serDocRef;
    }

    public void setSerDocRef(String serDocRef) {
        this.serDocRef = serDocRef;
    }

    public Long getNumDocRef() {
        return numDocRef;
    }

    public void setNumDocRef(Long numDocRef) {
        this.numDocRef = numDocRef;
    }

    public Integer getMesDocRef() {
        return mesDocRef;
    }

    public void setMesDocRef(Integer mesDocRef) {
        this.mesDocRef = mesDocRef;
    }

    public BigDecimal getEnerInjet() {
        return enerInjet;
    }

    public void setEnerInjet(BigDecimal enerInjet) {
        this.enerInjet = enerInjet;
    }

    public BigDecimal getOutrasDed() {
        return outrasDed;
    }

    public void setOutrasDed(BigDecimal outrasDed) {
        this.outrasDed = outrasDed;
    }

    public List<RegC510> getRegC510() {
        return regC510;
    }

    public void setRegC510(List<RegC510> regC510) {
        this.regC510 = regC510;
    }

    public List<RegC590> getRegC590() {
        return regC590;
    }

    public void setRegC590(List<RegC590> regC590) {
        this.regC590 = regC590;
    }

    public List<RegC595> getRegC595() {
        return regC595;
    }

    public void setRegC595(List<RegC595> regC595) {
        this.regC595 = regC595;
    }
    
}