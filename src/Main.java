import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        File src = new File("H:\\Games\\src");
        if (src.mkdir())
            stringBuilder.append("Каталог " + src.getName() + " создан\n");
        File res = new File("H:\\Games\\res");
        if (res.mkdir())
            stringBuilder.append("Каталог " + res.getName() + " создан\n");
        File saveGames = new File("H:\\Games\\saveGames");
        if (saveGames.mkdir())
            stringBuilder.append("Каталог " + saveGames.getName() + " создан\n");
        File temp = new File("H:\\Games\\temp");
        if (temp.mkdir())
            stringBuilder.append("Каталог " + temp.getName() + " создан\n");
        File main = new File("H:\\Games\\src\\main");
        if (main.mkdir())
            stringBuilder.append("Каталог " + main.getName() + " создан\n");
        File test = new File("H:\\Games\\src\\test");
        if (test.mkdir())
            stringBuilder.append("Каталог " + test.getName() + " создан\n");
        File drawables = new File("H:\\Games\\res\\drawables");
        if (drawables.mkdir())
            stringBuilder.append("Каталог " + drawables.getName() + " создан\n");
        File vectors = new File("H:\\Games\\res\\vectors");
        if (vectors.mkdir())
            stringBuilder.append("Каталог " + vectors.getName() + " создан\n");
        File icons = new File("H:\\Games\\res\\icons");
        if (icons.mkdir())
            stringBuilder.append("Каталог " + icons.getName() + " создан\n");

        File mainJava = new File("H:\\Games\\src\\main//Main.java");
        try {
            if (mainJava.createNewFile())
                stringBuilder.append("Файл " + mainJava.getName() + " успешно создан\n");
        }   catch (IOException ex) {
            stringBuilder.append("Ошибка при создании файла\n");
        }

        File utilsJava = new File("H:\\Games\\src\\main//Utils.java");
        try {
            if (utilsJava.createNewFile())
                stringBuilder.append("Файл " + utilsJava.getName() + " успешно создан\n");
        }   catch (IOException ex) {
            stringBuilder.append("Ошибка при создании файла\n");
        }

        File tempTxt = new File("H:\\Games\\temp//temp.txt");
        try {
            if (tempTxt.createNewFile())
                stringBuilder.append("Файл " + tempTxt.getName() + " успешно создан\n");
        }   catch (IOException ex) {
            stringBuilder.append("Ошибка при создании файла\n");
        }

        //System.out.println(stringBuilder.toString());

        try (FileWriter fileWriter = new FileWriter(tempTxt, false)) {
            fileWriter.write(stringBuilder.toString());
        } catch (IOException ex) {
            System.out.println("Ошибка при записи файла temp.txt");
        }
    }
}
