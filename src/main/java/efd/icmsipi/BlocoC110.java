package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoC110 {

    private final String reg = "C110";
    private String codInf;
    private String txtCompl;

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

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codInf);
        arr.add(this.txtCompl);

        return Parsers.converteBlocoEmString(arr);

    }

}
