package efd.icmsipi.blocoD.n1;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoD.n1.n2.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RegD001 {

    @Inclui
    private final String reg = "D001";

    @Inclui
    private String indMov;

    @Filho
    private List<RegD100> regD100;

    @Filho
    private List<RegD300> regD300;

    @Filho
    private List<RegD350> regD350;

    @Filho
    private List<RegD400> regD400;

    @Filho
    private List<RegD500> regD500;

    @Filho
    private List<RegD600> regD600;

    @Filho
    private List<RegD695> regD695;

}