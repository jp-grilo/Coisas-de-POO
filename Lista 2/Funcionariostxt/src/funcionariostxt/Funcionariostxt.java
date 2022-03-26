package funcionariostxt;

import java.io.*;
import java.text.DecimalFormat;

public class Funcionariostxt {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00");

        try{
            BufferedReader br = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Funcionariostxt\\src\\funcionariostxt\\funcionarios.txt")));
            
            BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(
                    new FileOutputStream("C:\\Users\\joaop\\OneDrive\\Documentos\\NetBeansProjects\\Funcionariostxt\\src\\funcionariostxt\\saida")));

            int cout=0;
            String s;
            String [] array;
            double salario;
            
            while((s = br.readLine()) != null){
                array = s.split(";");
                //nome idade endereço salario;
                for(String current : array){
                    //System.out.println(current);
                    if (cout == 0 /*nome*/){
                        bw.write("Nome do funcionario:" + current + ", ");
                        cout=1;
                    }
                    else if (cout == 1 /*idade*/){
                        //bw.write("cout==1, ");
                        cout=2;
                    }
                    else if (cout == 2 /*endereço*/){
                        //bw.write("cout==2, ");

                        cout=3;
                    }
                    else if (cout == 3 /*salario printar aliquota e imposto*/){
                        
                        salario = Double.parseDouble(current);
                        if (salario>4664.68){
                            bw.write("aliquota aplicada de 27,5%, imposto deduzido: " + df.format(salario/0.725) + "\n");
                        }
                        else if(salario>3754.05){
                            bw.write("aliquota aplicada de 22,5%, imposto deduzido: " + df.format(salario/0.775) + "\n");
                        }
                        else if(salario>2826.65){
                            bw.write("aliquota aplicada de 15%, imposto deduzido: " + df.format(salario/0.85) + "\n");
                        }
                        else if(salario>1903.98){
                            bw.write("aliquota aplicada de 7,5, imposto deduzido: " + df.format(salario/0.925) + "\n");
                        }
                        else{
                            bw.write("aliquota aplicada de 0%, imposto deduzido: 0.00" + "\n");
                        }
                        //bw.write("cout==3\n");
                        cout=0;
                    }
                    

                    
                }
            }
            
            br.close();
            bw.close();
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
