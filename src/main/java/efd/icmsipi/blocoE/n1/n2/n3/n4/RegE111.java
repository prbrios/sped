package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE112;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.RegE113;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE111 {

    @Inclui
    private final String reg = "E111";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<RegE112> regE112;

    @Filho
    private List<RegE113> regE113;

}