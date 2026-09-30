package controlflow;

public class switches {
    public static void main(String[] args) {
        int day=9;
        String name;
        switch(day){
            case 1:
                name="Monday";
                break;
                case 2:
                    name="Tuesday";
                    break;
                    case 3:
                    name="Wednesday";
                    break;
            default:
                name="Invalid Day";
        }
        System.out.println(name);

    }
}
