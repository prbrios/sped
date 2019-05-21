package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0305 {

    @Inclui private final String reg = "0305";
    @Inclui private String codCcus;
    @Inclui private String func;
    @Inclui private Integer vidaUtil;

    public String getReg() {
        return reg;
    }

    public String getCodCcus() {
        return codCcus;
    }

    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public Integer getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(Integer vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
