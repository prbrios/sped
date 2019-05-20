package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;

public class BlocoC165 {

    private final String reg = "C165";
    private String codPart;
    private String veidId;
    private String codAut;
    private String nrPasse;
    private LocalTime hora;
    private BigDecimal temper;
    private BigDecimal qtdVol;
    private BigDecimal pesoBrt;
    private BigDecimal pesoLiq;
    private String nomMot;
    private String cpf;
    private UF ufId;

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

    public UF getUfId() {
        return ufId;
    }

    public void setUfId(UF ufId) {
        this.ufId = ufId;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codPart);
        arr.add(this.veidId);
        arr.add(this.codAut);
        arr.add(this.nrPasse);
        arr.add(this.hora != null ? Parsers.formataHora(this.hora, "hhmmss") : null);
        arr.add(this.temper != null ? Parsers.formataNumero(this.temper, 2) : null);
        arr.add(this.qtdVol != null ? Parsers.formataNumero(this.qtdVol, 2) : null);
        arr.add(this.pesoBrt != null ? Parsers.formataNumero(this.pesoBrt, 2) : null);
        arr.add(this.pesoLiq != null ? Parsers.formataNumero(this.pesoLiq, 2) : null);
        arr.add(this.nomMot);
        arr.add(this.cpf);
        arr.add(this.ufId != null ? this.ufId.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

}
