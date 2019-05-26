package efd.icmsipi.blocoH.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.n4.RegH020;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegH010 {

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

    @Filho
    private List<RegH020> regH020;

}