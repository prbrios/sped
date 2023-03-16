package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


public class Reg1110 implements Serializable {
	private static final long serialVersionUID = 4153514942598913588L;

	@Getter @Inclui
    private final String reg = "1110";

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private Long numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String chvNfe;

    @Getter @Setter @Inclui
    private Integer nrMemo;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private String unid;

    public Reg1110(String codPart, String codMod, String ser, Long numDoc, LocalDate dtDoc, String chvNfe, Integer nrMemo, BigDecimal qtd, String unid) {
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