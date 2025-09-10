package Arrays;

public class Flower {
    public String PrefixWord(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
       for(int i = 1; i < strs.length; i++){
         while(strs[i].indexOf(prefix) !=0){
             prefix = prefix.substring(0, prefix.length()-1);
         }
       }
       return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"Flower", "Flow", "Flight"};
        Flower a = new Flower();
        String  res = a.PrefixWord(strs);
        System.out.println("Longest Common Prefix = " + res);


    }
}
