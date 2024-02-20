import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws Exception {
        // Читаем файл центральной точки и радиуса окружности
        int radius = 0;
        int centerX = 0, centerY = 0;
        File file1 = new File("/project-test/task2/src/file1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file1)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.length() == 1) {
                    radius = Integer.parseInt(line);
                } else {
                    String[] splitString = line.split(" ");
                    String centerXString = splitString[0];
                    centerX = Integer.parseInt(centerXString);
                    String centerYString = splitString[1];
                    centerY = Integer.parseInt(centerYString);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Читаем файл точек и выявляем где лежит точка
        File file2 = new File("/project-test/task2/src/file2.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file2)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitString = line.split(" ");   
                String tempXString = splitString[0];
                int tempX = Integer.parseInt(tempXString);
                String tempYString = splitString[1];
                int tempY = Integer.parseInt(tempYString);
                if (Math.pow((tempX - centerX), 2) + Math.pow((tempY - centerY), 2) == Math.pow(radius, 2)) {
                    System.out.println("0");
                } else if (Math.pow((tempX - centerX), 2) + Math.pow((tempY - centerY), 2) < Math.pow(radius, 2)) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }   
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
