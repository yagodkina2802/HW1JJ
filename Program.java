package org.example.hw;

import org.example.task1.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Напишите программу, которая использует Stream API для обработки списка чисел.
//Программа должна вывести на экран среднее значение всех четных чисел в списке.
public class Program {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(13);
        number.add(15);
        number.add(8);

        number = (List<Integer>) number.stream().filter(s->s%2 == 0).toList();
        OptionalDouble average = number.stream().mapToInt(e -> e).average();
        System.out.println(number);
        System.out.println(average);


    }
}
