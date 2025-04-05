package Loops;

public class CharacterFinder {
    public int findIndex(String str, char characterToFind) {
        if (str == null) {
            return -1;
        }
        System.out.println("Continue...");
        int index = -1;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == characterToFind) {
                index = i;
                break;
            }
        return index;
    }
    public int findIndexOf(String str, char characterToFind){
        if (str==null){
            return -1;
        }
        int lastIndex = -1;
        for (int i = str.length() -1; i >=0;i--){
            if (str.charAt(i) == characterToFind){
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        CharacterFinder characterFinder = new CharacterFinder();

        int index = characterFinder.findIndex("Hello World", 'L');
        System.out.println("First index: " + index);

        int LastIndex = characterFinder.findIndex("Hello World", 'L');
        System.out.println("First index: " + index);
    }




}
