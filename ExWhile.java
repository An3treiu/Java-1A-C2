/**
 Sa afisam in consola numerele de la 1 la 10.
 */
public class ExWhile {
    public static void main(String [] args) {
        int i = 1;
        
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        
        while(true) {
            //bucla infinta
            break;
        }
        
        System.out.println("unreachable statment");
        
        /* while(false){} */
        
        // do while
        i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=10);
    }
}