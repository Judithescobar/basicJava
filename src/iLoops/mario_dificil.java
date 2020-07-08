package iLoops;
import jdk.nashorn.internal.codegen.types.Type;
import libs.Input;

public class mario_dificil {
     public static void main(String[] args) {
        String otrapiramide = "SI";
        while (otrapiramide == "SI") {
            System.out.println("¿Qué altura quieres que tenga la pirámide? ");
            int alturapiramide = Input.get_int();
            if (alturapiramide > 1) {
                String impresion = "";
                for (int i = 1; i <= alturapiramide; i++) {
                    int numespacios = alturapiramide - i;
                    for (int b = 0; b < numespacios; b++) {
                        impresion = impresion + " ";
                    }
                    int numgatitos = i;
                    for (int c = 0; c < numgatitos; c++) {
                        impresion = impresion+"#";
                    }
                    impresion=impresion+"  ";
                    numgatitos = i;
                    for (int c = 0; c < numgatitos; c++) {
                        impresion = impresion+"#";
                    }
                    System.out.println(impresion+"  ");
                    impresion = "";
                }
             } else {
                System.out.println("Inserte valor positivo mayor a 1");
            }
        }
    }

}
