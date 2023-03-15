package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;


public class RegC179 implements Serializable {
	private static final long serialVersionUID = -9070511244860847710L;

	@Getter @Inclui
    private final String reg = "C179";

    @Getter @Setter @Inclui
    private BigDecimal bcStOrigDest;

    @Getter @Setter @Inclui
    private BigDecimal icmsStRep;

    @Getter @Setter @Inclui
    private BigDecimal icmsStCompl;

    @Getter @Setter @Inclui
    private BigDecimal bcRet;

    @Getter @Setter @Inclui
    private BigDecimal icmsRet;

    public RegC179(BigDecimal bcStOrigDest, BigDecimal icmsStRep, BigDecimal icmsStCompl, BigDecimal bcRet, BigDecimal icmsRet) {
        this.bcStOrigDest = bcStOrigDest;
        this.icmsStRep = icmsStRep;
        this.icmsStCompl = icmsStCompl;
        this.bcRet = bcRet;
        this.icmsRet = icmsRet;
    }

    public RegC179(){}
}
