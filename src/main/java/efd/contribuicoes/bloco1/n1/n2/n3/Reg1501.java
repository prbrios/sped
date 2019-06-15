package efd.contribuicoes.bloco1.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1501 {

    @Inclui
    private final String reg = "1501";

    @Inclui
    private String codPart;

    @Inclui
    private String codItem;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private String subSer;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtOper;

    @Inclui
    private String chvNfe;

    @Inclui
    private BigDecimal vlOper;

    @Inclui(zerosEsquerda = 4)
    private Integer cfop;

    @Inclui
    private String natBcCred;

    @Inclui
    private String indOrigCred;

    @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Inclui(casasDecimais = 3)
    private BigDecimal vlBcCofins;

    @Inclui(casasDecimais = 4)
    private BigDecimal aliqCofins;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui
    private String codCta;

    @Inclui
    private String codCcus;

    @Inclui
    private String descCompl;

    @Inclui(formatoData = "MMyyyy")
    private LocalDate perEscrit;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;
}
