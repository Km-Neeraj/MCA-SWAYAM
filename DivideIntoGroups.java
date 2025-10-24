import java.util.*;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i += k) {
            String g = s.substring(i, Math.min(i + k, s.length()));
            
            if (g.length() < k) {
                StringBuilder sb = new StringBuilder(g);
                while (sb.length() < k) {
                    sb.append(fill);
                }
                g = sb.toString();
            }
            
            res.add(g);
        }
        
        return res.toArray(new String[0]);
    }
}

public class DivideIntoGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter group size k: ");
        int k = sc.nextInt();

        System.out.print("Enter fill character: ");
        char fill = sc.next().charAt(0);

        Solution solution = new Solution();
        String[] groups = solution.divideString(s, k, fill);

        System.out.println("Divided groups:");
        for (String group : groups) {
            System.out.println(group);
        }

        sc.close();
    }
}

                         

