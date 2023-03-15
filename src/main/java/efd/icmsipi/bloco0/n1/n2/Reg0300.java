package efd.icmsipi.bloco0.n1.n2;

import java.io.Serializable;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco0.n1.n2.n3.Reg0305;
import lombok.Getter;
import lombok.Setter;


public class Reg0300 implements Serializable {
	private static final long serialVersionUID = -6247841193227375045L;

	@Getter @Inclui
    private final String reg = "0300";

    @Getter @Setter @Inclui
    private String codIndBem;

    @Getter @Setter @Inclui
    private String identMerc;

    @Getter @Setter @Inclui
    private String descrItem;

    @Getter @Setter @Inclui
    private String codPrnc;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private Integer nrParc;

    @Getter @Setter @Filho
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

}
