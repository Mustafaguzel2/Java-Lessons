package rectangletest;

import rectangletest.Rectangle;


public class RectangleTest {
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(7.4,9.1);
        double cevre = r.cevre();
        double alan = r.alan();
        
        System.out.println("Çevresi: " + cevre + " Alanı: " + alan);
        System.out.println(r);//toString ifadesini gösterir.
    }
}
