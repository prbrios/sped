package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1020 implements Serializable {
	private static final long serialVersionUID = -7293218511127045636L;

	@Getter @Inclui
	private final String reg = "1020";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indNatAcao;

    @Getter @Setter @Inclui
    private LocalDate dtDecAdm;

    public Reg1020(String numProc, String indNatAcao, LocalDate dtDecAdm) {
        this.numProc = numProc;
        this.indNatAcao = indNatAcao;
        this.dtDecAdm = dtDecAdm;
    }

    public Reg1020(){ }
}
