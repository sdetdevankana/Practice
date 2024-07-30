import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test001 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name of your student");
            String name = br.readLine();
            System.out.println("Enter the age of your student");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Enter the sex of your student (M/F)");
            char sex = (char) br.read();
            br.readLine();
            System.out.println("Enter the marks of your student");
            double marks = Double.parseDouble(br.readLine());
            System.out.println("Enter the avg of your student");
            float avg = Float.parseFloat(br.readLine());


            System.out.println("name= " + name);
            System.out.println("age= " + age);
            System.out.println("sex= " + sex);
            System.out.println("marks= " + marks);
            System.out.println("avg= " + avg);


            System.out.println("Hello world!");
        } catch (java.io.IOException e) {
            System.out.println("No input is given");

        } catch (java.lang.NumberFormatException e){
            System.out.println("Wrong input is given");
        }
    }

}