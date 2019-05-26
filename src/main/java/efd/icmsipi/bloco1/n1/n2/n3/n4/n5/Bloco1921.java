package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Bloco1922;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Bloco1923;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Bloco1921 {

    @Inclui
    private final String reg = "1921";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<Bloco1922> bloco1922;

    @Filho
    private List<Bloco1923> bloco1923;

}