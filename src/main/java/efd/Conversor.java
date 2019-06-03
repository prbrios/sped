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
import efd.icmsipi.blocoB.n1.RegB990;
import efd.icmsipi.blocoC.n1.RegC001;
import efd.icmsipi.blocoC.n1.RegC990;
import efd.icmsipi.blocoC.n1.n2.RegC100;
import efd.icmsipi.blocoD.n1.RegD990;
import efd.icmsipi.blocoE.n1.RegE990;
import efd.icmsipi.blocoG.n1.RegG990;
import efd.icmsipi.blocoH.n1.RegH990;
import efd.icmsipi.blocoK.n1.RegK990;

import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Conversor {

    private List<String> classes = new ArrayList<String>();

    public List<String> getClasses() {
        return classes;
    }

    private void trataObjeto(Object obj) {

        try {

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

        } catch (IllegalAccessException e){
            e.printStackTrace();
        }

    }

    public static String converte(Object obj, boolean calculaQuantidades){

        if(obj instanceof IcmsIpi && calculaQuantidades) {

            int qtdReg0 = 1, qtdReg1 = 1, qtdRegB = 1, qtdRegC = 1, qtdRegD = 1, qtdRegE = 1, qtdRegG = 1, qtdRegH = 1, qtdRegK = 1;

            Conversor c = new Conversor();
            c.trataObjeto(obj);

            for(String reg : c.getClasses()) {
                if (reg.startsWith("Reg0")) {
                    qtdReg0++;
                } else if(reg.startsWith("Reg1")) {
                    qtdReg1++;
                } else if(reg.startsWith("RegB")) {
                    qtdRegB++;
                } else if(reg.startsWith("RegC")) {
                    qtdRegC++;
                } else if(reg.startsWith("RegD")) {
                    qtdRegD++;
                } else if(reg.startsWith("RegE")) {
                    qtdRegE++;
                } else if(reg.startsWith("RegG")) {
                    qtdRegG++;
                } else if(reg.startsWith("RegH")) {
                    qtdRegH++;
                } else if(reg.startsWith("RegK")) {
                    qtdRegK++;
                }
            }

            Map<String, Long> resultado = c.getClasses().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            ArrayList<String> sortedKeys = new ArrayList<String>(resultado.keySet());
            Collections.sort(sortedKeys);

            //System.out.println(sortedKeys);

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

            // inicio tratamento de quatidades dos blocos
            if(((IcmsIpi) obj).getReg0000().getReg0001() != null){
                ((IcmsIpi) obj).getReg0000().setReg0990(new Reg0990(qtdReg0));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getReg1001() != null){
                ((IcmsIpi) obj).getReg0000().setReg1990(new Reg1990(qtdReg1));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegB001() != null){
                ((IcmsIpi) obj).getReg0000().setRegB990(new RegB990(qtdRegB));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegC001() != null){
                ((IcmsIpi) obj).getReg0000().setRegC990(new RegC990(qtdRegC));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegD001() != null){
                ((IcmsIpi) obj).getReg0000().setRegD990(new RegD990(qtdRegD));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegE001() != null){
                ((IcmsIpi) obj).getReg0000().setRegE990(new RegE990(qtdRegE));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegG001() != null){
                ((IcmsIpi) obj).getReg0000().setRegG990(new RegG990(qtdRegG));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegH001() != null){
                ((IcmsIpi) obj).getReg0000().setRegH990(new RegH990(qtdRegH));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            if(((IcmsIpi) obj).getReg0000().getRegK001() != null){
                ((IcmsIpi) obj).getReg0000().setRegK990(new RegK990(qtdRegK));
                reg9999.setQtdLin(reg9999.getQtdLin()+1);
            }
            // fim do tratamento de quantidades do blocos

            IcmsIpi icmsIpi = (IcmsIpi) obj;
            icmsIpi.getReg0000().setReg9001(reg9001);
            icmsIpi.getReg0000().setReg9990(reg9990);
            icmsIpi.setReg9999(reg9999);

            return Parsers.converteBlocoEmString(obj, true);

        }

        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converte(Object obj){
        return Parsers.converteBlocoEmString(obj, true);
    }

    public static String converteBloco(Object obj){
        return Parsers.converteBlocoEmString(obj, false);
    }

    /*
    public static void main(String[] args){

        List<Reg0200> r0200 = new ArrayList<>();
        r0200.add(new Reg0200());
        r0200.add(new Reg0200());
        r0200.add(new Reg0200());

        List<RegC100> rC100l = new ArrayList<RegC100>();
        rC100l.add(new RegC100());
        rC100l.add(new RegC100());
        rC100l.add(new RegC100());

        RegC001 regC001 = new RegC001("0");
        regC001.setRegC100(rC100l);

        Reg0001 r0001 = new Reg0001();
        r0001.setReg0200(r0200);

        Reg0000 r0000 = new Reg0000();
        r0000.setReg0001(r0001);
        r0000.setRegC001(regC001);

        IcmsIpi obj = new IcmsIpi();
        obj.setReg0000(r0000);

        System.out.println(Conversor.converte(obj, true));

    }
    */

}
