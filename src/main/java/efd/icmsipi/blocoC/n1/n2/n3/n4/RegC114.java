package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


public class RegC114 implements Serializable {
	private static final long serialVersionUID = 8850413375192512657L;

	@Getter @Inclui
    private final String reg = "C114";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ecfFab;

    @Getter @Setter @Inclui
    private Integer ecfCx;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    public RegC114(String codMod, String ecfFab, Integer ecfCx, Integer numDoc, LocalDate dtDoc) {
        this.codMod = codMod;
        this.ecfFab = ecfFab;
        this.ecfCx = ecfCx;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
    }

    public RegC114(){}
}
