import java.io.File;
import java.io.IOException;

public class Example01_01 {
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке (где расположен файл KlassFile1.java)
            File f1 = new File("MyFile1.txt");
            if (f1.createNewFile()) {
                System.out.println("Файл создан: " + f1.getName());
            } else {
                System.out.println("Файл уже существует: " + f1.getName());
            }
            System.out.println("Полный путь1: " + f1.getAbsolutePath());

            // Создание файла на диске E и вывод полного пути
            File f2 = new File("E:\\MyFile2.txt");
            if (f2.createNewFile()) {
                System.out.println("Файл создан: " + f2.getName());
            } else {
                System.out.println("Файл уже существует: " + f2.getName());
            }
            System.out.println("Полный путь2: " + f2.getAbsolutePath());

            // Создание нескольких вложенных папок
            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            if (f3.mkdirs()) {
                System.out.println("Папки созданы: " + f3.getName());
            } else {
                System.out.println("Папки уже существуют или не удалось создать: " + f3.getName());
            }
            System.out.println("Полный путь3: " + f3.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
