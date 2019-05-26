package efd.icmsipi.blocoD.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.n3.n4.n5.RegD370;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegD365 {

    @Inclui
    private final String reg = "D365";

    @Inclui
    private String codTotPar;

    @Inclui
    private BigDecimal vlrAcumTot;

    @Inclui
    private Integer nrTot;

    @Inclui
    private String descrNrTot;

    @Filho
    private List<RegD370> regD370;

}