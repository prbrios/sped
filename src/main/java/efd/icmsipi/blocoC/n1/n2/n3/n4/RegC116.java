package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Setter
@Getter
public class RegC116 implements Serializable {
	private static final long serialVersionUID = -5350329206951233157L;

	@Getter @Inclui
    private final String reg = "C116";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private Long nrSat;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private Integer numCfe;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    public RegC116(String codMod, Long nrSat, String chvNfe, Integer numCfe, LocalDate dtDoc) {
        this.codMod = codMod;
        this.nrSat = nrSat;
        this.chvNfe = chvNfe;
        this.numCfe = numCfe;
        this.dtDoc = dtDoc;
    }

    public RegC116(){}
}
