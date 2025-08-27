import java.util.EnumMap;
import java.util.Map;

class Demo{
    public static void main(String[] args){
        
        //Array of size same as that of Enum Day 
        Map<Day, String> map = new EnumMap<>(Day.class);
        
        //No hashing, Instead Ordinal is used 
        map.put(Day.TUESDAY, "GYM");
        map.put(Day.MONDAY, "Running");
        System.out.print(map);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }




}