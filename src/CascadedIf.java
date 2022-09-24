public class CascadedIf {
    public static void main(String[] args) {

        String partyAffiliation;

        System.out.println("Enter your party affiliation: [D/R/I]");
        partyAffiliation = "O";

        if (partyAffiliation == "D") {
            System.out.println("You are a donkey!");
        } else if (partyAffiliation == "R") {
            System.out.println("You are an Elephant!");
        } else if (partyAffiliation == "I") {
            System.out.println("You are a Man!");
        }else{
            System.out.println("You did not input a valid party of D R or I, your party is other");
        }
    }
}
