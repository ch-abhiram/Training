package DAY10.OOPs;
class tyre{
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
class caar{
    private String color;
    private tyre[] tyres;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    void setTyres(tyre[] tyres){
        this.tyres = tyres;
    }
    tyre[] getTyres(){
        return tyres;
    }
}
public class tyreDrive {
    static void main(String[] args) {
        tyre[] tyres = new tyre[4];
        for(int i = 0; i<tyres.length;i++){
            tyres[i] = new tyre();
            tyres[i].setBrand("MRF");
        }
        caar c = new caar();
        c.setColor("black");
        c.setTyres(tyres);
        System.out.println(c.getColor());
        for(tyre t:c.getTyres()){
            System.out.println(t.getBrand());
        }
    }
}
