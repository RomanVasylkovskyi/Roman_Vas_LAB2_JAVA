package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public  static  void  TaskController()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n \nЗнову Привіт \n Введіть номер Завдання>> \t");
        int Tasker = sc.nextInt();

        switch (Tasker)
        {
            case (1) :
                Task39();
                break;

            case (2) :
                Task64();
                break;

            case (3) :
                Task89();
                break;

            case (4) :
                Task114();
                break;

            case (5) :
                Task139();
                break;
        }
    }
    public  static  void Task39()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведіть кількість студентів >>");
        int k = sc.nextInt();
        int i=0;
        int counter=0;

        int mas[] = new int[k];

        for (; i< mas.length;i++)
        {
            double r = Math.random() * 5;
            int rand = (int) Math.round(r);

            mas[i] = rand;
            System.out.print("\t" + mas[i]);
            if (mas[i]<3)
            {
                counter++;
            }
        }

        System.out.print("\n Кількість недопущених студентів >> \t"+counter);
            TaskController();
    }


    public  static  void Task64()
    {
        int sum = 0;
        int [] mas = new int[20];

        for (int i=0;i< mas.length; i++)
        {

        double r = Math.random()*10;
        int rand = (int) Math.round (r);
        mas [i] = rand;

        System.out.print("\t"+ mas[i]);

            if (mas[i]%2!=0)
            {
            sum += mas[i];
            }
        }


        System.out.println("\n Сума непарних чисел в масиві >> \t"+sum);
        TaskController();
    }

    public  static  void Task89()
    {
        int mas[]=new int [20];
        boolean riv= true;
        int i=0;
        int counter =0;

        for (; i<mas.length;i++)
        {
            double r = Math.random();
            int rand = (int) Math.round(r);
            mas [i] = rand;

            System.out.print("\t"+mas[i]);

            for(;i<=mas[i];i++)
            {
                if (mas[i]==mas[i+1])
                {
                counter++;
                }
            }
        }
        if (counter == 20)
        {
            riv = true;
        }
        else
        {
            riv = false;
        }
        System.out.print("\n Всі числа рівні? >>"+riv);

        TaskController();
    }

    public  static  void Task114()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть номер  елемента в одновимірному масиві який хочете замінити >>");
        int k = sc.nextInt();
        if (k > 10 || k< 0)
        {
            System.out.print("Введіть правильне число: \n");
            Task114();

        }

        int [] mas = new int[10];
        for (int i=0; i < mas.length; i++)
        {
            double r = Math.random()*10;
            int rand = (int) Math.round(r);
            mas [i] = rand;

            System.out.print("\t"+mas[i]);
        }

        int num5 = mas[4];
        int num10 = mas[9];

        int convert5 =num5*num5;
        int convert10= num10*num10;

        mas[k-1]= convert5+convert10;
        System.out.print("\n NUM5 "+num5+"\n NUM10 "+num10+"\n");

         for (int i=0; i < mas.length; i++)
        {
            System.out.print("\t"+mas[i]);
        }

        TaskController();
    }

    public  static  void Task139()
    {
        int k=10;
        float [] mas = new float[k];
        float sum = 0;
        float ser = 0;
        float min=100;
        int nummin = 0;

        for (int i=0;i< mas.length;i++)
        {
            double r = Math.random()*10;
            int rand = (int) Math.round(r);
            mas [i] = rand;
            sum +=(float) mas[i];

            System.out.print(" \t "+mas[i]);

            if (mas[i]<min || mas[i]==min )
            {
            min = mas[i];
            nummin=i;
            }
        }
            ser = sum/k;
            System.out.print("\n Сума >>" + sum);
            System.out.print("\n Середнє >>"+ ser);

            System.out.print(" \n  Min == "+min+"\n");

        for (int i=0;i<mas.length;i++)
        {
            if (i == nummin)
            {
                mas[i]= ser;
            System.out.print(" \t "+mas[i]);
            }
            else
            {
                System.out.print(" \t "+mas[i]);
            }

        }

        TaskController();
    }


    public static void main(String[] args)
    {
        TaskController();

    }
}
