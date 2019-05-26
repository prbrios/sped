package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.BlocoE312;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.BlocoE313;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoE311 {

    @Inclui
    private final String reg = "E311";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<BlocoE312> blocoE312;

    @Filho
    private List<BlocoE313> blocoE313;

}