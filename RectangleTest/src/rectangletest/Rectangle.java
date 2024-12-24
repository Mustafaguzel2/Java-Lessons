package rectangletest;
public class Rectangle {
    
    private double en;
    private double boy;
    
    //default constructor
    public Rectangle() {
        
        this.setEn(1.0);
        this.setBoy(1.0);
        
    }
    public Rectangle(double en, double boy) {
        
        this.setEn(en);
        this.setBoy(boy);
        
    }
    public double cevre() {
        return 2 * (getEn() + getBoy());
    }
    public double alan() {
        return getEn() * getBoy();
    }
    
    public double getEn() {
        return this.en;
    }
    public double getBoy() {
        return this.boy;
    }
    
    public void setEn(double en) {
        this.en = en;
    }
    public void setBoy(double boy) {
        this.boy = boy;
    }
    
    @Override//Zaten mevcut olan to string yerine bu tostringin yazılması gerektiğini söyleyen ifade.
    public String toString() {
        return String.format("%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
        //Açıklama: %s = bir string ifadesi konacak ardından
        //%.2f ondalıklı sayı gelecek demektir
        //%n yeni satır ve %s tekrardan string ifade gelecek demektir.
                "Boy", getBoy(),
                "En", getEn(),
                "Çevre", cevre(),
                "Alan", alan());
    }
    
}
