package com.karan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class Main {
    private static final FastReader in =  new FastReader();
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args){
        int test = in.nextInt();
        while(test-->0){
            long h = in.nextLong();
            long p = in.nextLong();
            if((p>0) && (h>0)){
                    p = Math.floor(p / 2);
                    h = h - p;
                }
          if(h<=0){
	        out.println(1);
	    }
	    else{
	        out.println(0);
	    }
        }
        out.flush();
        out.close();
    }
}

class FastReader{
    private BufferedReader br;
    private StringTokenizer st;

    public FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next(){
        while(st == null || !st.hasMoreTokens()){
            try{
                st = new StringTokenizer(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt(){
        return Integer.parseInt(next());
    }

    public double nextDouble(){
        return Double.parseDouble(next());
    }

    public long nextLong(){
        return Long.parseLong(next());
    }

    public String nextLine(){
        String str = "";
        try{
            str = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }
}
