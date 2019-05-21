package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.math.BigDecimal;
import java.time.LocalTime;

public class BlocoC165 {

    @Inclui private final String reg = "C165";
    @Inclui private String codPart;
    @Inclui private String veidId;
    @Inclui private String codAut;
    @Inclui private String nrPasse;
    @Inclui private LocalTime hora;
    @Inclui private BigDecimal temper;
    @Inclui private BigDecimal qtdVol;
    @Inclui private BigDecimal pesoBrt;
    @Inclui private BigDecimal pesoLiq;
    @Inclui private String nomMot;
    @Inclui private String cpf;
    @Inclui private String ufId;

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

    public BigDecimal getQtdVol() {
        return qtdVol;
    }

    public void setQtdVol(BigDecimal qtdVol) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUfId() {
        return ufId;
    }

    public void setUfId(String ufId) {
        this.ufId = ufId;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
