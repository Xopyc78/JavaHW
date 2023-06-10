// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
// The returned string should only have a single space separating the words. Do not include any extra spaces.
// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"
import java.util.Scanner;
public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(str);
        String[] arr=str.split(" ");
        int k= arr.length-1;
        String[]inverseArr=new String[arr.length];
        int i=0;
        System.out.println(str);
        while(i<arr.length){
            inverseArr[i]=arr[k];
            i++;
            k--;
        }
        String strInverse = String.join(" ", inverseArr);
        System.out.println(strInverse);
    }
}