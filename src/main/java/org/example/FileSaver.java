package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс сохраняет массив данных в файл
 */
public class FileSaver {
    String[] values;
    public FileSaver(String[] datas) {
        this.values = datas;
    }

    public void save(String fileName) {
        try(FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (String value : values) {
                bufferedWriter.append(value + " ");
            }
            bufferedWriter.append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
