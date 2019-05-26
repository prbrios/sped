package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC310;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC370;
import efd.icmsipi.blocoC.n1.n2.n3.BlocoC390;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC350 {

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
    private List<BlocoC370> blocoC370;

    @Filho
    private List<BlocoC390> blocoC390;
}
