package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0001 {

    private String reg = "0001";
    private IndMov indMov;

    private Bloco0005 bloco0005;

    public String getReg() {
        return reg;
    }

    public IndMov getIndMov() {
        return indMov;
    }

    public void setIndMov(IndMov indMov) {
        this.indMov = indMov;
    }

    public Bloco0005 getBloco0005() {
        return bloco0005;
    }

    public void setBloco0005(Bloco0005 bloco0005) {
        this.bloco0005 = bloco0005;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();
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
