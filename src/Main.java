import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        ArrayList<String> dirList = new ArrayList<>();
        dirList.add("H:\\Games\\src");
        dirList.add("H:\\Games\\res");
        dirList.add("H:\\Games\\saveGames");
        dirList.add("H:\\Games\\temp");
        dirList.add("H:\\Games\\src\\main");
        dirList.add("H:\\Games\\src\\test");
        dirList.add("H:\\Games\\res\\drawables");
        dirList.add("H:\\Games\\res\\vectors");
        dirList.add("H:\\Games\\res\\icons");

        ArrayList<String> filesList = new ArrayList<>();
        filesList.add("H:\\Games\\src\\main//Main.java");
        filesList.add("H:\\Games\\src\\main//Utils.java");
        filesList.add("H:\\Games\\temp//temp.txt");

        createDir(dirList);
        createFiles(filesList);

        //System.out.println(stringBuilder.toString());

        try (FileWriter fileWriter = new FileWriter("H:\\Games\\temp//temp.txt", false)) {
            fileWriter.write(stringBuilder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createDir (ArrayList<String> arrayList) {
        for (String path : arrayList){
            File src = new File(path);
            if (src.mkdir())
                stringBuilder.append("Каталог " + src.getName() + " создан\n");
        }
    }

    public static void createFiles (ArrayList<String> arrayList) {
        for (String file : arrayList) {
            File newFile = new File(file);
            try {
                if (newFile.createNewFile())
                    stringBuilder.append("Файл " + newFile.getName() + " успешно создан\n");
            }   catch (IOException ex) {
                stringBuilder.append("Ошибка при создании файла\n");
            }
        }
    }
}
