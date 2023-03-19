package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.bloco1.n1.n2.n3.Reg1101;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Reg1100 implements Serializable {
	private static final long serialVersionUID = 3384086159451986555L;

	@Inclui
	private final String reg = "1100";

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perApuCred;

    @Inclui(zerosEsquerda = 2)
    private Integer origCred;

    @Inclui(zerosEsquerda = 14)
    private Long cnpjSuc;

    @Inclui
    private Integer codCred;

    @Inclui
    private BigDecimal vlCredApu;

    @Inclui
    private BigDecimal vlCredExtApu;

    @Inclui
    private BigDecimal vlTotCredApu;

    @Inclui
    private BigDecimal vlCredDescPaAnt;

    @Inclui
    private BigDecimal vlCredPerPaAnt;

    @Inclui
    private BigDecimal vlCredDcoMpPaAnt;

    @Inclui
    private BigDecimal sdCredDispEfd;

    @Inclui
    private BigDecimal vlCredDescEfd;

    @Inclui
    private BigDecimal vlCredPerEfd;

    @Inclui
    private BigDecimal vlCredDcoMpEfd;

    @Inclui
    private BigDecimal vlCredTrans;

    @Inclui
    private BigDecimal vlCredOut;

    @Inclui
    private BigDecimal sldCredFim;

    @Filho
    private List<Reg1101> reg1101;

    public Reg1100(LocalDate perApuCred, Integer origCred, Long cnpjSuc, Integer codCred, BigDecimal vlCredApu, BigDecimal vlCredExtApu, BigDecimal vlTotCredApu, BigDecimal vlCredDescPaAnt, BigDecimal vlCredPerPaAnt, BigDecimal vlCredDcoMpPaAnt, BigDecimal sdCredDispEfd, BigDecimal vlCredDescEfd, BigDecimal vlCredPerEfd, BigDecimal vlCredDcoMpEfd, BigDecimal vlCredTrans, BigDecimal vlCredOut, BigDecimal sldCredFim) {
        this.perApuCred = perApuCred;
        this.origCred = origCred;
        this.cnpjSuc = cnpjSuc;
        this.codCred = codCred;
        this.vlCredApu = vlCredApu;
        this.vlCredExtApu = vlCredExtApu;
        this.vlTotCredApu = vlTotCredApu;
        this.vlCredDescPaAnt = vlCredDescPaAnt;
        this.vlCredPerPaAnt = vlCredPerPaAnt;
        this.vlCredDcoMpPaAnt = vlCredDcoMpPaAnt;
        this.sdCredDispEfd = sdCredDispEfd;
        this.vlCredDescEfd = vlCredDescEfd;
        this.vlCredPerEfd = vlCredPerEfd;
        this.vlCredDcoMpEfd = vlCredDcoMpEfd;
        this.vlCredTrans = vlCredTrans;
        this.vlCredOut = vlCredOut;
        this.sldCredFim = sldCredFim;
    }

    public Reg1100(){ }

    public String getReg() {
        return reg;
    }

    public LocalDate getPerApuCred() {
        return perApuCred;
    }

    public void setPerApuCred(LocalDate perApuCred) {
        this.perApuCred = perApuCred;
    }

    public Integer getOrigCred() {
        return origCred;
    }

    public void setOrigCred(Integer origCred) {
        this.origCred = origCred;
    }

    public Long getCnpjSuc() {
        return cnpjSuc;
    }

    public void setCnpjSuc(Long cnpjSuc) {
        this.cnpjSuc = cnpjSuc;
    }

    public Integer getCodCred() {
        return codCred;
    }

    public void setCodCred(Integer codCred) {
        this.codCred = codCred;
    }

    public BigDecimal getVlCredApu() {
        return vlCredApu;
    }

    public void setVlCredApu(BigDecimal vlCredApu) {
        this.vlCredApu = vlCredApu;
    }

    public BigDecimal getVlCredExtApu() {
        return vlCredExtApu;
    }

    public void setVlCredExtApu(BigDecimal vlCredExtApu) {
        this.vlCredExtApu = vlCredExtApu;
    }

    public BigDecimal getVlTotCredApu() {
        return vlTotCredApu;
    }

    public void setVlTotCredApu(BigDecimal vlTotCredApu) {
        this.vlTotCredApu = vlTotCredApu;
    }

    public BigDecimal getVlCredDescPaAnt() {
        return vlCredDescPaAnt;
    }

    public void setVlCredDescPaAnt(BigDecimal vlCredDescPaAnt) {
        this.vlCredDescPaAnt = vlCredDescPaAnt;
    }

    public BigDecimal getVlCredPerPaAnt() {
        return vlCredPerPaAnt;
    }

    public void setVlCredPerPaAnt(BigDecimal vlCredPerPaAnt) {
        this.vlCredPerPaAnt = vlCredPerPaAnt;
    }

    public BigDecimal getVlCredDcoMpPaAnt() {
        return vlCredDcoMpPaAnt;
    }

    public void setVlCredDcoMpPaAnt(BigDecimal vlCredDcoMpPaAnt) {
        this.vlCredDcoMpPaAnt = vlCredDcoMpPaAnt;
    }

    public BigDecimal getSdCredDispEfd() {
        return sdCredDispEfd;
    }

    public void setSdCredDispEfd(BigDecimal sdCredDispEfd) {
        this.sdCredDispEfd = sdCredDispEfd;
    }

    public BigDecimal getVlCredDescEfd() {
        return vlCredDescEfd;
    }

    public void setVlCredDescEfd(BigDecimal vlCredDescEfd) {
        this.vlCredDescEfd = vlCredDescEfd;
    }

    public BigDecimal getVlCredPerEfd() {
        return vlCredPerEfd;
    }

    public void setVlCredPerEfd(BigDecimal vlCredPerEfd) {
        this.vlCredPerEfd = vlCredPerEfd;
    }

    public BigDecimal getVlCredDcoMpEfd() {
        return vlCredDcoMpEfd;
    }

    public void setVlCredDcoMpEfd(BigDecimal vlCredDcoMpEfd) {
        this.vlCredDcoMpEfd = vlCredDcoMpEfd;
    }

    public BigDecimal getVlCredTrans() {
        return vlCredTrans;
    }

    public void setVlCredTrans(BigDecimal vlCredTrans) {
        this.vlCredTrans = vlCredTrans;
    }

    public BigDecimal getVlCredOut() {
        return vlCredOut;
    }

    public void setVlCredOut(BigDecimal vlCredOut) {
        this.vlCredOut = vlCredOut;
    }

    public BigDecimal getSldCredFim() {
        return sldCredFim;
    }

    public void setSldCredFim(BigDecimal sldCredFim) {
        this.sldCredFim = sldCredFim;
    }

    public List<Reg1101> getReg1101() {
        return reg1101;
    }

    public void setReg1101(List<Reg1101> reg1101) {
        this.reg1101 = reg1101;
    }
    
}
