package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class BlocoB001 {

    private final String reg = "B001";
    private IndDad indDad;

    public String getReg() {
        return reg;
    }

    public IndDad getIndDad() {
        return indDad;
    }

    public void setIndDad(IndDad indDad) {
        this.indDad = indDad;
    }

    @Override
    public String toString(){

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indDad != null ? this.indDad.getCodigo() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndDad {

        BLOCO_COM_DADOS_INFORMADO("0"),
        BLOCO_SEM_DADOS_INFORMADOS("1");

        private String codigo;

        IndDad(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }
}
