package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoC111 {

    private final String reg = "C111";
    private String numProc;
    private IndProc indProc;

    public String getReg() {
        return reg;
    }

    public String getNumProc() {
        return numProc;
    }

    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }

    public IndProc getIndProc() {
        return indProc;
    }

    public void setIndProc(IndProc indProc) {
        this.indProc = indProc;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.numProc);
        arr.add(this.indProc != null ? this.indProc.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndProc {

        SEFAZ("0"),
        JUSTICA_FEDERAL("1"),
        JUSTICA_ESTADUAL("2"),
        SECEX__SRF("3"),
        OUTROS("9");

        private String codigo;

        IndProc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

}
