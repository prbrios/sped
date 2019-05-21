package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class BlocoC115 {

    @Inclui private final String reg = "C115";
    @Inclui private String indCarga;
    @Inclui private String cnpjCol;
    @Inclui private String ieCol;
    @Inclui private String cpfCol;
    @Inclui private String codMunCol;
    @Inclui private String cnpjEntg;
    @Inclui private String ieEntg;
    @Inclui private String cpfEntg;
    @Inclui private String codMunEntg;

    public String getReg() {
        return reg;
    }

    public String getIndCarga() {
        return indCarga;
    }

    public void setIndCarga(String indCarga) {
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
        return Parsers.converteBlocoEmString(this);
    }

}
