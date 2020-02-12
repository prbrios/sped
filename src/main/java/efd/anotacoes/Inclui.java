package efd.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inclui {

    String formatoData() default "ddMMyyyy";
    String formatoHora() default "hhmmss";
    int casasDecimais() default 2;
    int zerosEsquerda() default 0;
    Class classe() default String.class;

}
