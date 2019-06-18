package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


public class RegE316 {

    @Getter @Inclui
    private final String reg = "E316";

    @Getter @Setter @Inclui
    private String codOr;

    @Getter @Setter @Inclui
    private BigDecimal vlOr;

    @Getter @Setter @Inclui
    private LocalDate dtVcto;

    @Getter @Setter @Inclui
    private String codRec;

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    @Getter @Setter @Inclui
    private String proc;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Inclui(formatoData = "MMyyyy")
    private LocalDate mesRef;

    public RegE316(String codOr, BigDecimal vlOr, LocalDate dtVcto, String codRec, String numProc, String indProc, String proc, String txtCompl, LocalDate mesRef) {
        this.codOr = codOr;
        this.vlOr = vlOr;
        this.dtVcto = dtVcto;
        this.codRec = codRec;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.txtCompl = txtCompl;
        this.mesRef = mesRef;
    }

    public RegE316(){}
}