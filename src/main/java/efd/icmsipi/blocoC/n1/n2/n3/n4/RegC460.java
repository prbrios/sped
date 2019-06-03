package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC465;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.RegC470;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class RegC460 {

    @Inclui
    private final String reg = "C460";

    @Inclui
    private String codMod;

    @Inclui(zerosEsquerda = 2)
    private Integer codSit;

    @Inclui
    private Integer numDoc;

    @Inclui
    private LocalDate dtDoc;

    @Inclui
    private BigDecimal vlDoc;

    @Inclui
    private BigDecimal vlPis;

    @Inclui
    private BigDecimal vlCofins;

    @Inclui(zerosEsquerda = 14)
    private Long cpfCnpj;

    @Inclui
    private String nomAdq;

    @Filho
    private RegC465 regC465;

    @Filho
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