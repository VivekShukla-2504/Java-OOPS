package conditional_operator;

public class switchs {
    public static void main(String[] args) {
        int day = 4;
        String dayname;
        switch (day) {
            case 1:
                dayname="Monday";
                System.out.println(dayname);
                break;
            case 2:
                dayname = "Tuesday";
                System.out.println(dayname);
                break;
            case 3:
                dayname = "Wednesday";
                System.out.println(dayname);
                break;
            case 4:
                dayname = "Thursday";
                System.out.println(dayname);
                break;
            case 5:
                dayname = "Friday";
                System.out.println(dayname);
                break;
            case 6:
                dayname = "Saturday";
                System.out.println(dayname);
                break;
            case 7:
                dayname = "Sunday";
                System.out.println(dayname);      
            default:
                break;
        }
        
    }

}
