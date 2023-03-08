import javax.sound.sampled.SourceDataLine;

public class Lecture2 {
    public static void main(String[] args) {
        System.out.println("Лекция 2");
    }
}

// API (Application programming interface) —
// это контракт, который предоставляет программа.
// «Ко мне можно обращаться так и так, я обязуюсь
// делать то и это».

// Что такое API для нас
// Это возможности, который предоставляют
// разработчики языка для удобного
// взаимодействия с его функционалом

// Что такое API для нас: строки
// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// String
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// Много изменений – String
// Много преобразований – StringBuilder

// Работа с файловой системой. Файлы
// import java.io.File;
// Для работы нужно:
// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

// Работа с файловой системой. Файлы. Ошибки
// try {
//  Код, в котором может появиться ошибка
// } catch (Exception e) {
//  Обработка, если ошибка случилась
// }
// finally {
//  Код, который выполнится в любом случае
// }

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения
// файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые
// находятся в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// Логирование. Использование. Основы
// Использование
// Logger logger = Logger.getLogger()
// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.
// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);
// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter

// import java.util.logging.*;

// public class Ex0043 {
//     public static void main(String[] args) {
//         Logger logger = Logger.getLogger(Ex0043.class.getName());
//         logger.setLevel(Level.INFO);
//         ConsoleHandler ch = new ConsoleHandler();
//         logger.addHandler(ch);
//         SimpleFormatter sFormat = new SimpleFormatter();
//         ch.setFormatter(sFormat);
//         logger.log(Level.WARNING, "Тестовое логирование");
//         logger.info("Тестовое логирование");
//     }
// }
