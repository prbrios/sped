package efd.icmsipi.blocoE.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE112;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE113;
import lombok.Getter;
import lombok.Setter;


public class RegE111 {

    @Getter @Inclui
    private final String reg = "E111";

    @Getter @Setter @Inclui
    private String codAjApur;

    @Getter @Setter @Inclui
    private String descrComplAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAjApur;

    @Getter @Setter @Filho
    private List<RegE112> regE112;

    @Getter @Setter @Filho
    private List<RegE113> regE113;

    public RegE111(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE111(){}
}