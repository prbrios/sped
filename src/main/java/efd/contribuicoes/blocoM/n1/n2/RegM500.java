package efd.contribuicoes.blocoM.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM505;
import efd.contribuicoes.blocoM.n1.n2.n3.RegM510;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegM500 implements Serializable {
	private static final long serialVersionUID = -8462661106098890609L;

	@Inclui
	private final String reg = "M500";

    @Inclui
    private String codCred;

    @Inclui
    private Integer indCredOri;

    @Inclui
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofinsQuant;

    @Inclui
    private BigDecimal vlCred;

    @Inclui
    private BigDecimal vlAjusAcres;

    @Inclui
    private BigDecimal vlAjusReduc;

    @Inclui
    private BigDecimal vlCredDifer;

    @Inclui
    private BigDecimal vlCredDisp;

    @Inclui
    private String indDescCred;

    @Inclui
    private BigDecimal vlCredDesc;

    @Inclui
    private BigDecimal sldCred;

    @Filho
    private List<RegM505> regM505;

    @Filho
    private List<RegM510> regM510;

    public RegM500(String codCred, Integer indCredOri, BigDecimal vlBcCofins, BigDecimal aliqCofins, BigDecimal quantBcCofins, BigDecimal aliqCofinsQuant, BigDecimal vlCred, BigDecimal vlAjusAcres, BigDecimal vlAjusReduc, BigDecimal vlCredDifer, BigDecimal vlCredDisp, String indDescCred, BigDecimal vlCredDesc, BigDecimal sldCred) {
        this.codCred = codCred;
        this.indCredOri = indCredOri;
        this.vlBcCofins = vlBcCofins;
        this.aliqCofins = aliqCofins;
        this.quantBcCofins = quantBcCofins;
        this.aliqCofinsQuant = aliqCofinsQuant;
        this.vlCred = vlCred;
        this.vlAjusAcres = vlAjusAcres;
        this.vlAjusReduc = vlAjusReduc;
        this.vlCredDifer = vlCredDifer;
        this.vlCredDisp = vlCredDisp;
        this.indDescCred = indDescCred;
        this.vlCredDesc = vlCredDesc;
        this.sldCred = sldCred;
    }

    public RegM500(){}

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

    public BigDecimal getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    public void setAliqCofinsQuant(BigDecimal aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
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

    public BigDecimal getVlCredDifer() {
        return vlCredDifer;
    }

    public void setVlCredDifer(BigDecimal vlCredDifer) {
        this.vlCredDifer = vlCredDifer;
    }

    public BigDecimal getVlCredDisp() {
        return vlCredDisp;
    }

    public void setVlCredDisp(BigDecimal vlCredDisp) {
        this.vlCredDisp = vlCredDisp;
    }

    public String getIndDescCred() {
        return indDescCred;
    }

    public void setIndDescCred(String indDescCred) {
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

    public List<RegM505> getRegM505() {
        return regM505;
    }

    public void setRegM505(List<RegM505> regM505) {
        this.regM505 = regM505;
    }

    public List<RegM510> getRegM510() {
        return regM510;
    }

    public void setRegM510(List<RegM510> regM510) {
        this.regM510 = regM510;
    }

    
}
