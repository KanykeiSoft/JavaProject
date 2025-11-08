package Bank_app;

import java.util.ArrayList;
import java.util.List;

public class findMin {

    public List<String> generate(int n){
        List<String> res = new ArrayList<>();
        backtrack(res, 0 ,0 ,"",n);
        return res;
    }

     public void backtrack(List<String> res, int left, int right, String s, int n){
         if(s.length()==2 *n){
             res.add(s);
             return;

         }
         if (left < n) {
             backtrack(res, left + 1, right, s + "(", n);
         }

         // Если можно добавить закрывающую скобку
         if (right < left) {
             backtrack(res, left, right + 1, s + ")", n);
         }

     }
    public static void main(String[] args) {
    findMin find = new findMin();
    int n = 3;
        List<String> result = find.generate(n);
        System.out.println(result);
    }
}
