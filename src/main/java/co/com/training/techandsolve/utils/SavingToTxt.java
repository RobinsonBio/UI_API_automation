package co.com.training.techandsolve.utils;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SavingToTxt {

    public static void prices (List<String> prices_list){
        FileWriter fileWriter = null;
        try {
            fileWriter= new FileWriter("C:\\Automatizacion\\Automation_repository\\prices_of_clothes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s: prices_list) {
                bufferedWriter.write(s);
                bufferedWriter.append(" | ");
            }
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileWriter != null){
                try{
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}