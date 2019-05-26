package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1110 {

    @Inclui
    private final String reg = "1110";

    @Inclui
    private String codPart;

    @Inclui
    private String codMod;

    @Inclui
    private String ser;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private String chvNfe;

    @Inclui
    private Integer nrMemo;

    @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Inclui
    private String unid;



}