package efd.icmsipi.blocoH.n1.n2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.RegH010;
import lombok.Getter;
import lombok.Setter;


public class RegH005 {

    @Getter @Inclui
    private final String reg = "H005";

    @Getter @Setter @Inclui
    private LocalDate dtInv;

    @Getter @Setter @Inclui
    private BigDecimal vlInv;

    @Getter @Setter @Inclui
    private String motInv;

    @Getter @Setter @Filho
    private List<RegH010> regH010;

    public RegH005(LocalDate dtInv, BigDecimal vlInv, String motInv) {
        this.dtInv = dtInv;
        this.vlInv = vlInv;
        this.motInv = motInv;
    }

    public RegH005(){}
}