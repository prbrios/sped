package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM105;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM110;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM100 implements Serializable {
	private static final long serialVersionUID = 8062731191681288109L;

	@Inclui
	private final String reg = "M100";

    @Inclui
    private String codCred;

    @Inclui
    private Integer indCredOri;

    @Inclui
    private BigDecimal vlBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPis;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcPis;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqPisQuant;

    @Inclui
    private BigDecimal vlCred;

    @Inclui
    private BigDecimal vlAjusAcres;

    @Inclui
    private BigDecimal vlAjusReduc;

    @Inclui
    private BigDecimal vlCredDif;

    @Inclui
    private BigDecimal vlCredDisp;

    @Inclui
    private Integer indDescCred;

    @Inclui
    private BigDecimal vlCredDesc;

    @Inclui
    private BigDecimal sldCred;

    @Filho
    private List<RegM105> regM105;

    @Filho
    private List<RegM110> regM110;

    public RegM100(String codCred, Integer indCredOri, BigDecimal vlBcPis, BigDecimal aliqPis, BigDecimal quantBcPis, BigDecimal aliqPisQuant, BigDecimal vlCred, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlCredDif, BigDecimal vlCredDisp, Integer indDescCred, BigDecimal vlCredDesc, BigDecimal sldCred) {
        this.codCred = codCred;
        this.indCredOri = indCredOri;
        this.vlBcPis = vlBcPis;
        this.aliqPis = aliqPis;
        this.quantBcPis = quantBcPis;
        this.aliqPisQuant = aliqPisQuant;
        this.vlCred = vlCred;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlCredDif = vlCredDif;
        this.vlCredDisp = vlCredDisp;
        this.indDescCred = indDescCred;
        this.vlCredDesc = vlCredDesc;
        this.sldCred = sldCred;
    }

    public RegM100(){}

    public String getReg() {
        return reg;
    }

    public String getCodCred() {
        return codCred;
    }

    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }

    public Integer getIndCredOri() {
        return indCredOri;
    }

    public void setIndCredOri(Integer indCredOri) {
        this.indCredOri = indCredOri;
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

    public BigDecimal getAliqPisQuant() {
        return aliqPisQuant;
    }

    public void setAliqPisQuant(BigDecimal aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }

    public BigDecimal getVlCred() {
        return vlCred;
    }

    public void setVlCred(BigDecimal vlCred) {
        this.vlCred = vlCred;
    }

    public BigDecimal getVlAjusAcres() {
        return vlAjusAcres;
    }

    public void setVlAjusAcres(BigDecimal vlAjusAcres) {
        this.vlAjusAcres = vlAjusAcres;
    }

    public BigDecimal getVlAjusReduc() {
        return vlAjusReduc;
    }

    public void setVlAjusReduc(BigDecimal vlAjusReduc) {
        this.vlAjusReduc = vlAjusReduc;
    }

    public BigDecimal getVlCredDif() {
        return vlCredDif;
    }

    public void setVlCredDif(BigDecimal vlCredDif) {
        this.vlCredDif = vlCredDif;
    }

    public BigDecimal getVlCredDisp() {
        return vlCredDisp;
    }

    public void setVlCredDisp(BigDecimal vlCredDisp) {
        this.vlCredDisp = vlCredDisp;
    }

    public Integer getIndDescCred() {
        return indDescCred;
    }

    public void setIndDescCred(Integer indDescCred) {
        this.indDescCred = indDescCred;
    }

    public BigDecimal getVlCredDesc() {
        return vlCredDesc;
    }

    public void setVlCredDesc(BigDecimal vlCredDesc) {
        this.vlCredDesc = vlCredDesc;
    }

    public BigDecimal getSldCred() {
        return sldCred;
    }

    public void setSldCred(BigDecimal sldCred) {
        this.sldCred = sldCred;
    }

    public List<RegM105> getRegM105() {
        return regM105;
    }

    public void setRegM105(List<RegM105> regM105) {
        this.regM105 = regM105;
    }

    public List<RegM110> getRegM110() {
        return regM110;
    }

    public void setRegM110(List<RegM110> regM110) {
        this.regM110 = regM110;
    }
    
}
