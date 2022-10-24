import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int day = 6;
        String name;

        switch (day) {
            case 1:
                name = "пн";
                break;
            case 2:
                name = "Вт";
                break;
            case 3:
                name = "СР";
                break;
            case 4:
                name = "ЧТ";
                break;
            case 5:
                name = "ПТ";
                break;
            case 6:
                name = "СБ";
                break;
            case 7:
                name = "ВС";
                break;
            default:
                name = "??";
        }
        System.out.println(name);

    }

}

