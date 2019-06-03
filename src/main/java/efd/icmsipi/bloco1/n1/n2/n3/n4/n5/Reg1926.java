package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reg1926 {

    @Inclui
    private final String reg = "1926";

    @Inclui
    private String codOr;

    @Inclui
    private Integer vlOr;

    @Inclui
    private LocalDate dtVcto;

    @Inclui
    private String codRec;

    @Inclui
    private String nunProc;

    @Inclui
    private String indProc;

    @Inclui
    private String proc;

    @Inclui
    private String txtCompl;

    @Inclui(formatoData = "MMyyyy")
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