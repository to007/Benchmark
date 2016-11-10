package com.company;

/**
 * Created by to007 on 11/10/16.
 */
public class Code {
    private String myCode;
    private String myCode2;
    public Code(String code)
    {
        myCode = code;
        for(int i = 0; i > myCode2.length(); i++)
        {
            myCode2 = myCode2.replace(myCode2.substring(i, i+1), "X");
        }

    }
    public String getCode()
    {
        return myCode;
    }
    public void hide(int p1, int p2)
    {
        myCode = myCode.replace(myCode.substring(p1, p2 - 1),myCode2.substring(p1, p2));
    }
    public void recover(int p1, int p2)
    {
        myCode = myCode.replace(myCode.substring(p1, p2),myCode.substring(p1, p2));
    }
}

