package com.codebay.goldeneye;

import com.codebay.goldeneye.model.Employee;
import com.codebay.goldeneye.model.Office;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class WebController {


    private List<Office> offices;

    public WebController() {
        // Initialize lists of offices and departments
        List<String> milanDepartments = Arrays.asList("Design", "Business", "Advertising");
        List<String> spainDepartments = Arrays.asList("Research & development", "Business");
        List<String> newYorkDepartments = Arrays.asList("Business", "Advertising");

        offices = new ArrayList<>();
        offices.add(new Office("Milan", milanDepartments));
        offices.add(new Office("Spain", spainDepartments));
        offices.add(new Office("New York", newYorkDepartments));
    }

    @GetMapping("/")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("offices", offices);
        return "employee-form";
    }

    @PostMapping("/employee")
    public String submitEmployeeForm(@ModelAttribute("employee") Employee employee, Model model) {
        // Generate email
        String email = generateEmail(employee).toLowerCase();
        model.addAttribute("email", email);
        return "employee-confirmation";
    }

    @PostMapping("/departments")
    @ResponseBody
    public List<String> getDepartmentsByOffice(@RequestParam("office") String officeName) {
        for (Office office : offices) {
            if (office.getName().equals(officeName)) {
                return office.getDepartments();
            }
        }
        return Collections.emptyList();
    }

    private String generateEmail(Employee employee) {
        // Generate email using the employee information
        char firstNameInitial = employee.getName().trim().charAt(0);
        String surname = employee.getSurname().trim();
        String department = employee.getDepartment().trim();
        String office = employee.getOffice().replaceAll(" ", "").trim();
        return firstNameInitial + surname + "." + department + "@" + office + ".goldeneye.com";
    }
}