public class Pisica {
    // atribute
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    //constructor
    /*Pisica() {
        
    }*/
    Pisica(String nume, int varsta, String culoare, double greutate) {
        this.nume = nume;
        //p1.nume = "Tom";
        this.varsta = varsta;
        //p1.varsta = 2;
        this.culoare = culoare;
        //p1.culoare = "gri"
        this.greutate = greutate;
        //p1.greutate = 5.6,
    }
    //comportamente
    
    void spuneMiau() {
        System.out.println("Miau! Numele meu este "+this.nume);
    }
}