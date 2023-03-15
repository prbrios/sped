package efd.icmsipi.blocoC.n1.n2;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.RegC310;
import efd.icmsipi.blocoC.n1.n2.n3.RegC320;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegC300 implements Serializable {
	private static final long serialVersionUID = -7757052990099901019L;

	@Getter @Inclui
    private final String reg = "C300";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String sub;

    @Getter @Setter @Inclui
    private Integer numDocIni;

    @Getter @Setter @Inclui
    private Integer numDocFin;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegC310> regC310;

    @Getter @Setter @Filho
    private List<RegC320> regC320;

    public RegC300(String codMod, String ser, String sub, Integer numDocIni, Integer numDocFin, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.codMod = codMod;
        this.ser = ser;
        this.sub = sub;
        this.numDocIni = numDocIni;
        this.numDocFin = numDocFin;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC300(){}
}
