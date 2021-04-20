package project.pollbook.opinion.controller;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.*;

public class TestSolution {



    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        Integer innum =  Integer.parseInt(s.nextLine());



        String line;
        String[] lineVector;

        line = s.nextLine(); //read 1,2,3
        lineVector = line.split(",");
        int []inarr = new int[lineVector.length];


        for (int i = 0; i < innum; i++) {
            inarr[i]  =  Integer.parseInt(lineVector[i]);
        }

        new TestSolution().solution(innum, inarr) ;
    }
    public  String solution(int innum, int[] inarr){
        double range = (double)inarr.length / (double) innum;
        int firstDim = (int)Math.ceil(range);

        int [][]twoDArray = new int[firstDim-1][];

        for (int i = 0; i < inarr.length; i++){
            twoDArray[i/ innum][i  %  innum] = inarr[i];
        }

        return buildOutStr(twoDArray);

    }

    public String buildOutStr(int [][] twoDArray){

        String outStr = "";
        for(int i=0; i<twoDArray.length; i++) {
            boolean mulitpleOfTen = false;
            for(int j=0; j<twoDArray[i].length; j++) {
                  if(twoDArray[i][j] % 10 == 0 ){
                      mulitpleOfTen = true;
                      outStr =  outStr + numArr(twoDArray[i][j]  / 10);
                  }
            }
            if(mulitpleOfTen == false){
                if( outStr.length() > 0 ){
                    outStr = outStr +  outStr.charAt(outStr.length() -1 );
                }else{
                    outStr = "-";
                }
            }
        }

        return outStr;
    }

    public char numArr (int num){
        num = num + 64;
        char c=(char)num;
        return c;

    }

    public int solution(int []innarr){
        Map map = new HashMap<String, Integer>();
        for (int i = 0; i < innarr.length; i++) {
            map.put(String.valueOf(innarr[i]),0);
        }

        int size = map.size();
        return size * (size -1) * (size - 2) * (size- 3);

    }

    public int getNumGreaterThanParticular(int []innarr, int num){
        Map map = new HashMap<String, Integer>();
        for (int i = 0; i < innarr.length; i++) {
            map.put(String.valueOf(innarr[i]),0);
        }

        int size = map.size();
        return size * (size -1) * (size - 2) * (size- 3);
    }



}
