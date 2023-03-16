package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.Reg1110;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


public class Reg1105 implements Serializable {
	private static final long serialVersionUID = 2674062267724261764L;

	@Getter @Inclui
    private final String reg = "1105";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String serie;

    @Getter @Setter @Inclui
    private Long numDoc;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Filho
    private List<Reg1110> reg1110;

    public Reg1105(String codMod, String serie, Long numDoc, String chvNfe, LocalDate dtDoc, String codItem) {
        this.codMod = codMod;
        this.serie = serie;
        this.numDoc = numDoc;
        this.chvNfe = chvNfe;
        this.dtDoc = dtDoc;
        this.codItem = codItem;
    }

    public Reg1105(){}
}