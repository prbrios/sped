package efd.icmsipi.blocoE.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.BlocoE230;
import efd.icmsipi.blocoE.n1.n2.n3.n4.n5.BlocoE240;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoE220 {

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
    private List<BlocoE230> blocoE230;

    @Filho
    private List<BlocoE240> blocoE240;

}