package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class RegC176 implements Serializable {
	private static final long serialVersionUID = -4724971126856417199L;

	@Inclui
    private final String reg = "C176";

    @Inclui
    private String codModUltE;

    @Inclui
    private Long numDocUltE;

    @Inclui
    private String serUltE;

    @Inclui
    private LocalDate dtUltE;

    @Inclui
    private String codPartUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal quantUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitUltE;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlUnitBcSt;

    @Inclui
    private String chaveNfeUltE;

    @Inclui
    private Integer numItemUltE;

    @Inclui
    private BigDecimal vlUnitBcIcmsUltE;

    @Inclui
    private BigDecimal aliqIcmsUltE;

    @Inclui
    private BigDecimal vlUnitLimiteBcIcmsUltE;

    @Inclui
    private BigDecimal vlUnitIcmsUltE;

    @Inclui
    private BigDecimal aliqStUltE;

    @Inclui
    private BigDecimal vlUnitRes;

    @Inclui
    private Integer codRespRet;

    @Inclui
    private Integer codMotRes;

    @Inclui
    private String chaveNfeRet;

    @Inclui
    private String codParNfeRet;

    @Inclui
    private String serNfeRet;

    @Inclui
    private Integer numNfeRet;

    @Inclui
    private Integer itemNfeRet;

    @Inclui
    private String codDa;

    @Inclui
    private String numDa;

    @Inclui
    private BigDecimal vlUnitResFcpSt;

    public RegC176(String codModUltE, Long numDocUltE, String serUltE, LocalDate dtUltE, String codPartUltE, BigDecimal quantUltE, BigDecimal vlUnitUltE, BigDecimal vlUnitBcSt, String chaveNfeUltE, Integer numItemUltE, BigDecimal vlUnitBcIcmsUltE, BigDecimal aliqIcmsUltE, BigDecimal vlUnitLimiteBcIcmsUltE, BigDecimal vlUnitIcmsUltE, BigDecimal aliqStUltE, BigDecimal vlUnitRes, Integer codRespRet, Integer codMotRes, String chaveNfeRet, String codParNfeRet, String serNfeRet, Integer numNfeRet, Integer itemNfeRet, String codDa, String numDa, BigDecimal vlUnitResFcpSt) {
        this.codModUltE = codModUltE;
        this.numDocUltE = numDocUltE;
        this.serUltE = serUltE;
        this.dtUltE = dtUltE;
        this.codPartUltE = codPartUltE;
        this.quantUltE = quantUltE;
        this.vlUnitUltE = vlUnitUltE;
        this.vlUnitBcSt = vlUnitBcSt;
        this.chaveNfeUltE = chaveNfeUltE;
        this.numItemUltE = numItemUltE;
        this.vlUnitBcIcmsUltE = vlUnitBcIcmsUltE;
        this.aliqIcmsUltE = aliqIcmsUltE;
        this.vlUnitLimiteBcIcmsUltE = vlUnitLimiteBcIcmsUltE;
        this.vlUnitIcmsUltE = vlUnitIcmsUltE;
        this.aliqStUltE = aliqStUltE;
        this.vlUnitRes = vlUnitRes;
        this.codRespRet = codRespRet;
        this.codMotRes = codMotRes;
        this.chaveNfeRet = chaveNfeRet;
        this.codParNfeRet = codParNfeRet;
        this.serNfeRet = serNfeRet;
        this.numNfeRet = numNfeRet;
        this.itemNfeRet = itemNfeRet;
        this.codDa = codDa;
        this.numDa = numDa;
        this.vlUnitResFcpSt = vlUnitResFcpSt;
    }

    public RegC176(){}

    public String getReg() {
        return reg;
    }

    public String getCodModUltE() {
        return codModUltE;
    }

    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }

    public Long getNumDocUltE() {
        return numDocUltE;
    }

    public void setNumDocUltE(Long numDocUltE) {
        this.numDocUltE = numDocUltE;
    }

    public String getSerUltE() {
        return serUltE;
    }

    public void setSerUltE(String serUltE) {
        this.serUltE = serUltE;
    }

    public LocalDate getDtUltE() {
        return dtUltE;
    }

    public void setDtUltE(LocalDate dtUltE) {
        this.dtUltE = dtUltE;
    }

    public String getCodPartUltE() {
        return codPartUltE;
    }

    public void setCodPartUltE(String codPartUltE) {
        this.codPartUltE = codPartUltE;
    }

    public BigDecimal getQuantUltE() {
        return quantUltE;
    }

    public void setQuantUltE(BigDecimal quantUltE) {
        this.quantUltE = quantUltE;
    }

    public BigDecimal getVlUnitUltE() {
        return vlUnitUltE;
    }

    public void setVlUnitUltE(BigDecimal vlUnitUltE) {
        this.vlUnitUltE = vlUnitUltE;
    }

    public BigDecimal getVlUnitBcSt() {
        return vlUnitBcSt;
    }

    public void setVlUnitBcSt(BigDecimal vlUnitBcSt) {
        this.vlUnitBcSt = vlUnitBcSt;
    }

    public String getChaveNfeUltE() {
        return chaveNfeUltE;
    }

    public void setChaveNfeUltE(String chaveNfeUltE) {
        this.chaveNfeUltE = chaveNfeUltE;
    }

    public Integer getNumItemUltE() {
        return numItemUltE;
    }

    public void setNumItemUltE(Integer numItemUltE) {
        this.numItemUltE = numItemUltE;
    }

    public BigDecimal getVlUnitBcIcmsUltE() {
        return vlUnitBcIcmsUltE;
    }

    public void setVlUnitBcIcmsUltE(BigDecimal vlUnitBcIcmsUltE) {
        this.vlUnitBcIcmsUltE = vlUnitBcIcmsUltE;
    }

    public BigDecimal getAliqIcmsUltE() {
        return aliqIcmsUltE;
    }

    public void setAliqIcmsUltE(BigDecimal aliqIcmsUltE) {
        this.aliqIcmsUltE = aliqIcmsUltE;
    }

    public BigDecimal getVlUnitLimiteBcIcmsUltE() {
        return vlUnitLimiteBcIcmsUltE;
    }

    public void setVlUnitLimiteBcIcmsUltE(BigDecimal vlUnitLimiteBcIcmsUltE) {
        this.vlUnitLimiteBcIcmsUltE = vlUnitLimiteBcIcmsUltE;
    }

    public BigDecimal getVlUnitIcmsUltE() {
        return vlUnitIcmsUltE;
    }

    public void setVlUnitIcmsUltE(BigDecimal vlUnitIcmsUltE) {
        this.vlUnitIcmsUltE = vlUnitIcmsUltE;
    }

    public BigDecimal getAliqStUltE() {
        return aliqStUltE;
    }

    public void setAliqStUltE(BigDecimal aliqStUltE) {
        this.aliqStUltE = aliqStUltE;
    }

    public BigDecimal getVlUnitRes() {
        return vlUnitRes;
    }

    public void setVlUnitRes(BigDecimal vlUnitRes) {
        this.vlUnitRes = vlUnitRes;
    }

    public Integer getCodRespRet() {
        return codRespRet;
    }

    public void setCodRespRet(Integer codRespRet) {
        this.codRespRet = codRespRet;
    }

    public Integer getCodMotRes() {
        return codMotRes;
    }

    public void setCodMotRes(Integer codMotRes) {
        this.codMotRes = codMotRes;
    }

    public String getChaveNfeRet() {
        return chaveNfeRet;
    }

    public void setChaveNfeRet(String chaveNfeRet) {
        this.chaveNfeRet = chaveNfeRet;
    }

    public String getCodParNfeRet() {
        return codParNfeRet;
    }

    public void setCodParNfeRet(String codParNfeRet) {
        this.codParNfeRet = codParNfeRet;
    }

    public String getSerNfeRet() {
        return serNfeRet;
    }

    public void setSerNfeRet(String serNfeRet) {
        this.serNfeRet = serNfeRet;
    }

    public Integer getNumNfeRet() {
        return numNfeRet;
    }

    public void setNumNfeRet(Integer numNfeRet) {
        this.numNfeRet = numNfeRet;
    }

    public Integer getItemNfeRet() {
        return itemNfeRet;
    }

    public void setItemNfeRet(Integer itemNfeRet) {
        this.itemNfeRet = itemNfeRet;
    }

    public String getCodDa() {
        return codDa;
    }

    public void setCodDa(String codDa) {
        this.codDa = codDa;
    }

    public String getNumDa() {
        return numDa;
    }

    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }

    public BigDecimal getVlUnitResFcpSt() {
        return vlUnitResFcpSt;
    }

    public void setVlUnitResFcpSt(BigDecimal vlUnitResFcpSt) {
        this.vlUnitResFcpSt = vlUnitResFcpSt;
    }
    
}
