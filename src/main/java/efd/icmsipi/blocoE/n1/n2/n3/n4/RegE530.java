package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE531;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE530 {

    @Inclui
    private final String reg = "E330";

    @Inclui
    private String indAj;

    @Inclui
    private BigDecimal vlAj;

    @Inclui
    private String codAj;

    @Inclui
    private String indDoc;

    @Inclui
    private String numDoc;

    @Inclui
    private String descrAj;

    @Filho
    private List<RegE531> regE531;

    public RegE530(String indAj, BigDecimal vlAj, String codAj, String indDoc, String numDoc, String descrAj) {
        this.indAj = indAj;
        this.vlAj = vlAj;
        this.codAj = codAj;
        this.indDoc = indDoc;
        this.numDoc = numDoc;
        this.descrAj = descrAj;
    }

    public RegE530(){}
}