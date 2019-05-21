package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0001 {

    @Inclui
    private String reg = "0001";

    @Inclui
    private String indMov;

    private Bloco0005 bloco0005;

    public String getReg() {
        return reg;
    }

    public String getIndMov() {
        return indMov;
    }

    public void setIndMov(String indMov) {
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
        return Parsers.converteBlocoEmString(this);
    }

}
