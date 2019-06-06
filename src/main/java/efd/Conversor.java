package efd;

import efd.icmsipi.bloco0.Reg0000;
import efd.icmsipi.bloco0.n1.Reg0001;
import efd.icmsipi.bloco0.n1.Reg0990;
import efd.icmsipi.bloco0.n1.n2.Reg0200;
import efd.icmsipi.bloco1.n1.Reg1990;
import efd.icmsipi.bloco9.Reg9999;
import efd.icmsipi.bloco9.n1.Reg9001;
import efd.icmsipi.bloco9.n1.Reg9990;
import efd.icmsipi.bloco9.n1.n2.Reg9900;
import efd.icmsipi.blocoB.n1.RegB001;
import efd.icmsipi.blocoB.n1.RegB990;
import efd.icmsipi.blocoC.n1.RegC001;
import efd.icmsipi.blocoC.n1.RegC990;
import efd.icmsipi.blocoC.n1.n2.RegC100;
import efd.icmsipi.blocoC.n1.n2.n3.RegC101;
import efd.icmsipi.blocoC.n1.n2.n3.RegC170;
import efd.icmsipi.blocoD.n1.RegD001;
import efd.icmsipi.blocoD.n1.RegD990;
import efd.icmsipi.blocoE.n1.RegE001;
import efd.icmsipi.blocoE.n1.RegE990;
import efd.icmsipi.blocoG.n1.RegG001;
import efd.icmsipi.blocoG.n1.RegG990;
import efd.icmsipi.blocoH.n1.RegH001;
import efd.icmsipi.blocoH.n1.RegH990;
import efd.icmsipi.blocoK.n1.RegK001;
import efd.icmsipi.blocoK.n1.RegK990;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Conversor {

    static Logger logger = Logger.getLogger(Conversor.class);

    private List<String> classes = new ArrayList<String>();

    public List<String> getClasses() {
        return classes;
    }

    private void trataObjeto(Object obj) {

        try {
            if(obj != null) {
                for (Field field : obj.getClass().getDeclaredFields()) {

                    field.setAccessible(true);

                    if (field.get(obj) != null) {

                        if (field.get(obj) instanceof ArrayList) {

                            for (Object o : (ArrayList) field.get(obj)) {
                                if (o.getClass().getPackage().getName().startsWith("efd")) {
                                    this.classes.add(o.getClass().getName().substring(o.getClass().getName().indexOf("Reg")));
                                    this.trataObjeto(o);
                                }
                            }

                        } else if (field.get(obj).getClass().getPackage().getName().startsWith("efd")) {

                            this.classes.add(field.get(obj).getClass().getName().substring(field.get(obj).getClass().getName().indexOf("Reg")));
                            this.trataObjeto(field.get(obj));

                        }
                    }

                }
            }

        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

    }

    private static int getQuantidadeRegistrosDoBloco(Object obj){

        Conversor c = new Conversor();
        c.trataObjeto(obj);
        return obj != null ? c.getClasses().size() + 1 : 0;
    }

    public static String converte(Object obj, boolean calculaQuantidades){


        if(obj instanceof IcmsIpi && calculaQuantidades) {

            logger.info("Converter objeto em String com a opção de contagem automatica dos totalizadores dos blocos");
            logger.info("Inicio de conversao da classe IcmsIpi");

            int qtdReg0 = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getReg0001());
            int qtdReg1 = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getReg1001());
            int qtdRegB = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegB001());
            int qtdRegC = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegC001());
            int qtdRegD = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegD001());
            int qtdRegE = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegE001());
            int qtdRegG = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegG001());
            int qtdRegH = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegH001());
            int qtdRegK = getQuantidadeRegistrosDoBloco(((IcmsIpi) obj).getReg0000().getRegK001());

            logger.info("Calculado a quantidade de registro de cada bloco");

            if(qtdReg0 > 0){
                ((IcmsIpi) obj).getReg0000().setReg0990(new Reg0990(qtdReg0 + 2));
            }
            if(qtdReg1 > 0){
                ((IcmsIpi) obj).getReg0000().setReg1990(new Reg1990(qtdReg1 + 1));
            }
            if(qtdRegB > 0){
                ((IcmsIpi) obj).getReg0000().setRegB990(new RegB990(qtdRegB + 1));
            }
            if(qtdRegC > 0){
                ((IcmsIpi) obj).getReg0000().setRegC990(new RegC990(qtdRegC + 1));
            }
            if(qtdRegD > 0){
                ((IcmsIpi) obj).getReg0000().setRegD990(new RegD990(qtdRegD + 1));
            }
            if(qtdRegE > 0){
                ((IcmsIpi) obj).getReg0000().setRegE990(new RegE990(qtdRegE + 1));
            }
            if(qtdRegG > 0){
                ((IcmsIpi) obj).getReg0000().setRegG990(new RegG990(qtdRegG + 1));
            }
            if(qtdRegH > 0){
                ((IcmsIpi) obj).getReg0000().setRegH990(new RegH990(qtdRegH + 1));
            }
            if(qtdRegK > 0){
                ((IcmsIpi) obj).getReg0000().setRegK990(new RegK990(qtdRegK + 1));
            }

            Conversor c = new Conversor();
            c.trataObjeto(obj);

            Map<String, Long> resultado = c.getClasses().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            ArrayList<String> sortedKeys = new ArrayList<String>(resultado.keySet());
            Collections.sort(sortedKeys);

            Integer quantidadeTotalLinhas = 3;

            List<Reg9900> reg9900 = new ArrayList<Reg9900>();
            for (String key : sortedKeys) {

                Integer quantidade = Integer.parseInt(resultado.get(key).toString());
                quantidadeTotalLinhas += quantidade;

                Reg9900 reg9900l = new Reg9900();
                reg9900l.setRegBlc(key.substring(3));
                reg9900l.setQtdRegBlc(quantidade);
                reg9900.add(reg9900l);

            }

            reg9900.add(new Reg9900("9001", 1));
            reg9900.add(new Reg9900("9900", reg9900.size() + 3));
            reg9900.add(new Reg9900("9990", 1));
            reg9900.add(new Reg9900("9999", 1));

            Reg9001 reg9001 = new Reg9001();
            reg9001.setIndMov(0);
            reg9001.setReg9900(reg9900);

            Reg9990 reg9990 = new Reg9990();
            reg9990.setQtdLin9(reg9900.size() + 3);

            Reg9999 reg9999 = new Reg9999();
            reg9999.setQtdLin(quantidadeTotalLinhas + reg9900.size());

            IcmsIpi icmsIpi = (IcmsIpi) obj;
            icmsIpi.getReg0000().setReg9001(reg9001);
            icmsIpi.getReg0000().setReg9990(reg9990);
            icmsIpi.setReg9999(reg9999);

            return Parsers.converteBlocoEmString(icmsIpi, true);

        }

        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converte(Object obj){
        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converteBloco(Object obj){
        return Parsers.converteBlocoEmString(obj, false);
    }


    public static void main(String[] args){

        List<Reg0200> r0200 = new ArrayList<>();
        r0200.add(new Reg0200());
        r0200.add(new Reg0200());
        r0200.add(new Reg0200());

        RegB001 rB001 = new RegB001();
        RegD001 rD001 = new RegD001();
        RegE001 rE001 = new RegE001();
        RegG001 rG001 = new RegG001();
        RegH001 rH001 = new RegH001();
        RegK001 rK001 = new RegK001();

        RegC101 rC101 = new RegC101();
        List<RegC170> rC170l = new ArrayList<>();
        rC170l.add(new RegC170());

        RegC100 rC100 = new RegC100();
        rC100.setRegC101(rC101);
        rC100.setRegC170(rC170l);

        List<RegC100> rC100l = new ArrayList<RegC100>();
        rC100l.add(new RegC100());
        rC100l.add(new RegC100());
        rC100l.add(new RegC100());
        rC100l.add(rC100);

        RegC001 regC001 = new RegC001("0");
        regC001.setRegC100(rC100l);

        Reg0001 r0001 = new Reg0001();
        r0001.setReg0200(r0200);

        Reg0000 r0000 = new Reg0000();
        r0000.setReg0001(r0001);
        r0000.setRegB001(rB001);
        r0000.setRegD001(rD001);
        r0000.setRegE001(rE001);
        r0000.setRegG001(rG001);
        r0000.setRegH001(rH001);
        r0000.setRegK001(rK001);
        r0000.setRegC001(regC001);

        IcmsIpi obj = new IcmsIpi();
        obj.setReg0000(r0000);

        System.out.println(Conversor.converte(obj, true));

    }


}
