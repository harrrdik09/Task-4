import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        String fn = "src/product.csv";
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(fn));
            FileWriter fw = new FileWriter("src/Target.csv",true))

        {

            while ((line = br.readLine()) != null) {
                // Split by comma
                String[] data = line.split(",");

                String productName = data[0];
                double price = Double.parseDouble(data[1]);

                // Print output
               // System.out.println("Product: " + productName + " | Price: " + price);
                if (price>1000)
                {

                        System.out.println(productName + price);
                        fw.write(productName + " " + price +"\n");


                  
                }
              System.out.println("Data Come Succesfuly");
            }


        } catch (Exception e) {
            System.out.println(e);
        }



    }
}

