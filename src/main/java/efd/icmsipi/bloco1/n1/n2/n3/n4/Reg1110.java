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

    public Reg1110(String codPart, String codMod, String ser, Integer numDoc, LocalDate dtDoc, String chvNfe, Integer nrMemo, BigDecimal qtd, String unid) {
        this.codPart = codPart;
        this.codMod = codMod;
        this.ser = ser;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.chvNfe = chvNfe;
        this.nrMemo = nrMemo;
        this.qtd = qtd;
        this.unid = unid;
    }

    public Reg1110(){}
}