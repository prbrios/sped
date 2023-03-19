package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC160 implements Serializable {
	private static final long serialVersionUID = -3584697133795870167L;

	@Inclui
    private final String reg = "C160";

    @Inclui
    private String codPart;

    @Inclui
    private String veicId;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    @Inclui
    private String ufId;

    public RegC160(String codPart, String veicId, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq, String ufId) {
        this.codPart = codPart;
        this.veicId = veicId;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
        this.ufId = ufId;
    }

    public RegC160(){}

    public String getReg() {
        return reg;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getVeicId() {
        return veicId;
    }

    public void setVeicId(String veicId) {
        this.veicId = veicId;
    }

    public Integer getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(Integer qtdVol) {
        this.qtdVol = qtdVol;
    }

    public BigDecimal getPesoBrt() {
        return pesoBrt;
    }

    public void setPesoBrt(BigDecimal pesoBrt) {
        this.pesoBrt = pesoBrt;
    }

    public BigDecimal getPesoLiq() {
        return pesoLiq;
    }

    public void setPesoLiq(BigDecimal pesoLiq) {
        this.pesoLiq = pesoLiq;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}
