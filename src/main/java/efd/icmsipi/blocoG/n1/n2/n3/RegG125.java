package efd.icmsipi.blocoG.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG126;
import efd.icmsipi.blocoG.n1.n2.n3.n4.RegG130;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegG125 implements Serializable {
	private static final long serialVersionUID = 3336817459219171142L;

	@Getter @Inclui
    private final String reg = "G125";

    @Getter @Setter @Inclui
    private String codIndBem;

    @Getter @Setter @Inclui
    private LocalDate dtMov;

    @Getter @Setter @Inclui
    private String tipoMov;

    @Getter @Setter @Inclui
    private BigDecimal vlImobIcmsOp;

    @Getter @Setter @Inclui
    private BigDecimal vlImobicmsSt;

    @Getter @Setter @Inclui
    private BigDecimal vlImobIcmsFrt;

    @Getter @Setter @Inclui
    private BigDecimal vlImobIcmsDif;

    @Getter @Setter @Inclui
    private Integer numParc;

    @Getter @Setter @Inclui
    private  BigDecimal vlParcPass;

    @Getter @Setter @Filho
    private List<RegG126> regG126;

    @Getter @Setter @Filho
    private List<RegG130> regG130;

    public RegG125(String codIndBem, LocalDate dtMov, String tipoMov, BigDecimal vlImobIcmsOp, BigDecimal vlImobicmsSt, BigDecimal vlImobIcmsFrt, BigDecimal vlImobIcmsDif, Integer numParc, BigDecimal vlParcPass) {
        this.codIndBem = codIndBem;
        this.dtMov = dtMov;
        this.tipoMov = tipoMov;
        this.vlImobIcmsOp = vlImobIcmsOp;
        this.vlImobicmsSt = vlImobicmsSt;
        this.vlImobIcmsFrt = vlImobIcmsFrt;
        this.vlImobIcmsDif = vlImobIcmsDif;
        this.numParc = numParc;
        this.vlParcPass = vlParcPass;
    }

    public RegG125(){}
}