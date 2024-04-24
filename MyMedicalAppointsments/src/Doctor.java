public class Doctor {
    //Atributos
    static int id = 0; // Autoincrementado
    String name;
    String speciality;

    Doctor(){
        System.out.println("construyendo em objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El  nombre del Doctor es : " + name);
    }
    // comportamientos

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
