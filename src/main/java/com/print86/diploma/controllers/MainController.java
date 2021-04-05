package com.print86.diploma.controllers;

import com.print86.diploma.models.Report;
import com.print86.diploma.models.Request;
import com.print86.diploma.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class MainController {

    @GetMapping("")
    public String getMainPage() {
        return "mainPage";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model) {

        ArrayList<User> userList = new ArrayList<>();

        User ivan = new User(1, "Иван", "Антонов", "+79006543456", "mail@gmail.com");
        User alexey = new User(2, "Алексей", "Ивченко", "+79006543456", "mail@gmail.com");

        userList.add(ivan);
        userList.add(alexey);

        model.addAttribute("users", userList);
        return "AllUsers";
    }

    @GetMapping("/users/add")
    public String getUserAddingPage() {
        return "addUser";
    }

    @PostMapping("/users/add")
    public String addUser() {
        return "mainPage";
    }

    @GetMapping("/request/add")
    public String getRequestAddingPage() {
        return "addRequest";
    }

    @PostMapping("/Request/add")
    public String addRequest() {
        return "mainPage";
    }

    @GetMapping("/request")
    public String getAllRequests(Model model) {
        ArrayList<Request> requestList = new ArrayList<>();

        User ivan = new User(1, "Иван", "Антонов", "+79006543456", "mail@gmail.com");
        User alexey = new User(2, "Алексей", "Ивченко", "+79006543456", "mail@gmail.com");

        Request first = new Request(1, ivan, "12.03.2021", "Распечатка банеров", 2000);
        Request second = new Request(2, alexey, "15.03.2021", "Ремонт принтера", 1000);

        requestList.add(first);
        requestList.add(second);

        model.addAttribute("requests", requestList);
        return "requests";
    }

    @GetMapping("/reports")
    public String getInfoForReports(Model model) throws ParseException {
        Report report = new Report(new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021"), new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2021"));

        User ivan = new User(1, "Иван", "Антонов", "+79006543456", "mail@gmail.com");
        User alexey = new User(2, "Алексей", "Ивченко", "+79006543456", "mail@gmail.com");

        Request first = new Request(1, ivan, "12.03.2021", "Распечатка банеров", 2000);
        Request second = new Request(2, alexey, "15.03.2021", "Ремонт принтера", 1000);

        report.add(first);
        report.add(second);

        model.addAttribute("report", report);

        return "reports";
    }
}