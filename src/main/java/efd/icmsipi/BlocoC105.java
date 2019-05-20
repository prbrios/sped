package efd.icmsipi;

import efd.Parsers;
import efd.UF;

import java.util.ArrayList;

public class BlocoC105 {

    private final String reg = "C105";
    private Oper oper;
    private UF uf;

    public String getReg() {
        return reg;
    }

    public Oper getOper() {
        return oper;
    }

    public void setOper(Oper oper) {
        this.oper = oper;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.oper != null ? this.oper.getCodigo() : null);
        arr.add(this.uf != null ? this.uf.getSigla() : null);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum Oper {

        CONBUSTIVEIS_E_LUBRIFICANTES("0"),
        LEASING_DE_VEICULOS_OU_FATURAMENTO_DIRETO("1");

        private String codigo;

        Oper(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }

    }

}
