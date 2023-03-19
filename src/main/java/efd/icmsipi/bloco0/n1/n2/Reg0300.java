package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0305;

public class Reg0300 implements Serializable {
	private static final long serialVersionUID = -6247841193227375045L;

	@Inclui
    private final String reg = "0300";

    @Inclui
    private String codIndBem;

    @Inclui
    private String identMerc;

    @Inclui
    private String descrItem;

    @Inclui
    private String codPrnc;

    @Inclui
    private String codCta;

    @Inclui
    private Integer nrParc;

    @Filho
    private Reg0305 bloco0350;

    public Reg0300(String codIndBem, String identMerc, String descrItem, String codPrnc, String codCta, Integer nrParc) {

        this.codIndBem = codIndBem;
        this.identMerc = identMerc;
        this.descrItem = descrItem;
        this.codPrnc = codPrnc;
        this.codCta = codCta;
        this.nrParc = nrParc;
    }

    public Reg0300(){}

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

    public Reg0305 getBloco0350() {
        return bloco0350;
    }

    public void setBloco0350(Reg0305 bloco0350) {
        this.bloco0350 = bloco0350;
    }
    

}
