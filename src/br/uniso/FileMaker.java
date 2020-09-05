package br.uniso;

import java.io.*;

public class FileMaker {
    // Nesse programa
    // nos vamos criar o arquivo ao invês de lê-lo
    // e vamos populá-lo wooooooow
    public static void main(String args[]){


        String s = "Stringuinha de Jesus!!";
        String s2 = "Minitti é um merda!!";
        String s3 = "Realmente ele é mesmo!!";
        String s4 = "Concordo!!";
        String s5 = "O JOGO!!";


        String[] vetor = new String[5];

        vetor[0]= s;
        vetor[1]= s2;
        vetor[2]= s3;
        vetor[3]= s4;
        vetor[4]= s5;
        // arquivo não existe , então temos que criar
        File f = new File("arquivoTeste.txt");
        try {
            f.createNewFile();

            OutputStream is = new FileOutputStream(f);
            OutputStreamWriter isr = new OutputStreamWriter(is);
            BufferedWriter br = new BufferedWriter(isr);

            for (String cada: vetor){
                br.write(cada + "\n");
            }



/*

            br.write(s);
            br.write(s2);
            br.write(s3);
            br.write(s4); */
            //zera o buffer
            // tem que enfia o flush , senao nao da certo
            // o flush é especifico para serialização
            br.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }







}
