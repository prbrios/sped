package efd.icmsipi.blocoH.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.RegH010;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegH005 {

    @Inclui
    private final String reg = "H005";

    @Inclui
    private LocalDate dtInv;

    @Inclui
    private BigDecimal vlInv;

    @Inclui
    private String motInv;

    @Filho
    private List<RegH010> regH010;

    public RegH005(LocalDate dtInv, BigDecimal vlInv, String motInv) {
        this.dtInv = dtInv;
        this.vlInv = vlInv;
        this.motInv = motInv;
    }

    public RegH005(){}
}