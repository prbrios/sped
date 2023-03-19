package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegC170 implements Serializable {
	private static final long serialVersionUID = 6373252562737421905L;

    @Inclui
    private final String reg = "C170";

    @Inclui
    private Integer numItem;

    @Inclui
    private String codItem;

    @Inclui
    private String descrCompl;

    @Inclui(casasDecimais = 5)
    private BigDecimal qtd;

    @Inclui
    private String unid;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private String indMov;

    @Inclui(zerosEsquerda = 3)
    private Integer cstIcms;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String codNat;

    @Inclui
    private BigDecimal vlBcIcms;

    @Inclui
    private BigDecimal aliqIcms;

    @Inclui
    private BigDecimal vlIcms;

    @Inclui
    private BigDecimal vlBcIcmsSt;

    @Inclui
    private BigDecimal aliqSt;

    @Inclui
    private BigDecimal vlIcmsSt;

    @Inclui
    private String indApur;

    @Inclui(zerosEsquerda = 2)
    private Integer cstIpi;

    @Inclui
    private String codEnq;

    @Inclui
    private BigDecimal vlBcIpi;

    @Inclui
    private BigDecimal aliqIpi;

    @Inclui
    private BigDecimal vlIpi;

    @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisRs;

    @Inclui
    private BigDecimal vlPisRs;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsRs;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private BigDecimal vlAbatNt;

    @Filho
    private List<RegC171> regC171;

    @Filho
    private RegC172 regC172;

    @Filho
    private List<RegC173> regC173;

    @Filho
    private List<RegC174> regC174;

    @Filho
    private List<RegC175> regC175;

    @Filho
    private List<RegC176> regC176;

    @Filho
    private RegC177 regC177;

    @Filho
    private RegC178 regC178;

    @Filho
    private RegC179 regC179;

    @Filho
    private RegC180 regC180;

    public RegC170(Integer numItem, String codItem, String descrCompl, BigDecimal qtd, String unid, BigDecimal vlItem, BigDecimal vlDesc, String indMov, Integer cstIcms, Integer cfop, String codNat, BigDecimal vlBcIcms, BigDecimal aliqIcms, BigDecimal vlIcms, BigDecimal vlBcIcmsSt, BigDecimal aliqSt, BigDecimal vlIcmsSt, String indApur, Integer cstIpi, String codEnq, BigDecimal vlBcIpi, BigDecimal aliqIpi, BigDecimal vlIpi, Integer cstPis, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisRs, BigDecimal vlPisRs, Integer cstCofins, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsRs, BigDecimal vlCofins, String codCta, BigDecimal vlAbatNt) {
        this.numItem = numItem;
        this.codItem = codItem;
        this.descrCompl = descrCompl;
        this.qtd = qtd;
        this.unid = unid;
        this.vlItem = vlItem;
        this.vlDesc = vlDesc;
        this.indMov = indMov;
        this.cstIcms = cstIcms;
        this.cfop = cfop;
        this.codNat = codNat;
        this.vlBcIcms = vlBcIcms;
        this.aliqIcms = aliqIcms;
        this.vlIcms = vlIcms;
        this.vlBcIcmsSt = vlBcIcmsSt;
        this.aliqSt = aliqSt;
        this.vlIcmsSt = vlIcmsSt;
        this.indApur = indApur;
        this.cstIpi = cstIpi;
        this.codEnq = codEnq;
        this.vlBcIpi = vlBcIpi;
        this.aliqIpi = aliqIpi;
        this.vlIpi = vlIpi;
        this.cstPis = cstPis;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisRs = aliqPisRs;
        this.vlPisRs = vlPisRs;
        this.cstCofins = cstCofins;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsRs = aliqCofinsRs;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
        this.vlAbatNt = vlAbatNt;
    }

    public RegC170(){}

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

    public String getDescrCompl() {
        return descrCompl;
    }

    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public BigDecimal getVlItem() {
        return vlItem;
    }

    public void setVlItem(BigDecimal vlItem) {
        this.vlItem = vlItem;
    }

    public BigDecimal getVlDesc() {
        return vlDesc;
    }

    public void setVlDesc(BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }

    public Integer getCstIcms() {
        return cstIcms;
    }

    public void setCstIcms(Integer cstIcms) {
        this.cstIcms = cstIcms;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getCodNat() {
        return codNat;
    }

    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }

    public BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }

    public void setVlBcIcms(BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }

    public BigDecimal getAliqIcms() {
        return aliqIcms;
    }

    public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
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

    public BigDecimal getAliqSt() {
        return aliqSt;
    }

    public void setAliqSt(BigDecimal aliqSt) {
        this.aliqSt = aliqSt;
    }

    public BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }

    public void setVlIcmsSt(BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }

    public String getIndApur() {
        return indApur;
    }

    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }

    public Integer getCstIpi() {
        return cstIpi;
    }

    public void setCstIpi(Integer cstIpi) {
        this.cstIpi = cstIpi;
    }

    public String getCodEnq() {
        return codEnq;
    }

    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }

    public BigDecimal getVlBcIpi() {
        return vlBcIpi;
    }

    public void setVlBcIpi(BigDecimal vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }

    public BigDecimal getAliqIpi() {
        return aliqIpi;
    }

    public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
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

    public BigDecimal getQuantBcPis() {
        return quantBcPis;
    }

    public void setQuantBcPis(BigDecimal quantBcPis) {
        this.quantBcPis = quantBcPis;
    }

    public BigDecimal getAliqPisRs() {
        return aliqPisRs;
    }

    public void setAliqPisRs(BigDecimal aliqPisRs) {
        this.aliqPisRs = aliqPisRs;
    }

    public BigDecimal getVlPisRs() {
        return vlPisRs;
    }

    public void setVlPisRs(BigDecimal vlPisRs) {
        this.vlPisRs = vlPisRs;
    }

    public Integer getCstCofins() {
        return cstCofins;
    }

    public void setCstCofins(Integer cstCofins) {
        this.cstCofins = cstCofins;
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

    public BigDecimal getQuantBcCofins() {
        return quantBcCofins;
    }

    public void setQuantBcCofins(BigDecimal quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }

    public BigDecimal getAliqCofinsRs() {
        return aliqCofinsRs;
    }

    public void setAliqCofinsRs(BigDecimal aliqCofinsRs) {
        this.aliqCofinsRs = aliqCofinsRs;
    }

    public BigDecimal getVlCofins() {
        return vlCofins;
    }

    public void setVlCofins(BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }

    public void setVlAbatNt(BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }

    public List<RegC171> getRegC171() {
        return regC171;
    }

    public void setRegC171(List<RegC171> regC171) {
        this.regC171 = regC171;
    }

    public RegC172 getRegC172() {
        return regC172;
    }

    public void setRegC172(RegC172 regC172) {
        this.regC172 = regC172;
    }

    public List<RegC173> getRegC173() {
        return regC173;
    }

    public void setRegC173(List<RegC173> regC173) {
        this.regC173 = regC173;
    }

    public List<RegC174> getRegC174() {
        return regC174;
    }

    public void setRegC174(List<RegC174> regC174) {
        this.regC174 = regC174;
    }

    public List<RegC175> getRegC175() {
        return regC175;
    }

    public void setRegC175(List<RegC175> regC175) {
        this.regC175 = regC175;
    }

    public List<RegC176> getRegC176() {
        return regC176;
    }

    public void setRegC176(List<RegC176> regC176) {
        this.regC176 = regC176;
    }

    public RegC177 getRegC177() {
        return regC177;
    }

    public void setRegC177(RegC177 regC177) {
        this.regC177 = regC177;
    }

    public RegC178 getRegC178() {
        return regC178;
    }

    public void setRegC178(RegC178 regC178) {
        this.regC178 = regC178;
    }

    public RegC179 getRegC179() {
        return regC179;
    }

    public void setRegC179(RegC179 regC179) {
        this.regC179 = regC179;
    }

    public RegC180 getRegC180() {
        return regC180;
    }

    public void setRegC180(RegC180 regC180) {
        this.regC180 = regC180;
    }
    
}
