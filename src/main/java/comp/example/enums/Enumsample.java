package comp.example.enums;

/**
 * Author : Rajdeep Deb
 * Date   : 02-08-2024
 * Time   : 03:27 PM
 */
public enum Enumsample {

    MONDAY(101,"1st day"){
        @Override
        public void dummyMethod() {
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY(102,"2nd day"),
    WEDNESDAY(103,"3rd day"),
    THURSDAY(104,"4th day"),
    FRIDAY(105,"5th day"),
    SATURDAY(106,"6th day"),
    SUNDAY(107,"7th day");

    private int val;
    private String comment;

    Enumsample(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static Enumsample getEnumFromValues(int value){

        for(Enumsample enumsample :Enumsample.values()){

            if(value==enumsample.getVal()){
                return enumsample;
            }
        }
        return null;
    }
    public void dummyMethod(){
        System.out.println("Default dummy method!");
    }
}
