package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.BlocoK255;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoK250 {

    @Inclui
    private final String reg = "K250";

    @Inclui
    private LocalDate dtProd;

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtd;

    @Filho
    private List<BlocoK255> blocoK255;

}