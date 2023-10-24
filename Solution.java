import java.util.Scanner;

public class Solution {
    static int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input:");
        String letter= input.nextLine();
        int i = roman(letter);
        System.out.println("Change to number:"+roman(letter));

    }
    public static int roman(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int s1= value(s.charAt(i));
            if(i+1<s.length()){
                int s2=value(s.charAt(i+1));
                if(s1>=s2){
                    sum+=s1;
                }
                else{
                    sum=sum+s2-s1;
                    i++;
                }
            }
            else {
                sum=sum+s1;
            }
        }
        return sum;
    }
}



