package com.vyadrov.app.utils.homework.lesson9;

public class MultiplicationTable {
    public static void multiply() {
        int ii,jj;
        int masRes[][]=new int[15][2];
        int masi[]={2,3,4,5,6,7,8,9};
        int masj[]={2,3,4,5,6,7,8,9};
        for (int i = 0; i < masRes.length; i++) {
            ii=(int)(Math.random()*8+2);
            jj=(int)(Math.random()*8+2);
            for (int x = 0; x< masRes.length; x++) {
                if ((ii == masRes[x][0] && jj == masRes[x][1]) || (jj == masRes[x][0] && ii == masRes[x][1])) {
                    i--;
                }
            }
            masRes[i][0]=ii;
            masRes[i][1]=jj;
        }
        for (int i = 0; i < masRes.length; i++) {
            System.out.print("Schoolchild №" + (i + 1 + " " + "multiplies" + "\t"));
            for (int j = 0; j < masRes[j].length; j++) {
                if (j == 0) {
                    System.out.print(masRes[i][j] + "*");
                }
                if (j == 1) {
                    System.out.println(masRes[i][j]);
                }

            }
            
        }
    }

}
