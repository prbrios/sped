package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.n4.Reg1102;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1101 implements Serializable {
	private static final long serialVersionUID = 6324834302859185819L;

	@Inclui
	private final String reg = "1101";

    @Inclui
    private String codPart;

    @Inclui
    private String codItem;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private Long numDoc;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private String chvNfe;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String natBcCred;

    @Inclui
    private String indOrigCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descCompl;

    @Inclui
    private LocalDate perEscrit;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Filho
    private Reg1102 reg1102;

    public Reg1101(String codPart, String codItem, String codMod, String ser, String subSer, Long numDoc, LocalDate dtOper, String chvNfe, BigDecimal vlOper, Integer cfop, String natBcCred, String indOrigCred, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal vlPis, String codCta, String codCcus, String descCompl, LocalDate perEscrit, Long cnpj) {
        this.codPart = codPart;
        this.codItem = codItem;
        this.codMod = codMod;
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtOper = dtOper;
        this.chvNfe = chvNfe;
        this.vlOper = vlOper;
        this.cfop = cfop;
        this.natBcCred = natBcCred;
        this.indOrigCred = indOrigCred;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.vlPis = vlPis;
        this.codCta = codCta;
        this.codCcus = codCcus;
        this.descCompl = descCompl;
        this.perEscrit = perEscrit;
        this.cnpj = cnpj;
    }

    public Reg1101(){ }

    public String getReg() {
        return reg;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public String getCodMod() {
        return codMod;
    }

    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public String getSubSer() {
        return subSer;
    }

    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }

    public Long getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Long numDoc) {
        this.numDoc = numDoc;
    }

    public LocalDate getDtOper() {
        return dtOper;
    }

    public void setDtOper(LocalDate dtOper) {
        this.dtOper = dtOper;
    }

    public String getChvNfe() {
        return chvNfe;
    }

    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }

    public BigDecimal getVlOper() {
        return vlOper;
    }

    public void setVlOper(BigDecimal vlOper) {
        this.vlOper = vlOper;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getNatBcCred() {
        return natBcCred;
    }

    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }

    public String getIndOrigCred() {
        return indOrigCred;
    }

    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }

    public Integer getCstPis() {
        return cstPis;
    }

    public void setCstPis(Integer cstPis) {
        this.cstPis = cstPis;
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

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getDescCompl() {
        return descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }

    public LocalDate getPerEscrit() {
        return perEscrit;
    }

    public void setPerEscrit(LocalDate perEscrit) {
        this.perEscrit = perEscrit;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Reg1102 getReg1102() {
        return reg1102;
    }

    public void setReg1102(Reg1102 reg1102) {
        this.reg1102 = reg1102;
    }
    
}
