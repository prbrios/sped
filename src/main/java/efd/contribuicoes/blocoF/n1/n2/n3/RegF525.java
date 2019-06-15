package efd.contribuicoes.blocoF.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class RegF525 {

    @Getter @Inclui
    private final String reg = "F525";

    @Getter @Inclui
    private BigDecimal vlRec;

    @Getter @Inclui
    private String indRec;

    @Getter @Inclui
    private String cnpjCpf;

    @Getter @Inclui
    private String numDoc;

    @Getter @Inclui
    private String codItem;

    @Getter @Inclui
    private BigDecimal vlRecDet;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Inclui
    private String infoComp;

    @Getter @Inclui
    private String codCta;

    public RegF525(BigDecimal vlRec, String indRec, String cnpjCpf, String numDoc, String codItem, BigDecimal vlRecDet, Integer cstPis, Integer cstCofins, String infoComp, String codCta) {
        this.vlRec = vlRec;
        this.indRec = indRec;
        this.cnpjCpf = cnpjCpf;
        this.numDoc = numDoc;
        this.codItem = codItem;
        this.vlRecDet = vlRecDet;
        this.cstPis = cstPis;
        this.cstCofins = cstCofins;
        this.infoComp = infoComp;
        this.codCta = codCta;
    }

    public RegF525(){}
}
