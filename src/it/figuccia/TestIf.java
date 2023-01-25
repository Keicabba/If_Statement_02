package it.figuccia;

public class TestIf {
    public static void main(String[] args) {
        String mySurname = "Figuccia";

        String result = mySurname.contains("ni") ? "contains" : "doesn't contain";

        System.out.println("Your surname " + result + " the sequence of letters 'ni'");

    }
}
