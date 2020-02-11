package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.n5.RegM625;
import lombok.Getter;
import lombok.Setter;

public class RegM620 {

    @Getter @Inclui
private final String reg = "M620";

    @Getter @Setter @Inclui
    private String indAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAj;

    @Getter @Setter @Inclui
    private String codAj;

    @Getter @Setter @Inclui
    private String numDoc;

    @Getter @Setter @Inclui
    private String descrAj;

    @Getter @Setter @Inclui
    private LocalDate dtRef;

    @Getter @Setter @Filho
    private List<RegM625> regM625;

    public RegM620(String indAj, BigDecimal vlAj, String codAj, String numDoc, String descrAj, LocalDate dtRef) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
        this.dtRef = dtRef;
    }

    public RegM620(){}
}
