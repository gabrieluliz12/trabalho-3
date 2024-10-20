public class Main {
    public static void main(String[] args) {
               String[] nomes = {"Fernando", "José", "Maria", "Pedro", "Gustavo"};
              String[] ras = {"60001928", "600001929", "60001930", "60001931", "60001932"};
               double[] notas = {10.0, 8.0, 6.5, 3.0, 5.9};
              String[] resultados = new String[notas.length];


        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.0) {
                resultados[i] = "Aprovado"; // Se a nota for 6 ou mais
            } else {
                resultados[i] = "Reprovado"; // Se a nota for menor que 6
            }
        }

        
        System.out.println("Dados informados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + "-" + nomes[i] + " - RA: " + ras[i] + " - Nota: " + notas[i] + " - " + resultados[i]);
        }

      
        System.out.println("\nAprovados:");
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i].equals("Aprovado")) {
                System.out.println(nomes[i]);
            }
        }


        System.out.println("\nReprovados:");
        for (int i = 0; i < resultados.length; i++) {
            if (resultados[i].equals("Reprovado")) {
                System.out.println(nomes[i]);
            }
        }
    }
}
