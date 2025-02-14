public class MadLib {
    //Author Finn
    String classmate = "Chief Keef";
    String city = "Chiraq";
    String noun = "polo";
    String adjective = "smooth";
    String pluralNoun = "Choppas";
    String pluralAnimal = "Dawgs";
    boolean trueOrFalse = true;
    String decimalBiggerThan1 = "1.01";
    int number1 = 44;
    int number2 = 666;
    int wholeNumberBetween1And4 = 1;
    String miltonTeacher = "Ms.Latham";
    String miltonDean = "Mr.Ruiz";
    String letterGrade = "C";
    String season = "spring";


    public static void main(String[] args) {
        System.out.println("hello world");
        MadLib myStory = new MadLib();
    }


    public MadLib() {
        System.out.println("hello world");

        String story = "This weekend I am going camping with "
                + classmate + ". We are going to a campsite in "
                + city + ". I packed my " + noun + " and "
                + pluralNoun + ".  The forecast is calling for a high of "
                + decimalBiggerThan1 + " degrees fahrenheit. So it should be a "
                + adjective + " day! This year, the park rangers have seen "
                + number1 + " " + pluralAnimal + " which seems kind of dangerous. "
                + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class "
                + wholeNumberBetween1And4 + " students in the " + season + ". But, "
                + miltonDean + " said it actually has only happened "
                + number2 + " times. Wish us luck! If we survive, we will earn a "
                + letterGrade + "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);

    }
}

