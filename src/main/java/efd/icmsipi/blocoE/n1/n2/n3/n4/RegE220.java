package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE230;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE240;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegE220 {

    @Getter @Inclui
    private final String reg = "E220";

    @Getter @Setter @Inclui
    private String codAjApur;

    @Getter @Setter @Inclui
    private String descrComplAj;

    @Getter @Setter @Inclui
    private BigDecimal vlAjApur;

    @Getter @Setter @Filho
    private List<RegE230> regE230;

    @Getter @Setter @Filho
    private List<RegE240> regE240;

    public RegE220(String codAjApur, String descrComplAj, BigDecimal vlAjApur) {
        this.codAjApur = codAjApur;
        this.descrComplAj = descrComplAj;
        this.vlAjApur = vlAjApur;
    }

    public RegE220(){}
}