package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BlocoC160 {

    private final String reg = "C160";
    private String codPart;
    private String veicId;
    private Integer qtdVol;
    private BigDecimal pesoBrt;
    private BigDecimal pesoLiq;
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
        arr.add(this.veicId);
        arr.add(this.qtdVol);
        arr.add(this.pesoBrt != null ? Parsers.formataNumero(this.pesoBrt, 2) : null);
        arr.add(this.pesoLiq != null ? Parsers.formataNumero(this.pesoLiq, 2) : null);
        arr.add(this.ufId != null ? this.ufId.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

}
