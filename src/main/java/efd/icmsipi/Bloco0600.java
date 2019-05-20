package efd.icmsipi;

import efd.Parsers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bloco0600 {

    private final String reg = "0600";
    private LocalDate dtAlt;
    private String codCcus;
    private String ccus;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.dtAlt != null ? Parsers.formataData(this.dtAlt, "ddMMyyyy") : null);
        arr.add(this.codCcus);
        arr.add(this.ccus);

        return Parsers.converteBlocoEmString(arr);

    }

}
