package efd.icmsipi.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


public class Reg1360 implements Serializable {
	private static final long serialVersionUID = 3248929317773908873L;

	@Getter @Inclui
    private final String reg = "1360";

    @Getter @Setter @Inclui
    private String numLacre;

    @Getter @Setter @Inclui
    private LocalDate dtAplicacao;

    public Reg1360(String numLacre, LocalDate dtAplicacao) {
        this.numLacre = numLacre;
        this.dtAplicacao = dtAplicacao;
    }

    public Reg1360(){}
}