package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String out= "";
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++)
                out+= "*";
            out+="\n";
        }
        return out.trim();
    }

    public String tableSquare(){
        String out="";
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++) {
                String s = " " + j * 4;
                int length = s.length();
                out += String.format("|%" + length + "d ", i * j);
            }
            out+="|\n";
        }
        return out.trim();
    }

    public String tableSquares(int n){
        String out="";
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                String s = " " + j * n;
                int length = s.length();

                    out+= String.format("|%" + length+ "d " , i*j);

            }
            if(i!=n)
                out+="|\n";
            else
                out+="|";
        }
        return out;
    }
}
