package org.jekrish.learning.practicepblms;
import java.util.Scanner;
public class RiyaAndStrings {
    public static String process(String input1){
        int len = input1.length();
        int mid = 0 , index = 0;
        char[] inputstr = input1.toCharArray();
        char[] outputstr = new char[input1.length()];
        boolean traverseRightLeftFlag = false;
        
        if(len%2==0){
            mid=(len/2)-1;
            traverseRightLeftFlag = true;
        }else{
            mid=len/2;
            traverseRightLeftFlag = false;
        }
        index = mid;
        for(int i=0,j=1,k=-1;i<len;i++){
            outputstr[index] = inputstr[i];
            if(traverseRightLeftFlag){
                traverseRightLeftFlag = false;
                index = mid+j;
                j++;
            } else {
                traverseRightLeftFlag = true;
                index = mid+k;
                k--;
            }
        }
        return String.valueOf(outputstr); 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip1 = in.nextLine().trim();
        String output = process(ip1);
        System.out.println("output>>>>"+output);
      }

}
