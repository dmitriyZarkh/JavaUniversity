package syntax.arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Пирамида
*/

public class FirTree {
    public static char[][] array;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int high = scanner.nextInt();
        array = new char[high][];

        // создаем ширину для двумерного массива согласно значению high
        for (int x = 0; x < array.length; x++) {
            int save = x + 1;
            array[x] = new char[high + save];


        }

        //         заполняем массив решеткой
        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = '#';
            }
        }


        // заменяем часть решеток на пробелы для создания пирамиды
        for (int p = 0; p < array.length; p++) {
            int save = p + 1;
            for (int z = array.length - save; z >= 0; z--) {
                array[p][z] = ' ';
            }
        }

        // выводим пирамиды в консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

       int weight = scanner.nextInt();

        if (weight > 0 && weight % 2 != 0) {
            int height = (weight + 1) / 2;
            if (height > 0) {
                for (int i = 0; i < height; i++) {
                    for (int k = 1; k < height - i; k++) {
                        System.out.print(" ");
                    }
                    for (int s = 1; s <= i * 2 + 1; s++) {
                        System.out.print("*");
                    }
                    if (i != height - 1) {
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("Ширина не должна быть чётной или меньше или равно 0!!!");
        }

        int[][] arr=new int[5][5];
        //заполняем массив
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){// Генерируем случайное число [100-1000]
                arr[i][j]=(int)(Math.random()*(1000-100+1)+100);
            }
        }

        //Вывод массива
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

        //Сортировка массива
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //Заполним одномерный массив значениями из двумерного
        int[] temp=new int[25];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                temp[k]=arr[i][j];
                k++;
            }
        }

        //Вывод одномерного массива
        System.out.println();
        for(int x:temp){
            System.out.print(x+" ");
        }

        //Сортировка одномерного массива
        Arrays.sort(temp);
        System.out.println();
        for(int x:temp){
            System.out.print(x+" ");
        }

        k = -1;
        //Возвращение значений в двумерный массив
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                k++;
                arr[i][j]=temp[k];
            }
        }

        //Вывод массива
        System.out.println();
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
