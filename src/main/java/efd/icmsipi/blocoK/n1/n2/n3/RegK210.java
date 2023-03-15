package efd.icmsipi.blocoK.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoK.n1.n2.n3.n4.RegK215;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegK210 implements Serializable {
	private static final long serialVersionUID = 1045256751303446522L;

	@Getter @Inclui
    private final String reg = "K210";

    @Getter @Setter @Inclui
    private LocalDate dtIniOs;

    @Getter @Setter @Inclui
    private LocalDate dtFinOs;

    @Getter @Setter @Inclui
    private String codDocOs;

    @Getter @Setter @Inclui
    private String codItemOri;

    @Getter @Setter @Inclui(casasDecimais = 6)
    private BigDecimal qtdOri;

    @Getter @Setter @Filho
    private List<RegK215> regK215;

    public RegK210(LocalDate dtIniOs, LocalDate dtFinOs, String codDocOs, String codItemOri, BigDecimal qtdOri) {
        this.dtIniOs = dtIniOs;
        this.dtFinOs = dtFinOs;
        this.codDocOs = codDocOs;
        this.codItemOri = codItemOri;
        this.qtdOri = qtdOri;
    }

    public RegK210(){}
}