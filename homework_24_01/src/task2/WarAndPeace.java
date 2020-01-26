package task2;

import task2.api.IRegex;
import task2.api.IString;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarAndPeace implements IRegex, IString {
    private String word;
    private File file;


    public WarAndPeace(String word, File file) {
        this.word = word;
        this.file = file;
    }

    @Override
    public void counterReg() throws FileNotFoundException {
        String regexWord1 = "\\b"+word+"\\b";
        Scanner scanner = new Scanner(file);
        int kol = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Pattern pattern = Pattern.compile(regexWord1);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                kol++;
            }
        }
        System.out.println(String.format("количество слов \"%s\" %d  ", word, kol));
    }

    @Override
    public void counterString() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int kol = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] line1= line.split(" ");
            for (String temp : line1) {
                if (temp.matches(word+"\\W?"))
                    kol++;
            }
        }
        System.out.println(String.format("количество слов \"%s\" %d  ",word , kol));
    }
}
