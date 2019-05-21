package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

import java.time.LocalDate;

public class Bloco0600 {

    @Inclui private final String reg = "0600";
    @Inclui private LocalDate dtAlt;
    @Inclui private String codCcus;
    @Inclui private String ccus;

    public String getReg() {
        return reg;
    }

    public LocalDate getDtAlt() {
        return dtAlt;
    }

    public void setDtAlt(LocalDate dtAlt) {
        this.dtAlt = dtAlt;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getCcus() {
        return ccus;
    }

    public void setCcus(String ccus) {
        this.ccus = ccus;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
