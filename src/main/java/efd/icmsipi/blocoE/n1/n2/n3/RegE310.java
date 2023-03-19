package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegE310 implements Serializable {
	private static final long serialVersionUID = -7730345635479678023L;

	@Inclui
    private final String reg = "E310";

    @Inclui
    private String indMovFcpDifal;

    @Inclui
    private BigDecimal vlSldCredAntDifal;

    @Inclui
    private BigDecimal vlTotDebitosDifal;

    @Inclui
    private BigDecimal vlOutDebDifal;

    @Inclui
    private BigDecimal vlTotCreditosDifal;

    @Inclui
    private BigDecimal vlOutCredDifal;

    @Inclui
    private BigDecimal vlSldDevAntDifal;

    @Inclui
    private BigDecimal vlDeducoesDifal;

    @Inclui
    private BigDecimal vlRecolDifal;

    @Inclui
    private BigDecimal vlSldCredTransportarDifal;

    @Inclui
    private BigDecimal debEspDifal;

    @Inclui
    private BigDecimal vlSldCredAntFcp;

    @Inclui
    private BigDecimal vlTotDebFcp;

    @Inclui
    private BigDecimal vlOutDebFcp;

    @Inclui
    private BigDecimal vlTotCredFcp;

    @Inclui
    private BigDecimal vlOutCredFcp;

    @Inclui
    private BigDecimal vlSldDevAntFcp;

    @Inclui
    private BigDecimal vlDeducoesFcp;

    @Inclui
    private BigDecimal vlRecolFcp;

    @Inclui
    private BigDecimal vlSldCredTransportarFcp;

    @Inclui
    private BigDecimal debEspFcp;

    public RegE310(String indMovFcpDifal, BigDecimal vlSldCredAntDifal, BigDecimal vlTotDebitosDifal, BigDecimal vlOutDebDifal, BigDecimal vlTotCreditosDifal, BigDecimal vlOutCredDifal, BigDecimal vlSldDevAntDifal, BigDecimal vlDeducoesDifal, BigDecimal vlRecolDifal, BigDecimal vlSldCredTransportarDifal, BigDecimal debEspDifal, BigDecimal vlSldCredAntFcp, BigDecimal vlTotDebFcp, BigDecimal vlOutDebFcp, BigDecimal vlTotCredFcp, BigDecimal vlOutCredFcp, BigDecimal vlSldDevAntFcp, BigDecimal vlDeducoesFcp, BigDecimal vlRecolFcp, BigDecimal vlSldCredTransportarFcp, BigDecimal debEspFcp) {
        this.indMovFcpDifal = indMovFcpDifal;
        this.vlSldCredAntDifal = vlSldCredAntDifal;
        this.vlTotDebitosDifal = vlTotDebitosDifal;
        this.vlOutDebDifal = vlOutDebDifal;
        this.vlTotCreditosDifal = vlTotCreditosDifal;
        this.vlOutCredDifal = vlOutCredDifal;
        this.vlSldDevAntDifal = vlSldDevAntDifal;
        this.vlDeducoesDifal = vlDeducoesDifal;
        this.vlRecolDifal = vlRecolDifal;
        this.vlSldCredTransportarDifal = vlSldCredTransportarDifal;
        this.debEspDifal = debEspDifal;
        this.vlSldCredAntFcp = vlSldCredAntFcp;
        this.vlTotDebFcp = vlTotDebFcp;
        this.vlOutDebFcp = vlOutDebFcp;
        this.vlTotCredFcp = vlTotCredFcp;
        this.vlOutCredFcp = vlOutCredFcp;
        this.vlSldDevAntFcp = vlSldDevAntFcp;
        this.vlDeducoesFcp = vlDeducoesFcp;
        this.vlRecolFcp = vlRecolFcp;
        this.vlSldCredTransportarFcp = vlSldCredTransportarFcp;
        this.debEspFcp = debEspFcp;
    }

    public RegE310(){}

    public String getReg() {
        return reg;
    }

    public String getIndMovFcpDifal() {
        return indMovFcpDifal;
    }

    public void setIndMovFcpDifal(String indMovFcpDifal) {
        this.indMovFcpDifal = indMovFcpDifal;
    }

    public BigDecimal getVlSldCredAntDifal() {
        return vlSldCredAntDifal;
    }

    public void setVlSldCredAntDifal(BigDecimal vlSldCredAntDifal) {
        this.vlSldCredAntDifal = vlSldCredAntDifal;
    }

    public BigDecimal getVlTotDebitosDifal() {
        return vlTotDebitosDifal;
    }

    public void setVlTotDebitosDifal(BigDecimal vlTotDebitosDifal) {
        this.vlTotDebitosDifal = vlTotDebitosDifal;
    }

    public BigDecimal getVlOutDebDifal() {
        return vlOutDebDifal;
    }

    public void setVlOutDebDifal(BigDecimal vlOutDebDifal) {
        this.vlOutDebDifal = vlOutDebDifal;
    }

    public BigDecimal getVlTotCreditosDifal() {
        return vlTotCreditosDifal;
    }

    public void setVlTotCreditosDifal(BigDecimal vlTotCreditosDifal) {
        this.vlTotCreditosDifal = vlTotCreditosDifal;
    }

    public BigDecimal getVlOutCredDifal() {
        return vlOutCredDifal;
    }

    public void setVlOutCredDifal(BigDecimal vlOutCredDifal) {
        this.vlOutCredDifal = vlOutCredDifal;
    }

    public BigDecimal getVlSldDevAntDifal() {
        return vlSldDevAntDifal;
    }

    public void setVlSldDevAntDifal(BigDecimal vlSldDevAntDifal) {
        this.vlSldDevAntDifal = vlSldDevAntDifal;
    }

    public BigDecimal getVlDeducoesDifal() {
        return vlDeducoesDifal;
    }

    public void setVlDeducoesDifal(BigDecimal vlDeducoesDifal) {
        this.vlDeducoesDifal = vlDeducoesDifal;
    }

    public BigDecimal getVlRecolDifal() {
        return vlRecolDifal;
    }

    public void setVlRecolDifal(BigDecimal vlRecolDifal) {
        this.vlRecolDifal = vlRecolDifal;
    }

    public BigDecimal getVlSldCredTransportarDifal() {
        return vlSldCredTransportarDifal;
    }

    public void setVlSldCredTransportarDifal(BigDecimal vlSldCredTransportarDifal) {
        this.vlSldCredTransportarDifal = vlSldCredTransportarDifal;
    }

    public BigDecimal getDebEspDifal() {
        return debEspDifal;
    }

    public void setDebEspDifal(BigDecimal debEspDifal) {
        this.debEspDifal = debEspDifal;
    }

    public BigDecimal getVlSldCredAntFcp() {
        return vlSldCredAntFcp;
    }

    public void setVlSldCredAntFcp(BigDecimal vlSldCredAntFcp) {
        this.vlSldCredAntFcp = vlSldCredAntFcp;
    }

    public BigDecimal getVlTotDebFcp() {
        return vlTotDebFcp;
    }

    public void setVlTotDebFcp(BigDecimal vlTotDebFcp) {
        this.vlTotDebFcp = vlTotDebFcp;
    }

    public BigDecimal getVlOutDebFcp() {
        return vlOutDebFcp;
    }

    public void setVlOutDebFcp(BigDecimal vlOutDebFcp) {
        this.vlOutDebFcp = vlOutDebFcp;
    }

    public BigDecimal getVlTotCredFcp() {
        return vlTotCredFcp;
    }

    public void setVlTotCredFcp(BigDecimal vlTotCredFcp) {
        this.vlTotCredFcp = vlTotCredFcp;
    }

    public BigDecimal getVlOutCredFcp() {
        return vlOutCredFcp;
    }

    public void setVlOutCredFcp(BigDecimal vlOutCredFcp) {
        this.vlOutCredFcp = vlOutCredFcp;
    }

    public BigDecimal getVlSldDevAntFcp() {
        return vlSldDevAntFcp;
    }

    public void setVlSldDevAntFcp(BigDecimal vlSldDevAntFcp) {
        this.vlSldDevAntFcp = vlSldDevAntFcp;
    }

    public BigDecimal getVlDeducoesFcp() {
        return vlDeducoesFcp;
    }

    public void setVlDeducoesFcp(BigDecimal vlDeducoesFcp) {
        this.vlDeducoesFcp = vlDeducoesFcp;
    }

    public BigDecimal getVlRecolFcp() {
        return vlRecolFcp;
    }

    public void setVlRecolFcp(BigDecimal vlRecolFcp) {
        this.vlRecolFcp = vlRecolFcp;
    }

    public BigDecimal getVlSldCredTransportarFcp() {
        return vlSldCredTransportarFcp;
    }

    public void setVlSldCredTransportarFcp(BigDecimal vlSldCredTransportarFcp) {
        this.vlSldCredTransportarFcp = vlSldCredTransportarFcp;
    }

    public BigDecimal getDebEspFcp() {
        return debEspFcp;
    }

    public void setDebEspFcp(BigDecimal debEspFcp) {
        this.debEspFcp = debEspFcp;
    }
    
}