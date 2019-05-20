package efd.icmsipi;

import efd.Parsers;

import java.util.ArrayList;
import java.util.List;

public class Bloco0300 {

    private final String reg = "0300";
    private String codIndBem;
    private IdentMerc identMerc;
    private String descrItem;
    private String codPrnc;
    private String codCta;
    private Integer nrParc;

    public String getReg() {
        return reg;
    }

    public String getCodIndBem() {
        return codIndBem;
    }

    public void setCodIndBem(String codIndBem) {
        this.codIndBem = codIndBem;
    }

    public IdentMerc getIdentMerc() {
        return identMerc;
    }

    public void setIdentMerc(IdentMerc identMerc) {
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

        List arr = new ArrayList<>();

        arr.add(this.reg);
        arr.add(this.codIndBem);
        arr.add(this.identMerc != null ? this.identMerc.getCodigo() : null);
        arr.add(this.descrItem);
        arr.add(this.codPrnc);
        arr.add(this.codCta);
        arr.add(this.nrParc);

        return Parsers.converteBlocoEmString(arr);

    }

    public enum IdentMerc {

        BEM("1"),
        COMPONENTE("2");

        private String codigo;

        IdentMerc(String codigo){
            this.codigo = codigo;
        }

        public String getCodigo() {
            return codigo;
        }

    }
}
