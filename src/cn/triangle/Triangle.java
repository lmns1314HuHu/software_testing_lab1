package cn.triangle;

/**
 * Created by yunhao on 17-3-10.
 */

public class Triangle {
    public String kind(int a, int b, int c){
        String ret = "";
        int count = -1;
        if(a + b + c - Math.max(a, Math.max(b, c)) > Math.max(a, Math.max(b, c))) {
            count++;
            if (a == b) count++;
            if (b == c) count++;
            if (c == a) count++;
        }
        switch (count){
            case -1:
                ret = "not a triangle";
                break;
            case 0:
                ret = "scalene";
                break;
            case 1:
                ret = "isosceles";
                break;
            case 3:
                ret = "equilateral";
                break;
        }
        return ret;
    }
}
