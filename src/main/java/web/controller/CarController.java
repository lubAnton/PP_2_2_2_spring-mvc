package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServiceImpl carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }
    @GetMapping("")
    public String getCarCount(HttpServletRequest request, Model model) {
        int count = 0;
        if (request.getParameter("count")==null) {
            count = count;
        } else {
            count = Integer.parseInt(request.getParameter("count"));
        }
       model.addAttribute("carCount", carService.getCarCount(count));

        return "carCount";
    }
}
