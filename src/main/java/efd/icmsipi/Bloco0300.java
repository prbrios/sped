package efd.icmsipi;

import efd.Inclui;
import efd.Parsers;

public class Bloco0300 {

    @Inclui private final String reg = "0300";
    @Inclui private String codIndBem;
    @Inclui private String identMerc;
    @Inclui private String descrItem;
    @Inclui private String codPrnc;
    @Inclui private String codCta;
    @Inclui private Integer nrParc;

    public String getReg() {
        return reg;
    }

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public String getIdentMerc() {
        return identMerc;
    }

    public void setIdentMerc(String identMerc) {
        this.identMerc = identMerc;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public String getCodPrnc() {
        return codPrnc;
    }

    public void setCodPrnc(String codPrnc) {
        this.codPrnc = codPrnc;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public Integer getNrParc() {
        return nrParc;
    }

    public void setNrParc(Integer nrParc) {
        this.nrParc = nrParc;
    }

    @Override
    public String toString(){
        return Parsers.converteBlocoEmString(this);
    }

}
