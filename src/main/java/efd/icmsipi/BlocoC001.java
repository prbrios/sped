package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoC001 {

    private final String reg = "C001";
    private IndMov indMov;

    public String getReg() {
        return reg;
    }

    public IndMov getIndMov() {
        return indMov;
    }

    public void setIndMov(IndMov indMov) {
        this.indMov = indMov;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indMov != null ? this.indMov.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndMov {

        BLOCO_COM_DADOS_INFORMADOS("0"),
        BLOCO_SEM_DADOS_INFORMADOS("1");

        private String codigo;

        IndMov(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }
}
