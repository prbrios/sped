package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


public class RegB460 {

    @Getter @Inclui
    private final String reg = "B460";

    @Getter @Setter @Inclui
    private String indDed;

    @Getter @Setter @Inclui
    private BigDecimal vlDed;

    @Getter @Setter @Inclui
    private String numProc;

    @Getter @Setter @Inclui
    private String indProc;

    @Getter @Setter @Inclui
    private String proc;

    @Getter @Setter @Inclui
    private String codInfObs;

    @Getter @Setter @Inclui
    private String indObr;

    public RegB460(String indDed, BigDecimal vlDed, String numProc, String indProc, String proc, String codInfObs, String indObr) {
        this.indDed = indDed;
        this.vlDed = vlDed;
        this.numProc = numProc;
        this.indProc = indProc;
        this.proc = proc;
        this.codInfObs = codInfObs;
        this.indObr = indObr;
    }

    public RegB460(){}
}
