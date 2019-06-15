package efd.contribuicoes.bloco1.n1.n2;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Reg1050 {

    @Inclui
    private final String reg = "1050";

    @Inclui
    private LocalDate dtRef;

    @Inclui
    private String indAjBc;

    @Inclui(zerosEsquerda = 14)
    private Long cnpj;

    @Inclui
    private BigDecimal vlAjCst01;

    @Inclui
    private BigDecimal vlAjCst02;

    @Inclui
    private BigDecimal vlAjCst03;

    @Inclui
    private BigDecimal vlAjCst04;

    @Inclui
    private BigDecimal vlAjCst05;

    @Inclui
    private BigDecimal vlAjCst06;

    @Inclui
    private BigDecimal vlAjCst07;

    @Inclui
    private BigDecimal vlAjCst08;

    @Inclui
    private BigDecimal vlAjCst09;

    @Inclui
    private BigDecimal vlAjCst49;

    @Inclui
    private BigDecimal vlAjCst99;

    @Inclui
    private String indAprop;

    @Inclui
    private String numRec;

    @Inclui
    private String infoCompl;

}
