package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;

public class RegC165 implements Serializable {
	private static final long serialVersionUID = -3688667555198158588L;

	@Inclui
    private final String reg = "C165";

    @Inclui
    private String codPart;

    @Inclui
    private String veidId;

    @Inclui
    private String codAut;

    @Inclui
    private String nrPasse;

    @Inclui
    private LocalTime hora;

    @Inclui(casasDecimais = 1)
    private BigDecimal temper;

    @Inclui
    private Integer qtdVol;

    @Inclui
    private BigDecimal pesoBrt;

    @Inclui
    private BigDecimal pesoLiq;

    @Inclui
    private String nomMot;

    @Inclui(zerosEsquerda = 11)
    private Long cpf;

    @Inclui
    private String ufId;

    public RegC165(String codPart, String veidId, String codAut, String nrPasse, LocalTime hora, BigDecimal temper, Integer qtdVol, BigDecimal pesoBrt, BigDecimal pesoLiq, String nomMot, Long cpf, String ufId) {
        this.codPart = codPart;
        this.veidId = veidId;
        this.codAut = codAut;
        this.nrPasse = nrPasse;
        this.hora = hora;
        this.temper = temper;
        this.qtdVol = qtdVol;
        this.pesoBrt = pesoBrt;
        this.pesoLiq = pesoLiq;
        this.nomMot = nomMot;
        this.cpf = cpf;
        this.ufId = ufId;
    }

    public RegC165(){}

    public String getReg() {
        return reg;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public String getVeidId() {
        return veidId;
    }

    public void setVeidId(String veidId) {
        this.veidId = veidId;
    }

    public String getCodAut() {
        return codAut;
    }

    public void setCodAut(String codAut) {
        this.codAut = codAut;
    }

    public String getNrPasse() {
        return nrPasse;
    }

    public void setNrPasse(String nrPasse) {
        this.nrPasse = nrPasse;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public BigDecimal getTemper() {
        return temper;
    }

    public void setTemper(BigDecimal temper) {
        this.temper = temper;
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

    public String getNomMot() {
        return nomMot;
    }

    public void setNomMot(String nomMot) {
        this.nomMot = nomMot;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }
    
}
