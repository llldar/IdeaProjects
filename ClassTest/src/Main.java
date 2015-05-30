/**
 * Created by Administrator on 2015/5/25.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String buffer1 = in.nextLine();
        Pair[] letters = new Pair[(buffer1.length()+1)/2];
        for (int i = 0,j = 0; i < buffer1.length(); i++) {
            if( buffer1.charAt(i) >= 'a' && buffer1.charAt(i) <= 'z')
                letters[j++] = new Pair(buffer1.charAt(i));
        }
        String buffer2 = in.nextLine();//Begin to establish connections
        for (int i = 0; i < buffer2.length(); i++) {//iterate ever char
            if( buffer2.charAt(i) >= 'a' && buffer2.charAt(i)<= 'z' && buffer2.charAt(i+1)!='>'
                    && buffer2.charAt(i) != buffer2.charAt(i+2) )
            {//deal with front
                for (Pair letter : letters) {//find front
                    if (letter.getName() == buffer2.charAt(i)) {
                        letter.hasParent = true;
                    }
                }
            }
            if( buffer2.charAt(i) >= 'a' && buffer2.charAt(i)<= 'z' && buffer2.charAt(i+1)!=','
                    && buffer2.charAt(i) != buffer2.charAt(i-2))
            {//deal with back
                for (Pair letter : letters) {//find back
                    if (letter.getName() == buffer2.charAt(i)) {
                        letter.hasChild = true;
                    }
                }
            }
        }
        String minAnswers = "";
        String maxAnswers = "";
        for (Pair letter : letters) {//find final
            if (!letter.hasParent) {
                maxAnswers = maxAnswers+letter.getName()+",";
            }
            if(!letter.hasChild){
                minAnswers = minAnswers+letter.getName()+",";
            }
        }
        if(minAnswers.length() == 0)
            System.out.println(buffer1);
        else
            System.out.println(minAnswers.substring(0,minAnswers.length() -1));
        if(maxAnswers.length() == 0)
            System.out.println(buffer1);
        else
            System.out.println(maxAnswers.substring(0,maxAnswers.length() -1));
    }
}

class Pair {
    private char name;
    public boolean hasParent;
    public boolean hasChild;

    public Pair(char name){
        this.name = name;
        hasChild = false;
        hasParent = false;
    }

    public char getName() {
        return name;
    }
}