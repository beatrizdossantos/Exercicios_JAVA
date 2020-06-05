
package exc03;

import java.util.Random;

public class Exc03 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        while(i<11) {
            j=1;
            System.out.println(i+"° CONCURSO");  
            while(j<7) {
                Random s = new Random();
                int sort = s.nextInt(60);
                System.out.println(sort);
                j++;
                
        }
          i++;  
        }
    }
    
}
