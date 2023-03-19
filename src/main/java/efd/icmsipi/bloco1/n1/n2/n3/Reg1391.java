package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1391 implements Serializable {
	private static final long serialVersionUID = -3211000897220254254L;

	@Inclui
    private final String reg = "1391";

    @Inclui
    private LocalDate dtRegistro;

    @Inclui
    private BigDecimal qtdMoid;

    @Inclui
    private BigDecimal estqIni;

    @Inclui
    private BigDecimal qtdProduz;

    @Inclui
    private BigDecimal entAnidHid;

    @Inclui
    private BigDecimal outrEntr;

    @Inclui
    private BigDecimal perda;

    @Inclui
    private BigDecimal cons;

    @Inclui
    private BigDecimal saiAniHid;

    @Inclui
    private Integer saidas;

    @Inclui
    private BigDecimal estqFin;

    @Inclui
    private BigDecimal estqIniMel;

    @Inclui
    private BigDecimal prodDiaMel;

    @Inclui
    private BigDecimal utilMel;

    @Inclui
    private BigDecimal prodAlcMel;

    @Inclui
    private String obs;

    @Inclui(zerosEsquerda = 2)
    String codItem;

    @Inclui
    Integer tpResiduo;

    @Inclui
    private BigDecimal qtdResiduo;

    public Reg1391(LocalDate dtRegistro, BigDecimal qtdMoid, BigDecimal estqIni, BigDecimal qtdProduz, BigDecimal entAnidHid, BigDecimal outrEntr, BigDecimal perda, BigDecimal cons, BigDecimal saiAniHid, Integer saidas, BigDecimal estqFin, BigDecimal estqIniMel, BigDecimal prodDiaMel, BigDecimal utilMel, BigDecimal prodAlcMel, String obs, String codItem, Integer tpResiduo, BigDecimal qtdResiduo) {
        this.dtRegistro = dtRegistro;
        this.qtdMoid = qtdMoid;
        this.estqIni = estqIni;
        this.qtdProduz = qtdProduz;
        this.entAnidHid = entAnidHid;
        this.outrEntr = outrEntr;
        this.perda = perda;
        this.cons = cons;
        this.saiAniHid = saiAniHid;
        this.saidas = saidas;
        this.estqFin = estqFin;
        this.estqIniMel = estqIniMel;
        this.prodDiaMel = prodDiaMel;
        this.utilMel = utilMel;
        this.prodAlcMel = prodAlcMel;
        this.obs = obs;
        this.codItem = codItem;
        this.tpResiduo = tpResiduo;
        this.qtdResiduo = qtdResiduo;
    }

    public Reg1391(){}

    public String getReg() {
        return reg;
    }

    public LocalDate getDtRegistro() {
        return dtRegistro;
    }

    public void setDtRegistro(LocalDate dtRegistro) {
        this.dtRegistro = dtRegistro;
    }

    public BigDecimal getQtdMoid() {
        return qtdMoid;
    }

    public void setQtdMoid(BigDecimal qtdMoid) {
        this.qtdMoid = qtdMoid;
    }

    public BigDecimal getEstqIni() {
        return estqIni;
    }

    public void setEstqIni(BigDecimal estqIni) {
        this.estqIni = estqIni;
    }

    public BigDecimal getQtdProduz() {
        return qtdProduz;
    }

    public void setQtdProduz(BigDecimal qtdProduz) {
        this.qtdProduz = qtdProduz;
    }

    public BigDecimal getEntAnidHid() {
        return entAnidHid;
    }

    public void setEntAnidHid(BigDecimal entAnidHid) {
        this.entAnidHid = entAnidHid;
    }

    public BigDecimal getOutrEntr() {
        return outrEntr;
    }

    public void setOutrEntr(BigDecimal outrEntr) {
        this.outrEntr = outrEntr;
    }

    public BigDecimal getPerda() {
        return perda;
    }

    public void setPerda(BigDecimal perda) {
        this.perda = perda;
    }

    public BigDecimal getCons() {
        return cons;
    }

    public void setCons(BigDecimal cons) {
        this.cons = cons;
    }

    public BigDecimal getSaiAniHid() {
        return saiAniHid;
    }

    public void setSaiAniHid(BigDecimal saiAniHid) {
        this.saiAniHid = saiAniHid;
    }

    public Integer getSaidas() {
        return saidas;
    }

    public void setSaidas(Integer saidas) {
        this.saidas = saidas;
    }

    public BigDecimal getEstqFin() {
        return estqFin;
    }

    public void setEstqFin(BigDecimal estqFin) {
        this.estqFin = estqFin;
    }

    public BigDecimal getEstqIniMel() {
        return estqIniMel;
    }

    public void setEstqIniMel(BigDecimal estqIniMel) {
        this.estqIniMel = estqIniMel;
    }

    public BigDecimal getProdDiaMel() {
        return prodDiaMel;
    }

    public void setProdDiaMel(BigDecimal prodDiaMel) {
        this.prodDiaMel = prodDiaMel;
    }

    public BigDecimal getUtilMel() {
        return utilMel;
    }

    public void setUtilMel(BigDecimal utilMel) {
        this.utilMel = utilMel;
    }

    public BigDecimal getProdAlcMel() {
        return prodAlcMel;
    }

    public void setProdAlcMel(BigDecimal prodAlcMel) {
        this.prodAlcMel = prodAlcMel;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public Integer getTpResiduo() {
        return tpResiduo;
    }

    public void setTpResiduo(Integer tpResiduo) {
        this.tpResiduo = tpResiduo;
    }

    public BigDecimal getQtdResiduo() {
        return qtdResiduo;
    }

    public void setQtdResiduo(BigDecimal qtdResiduo) {
        this.qtdResiduo = qtdResiduo;
    }
    
}