package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.contribuicoes.blocoM.n1.n2.n3.n4.RegM115;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RegM110 {

    @Getter @Inclui
private final String reg = "M110";

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
    private List<RegM115> regM115;

    public RegM110(String indAj, BigDecimal vlAj, String codAj, String numDoc, String descrAj, LocalDate dtRef) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
        this.dtRef = dtRef;
    }

    public RegM110(){}
}
