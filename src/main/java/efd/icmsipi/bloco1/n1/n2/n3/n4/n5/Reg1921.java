package efd.icmsipi.bloco1.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1922;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.n6.Reg1923;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Reg1921 {

    @Inclui
    private final String reg = "1921";

    @Inclui
    private String codAjApur;

    @Inclui
    private String descrComplAj;

    @Inclui
    private BigDecimal vlAjApur;

    @Filho
    private List<Reg1922> reg1922;

    @Filho
    private List<Reg1923> reg1923;

}