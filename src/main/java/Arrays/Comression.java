package Arrays;

public class Comression {
    public int compress(char[] chars){
        int n = chars.length;
        int w = 0;      // куда пишем (write)
        int i = 0;      // начало серии (read)
        while(i < n){
            int j = i;

            while(j< n && chars[j]== chars[i])
                j++;
            int cnt = j-i;
                chars[w++] = chars[i];
                if(cnt < 1){
                    String s = Integer.toString(cnt);
                    for (int k = 0; k < s.length(); k++){
                        chars[w++] = s.charAt(k);
                    }
                }
                i =j;


        }
        return w;

    }
    public static void main(String[] args) {
      Comression cm =new Comression();
      char[] a = "aaabbccc".toCharArray();
      int len = cm.compress(a);
        System.out.println("len = " + len);
        System.out.println(new String(a,0, len));

        char[] b = "ab".toCharArray();
        int len2 = cm.compress(b);
        System.out.println("len = " + len2);                // 2
        System.out.println(new String(b, 0, len2));

        char[] c = "aaaaaaaaaaaabb" .toCharArray();         // 12 'a' + 2 'b'
        int len3 = cm.compress(c);
        System.out.println("len = " + len3);                // 6
        System.out.println(new String(c, 0, len3));


    }
}
