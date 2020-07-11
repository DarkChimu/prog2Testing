package arrayDokuTesting;

import java.io.*;

public class Record {
    
    File f;
    BufferedReader br;
    FileReader fr;
    
    public Record(){
        File dir = new File(System.getenv("APPDATA")+"/.sudoku/saves");
        dir.mkdirs();
        this.f = new File (System.getenv("APPDATA")+"/.sudoku/saves/record");
        try{
            this.fr = new FileReader(f);
            this.br = new BufferedReader(fr);
        }catch(Exception e){}
    }
    
    public void escribir(String texto){
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter pr = new PrintWriter(bw);
            pr.write(texto);
            pr.close();
            bw.close();
        }catch (Exception e){}
    }
    
    public String leer(){
        String linea="";
        try{
            linea = br.readLine();
        }catch (Exception e){}
        return linea;
    }
}