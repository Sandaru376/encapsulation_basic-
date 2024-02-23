public class Main {
    String make;
    String model;
    private int year;

    public String getmake(){
        return make;
    }

    public void setname(String Make){
        make=Make;
    }

    
    public String getmodel(){
        return model;
    }

    public void setmodel(String Model){
        model=Model;
    }

    
    public String getyear(){
        return year;
    }

    public void setyear(String Year){
        if(year>1900){
            year=Year;
        }
        else{
            System.out.println("invalid year ..");
        }
    }


    public static void main(String[] args) {
        Main obj=new Main("toyota","cormy",2000);
        
        System.out.println(car.make);
        car.make="honda";

        System.out.println(car.getmake);
        car.setmake("ford");
        System.out.println(car.getmake());
        
    }

    
}