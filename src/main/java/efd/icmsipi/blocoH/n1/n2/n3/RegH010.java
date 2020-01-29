package efd.icmsipi.blocoH.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoH.n1.n2.n3.n4.RegH020;
import efd.icmsipi.blocoH.n1.n2.n3.n4.RegH030;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class RegH010 {

    @Getter @Inclui
    private final String reg = "H010";

    @Getter @Setter @Inclui
    private String codImtem;

    @Getter @Setter @Inclui
    private String unid;

    @Getter @Setter @Inclui(casasDecimais = 3)
    private BigDecimal qtd;

    @Getter @Setter @Inclui
    private BigDecimal vlUnit;

    @Getter @Setter @Inclui
    private BigDecimal vlItem;

    @Getter @Setter @Inclui
    private String indProp;

    @Getter @Setter @Inclui
    private String codPart;

    @Getter @Setter @Inclui
    private String txtCompl;

    @Getter @Setter @Inclui
    private String codCta;

    @Getter @Setter @Inclui
    private BigDecimal vlItemIr;

    @Getter @Setter @Filho
    private List<RegH020> regH020;

    @Getter @Setter @Filho
    private RegH030 regH030;

    public RegH010(String codImtem, String unid, BigDecimal qtd, BigDecimal vlUnit, BigDecimal vlItem, String indProp, String codPart, String txtCompl, String codCta, BigDecimal vlItemIr) {
        this.codImtem = codImtem;
        this.unid = unid;
        this.qtd = qtd;
        this.vlUnit = vlUnit;
        this.vlItem = vlItem;
        this.indProp = indProp;
        this.codPart = codPart;
        this.txtCompl = txtCompl;
        this.codCta = codCta;
        this.vlItemIr = vlItemIr;
    }

    public RegH010(){}
}