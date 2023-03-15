package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

public class Reg1010 implements Serializable {
	private static final long serialVersionUID = 2546321335763643991L;

	@Getter @Inclui
	private final String reg = "1010";

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String idSecJud;

    @Getter @Setter @Inclui
    private String idVara;

    @Getter @Setter @Inclui
    private String indNatAcao;

    @Getter @Setter @Inclui
    private String descDecJud;

    @Getter @Setter @Inclui
    private LocalDate dtSentJud;

    public Reg1010(String numProc, String idSecJud, String idVara, String indNatAcao, String descDecJud, LocalDate dtSentJud) {
        this.numProc = numProc;
        this.idSecJud = idSecJud;
        this.idVara = idVara;
        this.indNatAcao = indNatAcao;
        this.descDecJud = descDecJud;
        this.dtSentJud = dtSentJud;
    }

    public Reg1010(){ }
}
