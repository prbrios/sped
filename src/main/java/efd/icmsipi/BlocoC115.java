package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;

public class BlocoC115 {

    private final String reg = "C115";
    private IndCarga indCarga;
    private String cnpjCol;
    private String ieCol;
    private String cpfCol;
    private String codMunCol;
    private String cnpjEntg;
    private String ieEntg;
    private String cpfEntg;
    private String codMunEntg;

    public String getReg() {
        return reg;
    }

    public IndCarga getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(IndCarga indCarga) {
        this.indCarga = indCarga;
    }

    public String getCnpjCol() {
        return cnpjCol;
    }

    public void setCnpjCol(String cnpjCol) {
        this.cnpjCol = cnpjCol;
    }

    public String getIeCol() {
        return ieCol;
    }

    public void setIeCol(String ieCol) {
        this.ieCol = ieCol;
    }

    public String getCpfCol() {
        return cpfCol;
    }

    public void setCpfCol(String cpfCol) {
        this.cpfCol = cpfCol;
    }

    public String getCodMunCol() {
        return codMunCol;
    }

    public void setCodMunCol(String codMunCol) {
        this.codMunCol = codMunCol;
    }

    public String getCnpjEntg() {
        return cnpjEntg;
    }

    public void setCnpjEntg(String cnpjEntg) {
        this.cnpjEntg = cnpjEntg;
    }

    public String getIeEntg() {
        return ieEntg;
    }

    public void setIeEntg(String ieEntg) {
        this.ieEntg = ieEntg;
    }

    public String getCpfEntg() {
        return cpfEntg;
    }

    public void setCpfEntg(String cpfEntg) {
        this.cpfEntg = cpfEntg;
    }

    public String getCodMunEntg() {
        return codMunEntg;
    }

    public void setCodMunEntg(String codMunEntg) {
        this.codMunEntg = codMunEntg;
    }

    @Override
    public String toString(){

        java.util.List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.indCarga != null ? this.indCarga.getCodigo() : null);
        arr.add(this.cnpjCol);
        arr.add(this.ieCol);
        arr.add(this.cpfCol);
        arr.add(this.codMunCol);
        arr.add(this.cnpjEntg);
        arr.add(this.ieEntg);
        arr.add(this.cpfEntg);
        arr.add(this.codMunEntg);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IndCarga {

        RODOVIARIO("0"),
        FERROVIARIO("1"),
        RODO_FERROVIARIO("2"),
        AQUAVIARIO("3"),
        DUTOVIARIO("4"),
        AEREO("5"),
        OUTROS("9");

        private String codigo;

        IndCarga(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return this.codigo;
        }
    }

}
