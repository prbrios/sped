package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class Bloco0500 {

    @Inclui private final String reg = "0500";
    @Inclui private LocalDate dtAlt;
    @Inclui private String codNatCc;
    @Inclui private String indCta;
    @Inclui private Integer nivel;
    @Inclui private String codCta;
    @Inclui private String nomeCta;

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodNatCc() {
        return codNatCc;
    }

    public void setCodNatCc(String codNatCc) {
        this.codNatCc = codNatCc;
    }

    public String getIndCta() {
        return indCta;
    }

    public void setIndCta(String indCta) {
        this.indCta = indCta;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getNomeCta() {
        return nomeCta;
    }

    public void setNomeCta(String nomeCta) {
        this.nomeCta = nomeCta;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }
}
