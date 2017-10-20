package io.zipcoder.microlabs.mastering_loops;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Shapes {

    public String triangle(){
        String output = "triangle()\n*** Output ***";
        String stars="*****";

        for (int i=1; i<=5; i++){
            output+="\n"+stars.substring(0,i);
        }

        return output;
    }

    public String tableSquare(){
        String output = "tableSquare()\n*** Output ***\nA 4 x 4 table square";
        for (int i=1; i<=4; i++){
            output+="\n| "+i+" |";
            for(int j=2;j<=4; j++){
                String fill="  "+i*j+" ";
                output+=fill.substring(fill.length()-4)+"|";
            }
        }

        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares("+n+")\n*** Output ***\nA 6 x 6 table square";
        for (int i=1;i<=n;i++){
            output+="\n| "+i+" |";
            for (int j=2;j<=n; j++){
                String fill="  "+i*j+" ";
                output+=fill.substring(fill.length()-4)+"|";
            }
        }
        return output;
    }
}
