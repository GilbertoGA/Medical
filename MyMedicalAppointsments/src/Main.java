
import static UI.UIMenu.showMenu;


public class Main {
    public static void main(String[] args){

        Doctor myDoctor = new Doctor();
        myDoctor.name = "alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor MyDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();

    }

}