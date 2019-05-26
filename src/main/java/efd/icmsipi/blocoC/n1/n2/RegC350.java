package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC370;
import efd.icmsipi.blocoC.n1.n2.n3.RegC390;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegC350 {

    @Inclui
    private final String reg = "C350";

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private Long cnpjCpf;

    @Inclui
    private BigDecimal vlMerc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlDesc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Filho
    private List<RegC370> regC370;

    @Filho
    private List<RegC390> regC390;
}
