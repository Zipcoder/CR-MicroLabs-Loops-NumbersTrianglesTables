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

                output+=String.format("%3d |",i*j);
            }
        }

        return output;
    }

    public String tableSquares(int n){
        String output = "tableSquares("+n+")\n*** Output ***\nA "+n+" x "+n+" table square";
        String space =n*n+"";
        for (int i=1;i<=n;i++){
            output+="\n|"+String.format("%"+((n+"").length()+1)+"d |",i);
            for (int j=2;j<=n; j++){
                output+=String.format("%"+(space.length()+1)+"d |",i*j);
            }
        }
        return output;
    }
}
