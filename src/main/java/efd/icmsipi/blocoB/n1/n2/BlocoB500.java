package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoB.n1.n2.n3.BlocoB510;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlocoB500 {

    @Inclui
    private final String reg = "B500";

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private Integer qtdProf;

    @Inclui
    private BigDecimal vlOr;

    @Filho
    private List<BlocoB510> blocoB510;

}
