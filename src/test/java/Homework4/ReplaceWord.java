package Homework4;

public class ReplaceWord {
    public static void main(String[] args) {
        String text ="The quick brown fox jumps over the lazy dog.";
        String replaceString=text.replaceAll("fox","cat");

        System.out.println(replaceString);
    }

}
