package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


public class Reg1926 implements Serializable {
	private static final long serialVersionUID = -3288312024347411712L;

	@Getter @Inclui
    private final String reg = "1926";

    @Getter @Setter @Inclui
    private String codOr;

    @Getter @Setter @Inclui
    private Integer vlOr;

    @Getter @Setter @Inclui
    private LocalDate dtVcto;

    @Getter @Setter @Inclui
    private String codRec;

    @Getter @Setter @Inclui
    private String nunProc;

    @Getter @Setter @Inclui
    private String indProc;

    @Getter @Setter @Inclui
    private String proc;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRef;

    public Reg1926(String codOr, Integer vlOr, LocalDate dtVcto, String codRec, String nunProc, String indProc, String proc, String txtCompl, LocalDate mesRef) {
        this.codOr = codOr;
        this.vlOr = vlOr;
        this.dtVcto = dtVcto;
        this.codRec = codRec;
        this.nunProc = nunProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
        this.mesRef = mesRef;
    }

    public Reg1926(){}
}