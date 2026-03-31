package Enum;
//  Enum is basically static final constants but with superpowers — fields, methods, switch support!

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Enum {
    public static void main(String[] args) {
          Day today =Day.MONDAY;     // type of today is Day- enum object
        System.out.println(today);  // MONDAY

          Day weekend =Day.SATURDAY;
        System.out.println(weekend);

    // Built-in methods
        // name()
        System.out.println(today.name());// FRIDAY  // type is String , not an enum obj
        // ordinal()
        System.out.println(today.ordinal());// position or index of constant stored in today -- 0
        System.out.println(weekend.ordinal());// 5
        // values() - return ALL constants
        Day[] day=Day.values(); // array of constants and Day.values() automatically contains all the elements as
        // constants from the enum
        for (Day d: day){
            System.out.println(d.ordinal() + " -> "+ d);
        }
        // valueOf() - String to Enum
        Day d=Day.valueOf("MONDAY"); //    valueOf() basically says — "Give me a String that EXACTLY matches one of
        // my constants — or I'll crash!
        System.out.println(d);
//        Day e=Day.valueOf("GOOD");     ---- ERROR
//        System.out.println(e);
    // IF
        if(today == Day.SATURDAY || today==Day.SUNDAY){
            System.out.println("Its weekend!");
        }
        else{
            System.out.println("Weekdays!");
        }
    // SWITCH
        switch(today){
            case MONDAY:
                System.out.println("First day of School");
                break;
            case WEDNESDAY:
                System.out.println("Wear house dress");
                break;
            case SATURDAY:
                System.out.println("Club activity's day");
        }
    }
}
