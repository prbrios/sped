package efd.icmsipi.blocoG.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.BlocoG110;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoG001 {

    @Inclui
    private final String reg = "G001";

    @Inclui
    private String indMov;

    @Filho
    private List<BlocoG110> blocoG110;

}