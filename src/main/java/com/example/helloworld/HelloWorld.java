package com.example.helloworld;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorld extends HttpServlet {
//    public static void main(String[] args) {
//        String tip;
////        System.out.println("Hello, World!");
//        double a = 3;
//
//        double b = 4;
//
//        double c = 6;
//
//        try {
//
//            if (a + b < c || a + c < b || b + c < a)
//                tip = "Тругольника с данными сторонами не существует";
//            else if (a == b && a == c && c == b)
//                tip = "Треугольник равносторонний";
//            else if (a == b || a == c || b == c)
//                tip = "Треугольник равнобедренный";
//            else tip = "Треугольник обычный";
//
//            System.out.println(tip);
//        }catch (NumberFormatException exception) {
//            System.out.println("Ошибка! Проверьте введенные данные.");}
//        }

    //        servlet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String _a = req.getParameter("a");
        String _b = req.getParameter("b");
        String _c = req.getParameter("c");
        try {
            double a = Integer.parseInt(_a);
            double b = Integer.parseInt(_b);
            double c = Integer.parseInt(_c);

            String tip;

            if (a + b < c || a + c < b || b + c < a)
                tip = "Тругольника с данными сторонами не существует";
            else if (a == b && a == c && c == b)
                tip = "Треугольник равносторонний";
            else if (a == b || a == c || b == c)
                tip = "Треугольник равнобедренный";
            else tip = "Треугольник обычный";

            req.setAttribute("answer", "" +  tip);
        } catch (NumberFormatException exception) {
            req.setAttribute("answer", "- Нужно написать цифрами. Попробуйте снова.");
        }
        req.getRequestDispatcher("result.jsp").forward(req, resp);
    }
}
