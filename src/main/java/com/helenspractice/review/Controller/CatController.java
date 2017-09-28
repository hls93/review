package com.helenspractice.review.Controller;

import com.helenspractice.review.Repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    private CatRepository catRepo;

    @RequestMapping("/cats")
    public String cats (Model model) {
        return "cats";
    }


}
