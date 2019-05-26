package efd.icmsipi.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.BlocoC465;
import efd.icmsipi.blocoC.n1.n2.n3.n4.n5.BlocoC470;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlocoC460 {

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
    private BlocoC465 blocoC465;

    @Filho
    private List<BlocoC470> blocoC470;

}