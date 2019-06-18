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


public class RegC350 {

    @Getter @Inclui
    private final String reg = "C350";

    @Getter @Setter @Inclui
    private String ser;

    @Getter @Setter @Inclui
    private String subSer;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private String cnpjCpf;

    @Getter @Setter @Inclui
    private BigDecimal vlMerc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDesc;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Filho
    private List<RegC370> regC370;

    @Getter @Setter @Filho
    private List<RegC390> regC390;

    public RegC350(String ser, String subSer, Integer numDoc, LocalDate dtDoc, String cnpjCpf, BigDecimal vlMerc, BigDecimal vlDoc, BigDecimal vlDesc, BigDecimal vlPis, BigDecimal vlCofins, String codCta) {
        this.ser = ser;
        this.subSer = subSer;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.cnpjCpf = cnpjCpf;
        this.vlMerc = vlMerc;
        this.vlDoc = vlDoc;
        this.vlDesc = vlDesc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.codCta = codCta;
    }

    public RegC350(){}
}
