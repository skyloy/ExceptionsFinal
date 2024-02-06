package org.example;

import org.example.Exceptions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        List<FormatOfException> exceptions = new ArrayList<>(Arrays.asList(
                new NameException(),
                new NameException(),
                new NameException(),
                new DateException(),
                new PhoneNumException(),
                new SexException()
        ));

        System.out.println("Enter values:");

        Scanner scanner = new Scanner(System.in);

        Terminal terminal = new Terminal(exceptions);

        String readLine = "";
        while(true){
            readLine = scanner.nextLine();

            if(!readLine.toLowerCase().equals("exit")){
                String[] readDatas = terminal.spliter(readLine);
                if(readDatas != null){
                    FileSaver saveData = new FileSaver(readDatas);
                    saveData.save(readDatas[1] + ".txt");
                }
            } else {
                break;
            }
        }

    }
}
