package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoC110 {

    @Inclui private final String reg = "C110";
    @Inclui private String codInf;
    @Inclui private String txtCompl;

    public String getReg() {
        return reg;
    }

    public String getCodInf() {
        return codInf;
    }

    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }

    public String getTxtCompl() {
        return txtCompl;
    }

    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
