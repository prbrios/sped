package efd.icmsipi.blocoH.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class BlocoH010 {

    @Inclui
    private final String reg = "H010";

    @Inclui
    private String codImtem;

    @Inclui
    private String unid;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private BigDecimal vlUnit;

    @Inclui
    private BigDecimal vlItem;

    @Inclui
    private String indProp;

    @Inclui
    private String codPart;

    @Inclui
    private String txtCompl;

    @Inclui
    private String codCta;

    @Inclui
    private BigDecimal vlItemIr;

}