package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK215;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegK210 {

    @Inclui
    private final String reg = "K210";

    @Inclui
    private LocalDate dtIniOs;

    @Inclui
    private LocalDate dtFinOs;

    @Inclui
    private String codDocOs;

    @Inclui
    private String codItemOri;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Filho
    private List<RegK215> regK215;

}