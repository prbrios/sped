package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0305 {

    private final String reg = "0305";
    private String codCcus;
    private String func;
    private Integer vidaUtil;

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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codCcus);
        arr.add(this.func);
        arr.add(this.vidaUtil);

        return Parsers.converteBlocoEmString(arr);

    }

}
