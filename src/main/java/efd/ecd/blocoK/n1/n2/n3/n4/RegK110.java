package efd.ecd.blocoK.n1.n2.n3.n4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.ecd.blocoK.n1.n2.n3.n4.n5.RegK115;
import lombok.Getter;
import lombok.Setter;

public class RegK110 implements Serializable {
	private static final long serialVersionUID = -561536673634244134L;

	@Getter @Inclui
    private final String reg = "K110";

    @Getter @Setter @Inclui
    private Integer evento;

    @Getter @Setter @Inclui
    private LocalDate dtEvento;

    @Getter @Setter @Filho
    private List<RegK115> regK115;

    public RegK110() {}

    public RegK110(Integer evento, LocalDate dtEvento) {
        this.evento = evento;
        this.dtEvento = dtEvento;
    }

}
