package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.model.MealTo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MealServlet extends HttpServlet {
    private static final Logger log = getLogger(UserServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("Get meals");

        List<MealTo> list = new ArrayList<>();
        list.add(new MealTo(LocalDateTime.of(2018, 1, 2, 3, 0, 0), "breakfast", 400, true));
        list.add(new MealTo(LocalDateTime.of(2018, 2, 2, 3, 0, 0), "breakfast", 2000, false));
        list.add(new MealTo(LocalDateTime.of(2018, 3, 2, 3, 0, 0), "breakfast", 600, true));

        request.setAttribute("mealsWithExceed", list);
        System.out.println(list);
        request.getRequestDispatcher("/meals.jsp").forward(request, response);

    }
}
