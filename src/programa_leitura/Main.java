package programa_leitura;

import java.util.Scanner;

    public class Main {

        public static void main (String[] args) {
            Scanner in  = new Scanner(System.in);
            String nome,sobrenome,idade,sexo,data_de_nascimento,cidade,estado,trabalho,interesse;
            System.out.println("Por favor digite o seu nome:");
            nome = in.nextLine();
            System.out.println("Agora digite seu sobrenome:");
            sobrenome = in.nextLine();
            System.out.println("Perfeito, agora nos diga sua idade:");
            idade = in.nextLine();
            System.out.println("Seu sexo:");
            sexo = in.nextLine();
            System.out.println("Sua data de nascimento:");
            data_de_nascimento = in.nextLine();
            System.out.println("Em que cidade você mora atualmente:");
            cidade = in.nextLine();
            System.out.println("O estado em que você vive:");
            estado = in.nextLine();
            System.out.println("E agora nos diga no que você trabalha, ou está desempregado:");
            trabalho = in.nextLine();
            System.out.println("Em que área gostaria de trabalhar? e Quais seus interesses nela?");
            interesse = in.nextLine();
            System.out.println("Certinho, seu formulário foi preenchido, agora só aguardar a volta do nosso contato! ^-^");
            System.out.println("------------------");
            System.out.println("Você gostaria de visualizar seu formulário para análise? (Sim/Não)");
            String comando = in.nextLine();
            if(comando.equals("Sim")) {
                System.out.println("------------------");
                System.out.println("Aqui está seu formulário:");
                System.out.println("Nome: "+nome+" ;");
                System.out.println("Sobrenome: "+sobrenome+" ;");
                System.out.println("Idade: "+idade+" ;");
                System.out.println("Sexo: "+sexo+" ;");
                System.out.println("Data de Nascimento: "+data_de_nascimento+" ;");
                System.out.println("Localização: "+cidade+", "+estado+", Brasil ;");
                System.out.println("Status atual: "+trabalho+" ;");
                System.out.println("Interesse: "+interesse+" .");
                System.out.println("------------------");
            } else {
                System.out.println("Entendido, finalizaremos por aqui então.");
            } if(comando.equals("sim")) {
                System.out.println("------------------");
                System.out.println("Aqui está seu formulário:");
                System.out.println("Nome: "+nome+" ;");
                System.out.println("Sobrenome: "+sobrenome+" ;");
                System.out.println("Idade: "+idade+" ;");
                System.out.println("Sexo: "+sexo+" ;");
                System.out.println("Data de Nascimento: "+data_de_nascimento+" ;");
                System.out.println("Localização: "+cidade+", "+estado+", Brasil ;");
                System.out.println("Status atual: "+trabalho+" ;");
                System.out.println("Interesse: "+interesse+" .");
                System.out.println("------------------");
            }




        }





    }

