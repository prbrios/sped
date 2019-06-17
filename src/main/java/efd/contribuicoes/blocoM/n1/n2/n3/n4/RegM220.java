package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.n5.RegM225;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegM220 {

    @Getter @Inclui
    private final String reg = "M220";

    @Getter @Inclui
    private String indAj;

    @Getter @Inclui
    private BigDecimal vlAj;

    @Getter @Inclui
    private String codAj;

    @Getter @Inclui
    private String numDoc;

    @Getter @Inclui
    private String descrAj;

    @Getter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Filho
    private List<RegM225> regM225;

    public RegM220(String indAj, BigDecimal vlAj, String codAj, String numDoc, String descrAj, LocalDate dtRef) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
        this.dtRef = dtRef;
    }

    public RegM220(){}
}
