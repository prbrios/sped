package efd.icmsipi.blocoD.n1.n2.n3;

import java.io.Serializable;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;


public class RegD301 implements Serializable {
	private static final long serialVersionUID = -6385896381682561927L;

	@Getter @Inclui
    private final String reg = "D301";

    @Getter @Setter @Inclui
    private Integer numDocCan;

    public RegD301(Integer numDocCan) {
        this.numDocCan = numDocCan;
    }

    public RegD301(){}
}