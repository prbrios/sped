package efd.contribuicoes.blocoF.n1.n2.n3;

import java.math.BigDecimal;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

public class RegF525 {

    @Getter @Inclui
private final String reg = "F525";

    @Getter @Setter @Inclui
    private BigDecimal vlRec;

    @Getter @Setter @Inclui
    private String indRec;

    @Getter @Setter @Inclui
    private String cnpjCpf;

    @Getter @Setter @Inclui
    private String numDoc;

    @Getter @Setter @Inclui
    private String codItem;

    @Getter @Setter @Inclui
    private BigDecimal vlRecDet;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstPis;

    @Getter @Setter @Inclui(zerosEsquerda = 2)
    private Integer cstCofins;

    @Getter @Setter @Inclui
    private String infoComp;

    @Getter @Setter @Inclui
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
