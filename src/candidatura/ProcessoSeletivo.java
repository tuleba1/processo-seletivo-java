package candidatura;

import java.util.Locale;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String[] candidatos = {"Pedro", "Caio", "Luiza", "Túlio"};
        double[] salariosDesejados = {3000.0, 2000.0, 1800.0, 1900.0};

        for(int i = 0; i < candidatos.length; i++){
            String candidato = candidatos[i];
            double salarioDesejado = salariosDesejados[i];

            if(salarioDesejado < 2000.0){
                System.out.println("Ligar para candidato(a) " + candidato + " para análise.");
            }
            else if(salarioDesejado == 2000.0){
                System.out.println("Ligar para candidato(a) " + candidato + "com salário equivalente a R$" + salarioDesejado + " para nova proposta.");
            }
            else {
                System.out.println("Candidatura negada devido ao salário muito alto.");
            }
        }
    }
}