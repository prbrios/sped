package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC465;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC470;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


public class RegC460 implements Serializable {
	private static final long serialVersionUID = -5295308192945046479L;

	@Getter @Inclui
    private final String reg = "C460";

    @Getter @Setter @Inclui
    private String codMod;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Getter @Setter @Inclui
    private Integer numDoc;

    @Getter @Setter @Inclui
    private LocalDate dtDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlDoc;

    @Getter @Setter @Inclui
    private BigDecimal vlPis;

    @Getter @Setter @Inclui
    private BigDecimal vlCofins;

    @Getter @Setter @Inclui(zerosEsquerda = 14)
    private Long cpfCnpj;

    @Getter @Setter @Inclui
    private String nomAdq;

    @Getter @Setter @Filho
    private RegC465 regC465;

    @Getter @Setter @Filho
    private List<RegC470> regC470;

    public RegC460(String codMod, Integer codSit, Integer numDoc, LocalDate dtDoc, BigDecimal vlDoc, BigDecimal vlPis, BigDecimal vlCofins, Long cpfCnpj, String nomAdq) {
        this.codMod = codMod;
        this.codSit = codSit;
        this.numDoc = numDoc;
        this.dtDoc = dtDoc;
        this.vlDoc = vlDoc;
        this.vlPis = vlPis;
        this.vlCofins = vlCofins;
        this.cpfCnpj = cpfCnpj;
        this.nomAdq = nomAdq;
    }

    public RegC460(){}
}