package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JavaDemoJDBC {

    private static Connection connection = null; //Отвечает за соединение приложения с базой данных (устанавливаем соединение)
    private static String URL =""; //Вводится адрес для соединения с БД
    private static String USERNAME = "Sample user";
    private static String PASSWORD = "";

    public static void main(String[] args) throws SQLException{

            String name;
            String FIO;
            Scanner in = new Scanner(System.in);

            System.out.println("Введите имя: ");
            name = in.nextLine();

            System.out.println("Введите фамилию: ");
            FIO = in.nextLine();

            System.out.println(name + " " + FIO);

        Statement stmt = null; //Отвечает за выполнение запросов после подключения к БД
        ResultSet result = null; //Обрабатывает полученные результаты

        String value = "";
        String SQL = "";

        try {
            System.out.println("Устанавливаем соединение с базой");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //Запуск
            SQL = ""; //Тут вводится действие SQL-запроса


            stmt = connection.createStatement();
            stmt.executeUpdate(SQL);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            connection.close();
            System.out.println("Закрыли соединение с базой");
        }
    }

}

