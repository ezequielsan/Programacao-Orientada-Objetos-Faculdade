package enumeracoes;

/**
 * Declara??o de um tipo enumerado
 */
enum DiaDaSemana { DOMINGO, SEGUNDA, TER?A, QUARTA, QUINTA, SEXTA, S?BADO };

/**
 * Classe de aplica??o
 */
public class ExemploTeste {
    public static void main(String[] args) {
    	
        // obt?m um array de objetos a partir do m?todo values()
        var arrayEnums = DiaDaSemana.values(); // uso recurso de infer?ncia de tipos para vari?veis locais

        // Imprimir conte?do do array
        System.out.print("Conte?do do arrayEnums: ");
        for(int i = 0; i < arrayEnums.length; i++) {
            System.out.print(arrayEnums[i] + " ");
        }
        System.out.println();

        for(DiaDaSemana d : arrayEnums) {
            System.out.print(d.ordinal() + ": "); // a ordem do objeto na enumera??o
            System.out.println(d); // invoca toString() implicitamente
        }

        DiaDaSemana d1 = DiaDaSemana.DOMINGO;
        DiaDaSemana d2 = DiaDaSemana.valueOf("DOMINGO");

        // Compara??o com o m?todo equals
        if(d1.equals(d2)) {
            System.out.println("d1 e d2 possuem o mesmo valor");
        }
        else {
            System.out.println("d1 e d2 s?o diferentes");
        }

        // Usando o operador de igualdade pra checar refer?ncias
        if(d1 == d2) {
            System.out.println("d1 e d2 referenciam o mesmo objeto");
        }
        else {
            System.out.println("d1 e d2 referenciam objetos distintos");
        }

        // Testando o m?todo compareTo
        if(d1.compareTo(DiaDaSemana.TER?A) < 0) {
            System.out.println(d1 + " vem antes de " + DiaDaSemana.TER?A);
        }
        else{
            System.out.println(d1 + " vem depois de " + DiaDaSemana.TER?A);
        }
    }
}
