package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char ch=character;
        if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
            if (ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
