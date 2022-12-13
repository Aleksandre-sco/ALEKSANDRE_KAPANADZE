import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

    public static float count(int[] array){
        float counter = 0;
        int sum = 0;

        for (int a : array) {
            if (a > 150) {
                counter++;
                sum += a;
            }
        }

        return sum/counter;

    }

    public static double geometricMean(int[] array2){

        float counter = 0;
        int k = 1;

        for (int a : array2) {
            if (a % 2 == 1) {
                counter++;
                k *= a;
            }
        }

        return Math.pow(k, 1/counter);
    }

    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {

        int[] array = new int[]{12, 18, 152, 307, 345, 359, 30, 120};

        int[] array2 = new int[]{2, 3, 8, 12, 18, 7, 23};

        System.out.println(count(array));

        System.out.println(geometricMean(array2));

        Department depOne = new Department("IT", 90, "It@gmail.com");
        Department depTwo = new Department("Management", 30, "Managment@gmail.com");
        System.out.println(depOne.toString());
        System.out.println("Number of employees equals " + depOne.equals(depTwo));

        CreateFile.createFile("Aleksandre Kapanadze");

        XML.createXml();

    }
}
