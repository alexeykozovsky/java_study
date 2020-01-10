package Calc_home;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calc
{
    private StringBuilder cstring = new StringBuilder();
    private boolean PlusSign = true;
    private int CloseBracket,OpenBracket;
    private int FinishPos = 0, StartPos = 0;

    public void readLine()
    {
        System.out.println("Введите выражение: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exprString = null;
        try
        {
            while(!(exprString = reader.readLine()).equals("exit"))
            {
                calculate(exprString);
                if (PlusSign == true)
                {
                    System.out.println("Результат: "+cstring);
                } else
                {
                    cstring.insert(0, '-');
                    System.out.println("Результат: "+cstring);
                }
                PlusSign = true;
                System.out.println("Введите новое выражение:");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch(NumberFormatException a)
        {
            System.out.println("ERROR!");
            System.out.println("Введите новое выражение или \"exit\" для выхода ");
            try
            {
                while(!(exprString = reader.readLine()).equals("exit"))
                {
                    calculate(exprString);
                    if (PlusSign == true)
                    {
                        System.out.println("Результат: "+cstring);
                    } else
                    {
                        cstring.insert(0, '-');
                        System.out.println("Результат: "+cstring);
                    }
                    PlusSign = true;
                    System.out.println("Введите новое выражение:");
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
    private int valueCalc(String input)//подсчет размера нового массива
    {
        int Slots = 0;
        for (int i = 0; i < input.length(); i++)
        {
            if ((input.charAt(i) == '+') || (input.charAt(i) == '-') ||
                    (input.charAt(i) == '*') || (input.charAt(i) == '/')||
                    (input.charAt(i) == ')')|| (input.charAt(i) == '('))
            {
                Slots++;
            }
        }
        return Slots;
    }
    private void calculate(String input)
    {
        int[] CharsPos = new int[valueCalc(input)+2];
        //начало и конец
        float a = 0, b = 0; //for parse parts
        Float c = null; //результат в скобках
        cstring.delete(0, cstring.length());
        cstring.append(input);
        /////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < cstring.length(); i++)
        {
            if(cstring.charAt(i)=='(')
            {
                OpenBracket=i;
            }
            if(cstring.charAt(i)==')')//максимальный приоритет
            {
                CloseBracket=i;
                String subString=new String();
                subString=cstring.substring(OpenBracket+1, CloseBracket);
                cstring.delete(OpenBracket, CloseBracket+1);
                StringBuilder mainString=new StringBuilder(cstring);
                calculate(subString);
                mainString.insert(OpenBracket,cstring.toString());
                cstring.delete(0, cstring.length());
                cstring.insert(0, mainString.toString());
                calculate(cstring.toString());
            }
        }
        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < cstring.length(); i++)
        {
            if (cstring.charAt(i) == '*')
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(StartPos, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(StartPos, FinishPos);
                c = a * b;
                cstring.insert(StartPos, c.toString());
                calculate(cstring.toString());
                break;
            }
            if (cstring.charAt(i) == '/')
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(StartPos, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(StartPos, FinishPos);
                c = a / b;
                cstring.insert(StartPos, c.toString());
                calculate(cstring.toString());
                break;
            }

        }
        for (int i = 0; i < cstring.length(); i++)
        {
            if ((cstring.charAt(i) == '*') || (cstring.charAt(i) == '/'))
            {
                calculate(cstring.toString());
            }
        }
        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < cstring.length(); i++)
        {
            if ((cstring.charAt(i) == '+') && (PlusSign == true))
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(StartPos, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(StartPos, FinishPos);
                c = a + b;
                cstring.insert(StartPos, c.toString());
                break;
            }
            if ((cstring.charAt(i) == '+') && (PlusSign == false))
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(0, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(0, FinishPos);
                if (b > a)
                {
                    c = b - a;
                    PlusSign = true;
                }
                else
                {
                    c = a - b;
                }
                cstring.insert(0, c.toString());
                break;
            }
            if ((cstring.charAt(i) == '-') && (PlusSign == true))
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(0, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(0, FinishPos);
                if (b > a)
                {
                    c = b - a;
                    PlusSign = false;
                }
                else
                {
                    c = a - b;
                }
                cstring.insert(0, c.toString());
                break;
            }
            if ((cstring.charAt(i) == '-') && (PlusSign == false))
            {
                CharsPos[0]=0;
                for (int j = 0,  k = 1; j < cstring.length()-1; j++)
                {
                    if ((cstring.charAt(j) == '+') || (cstring.charAt(j) == '-') ||
                            (cstring.charAt(j) == '*') || (cstring.charAt(j) == '/')||
                            (cstring.charAt(j) == '(')|| (cstring.charAt(j) == ')'))
                    {
                        CharsPos[k] = j+1;
                        k++;
                    }
                    CharsPos[CharsPos.length-1]=cstring.length()+1;
                }
                for(int k=0;k<CharsPos.length;k++)
                {

                    if(CharsPos[k]==i+1)
                    {
                        StartPos=CharsPos[k-1];
                        FinishPos=CharsPos[k+1]-1;
                    }
                }
                a = Float.parseFloat(cstring.substring(0, i));
                b = Float.parseFloat(cstring.substring(i + 1, FinishPos));
                cstring.delete(0, FinishPos);
                c = a + b;
                cstring.insert(0, c.toString());
                break;
            }
        }
        for (int i = 0; i < cstring.length(); i++)
        {
            if ((cstring.charAt(i) == '+') || (cstring.charAt(i) == '-'))
            {
                calculate(cstring.toString());
            }
        }
    }
}
