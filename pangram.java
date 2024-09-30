import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
             continue;   
            }
            else if(ch>='a' && ch<='z')
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count<26)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}

