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

@Getter
@Setter
public class RegE220 {

    @Inclui
    private final String reg = "E220";

    @Inclui
    private String uf;

    @Inclui
    private LocalDate dtIni;

    @Inclui
    private LocalDate dtFin;

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<RegE230> regE230;

    @Filho
    private List<RegE240> regE240;

}